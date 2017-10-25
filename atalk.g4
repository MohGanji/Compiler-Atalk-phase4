grammar atalk;

@members {
    void print(String str){
        System.out.println(str);
    }
}

program : (actor | NEWLINE) * ;


actor : ACTOR ID actor_size actor_content END NEWLINE {print("actor");};
actor_content : (state | receiver)+ {print("actor content");};
actor_size : '<'NUMBER'>' NEWLINE {print("actor size");};

state : {print("state start");} var_type global_vardef (',' global_vardef)* NEWLINE {print("state");};
global_vardef : ID {print("global vardef");};

receiver : RECEIVER ID arguments receiver_content END NEWLINE {print("receiver");};
arguments : '('(arg_var)*')' NEWLINE {print("arguments");};
arg_var : var_type global_vardef {print("arg var");};
receiver_content : (vardef)* {print("receiver content");};
vardef : var_type var (',' var)* NEWLINE {print("vardef");};
var : ID ('=' value)? {print("var");};

value : expr | array {print("value");};

// ambiguous and left recursive solve
expr : (texpr exprp | def_value) {print("expr");}; // op is sooooo simple
exprp : ('+' | '-') texpr exprp | ;
texpr : fexpr | texprp ;
texprp : ('*' | '/') | fexpr texprp | ;
fexpr : '(' expr ')' | def_value ;
/*E  → T E'
E' → + T E' | ε
T  → F T'
T' → * F T' | ε
F  → ( E ) | id*/

def_value : ( STRING | NUMBER | CHAR | ID ) {print("def value");};

array : '{'value (','value)*'}' {print("array");};

var_type : TYPE (array_def)* {print("var type");};
array_def : ('['NUMBER']') {print("array def");};
array_access : ('['(ID | NUMBER)']') {print("array access");};


// TOKENS -----------------------------------------


COMMENT : (NEWLINE '#'(ANY_CHAR)* | '#'(ANY_CHAR)*) {print("COMMENT : " + getText());} {skip();};
NEWLINE : ('\r\n' | '\n')+ {print("NEWLINE");};
SPACE : [ \t]+ {skip();} ;

ACTOR : 'actor' {print("ACTOR : " + getText());};
RECEIVER : 'receiver';
TYPE : ( 'int' | 'char' ) {print("TYPE : " + getText());}; // should support arrays

END : 'end' {print("END");};
STRING : '"' CHARACTER* '"' {print("STRING : " + getText());};
CHAR : '\'' (CHARACTER | '"') '\'' {print("CHAR : " + getText());};
NUMBER : [0-9]+ {print("NUMBER : " + getText());};



// keywords
ID : [a-zA-Z_][a-zA-Z_0-9]* {print("ID : " + getText());};


CHARACTER : ( ~([\n"]) | '\\"' | '\\t' | '\\n' | '\\\\' | '\\\'' ) {print("CHARACTER : " + getText());};


ANY_CHAR : ~('\n') ;
