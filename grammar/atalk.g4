grammar atalk;

@members {
    void print(String str){
        System.out.println(str);
    }
}

program locals [String hasActor="F"]
        : (actor {$hasActor = "T";}
        | NEWLINE) *
        {print($hasActor);} ;



actor : ACTOR name=ID {print("actor : " + $name.getText());} actor_size actor_content END (NEWLINE | EOF) ;
actor_content : {print("actor content");} (state | receiver)+ ;
actor_size : {print("actor size");} '<' NUMBER '>' NEWLINE ;

state : {print("state");} var_type ID (',' ID)* NEWLINE ;

statement : {print("statement");} (QUIT | vardef | condition | foreach | sender | function_call | write_func | scope | assignment | loop_statements) NEWLINE ; // loop_statements should be just in foreachs
statements : {print("statements");}  (statement)* ;

receiver : RECEIVER name=ID {print("receiver : " + $name.getText());} def_arguments NEWLINE receiver_content END NEWLINE ;

def_arguments : {print("def arguments");} '(' (arg_var_def (',' arg_var_def)*)? ')' ;
argument : {print("argument");} '(' (arg_var) ')';
arguments : {print("arguments");} '(' (arg_var (',' arg_var)*)? ')';
arg_var : {print("arg var");} ID | expr ;
arg_var_def : {print("arg var def");} var_type ID ;
receiver_content : {print("receiver content");} statements ;
vardef : {print("vardef");} var_type var (',' var)* ;
var : {print("var");} ID ('=' expr)? ;

loop_statements : {print("loop statements");}  BREAK ;
scope : {print("scope");} BEGIN NEWLINE statements END ;
condition : {print("condition");}  IF expr NEWLINE statements (ELSEIF expr NEWLINE statements)* (ELSE NEWLINE statements)? END ;
foreach : {print("foreach");}  FOREACH ID IN rvalue NEWLINE statements END ;
sender : {print("sender");} (SENDER | SELF | ID) '<<' method_call ;
assignment : {print("assignment");} lvalue '=' expr ;

method_call : {print("method call");} ID arguments;

function_def : {print("function def");} ID def_arguments ;
function_call : {print("function call");} read_func ;
read_func : {print("function call");} READ '(' NUMBER ')'; 
write_func : {print("function call");} WRITE '(' (STRING | NUMBER | CHARACTER) ')'; 


expr : {print("expr");} a1;
a1 : a2 a1p | rvalue ;
a1p : ({print("a1p : or");} OR a2 a1p) | ;

a2 : a3 a2p ;
a2p : ({print("a1p : and");} AND a3 a2p) | ;

a3 : a4 a3p ;
a3p : (op=('==' | '<>') {print("a1p : " + $op.getText());}  a4 a3p) | ;

a4 : a5 a4p ;
a4p : (op=('<' | '>') {print("a1p : " + $op.getText());} a5 a4p) | ;

a5 : a6 a5p ;
a5p : (op=('+' | '-') {print("a1p : " + $op.getText());} a6 a5p) | ;

a6 : a7 a6p ;
a6p : (op=('*' | '/') {print("a1p : " + $op.getText());} a7 a6p) | ;

a7 : ('-' | NOT)* {print("a1p : -");} a8 ;

a8 : ('(' {print("a1p : ()");} a1 ')') | rvalue ;

// ambiguous and left recursive solve
/*E  → T E'
E' → + T E' | ε
T  → F T'
T' → * F T' | ε
F  → ( E ) | id*/


rvalue : {print("rvalue");} STRING | NUMBER | CHAR | ID | access_array | function_call | array ;
lvalue : {print("lvalue");} ID | access_array ;

access_array : {print("access array");} ID (array_index)+;

array : {print("array");} '{' expr (',' expr)* '}' ;

var_type : {print("var type");} TYPE (array_def)* ;
array_def : {print("array def");} ('[' NUMBER ']') ;
array_index : {print("array access");} ('[' expr ']') ;


// TOKENS -----------------------------------------


SPACE : [ \t]+ {skip();} ;
COMMENT : (NEWLINE SPACE* '#' (ANY_CHAR)* | '#' (ANY_CHAR)*) {print("COMMENT : " + getText());} {skip();};
NEWLINE : (('\r\n' | '\n') SPACE* )+ {print("NEWLINE");};

ACTOR : 'actor' {print("ACTOR : " + getText());};
RECEIVER : 'receiver' {print("RECEIVER");};
TYPE : ( 'int' | 'char' ) {print("TYPE : " + getText());}; // should support arrays
QUIT : 'quit' {print("QUIT");};
IF : 'if' {print("IF");};
ELSEIF : 'elseif' {print("ELSEIF");};
ELSE : 'else' {print("ELSE");};
END : 'end' {print("END");};
FOREACH : 'foreach' {print("FOREACH");};
BREAK : 'break' {print("BREAK");};
IN : 'in' {print("IN");};
SENDER : 'sender' {print("SENDER");};
SELF : 'self' {print("SELF");};
BEGIN : 'begin' {print("BEGIN");};

READ: 'read' {print("READ");};
WRITE: 'write' {print("WRITE");};

AND : 'and' {print("AND");};
OR : 'or' {print("OR");};
NOT : 'not' {print("NOT");};

STRING : '"' CHARACTER* '"' {print("STRING : " + getText());};
CHAR : '\'' (CHARACTER | '"') '\'' {print("CHAR : " + getText());};
NUMBER : [0-9]+ {print("NUMBER : " + getText());};



// keywords
ID : [a-zA-Z_][a-zA-Z_0-9]* {print("ID : " + getText());};


CHARACTER : ( ~([\n"]) | '\\"' | '\\t' | '\\n' | '\\\\' | '\\\'' ) {print("CHARACTER : " + getText());};


ANY_CHAR : ~('\n') ;
