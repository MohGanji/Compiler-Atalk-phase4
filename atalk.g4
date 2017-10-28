grammar atalk;

@members {
    void print(String str){
        System.out.println(str);
    }
}

program : (actor | NEWLINE) * ;


actor : ACTOR ID actor_size actor_content END NEWLINE {print("actor");};
actor_content : (state | receiver)+ {print("actor content");};
actor_size : LT NUMBER GT NEWLINE {print("actor size");};

state : {print("state start");} var_type ID (COMMA ID)* NEWLINE {print("state");};

receiver : RECEIVER function_def receiver_content END NEWLINE {print("receiver");};
def_arguments : POPEN(arg_var)*PCLOSE NEWLINE {print("def arguments");};
arguments : POPEN(ID | value)PCLOSE NEWLINE;
arg_var : var_type ID {print("arg var");};
receiver_content : statements {print("receiver content");};
vardef : var_type var (COMMA var)* {print("vardef");};
var : ID (EQ value)? {print("var");};

statements : (statement)* {print("statements");} ;
loop_statements : BREAK {print("loop statements");} ;
statement : (QUIT | vardef | condition | foreach | sender | function_call | scope | assignment | loop_statements) NEWLINE {print("statement");}; // loop_statements should be just in foreachs

condition : IF statements (ELSEIF statements)* END {print("condition");} ;
foreach : FOREACH ID IN (ID | array) NEWLINE statements END {print("foreach");} ;
sender : (SENDER | SELF | ID) SEND_OP function_call {print("sender");};
scope : BEGIN statements END {print("scope");};
assignment : ID EQ value {print("assignment");};

function_def : ID def_arguments {print("function def");};
function_call : ID arguments {print("function call");};

value : expr | array {print("value");};

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
/*expr : texpr exprp | def_value {print("expr");}; // op is sooooo simple
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

lgc : (tlgc lgcp | def_value) {print("lgc");};
lgcp : ('==' | '<>') tlgc lgcp | ;
tlgc : flgc | tlgcp ;
tlgcp : ('<' | '>') | flgc tlgcp | ;
flgc : def_value ;
*/
def_value : ( STRING | NUMBER | CHAR | ID ) {print("def value");};

array : COPEN value (COMMA value)* CCLOSE {print("array");};

var_type : TYPE (array_def)* {print("var type");};
array_def : (BOPEN NUMBER BCLOSE) {print("array def");};
array_access : (BOPEN (ID | NUMBER) BCLOSE) {print("array access");};


// TOKENS -----------------------------------------


COMMENT : (NEWLINE SHARP (ANY_CHAR)* | SHARP (ANY_CHAR)*) {print("COMMENT : " + getText());} {skip();};
NEWLINE : ('\r\n' | '\n')+ {print("NEWLINE");};
SPACE : [ \t]+ {skip();} ;

ACTOR : 'actor' {print("ACTOR : " + getText());};
RECEIVER : 'receiver' {print("RECEIVER");};
TYPE : ( 'int' | 'char' ) {print("TYPE : " + getText());}; // should support arrays
QUIT : 'quit' {print("QUIT");};
IF : 'if' {print("QUIT");};
ELSEIF : 'elseif' {print("QUIT");};
END : 'end' {print("END");};
FOREACH : 'foreach' {print("FOREACH");};
BREAK : 'break' {print("BREAK");};
IN : 'in' {print("IN");};
SENDER : 'sender' {print("SENDER");};
SELF : 'self' {print("SELF");};
BEGIN : 'begin' {print("BEGIN");};

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
