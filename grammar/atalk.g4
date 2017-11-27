grammar atalk;

// ------------> Methods <-----------------

@members {
    void print(String str){
        System.out.println(str);
    }
    void log(String str){
        // System.out.println(str);
    }

    void putLocalVar(String name, Type type) throws ItemAlreadyExistsException {
        SymbolTable.top.put(
            new SymbolTableLocalVariableItem(
                new Variable(name, type),
                SymbolTable.top.getOffset(Register.SP)
            )
        );
    }
    
    void putActor(String name, int queueLen) throws ItemAlreadyExistsException {
        try{
            SymbolTable.top.put(
                new SymbolTableActorItem(name, queueLen)
            );
        }
        catch (ItemAlreadyExistsException iaee){
            name = name+"_temp";
            putActor(name, queueLen);
            throw iaee;
        }
    }

    void beginScope() {
    	int offset = 0;
    	if(SymbolTable.top != null)
        	offset = SymbolTable.top.getOffset(Register.SP);
        SymbolTable.push(new SymbolTable());
        SymbolTable.top.setOffset(Register.SP, offset);
    }
    
    void endScope() {
        print("Stack offset: " + SymbolTable.top.getOffset(Register.SP));
        SymbolTable.pop();
    }
}


//‌ ------------> Parser <--------------

program locals [boolean hasActor=false]
    : {beginScope();} 
    (
        ac=actor 
            {
                $hasActor = true;
            }
        | NEWLINE
    ) *
        {
            if(!$hasActor) throw new NoActorException();
        }
    {endScope();}
    ; 
    catch[NoActorException nae] {print("ERR: No actors defined");}
    // catch[SameActorNameException sane] {print("ERR: there is an actor with the same name as ");}



actor 
    : ACTOR name=ID as=actor_size
        {
            putActor($name.getText(), $as.actorSize);
            beginScope();
        }
    actor_content 
    END
        {
            endScope();
        }
    (NEWLINE | EOF)
        {
            print("actor : " + $name.getText() + "<" + Integer.toString($as.actorSize) + ">");
        }
    ;
    catch[ItemAlreadyExistsException iaee] {print("ERR: Actor already exists: " + iaee.getName());}

actor_content 
    : {log("actor content");}
    (
        state 
        | receiver
    )+ 
    ;

actor_size returns[int actorSize] 
    : {log("actor size");}
    '<' num=NUMBER {$actorSize=$num.int;} '>' NEWLINE 
    ;

state 
    : {log("state");} 
    var_type ID (',' ID)* NEWLINE 
    ;

statement 
    : {log("statement");} 
    (
        QUIT 
        | vardef 
        | condition 
        | foreach 
        | sender 
        | function_call 
        | write_func 
        | scope 
        | assignment 
        | loop_statements
    ) NEWLINE ; // loop_statements should be just in foreachs

statements 
    : {log("statements");} 
    (statement)* 
    ;

receiver : RECEIVER name=ID {log("receiver : " + $name.getText());} def_arguments NEWLINE receiver_content END NEWLINE ;

def_arguments 
    : {log("def arguments");} 
    '(' (arg_var_def (',' arg_var_def)*)? ')' 
    ;

argument 
    : {log("argument");} 
    '(' (arg_var) ')'
    ;

arguments 
    : {log("arguments");} 
    '(' (arg_var (',' arg_var)*)? ')'
    ;

arg_var 
    : {log("arg var");} 
    ID 
    | expr 
    ;

arg_var_def 
    : {log("arg var def");} 
    var_type ID 
    ;

receiver_content 
    : {log("receiver content");} 
    statements 
    ;

vardef 
    : {log("vardef");} 
    var_type var (',' var)* 
    ;

var 
    : {log("var");} 
    ID ('=' expr)? 
    ;

loop_statements 
    : {log("loop statements");}  
    BREAK 
    ;

scope 
    : {log("scope");} 
    BEGIN NEWLINE statements END 
    ;
condition 
    : {log("condition");} 
    IF expr NEWLINE statements 
    (ELSEIF expr NEWLINE statements)* 
    (ELSE NEWLINE statements)? 
    END 
    ;

foreach 
    : {log("foreach");}  
    FOREACH ID IN rvalue NEWLINE statements END 
    ;
