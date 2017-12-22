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
		for (int i = 0; i < logs.size(); i++) {
			System.out.println(logs.get(i));
		}
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

	int putGlobalVar(String name, Type type) throws ItemAlreadyExistsException {
		int offset = SymbolTable.top.getOffset(Register.GP);
        try{
            SymbolTable.top.put(
                new SymbolTableGlobalVariableItem (
                    new Variable(name, type),
                    offset
                )
            );
        }
        catch (ItemAlreadyExistsException iaee){
            name = name+"_temp";
            offset = putGlobalVar(name, type);
            throw iaee;
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

    SymbolTableActorItem putActor(String name, int queueLen) throws ItemAlreadyExistsException, 
													NegativeActorQueueLenException {
		SymbolTableActorItem stai;
        try{
			if(queueLen <= 0){
				throw new NegativeActorQueueLenException(name, queueLen);
			}
			stai = new SymbolTableActorItem(name, queueLen);
            SymbolTable.top.put(stai);
        }
        catch (ItemAlreadyExistsException iaee){
            name = name+"_temp";
            stai = putActor(name, queueLen);
            throw iaee;
        }
		catch (NegativeActorQueueLenException naqle){
			stai = new SymbolTableActorItem(name, 0);
			SymbolTable.top.put(stai);
			throw naqle;
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
				try{
					$stai = putActor($name.getText(), $as.int );
				}
				catch (ItemAlreadyExistsException iaee){
					printErr($name.getLine(), "ERR: Actor already exists: " + $name.getText());
				}
				catch (NegativeActorQueueLenException naqle){
					printErr($as.getLine(), "ERR: Actor '" + naqle.getName() + "' has invalid queue length: " + naqle.getQueueLen());
				}
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
				try{
					$offset = putGlobalVar($nm.getText(), $tp.typeName);
					print("State:\n\tname: " + $nm.getText() + "\n\ttype: " + $tp.typeName.toString() + "\n\toffset: " + $offset + "\n\tsize: " + $tp.typeName.size());
				}
				catch (ItemAlreadyExistsException iaee){
					printErr($nm.getLine(), "ERR: state already exists: " + $nm.getText());
				}
            }
            (',' nm2=ID 
                {
					try{
						$offset = putGlobalVar($nm2.getText(), $tp.typeName);
						print("State:\n\tname: " + $nm2.getText() + "\n\ttype: " + $tp.typeName.toString() + "\n\toffset: " + $offset + "\n\tsize: " + $tp.typeName.size());
					}
					catch (ItemAlreadyExistsException iaee){
						printErr($nm2.getLine(), "ERR: state already exists: " + $nm2.getText());
					}
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
					try {
						$offset = putLocalVar($names.get(i), $types.get(i));
						print("Argument:\n\tname: " + $names.get(i) + "\n\ttype: " + $types.get(i).toString() + "\n\toffset: " + $offset + "\n\tsize: " + $types.get(i).size());
					} catch (ItemAlreadyExistsException iaee) {
						printErr($name.getLine(), "ERR: variable already exists: " + $names.get(i));
					}
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
                try {
					$offset = putLocalVar($nm.getText(), $tp.typeName);
					print("Variable:\n\tname: " + $nm.getText() + "\n\ttype: " + $tp.typeName.toString() + "\n\toffset: " + $offset + "\n\tsize: " + $tp.typeName.size());
				} catch (ItemAlreadyExistsException iaee) {
					printErr($nm.getLine(), "ERR: variable already exists: " + $nm.getText());
				}
            }
            (',' nm2=ID ('=' expr)?
                {
					try {
						$offset = putLocalVar($nm2.getText(), $tp.typeName);
						print("Variable:\n\tname: " + $nm2.getText() + "\n\ttype: " + $tp.typeName.toString() + "\n\toffset: " + $offset + "\n\tsize: " + $tp.typeName.size());
					} catch (ItemAlreadyExistsException iaee) {
						printErr($nm2.getLine(), "ERR: variable already exists: " + $nm2.getText());
					}
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
				try {
					putLocalVar($var.getText(), NoType.getInstance());
				} catch (ItemAlreadyExistsException iaee) {
					printErr($var.getLine(), "ERR: variable already exists: " + $var.getText());
				}
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
