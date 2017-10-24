grammar test;

@members {
    void print(String str){
        System.out.println(str);
    }
    private boolean keepNewLine = false;
}

program : 'ali' {keepNewLine = true;} cont ;
cont :  NewLine {keepNewLine = false;} conti;
conti : 'vahid';
NewLine
 : ('\r'? '\n' | '\r') {if(!keepNewLine) skip();}
 ;

Space
 : (' ' | '\t') {skip();}
 ;
// WS : (' ' | '\r' | '\n' | '\t')+ {print} -> channel(HIDDEN); 
