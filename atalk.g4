grammar atalk;

@members {
    void print(String str){
        System.out.println(str);
    }
}

program : (COMMENT) * ;

COMMENT : '#'ANY_CHAR*;
ANY_CHAR : . ;
// WS : [ \r\t\n]+ -> skip ;
