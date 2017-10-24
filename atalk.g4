grammar atalk;

@members {
    void print(String str){
        System.out.println(str);
    }
}

program : (actor) * ;

actor : ACTOR' 'ID '<'NUMBER'>' NEWLINE actorcontent 'end' NEWLINE;
actorcontent : (vardef | receiver)*;

vardef : 'a';
receiver : 'as';



ACTOR : 'actor';

COMMENT : '#'(ANY_CHAR)* {print("COMMENT");} -> skip;
// keywords
ID : [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER : [0-9]+;




ANY_CHAR : ~('\n') ;
WS: [ \r\t]+ -> skip ;
NEWLINE: [\n]+ ;