sender 
    : {log("sender");} 
    (SENDER | SELF | ID) '<<' method_call 
    ;

assignment 
    : {log("assignment");} 
    lvalue '=' expr 
    ;

method_call 
    : {log("method call");} 
    ID arguments
    ;

function_def 
    : {log("function def");} 
    ID def_arguments 
    ;

function_call 
    : {log("function call");}
    read_func 
    ;
read_func 
    : {log("function call");} 
    READ '(' NUMBER ')'
    ; 
write_func 
    : {log("function call");} 
    WRITE '(' (STRING | NUMBER | CHARACTER) ')'
    ; 


expr 
    : {log("expr");} 
    a1
    ;
a1 : a2 a1p | rvalue ;
a1p : ({log("a1p : or");} OR a2 a1p) | ;

a2 : a3 a2p ;
a2p : ({log("a1p : and");} AND a3 a2p) | ;

a3 : a4 a3p ;
a3p : (op=('==' | '<>') {log("a1p : " + $op.getText());}  a4 a3p) | ;

a4 : a5 a4p ;
a4p : (op=('<' | '>') {log("a1p : " + $op.getText());} a5 a4p) | ;

a5 : a6 a5p ;
a5p : (op=('+' | '-') {log("a1p : " + $op.getText());} a6 a5p) | ;

a6 : a7 a6p ;
a6p : (op=('*' | '/') {log("a1p : " + $op.getText());} a7 a6p) | ;

a7 : ('-' | NOT)* {log("a1p : -");} a8 ;

a8 : ('(' {log("a1p : ()");} a1 ')') | rvalue ;

// ambiguous and left recursive solve
/*E  → T E'
E' → + T E' | ε
T  → F T'
T' → * F T' | ε
F  → ( E ) | id*/


rvalue 
    : {log("rvalue");} 
    STRING 
    | NUMBER 
    | CHAR 
    | ID 
    | access_array 
    | function_call 
    | array 
    ;

lvalue 
    : {log("lvalue");} 
    ID 
    | access_array 
    ;

access_array 
    : {log("access array");} 
    ID (array_index)+
    ;

array 
    : {log("array");} 
    '{' expr (',' expr)* '}' 
    ;

var_type 
    : {log("var type");} 
    TYPE (array_def)* 
    ;

array_def 
    : {log("array def");} 
    ('[' NUMBER ']') 
    ;

array_index 
    : {log("array access");} 
    ('[' expr ']') 
    ;


// ----------------> Tokens <---------------------


SPACE : [ \t]+ {skip();} ;
COMMENT : (NEWLINE SPACE* '#' (ANY_CHAR)* | '#' (ANY_CHAR)*) {log("COMMENT : " + getText());} {skip();};
NEWLINE : (('\r\n' | '\n') SPACE* )+ {log("NEWLINE");};

ACTOR : 'actor' {log("ACTOR : " + getText());};
RECEIVER : 'receiver' {log("RECEIVER");};
TYPE : ( 'int' | 'char' ) {log("TYPE : " + getText());}; // should support arrays
QUIT : 'quit' {log("QUIT");};
IF : 'if' {log("IF");};
ELSEIF : 'elseif' {log("ELSEIF");};
ELSE : 'else' {log("ELSE");};
END : 'end' {log("END");};
FOREACH : 'foreach' {log("FOREACH");};
BREAK : 'break' {log("BREAK");};
IN : 'in' {log("IN");};
SENDER : 'sender' {log("SENDER");};
SELF : 'self' {log("SELF");};
BEGIN : 'begin' {log("BEGIN");};

READ: 'read' {log("READ");};
WRITE: 'write' {log("WRITE");};

AND : 'and' {log("AND");};
OR : 'or' {log("OR");};
NOT : 'not' {log("NOT");};

STRING : '"' CHARACTER* '"' {log("STRING : " + getText());};
CHAR : '\'' (CHARACTER | '"') '\'' {log("CHAR : " + getText());};
NUMBER : [0-9]+ {log("NUMBER : " + getText());};



// keywords
ID : [a-zA-Z_][a-zA-Z_0-9]* {log("ID : " + getText());};


CHARACTER : ( ~([\n"]) | '\\"' | '\\t' | '\\n' | '\\\\' | '\\\'' ) {log("CHARACTER : " + getText());};


ANY_CHAR : ~('\n') ;
