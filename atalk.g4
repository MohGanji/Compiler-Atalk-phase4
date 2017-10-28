grammar atalk;

@members {
    void print(String str){
        System.out.println(str);
    }
}

program : (actor | NEWLINE) * ;


actor : {print("actor");} ACTOR ID actor_size actor_content END NEWLINE ;
actor_content : {print("actor content");} (state | receiver)+ ;
actor_size : {print("actor size");} LT NUMBER GT NEWLINE ;

state : {print("state");} var_type ID (COMMA ID)* NEWLINE ;

statement : {print("statement");} (QUIT | vardef | condition | foreach | sender | function_call | write_func | scope | assignment | loop_statements) NEWLINE ; // loop_statements should be just in foreachs
statements : {print("statements");}  (statement)* ;

receiver : {print("receiver");} RECEIVER function_def NEWLINE receiver_content END NEWLINE ;

def_arguments : {print("def arguments");} POPEN (arg_var_def (COMMA arg_var_def)*)? PCLOSE ;
argument : {print("argument");} POPEN (arg_var) PCLOSE;
arguments : {print("arguments");} POPEN (arg_var (COMMA arg_var)*)? PCLOSE;
arg_var : {print("arg var");} ID | expr ;
arg_var_def : {print("arg var def");} var_type ID ;
receiver_content : {print("receiver content");} statements ;
vardef : {print("vardef");} var_type var (COMMA var)* ;
var : {print("var");} ID (EQ expr)? ;

loop_statements : {print("loop statements");}  BREAK ;
scope : {print("scope");} BEGIN NEWLINE statements END ;
condition : {print("condition");}  IF expr NEWLINE statements (ELSEIF expr NEWLINE statements)* (ELSE NEWLINE statements)? END ;
foreach : {print("foreach");}  FOREACH ID IN rvalue NEWLINE statements END ;
sender : {print("sender");} (SENDER | SELF | ID) SEND_OP method_call ;
assignment : {print("assignment");} lvalue EQ expr ;

method_call : {print("method call");} ID arguments;

function_def : {print("function def");} ID def_arguments ;
function_call : {print("function call");} read_func ;
read_func : {print("function call");} READ '(' NUMBER ')'; 
write_func : {print("function call");} WRITE '(' (STRING | NUMBER | CHARACTER) ')'; 


expr : {print("expr");} a1;
a1 : a2 a1p | rvalue ;
a1p : OR a2 a1p | ;

a2 : a3 a2p ;
a2p : AND a3 a2p | ;

a3 : a4 a3p ;
a3p : (EQEQ | NOTEQ) a4 a3p | ;

a4 : a5 a4p ;
a4p : (LT | GT) a5 a4p | ;

a5 : a6 a5p ;
a5p : (PLUS | MINUS) a6 a5p | ;

a6 : a7 a6p ;
a6p : (MULT | DIV) a7 a6p | ;

a7 : (MINUS | NOT)* a8 ;

a8 : POPEN a1 PCLOSE | rvalue ;

// ambiguous and left recursive solve
/*E  → T E'
E' → + T E' | ε
T  → F T'
T' → * F T' | ε
F  → ( E ) | id*/


rvalue : {print("rvalue");} STRING | NUMBER | CHAR | ID | access_array | function_call | array ;
lvalue : ID | access_array ;

access_array : {print("access array");} ID (array_index)+;

array : {print("array");} COPEN expr (COMMA expr)* CCLOSE ;

var_type : {print("var type");} TYPE (array_def)* ;
array_def : {print("array def");} (BOPEN NUMBER BCLOSE) ;
array_index : {print("array access");} (BOPEN expr BCLOSE) ;


// TOKENS -----------------------------------------


SPACE : [ \t]+ {skip();} ;
COMMENT : (NEWLINE SPACE* SHARP (ANY_CHAR)* | SHARP (ANY_CHAR)*) {print("COMMENT : " + getText());} {skip();};
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
PLUS : '+' {print("PLUS");};
MINUS : '-' {print("MINUS");};
MULT : '*' {print("MULT");};
DIV : '/' {print("DIV");};
EQ : '=' {print("EQ");};
EQEQ : '==' {print("EQEQ");};
NOTEQ : '<>' {print("NOTEQ");};
LT : '<' {print("LT");};
GT : '>' {print("GT");};
POPEN : '(' {print("POPEN");};
PCLOSE : ')' {print("PCLOSE");};
BOPEN : '[' {print("BOPEN");};
BCLOSE : ']' {print("BCLOSE");};
COPEN : '{' {print("COPEN");};
CCLOSE : '}' {print("CCLOSE");};
SEND_OP : '<<' {print("SEND_OP");};
SHARP : '#' {print("SHARP");};
COMMA : ',' {print("COMMA");};
NOT : 'not' {print("NOT");};

STRING : '"' CHARACTER* '"' {print("STRING : " + getText());};
CHAR : '\'' (CHARACTER | '"') '\'' {print("CHAR : " + getText());};
NUMBER : [0-9]+ {print("NUMBER : " + getText());};



// keywords
ID : [a-zA-Z_][a-zA-Z_0-9]* {print("ID : " + getText());};


CHARACTER : ( ~([\n"]) | '\\"' | '\\t' | '\\n' | '\\\\' | '\\\'' ) {print("CHARACTER : " + getText());};


ANY_CHAR : ~('\n') ;
