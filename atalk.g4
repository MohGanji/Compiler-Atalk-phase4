grammar atalk;

@members {
    void print(String str){
        System.out.println(str);
    }
}

program : (actor | var) * ;

actor : ACTOR' 'ID '<'NUMBER'>' NEWLINE actor_content 'end' NEWLINE {print("actor");};
actor_content : (state | receiver)* {print("actor content");};

state : TYPE global_vardef (',' global_vardef)* NEWLINE {print("state");};
var : TYPE vardef (',' vardef)* NEWLINE {print("var");};
global_vardef : ID {print("global vardef");};
vardef : ID '=' VALUE {print("vardef");};
receiver : 'as' {print("receiver");};


ACTOR : 'actor' {print("ACTOR");};
TYPE : ( 'int' | 'char' ) {print("TYPE");}; // should support arrays
VALUE : ( '"' STRING_CHAR* '"' | NUMBER | '\'' CHAR '\'' ) {print("VALUE");}; 


COMMENT : '#'(ANY_CHAR)* {print("COMMENT");} -> skip;
// keywords
ID : [a-zA-Z_][a-zA-Z_0-9]* {print("ID");};
CHAR : (STRING_CHAR | '\\t' | '\\n' | '\\\\' | '"' | '\\\'') {print("CHAR");};
STRING_CHAR : ( ~([\n"]) | '\\"' ) {print("STRING CHAR");};
NUMBER : [0-9]+ {print("NUMBER");};




ANY_CHAR : ~('\n') ;
NEWLINE : ('\r'? '\n' | '\r') ;
Space : (' ' | '\t') {skip();} ;
