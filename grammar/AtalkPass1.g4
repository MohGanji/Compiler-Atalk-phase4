grammar AtalkPass1;

@header {
	import java.util.ArrayList ;
}

@members {
	int foreachs = 0;
	boolean hasErr = false;
	ArrayList<String> logs = new ArrayList<String>();

	void cerr(String str) {
		System.out.println(str);
	}
    void print(String str){
		logs.add(str);
    }
	void printErr(int line, String str){
		hasErr = true;
        System.out.println("line " + line + ": " + str);
    }
	void printLogs() {
		if (hasErr) {
			cerr("------------------------------ Pass 1 finished ------");
			return;
		}
		// for (int i = 0; i < logs.size(); i++) {
		// 	System.out.println(logs.get(i));
		// }
		cerr("------------------------------ Pass 1 finished ------");
	}

	void beginForeach() {
		foreachs ++;
	}
	void sawBreak(int line) {
		try {
			if (foreachs <= 0)
				throw new BreakOutsideForeach();
		} catch (BreakOutsideForeach bof) {
			printErr(line, "ERR: Found a break not blonging to any foreach.");
		}
	}
	void endForeach() {
		foreachs --;
	}

    int putLocalVar(int line, String name, Type type) {
		int offset = SymbolTable.top.getOffset(Register.SP);
		cerr("" + offset);
		boolean f = true;
		String nm = name;
		while (f) {
			try{
				SymbolTable.top.put(
					new SymbolTableLocalVariableItem(
						new Variable(nm, type),
						offset
					)
				);
				f = false;
			}
			catch (ItemAlreadyExistsException iaee){
				if (nm.equals(name))
					printErr(line, "ERR: Variable already exists: " + name);
				nm = nm+"_temp";
			}
		}
		return offset;
    }

	int putGlobalVar(int line, String name, Type type) {
		int offset = SymbolTable.top.getOffset(Register.GP);
		boolean f = true;
		String nm = name;
		while (f) {
			try {
				SymbolTable.top.put(
					new SymbolTableGlobalVariableItem (
						new Variable(nm, type),
						offset
					)
				);
				f = false;
			}
			catch (ItemAlreadyExistsException iaee){
				if (nm.equals(name))
					printErr(line, "ERR: State already exists: " + name);
				nm = nm+"_temp";
			}
		}
		return offset;
    }
    
    SymbolTableReceiverItem putReceiver(int line, String name, ArrayList<Type> args) {
		SymbolTableReceiverItem stri = new SymbolTableReceiverItem(name, args);
		boolean f = true;
		String nm = name;
		while(f){
			try{
				stri = new SymbolTableReceiverItem(nm, args);
				SymbolTable.top.put(stri);
				f = false;
			}
			catch (ItemAlreadyExistsException iaee){
				if(nm.equals(name))
					printErr(line, "ERR: Receiver already exists: " + name);
				nm = nm+"_temp";
			}
		}
		return stri;
    }

    SymbolTableActorItem putActor(int line, String name, int queueLen) {
		try {
			if(queueLen <= 0){
				throw new NegativeActorQueueLenException(name, queueLen);
			}
		} catch (NegativeActorQueueLenException naqle){
			queueLen = 0;
			printErr(line, "ERR: Actor '" + name + "' has invalid queue length: " + queueLen);
		}
		SymbolTableActorItem stai = new SymbolTableActorItem(name, queueLen);
		boolean f = true;
		String nm = name;
		while(f){
			try {
				stai = new SymbolTableActorItem(nm, queueLen);
				SymbolTable.top.put(stai);
				f = false;
			}
			catch (ItemAlreadyExistsException iaee){
				if(nm.equals(name))
					printErr(line, "ERR: Actor already exists: " + name);
				nm = nm+"_temp";
			}
		}
		return stai;
    }

	void beginScope() {
    	int localOffset = 0;
    	int globalOffset = 0;
    	
    	if(SymbolTable.top != null) {
        	localOffset = SymbolTable.top.getOffset(Register.SP);
        	globalOffset = SymbolTable.top.getOffset(Register.GP);
    	}

        SymbolTable.push(new SymbolTable(SymbolTable.top));

        SymbolTable.top.setOffset(Register.SP, localOffset);
        SymbolTable.top.setOffset(Register.GP, globalOffset);
    }
    
    void endScope() {
        print("Stack offset: " + SymbolTable.top.getOffset(Register.SP) + ", Global offset: " + SymbolTable.top.getOffset(Register.GP));
        
        if(SymbolTable.top.getPreSymbolTable() != null) {
            SymbolTable.top.getPreSymbolTable().setOffset(
                Register.GP,
                SymbolTable.top.getOffset(Register.GP)
            );
			SymbolTable.top.updateLocalStackSize(SymbolTable.top.getOffset(Register.SP) - SymbolTable.top.getPreSymbolTable().getOffset(Register.SP));
        }

        SymbolTable.pop();
    }
}


program locals [boolean hasActor=false]
    : {beginScope();} 
    (
        ac=actor { $hasActor = true; }
        | NL
    ) *
        {
			try {
            	if(!$hasActor) throw new NoActorException();
			} catch (NoActorException nae) {
				printErr(0, "ERR: No actors defined");
			}
        }
    {
		endScope();
		printLogs();
	}
    ;
actor locals [SymbolTableActorItem stai]
    : 'actor' name=ID '<' as=CONST_NUM '>' NL
		{ print("Actor:\n\tname: " + $name.getText() + "\n\tqueueLen: " + $as.getText()); }
            {
				$stai = putActor($name.getLine(), $name.getText(), $as.int );
                beginScope();
            }
        (state | rc=receiver { $stai.addReceiver($rc.stri); } | NL)*
        'end'
            { endScope(); }
        (NL | EOF)
    ;

