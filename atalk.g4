grammar atalk;

@members {
    void print(String str){
        System.out.println(str);
    }
}

program : (actor | var) * ;


actor : ACTOR ID ACTOR_SIZE NEWLINE actor_content 'end' NEWLINE {print("actor");};
actor_content : (state | receiver)* {print("actor content");};

state : TYPE global_vardef (',' global_vardef)* NEWLINE {print("state");};
var : TYPE vardef (',' vardef)* NEWLINE {print("var");};
global_vardef : ID {print("global vardef");};
vardef : ID '=' VALUE {print("vardef");};
receiver : 'as' {print("receiver");};


// TOKENS -----------------------------------------


COMMENT : '#'(ANY_CHAR)* {print("COMMENT");} {skip();};
SPACE : [ \t]+ {skip();} ;

ACTOR : 'actor' {print("ACTOR : " + getText());};
ACTOR_SIZE : '<'NUMBER'>' {print("actor size : " + getText());};
TYPE : ( 'int' | 'char' ) {print("TYPE : " + getText());}; // should support arrays

STRING : '"' CHAR* '"' ;
CHAR : '\'' ( ~([\n"]) | '\\"' | '\\t' | '\\n' | '\\\\' | '"' | '\\\'') '\'' {print("CHAR : " + getText());};
NUMBER : [0-9]+ {print("NUMBER : " + getText());};

VALUE : ( STRING | NUMBER | CHAR ) {print("VALUE : " + getText());};


// keywords
ID : [a-zA-Z_][a-zA-Z_0-9]* {print("ID : " + getText());};




ANY_CHAR : ~('\n') ;
NEWLINE : ('\r'? '\n' | '\r') ;
