lexer grammar atalk_lexer;
parser grammar atalk_parser;
options {tokenVocab = atalk_lexer; }

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

receiver : {print("receiver");} RECEIVER function_def receiver_content END NEWLINE ;
def_arguments : {print("def arguments");} POPEN(arg_var)*PCLOSE NEWLINE ;
arguments : POPEN(ID | value)PCLOSE NEWLINE;
arg_var : {print("arg var");} var_type ID ;
receiver_content : {print("receiver content");} statements ;
vardef : {print("vardef");} var_type var (COMMA var)* ;
var : {print("var");} ID (EQ value)? ;

statements : {print("statements");}  (statement)* ;
loop_statements : {print("loop statements");}  BREAK ;
statement : {print("statement");} (QUIT | vardef | condition | foreach | sender | function_call | scope | assignment | loop_statements) NEWLINE ; // loop_statements should be just in foreachs

scope : {print("scope");} BEGIN statements END ;
condition : {print("condition");}  IF expr NEWLINE statements (ELSEIF expr NEWLINE statements)* (ELSE NEWLINE statements)? END ;
foreach : {print("foreach");}  FOREACH ID IN (ID | array) NEWLINE statements END ;
sender : {print("sender");} (SENDER | SELF | ID) SEND_OP function_call ;
assignment : {print("assignment");} ID EQ value ;

function_def : {print("function def");} ID def_arguments ;
function_call : {print("function call");} ID arguments ;

value : {print("value");} expr | array ;

expr : a1;
a1 : a2 a1p | def_value ;
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

a7 : POPEN a1 PCLOSE | def_value ;


// ambiguous and left recursive solve
/*expr : {print("expr");} texpr exprp | def_value e ; // op is sooooo simpl
exprp : jam lgc | ;
texpr : fexpr | texprp ;
texprp : ('*' | '/') fexpr texprp | ;
fexpr : '(' expr ')' | def_value ;

jam : fjam | tjamp ;
tjamp : ('+' | '-') fjam tjamp | ;
// fjam :  ;
/*E  → T E'
E' → + T E' | ε
T  → F T'
T' → * F T' | ε
F  → ( E ) | id*/
/*
lgc : (tlgc lgcp | def_value);
lgcp : 'or' tlgc lgcp | ;
tlgc : flgc | tlgcp ;
tlgcp : 'and' | flgc tlgcp | ;
flgc : lgc | def_value ;

lgc : {print("lgc");} (tlgc lgcp | def_value) ;
lgcp : ('==' | '<>') tlgc lgcp | ;
tlgc : flgc | tlgcp ;
tlgcp : ('<' | '>') | flgc tlgcp | ;
flgc : def_value ;
*/
def_value : {print("def value");} ( STRING | NUMBER | CHAR | ID ) ;

array : {print("array");} COPEN value (COMMA value)* CCLOSE ;

var_type : {print("var type");} TYPE (array_def)* ;
array_def : {print("array def");} (BOPEN NUMBER BCLOSE) ;
array_access : {print("array access");} (BOPEN (ID | NUMBER) BCLOSE) ;


// TOKENS -----------------------------------------


COMMENT : (NEWLINE SHARP (ANY_CHAR)* | SHARP (ANY_CHAR)*) {print("COMMENT : " + getText());} {skip();};
NEWLINE : ('\r\n' | '\n')+ {print("NEWLINE");};
SPACE : [ \t]+ {skip();} ;

ACTOR : 'actor' {print("ACTOR : " + getText());};
RECEIVER : 'receiver' {print("RECEIVER");};
TYPE : ( 'int' | 'char' ) {print("TYPE : " + getText());}; // should support arrays
QUIT : 'quit' {print("QUIT");};
IF : 'if' {print("IF");};
ELSEIF : 'elseif' {print("ELSEIF");};
ELSE : 'else' {print("ELSE");};
END : 'end' {print("END");} -> popMode;
FOREACH : 'foreach' {print("FOREACH");};
BREAK : 'break' {print("BREAK");};
IN : 'in' {print("IN");};
SENDER : 'sender' {print("SENDER");};
SELF : 'self' {print("SELF");};
BEGIN : 'begin' {print("BEGIN");} -> pushMode(INSIDE);

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

STRING : '"' CHARACTER* '"' {print("STRING : " + getText());};
CHAR : '\'' (CHARACTER | '"') '\'' {print("CHAR : " + getText());};
NUMBER : [0-9]+ {print("NUMBER : " + getText());};



// keywords
ID : [a-zA-Z_][a-zA-Z_0-9]* {print("ID : " + getText());};


CHARACTER : ( ~([\n"]) | '\\"' | '\\t' | '\\n' | '\\\\' | '\\\'' ) {print("CHARACTER : " + getText());};


ANY_CHAR : ~('\n') ;
