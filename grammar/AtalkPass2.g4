grammar AtalkPass2;

@header {
	import java.util.ArrayList ;
}

@members {
	boolean hasErr = false;
	ArrayList<String> logs = new ArrayList<String>();
	String currentActor;

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

	void checkVariableExistance(int line, String name) {
		SymbolTableItem sti = SymbolTable.top.get(name);
		try {
			if(sti == null) {
				throw new UndefinedVariableException();
			}
			else {
				cerr("hast " + name);
			}
		} catch (UndefinedVariableException uve) {
			try {
				SymbolTable.define();
				putLocalVar(name, NoType.getInstance());
			} catch (ItemAlreadyExistsException iaee) {
				printErr(line, "ERR: variable already exists: " + iaee.getName());
			}
			printErr(line, "Item " + name + " doesn't exist.");
		}
	}

	void checkActorExistance(int line, String name) {
		SymbolTableItem sti = SymbolTable.top.get(name);
		try {
			if(sti == null) {
				throw new UndefinedActorException();
			} else {
				cerr("actor hast " + name);
			}
		} catch (UndefinedActorException uae) {
			printErr(line, "Actor " + name + " doesn't exist.");
		}
	}
	void checkReceiverExistance(int line, String actor, String receiverKey) {
		SymbolTableActorItem stai = (SymbolTableActorItem) SymbolTable.top.get(actor);
		try {
			if (stai != null && !stai.hasReceiver(receiverKey)) {
				// stai.printReceivers();
				throw new UndefinedReceiverException();
			}
		} catch (UndefinedReceiverException ure) {
			printErr(line, "Receiver " + receiverKey + " doesn't exist in Actor " + actor + ".");
		}
	}
	Type getIDType(String name) {
		SymbolTableLocalVariableItem stlvi = (SymbolTableLocalVariableItem) SymbolTable.top.get(name);
		Variable var = stlvi.getVariable();
		return var.getType();
	}
	void typeCheck(int line, Type t1, Type t2) {
		try {
			if (!t1.equals(t2)) {
				throw new TypeErrorException();
			}
		} catch (TypeErrorException tee) {
			printErr(line, "Can't convert type " + t2.toString() + " to " + t1.toString());
		}
	}
	void checkArrayDim(int line, Type type, int dim) {
		try {
			if (!(type instanceof ArrayType && dim <= ((ArrayType) type).dim())) {
				throw new TypeErrorException();
			}
		} catch (TypeErrorException tee) {
			printErr(line, "Array " + type.toString() + " dimmentions count is less than " + dim);
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
    : 'actor' act=ID {currentActor = $act.getText();} '<' CONST_NUM '>' NL
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

stm_tell locals [String rcKey, String actorName]
	:
		(act=ID {
			$actorName = $act.getText();
			checkActorExistance($act.line, $actorName);
		}
		| 'sender'
		| 'self' {
			$actorName = currentActor;
		})
		'<<' rc=ID {
			$rcKey = $rc.getText();
		}
		'(' (ex=expr {$rcKey += ":" + $ex.retType.toString();}
		(',' ex2=expr {$rcKey += ":" + $ex2.retType.toString();} )*)? ')' NL 
		{
			checkReceiverExistance($rc.line, $actorName, $rcKey);
		}
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

expr returns [int line, boolean is_lvalue, Type retType]
	:
		expr_assign {$retType = IntType.getInstance();}
	;

expr_assign returns [int line, boolean is_lvalue, Type retType]
	:
		expr_or '=' expr_assign
	|	expr_or
	;

expr_or returns [int line, boolean is_lvalue, Type retType]
	:
		expr_and expr_or_tmp
	;

expr_or_tmp returns [int line, boolean is_lvalue, Type retType]
	:
		'or' expr_and expr_or_tmp
	|
	;

expr_and returns [int line, boolean is_lvalue, Type retType]
	:
		expr_eq expr_and_tmp
	;

expr_and_tmp returns [int line, boolean is_lvalue, Type retType]
	:
		'and' expr_eq expr_and_tmp
	|
	;

expr_eq returns [int line, boolean is_lvalue, Type retType]
	:
		expr_cmp expr_eq_tmp
	;

expr_eq_tmp returns [int line, boolean is_lvalue, Type retType]
	:
		('==' | '<>') expr_cmp expr_eq_tmp
	|
	;

expr_cmp returns [int line, boolean is_lvalue, Type retType]
	:
		expr_add expr_cmp_tmp
	;

expr_cmp_tmp returns [int line, boolean is_lvalue, Type retType]
	:
		('<' | '>') expr_add expr_cmp_tmp
	|
	;

expr_add returns [int line, boolean is_lvalue, Type retType]
	:
		expr_mult expr_add_tmp
	;

expr_add_tmp returns [int line, boolean is_lvalue, Type retType]
	:
		('+' | '-') expr_mult expr_add_tmp
	|
	;

expr_mult returns [int line, boolean is_lvalue, Type retType]
	:
		exp=expr_un exp2=expr_mult_tmp {
			if (!$exp2.retType.equals(NoType.getInstance())) {
				typeCheck($exp.line, $exp.retType, $exp2.retType);
			}
			$is_lvalue = $exp.is_lvalue && $exp2.is_lvalue;
			$retType = $exp.retType;
			$line = $exp.line;
		}
	;

expr_mult_tmp returns [int line, boolean is_lvalue, Type retType]
	:
		('*' | '/') exp=expr_un exp2=expr_mult_tmp {
			if (!$exp2.retType.equals(NoType.getInstance())) {
				typeCheck($exp.line, $exp.retType, $exp2.retType);
			}
			$is_lvalue = false; $retType = $exp.retType;
			$is_lvalue = true;
			$retType = NoType.getInstance();
			$line = $exp.line;
		}
	;

expr_un returns [int line, boolean is_lvalue, Type retType]
	:
		('not' | '-') exp=expr_un {
			$is_lvalue = false;
			$retType = $exp.retType;
			$line = $exp.line;
		}
	|	exp2=expr_mem {
			$is_lvalue = $exp2.is_lvalue;
			$retType = $exp2.retType;
			$line = $exp2.line;
		}
	;

expr_mem returns [int line, boolean is_lvalue, Type retType]
	:
		exp=expr_other {
			$is_lvalue = $exp.is_lvalue;
			$retType = $exp.retType;
			$line = $exp.line;
		} expmt=expr_mem_tmp {
			checkArrayDim($exp.line, $exp.retType, $expmt.dim);
		}
	;

expr_mem_tmp returns [int dim]
	:
		'[' expr ']' expmt=expr_mem_tmp { $dim = $expmt.dim; }
	| { $dim = 0; }
	;

expr_other returns [int line, boolean is_lvalue, Type retType] locals [int arrayLength = 0]
	:
		l=CONST_NUM {$is_lvalue = false; $retType = IntType.getInstance(); $line = $l.line;}
	|	l=CONST_CHAR {$is_lvalue = false; $retType = CharType.getInstance(); $line = $l.line;}
	|	str=CONST_STR {$is_lvalue = false; $retType = new ArrayType(CharType.getInstance(), $str.getText().length()); $line = $str.line;}
	|	var=ID { checkVariableExistance($var.line, $var.getText()); $is_lvalue = true; $retType = getIDType($var.getText()); $line = $var.line;}
	|	lineToken='{' exp=expr {
			$arrayLength = 1;
		} (',' exp2=expr {
			$line = $lineToken.line;
			typeCheck($lineToken.line, $exp2.retType, $exp.retType);
			$arrayLength += 1;
		})* '}' {
			$is_lvalue = false; $retType = new ArrayType($exp.retType, $arrayLength);
		}
	|	'read' '(' alen=CONST_NUM ')' {
		$is_lvalue = false;
		$retType = new ArrayType(CharType.getInstance(), $alen.int);
		$line = $alen.line;
	}
	|	'(' exp=expr ')' {
		$is_lvalue = $exp.is_lvalue; $retType = $exp.retType;
		$line = $exp.line;
	}
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