state locals [int offset]
	:
		tp=type nm=ID
            {
				$offset = putGlobalVar($nm.getLine(), $nm.getText(), $tp.typeName);
				print("State:\n\tname: " + $nm.getText() + "\n\ttype: " + $tp.typeName.toString() + "\n\toffset: " + $offset + "\n\tsize: " + $tp.typeName.size());
            }
            (',' nm2=ID 
                {
					$offset = putGlobalVar($nm2.getLine(), $nm2.getText(), $tp.typeName);
					print("State:\n\tname: " + $nm2.getText() + "\n\ttype: " + $tp.typeName.toString() + "\n\toffset: " + $offset + "\n\tsize: " + $tp.typeName.size());
                }
            )* NL
	;

receiver returns [SymbolTableReceiverItem stri] locals [ArrayList<Type> types = new ArrayList<Type>(), ArrayList<String> names = new ArrayList<String>(), int offset]
	: 
		'receiver' name=ID '(' (tp=type nm=ID
			{
				$types.add($tp.typeName);
				$names.add($nm.getText());
			}
		(',' tp2=type nm2=ID
		 	{
				$types.add($tp2.typeName);
				$names.add($nm2.getText());
			}
		)*)? ')' NL 
			{
				print("Receiver:\n\tname: " + $name.getText());
				String args = "\targs: ";
				for (int i =0; i < $types.size(); i++) {
					if (i != 0) {
						args += ", ";
					}
					args += $types.get(i).toString();
				}
				print(args);
				$stri = putReceiver($name.getLine(), $name.getText(), $types);
				
				beginScope();
				for (int i = 0; i < $types.size(); i++) {
					$offset = putLocalVar($name.getLine(), $names.get(i), $types.get(i));
					print("Argument:\n\tname: " + $names.get(i) + "\n\ttype: " + $types.get(i).toString() + "\n\toffset: " + $offset + "\n\tsize: " + $types.get(i).size());
				}
			}
		statements 
		'end' NL
			{ endScope(); }
	;

type returns [Type typeName] locals [int size = 1, ArrayList<Integer> dims = new ArrayList<Integer>(), Type x]
	:
		'char' ('[' sz=CONST_NUM ']' 
			{
				$size *= $sz.int;

                try {
					if($sz.int <= 0) {
						throw new NegativeArrayLengthException($sz.int);
					}
					else {
						$dims.add($sz.int);
					}
				}
				catch (NegativeArrayLengthException nale){
					printErr($sz.getLine(), "ERR: Array Length is negative.");
					$typeName = new ArrayType(CharType.getInstance(), 0);
				}
			})* 
			{
				if ($size == 1 && $sz.int == 0)
					$typeName = CharType.getInstance();
				else {
					for(int i = $dims.size()-1; i >= 0; i--){
						if(i == $dims.size()-1)
							$x = new ArrayType(CharType.getInstance(), $dims.get(i));
						else
							$x = new ArrayType($x, $dims.get(i));
					}
					$typeName = $x;
				}
			}
	|	'int' ('[' sz=CONST_NUM ']'
		{
			$size *= $sz.int;
			try{
				if($sz.int <= 0){
					throw new NegativeArrayLengthException($sz.int);
				}
				else {
					$dims.add($sz.int);
				}
			}
			catch (NegativeArrayLengthException nale){
				printErr($sz.getLine(), "ERR: Array Length is negative.");
				$typeName = new ArrayType(IntType.getInstance(), 0);
			}
		})* 
		{
			if ($size == 1 && $sz.int == 0)
				$typeName = IntType.getInstance();
			else if ($size != 0 && $sz.int != 0) {
				for(int i = $dims.size()-1; i >= 0; i--){
					if(i == $dims.size()-1)
						$x = new ArrayType(IntType.getInstance(), $dims.get(i));
					else
						$x = new ArrayType($x, $dims.get(i));
				}
				$typeName = $x;
			}
		}
                
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
	|	sb=stm_break { sawBreak($sb.line); }
	|	stm_tell
	|	stm_write
	|	block
	;

stm_vardef locals [int offset]
	:
		tp=type nm=ID ('=' expr)?
            {
                $offset = putLocalVar($nm.getLine(), $nm.getText(), $tp.typeName);
				print("Variable:\n\tname: " + $nm.getText() + "\n\ttype: " + $tp.typeName.toString() + "\n\toffset: " + $offset + "\n\tsize: " + $tp.typeName.size());
            }
            (',' nm2=ID ('=' expr)?
                {
					$offset = putLocalVar($nm2.getLine(), $nm2.getText(), $tp.typeName);
					print("Variable:\n\tname: " + $nm2.getText() + "\n\ttype: " + $tp.typeName.toString() + "\n\toffset: " + $offset + "\n\tsize: " + $tp.typeName.size());
                }
            )* NL
	;

stm_tell:
		(ID | 'sender' | 'self') '<<' ID '(' (expr (',' expr)*)? ')' NL
	;

stm_write:
		'write' '(' expr ')' NL
	;

stm_if_elseif_else:
		'if' expr NL
			{
				beginScope();
			}
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
			{
				endScope();
			}
	;

stm_foreach:
		'foreach' var=ID 'in' expr NL
			{
				beginForeach();
				beginScope();
				putLocalVar($var.getLine(), $var.getText(), IntType.getInstance());
			}
		statements
		'end' NL
			{
				endForeach();
				endScope();
			}
	;

stm_quit:
		'quit' NL
	;

stm_break returns [int line]
	:
		brk='break' NL {$line = $brk.getLine();}
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
	|	ID
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
