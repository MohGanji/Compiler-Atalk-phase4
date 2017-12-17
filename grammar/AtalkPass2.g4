grammar AtalkPass2;

@header {
	import java.util.ArrayList ;
}

@members {
	boolean hasErr = false;
	ArrayList<String> logs = new ArrayList<String>();

	void cerr(String str) {
		System.out.println(str);
	}
    void print(String str){
		// logs.add(str);
    }
	void printErr(int line, String str){
		hasErr = true;
        System.out.println("line " + line + ": " + str);
    }
	void printLogs() {
		if (hasErr)
			return;
		for (int i = 0; i < logs.size(); i++) {
			System.out.println(logs.get(i));
		}
	}

    void beginScope() {
        SymbolTable.push();
    }

    void endScope() {
        print("Stack offset: " + SymbolTable.top.getOffset(Register.SP) + ", Global offset: " + SymbolTable.top.getOffset(Register.GP));
        SymbolTable.pop();
    }

	int putLocalVar(String name, Type type) throws ItemAlreadyExistsException {
		int offset = SymbolTable.top.getOffset(Register.SP);
        try{
            SymbolTable.top.put(
                new SymbolTableLocalVariableItem(
                    new Variable(name, type),
                    offset
                )
            );
        }
        catch (ItemAlreadyExistsException iaee){
            name = name+"_temp";
            offset = putLocalVar(name, type);
            throw iaee;
        }
		return offset;
    }

	void checkExistance(int line, String name) {
		SymbolTableItem sti = SymbolTable.top.get(name);
		try {
			if(sti == null) {
				throw new UndefinedVariableException();
			}
			else {
				SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) sti;
				cerr("hast " + name);
				// print(line + ") Variable " + name + " used.\t\t" +   "Base Reg: " + var.getBaseRegister() + ", Offset: " + var.getOffset());
			}
		} catch (UndefinedVariableException uve) {
			try{
				putLocalVar(name, NoType.getInstance());
			} catch (ItemAlreadyExistsException iaee) {
				printErr(line, "ERR: variable already exists: " + iaee.getName());
			}
			printErr(line, "Item " + name + " doesn't exist.");
		}
	}
}


program
    : { beginScope(); }
    (
        actor
        | NL
    ) *
    {
		endScope();
		printLogs();
	}
    ;
actor
    : 'actor' ID '<' CONST_NUM '>' NL
            { beginScope(); }
        (state | receiver | NL)*
        'end'
            { endScope(); }
        (NL | EOF)
    ;

state
	:
		type ID (',' ID)* NL
	;

receiver
	: 
		'receiver' ID '(' (type ID
		(',' type ID
		)*)? ')' NL 
			{ beginScope(); }
		statements 
		'end' NL
			{ endScope(); }
	;

type returns [Type return_type] 
	:
		'char' ('[' CONST_NUM ']')* { $return_type = CharType.getInstance(); }
	|	'int' ('[' CONST_NUM ']')* { $return_type = IntType.getInstance(); }
	;

block
	:
		'begin' NL
            { beginScope(); }
			statements
		'end' NL
            { endScope(); }        
	;

statements
	:
		(statement | NL)*
	;

statement:
		stm_vardef
	|	stm_assignment
	|	stm_foreach
	|	stm_if_elseif_else
	|	stm_quit
	|	stm_break
	|	stm_tell
	|	stm_write
	|	block
	;

stm_vardef
	:
		type ID { SymbolTable.define(); } ('=' expr)?
            (',' ID { SymbolTable.define(); } ('=' expr)?)* NL
	;

stm_tell:
		(ID | 'sender' | 'self') '<<' ID '(' (expr (',' expr)*)? ')' NL
	;

stm_write:
		'write' '(' expr ')' NL
	;

stm_if_elseif_else:
		'if' expr NL
			{ beginScope(); }
		statements
		('elseif' expr NL
			{
				endScope();
				beginScope();
			}
		statements)*
		('else' NL
			{
				endScope();
				beginScope();
			}
		statements)?
		'end' NL
			{ endScope(); }
	;

stm_foreach:
		'foreach' ID 'in' expr NL
			{ beginScope(); }
		statements
		'end' NL
			{ endScope(); }
	;

stm_quit:
		'quit' NL
	;

stm_break
	:
		'break' NL
	;

stm_assignment:
		expr NL
	;

expr:
		expr_assign
	;

expr_assign:
		expr_or '=' expr_assign
	|	expr_or
	;

expr_or:
		expr_and expr_or_tmp
	;

expr_or_tmp:
		'or' expr_and expr_or_tmp
	|
	;

expr_and:
		expr_eq expr_and_tmp
	;

expr_and_tmp:
		'and' expr_eq expr_and_tmp
	|
	;

expr_eq:
		expr_cmp expr_eq_tmp
	;

expr_eq_tmp:
		('==' | '<>') expr_cmp expr_eq_tmp
	|
	;

expr_cmp:
		expr_add expr_cmp_tmp
	;

expr_cmp_tmp:
		('<' | '>') expr_add expr_cmp_tmp
	|
	;

expr_add:
		expr_mult expr_add_tmp
	;

expr_add_tmp:
		('+' | '-') expr_mult expr_add_tmp
	|
	;

expr_mult:
		expr_un expr_mult_tmp
	;

expr_mult_tmp:
		('*' | '/') expr_un expr_mult_tmp
	|
	;

expr_un:
		('not' | '-') expr_un
	|	expr_mem
	;

expr_mem:
		expr_other expr_mem_tmp
	;

expr_mem_tmp:
		'[' expr ']' expr_mem_tmp
	|
	;

expr_other:
		CONST_NUM
	|	CONST_CHAR
	|	CONST_STR
	|	var=ID { checkExistance($var.line, $var.getText()); }
	|	'{' expr (',' expr)* '}'
	|	'read' '(' CONST_NUM ')'
	|	'(' expr ')'
	;

CONST_NUM:
		[0-9]+
	;

CONST_CHAR:
		'\'' . '\''
	;

CONST_STR:
		'"' ~('\r' | '\n' | '"')* '"'
	;

NL:
		'\r'? '\n' { setText("new_line"); }
	;

ID:
		[a-zA-Z_][a-zA-Z0-9_]*
	;

COMMENT:
		'#'(~[\r\n])* -> skip
	;

WS:
    	[ \t] -> skip
    ;
