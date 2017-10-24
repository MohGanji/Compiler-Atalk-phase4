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

state : {print("state start");} TYPE global_vardef (',' global_vardef)* NEWLINE {print("state");};
global_vardef : ID {print("global vardef");};

receiver : RECEIVER ID arguments receiver_content END NEWLINE {print("receiver");};
arguments : '('(arg_var)*')' NEWLINE {print("arguments");};
arg_var : TYPE global_vardef {print("arg var");};
receiver_content : (var)* {print("receiver content");};
var : TYPE vardef (',' vardef)* NEWLINE {print("var");};
vardef : ID ('=' value)? {print("vardef");};
value : ( STRING | NUMBER | CHAR ) {print("value");};


// TOKENS -----------------------------------------


COMMENT : (NEWLINE '#'(ANY_CHAR)* | '#'(ANY_CHAR)*) {print("COMMENT : " + getText());} {skip();};
NEWLINE : ('\r\n' | '\n')+ {print("NEWLINE");};
SPACE : [ \t]+ {skip();} ;

ACTOR : 'actor' {print("ACTOR : " + getText());};
RECEIVER : 'receiver';
TYPE : ( 'int' | 'char' ) {print("TYPE : " + getText());}; // should support arrays

END : 'end' {print("END");};
STRING : '"' CHAR* '"' ;
CHAR : '\'' ( ~([\n"]) | '\\"' | '\\t' | '\\n' | '\\\\' | '"' | '\\\'') '\'' {print("CHAR : " + getText());};
NUMBER : [0-9]+ {print("NUMBER : " + getText());};



// keywords
ID : [a-zA-Z_][a-zA-Z_0-9]* {print("ID : " + getText());};




ANY_CHAR : ~('\n') ;
