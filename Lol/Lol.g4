grammar Lol;

@members{
    
    void print(String str){
        System.out.println(str);
    }

    void putLocalVar(String name, Type type) throws ItemAlreadyExistsException {
        SymbolTable.top.put(
            new SymbolTableLocalVariableItem(
                new Variable(name, type),
                SymbolTable.top.getOffset(Register.SP)
            )
        );
    }

    void beginScope() {
    	int offset = 0;
    	if(SymbolTable.top != null)
        	offset = SymbolTable.top.getOffset(Register.SP);
        SymbolTable.push(new SymbolTable());
        SymbolTable.top.setOffset(Register.SP, offset);
    }
    
    void endScope() {
        print("Stack offset: " + SymbolTable.top.getOffset(Register.SP));
        SymbolTable.pop();
    }
}

program
    :
    { 
        beginScope(); 
    }    
        (statement)*    
    {
        endScope();
    }
    ;

statement
    : 
        vardef ';' 
    |   expr ';' 
    |   block
    ;

vardef
    :   
        var_type = type var_id = ID ('<-' expr)? 
        {
            try {
                putLocalVar($var_id.text, $var_type.return_type);
            }
            catch(ItemAlreadyExistsException e) {
            	print(String.format("[Line #%s] Variable \"%s\" already exists.", $var_id.getLine(), $var_id.text));
            }
        }
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
        ('out' | expr_add) '<-' expr
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
    |   ID 
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
