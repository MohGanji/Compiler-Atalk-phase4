grammar LolPass2;

@members{
    
    void print(String str){
        System.out.println(str);
    }

    void beginScope() {
        SymbolTable.push();
    }

    void endScope() {
        print("Stack offset: " + SymbolTable.top.getOffset(Register.SP) + ", Global offset: " + SymbolTable.top.getOffset(Register.GP));
        SymbolTable.pop();
    }
}

program
    :
    { 
        print("Pass2 started -------------------------");
        beginScope(); 
    }    
        (statement)*    
    {
        endScope();
        print("Pass2 finished -------------------------");
    }
    ;

statement
    : 
        vardef ';' 
    |   static_vardef ';'
    |   expr ';' 
    |   block
    ;

static_vardef
    :
        'static' var_type = type var_id = ID
    ;

vardef
    :   
        var_type = type var_id = ID
        { SymbolTable.define(); }
    ;

type returns [Type return_type] 
    :
        'int' { $return_type = IntType.getInstance(); }
    ;

block
    : 
    	{ beginScope(); }
        '{' (statement)* '}'
    	{ endScope(); }
    ;

expr
    : 
        (
            'out' '<-' expr
            |
            expr_add op = '<-' expr
        )
    |   expr_add 
    ;

expr_add
    :
        expr_mult expr_add_tmp
    ;

expr_add_tmp
    : 
        op=('+'|'-') expr_mult expr_add_tmp
    |
    ;

expr_mult
    : 
        expr_other expr_mult_tmp
    ;

expr_mult_tmp
    : 
        op=('*'|'/') expr_other expr_mult_tmp
    |
    ;

expr_other
    :
        CONST_INT
    |   id = ID
        { 
            SymbolTableItem item = SymbolTable.top.get($id.text);
            if(item == null) {
                print($id.line + ") Item " + $id.text + " doesn't exist.");
            }
            else {
                SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) item;
                print($id.line + ") Variable " + $id.text + " used.\t\t" +   "Base Reg: " + var.getBaseRegister() + ", Offset: " + var.getOffset());
            }
        }
    |   '(' expr ')'
    ;

CONST_INT:
        [0-9]+
    ;

ID:
        [a-zA-Z_][a-zA-Z0-9_]*
    ;

WS:
        [ \r\t\n]+ -> skip
    ;
