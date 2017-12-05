grammar atalk;

@header {
	import java.util.ArrayList ;
}

@members {
	int foreachs = 0;
	boolean hasErr = false;

    void print(String str){
		if (hasErr)
			return;
        System.out.println(str);
    }
	void printErr(String str){
		hasErr = true;
        System.out.println(str);
    }
    void log(String str){
        // System.out.println(str);
    }

	void beginForeach() {
		foreachs ++;
	}
	void sawBreak() {
		try {
			if (foreachs <= 0)
				throw new BreakOutsideForeach();
		} catch (BreakOutsideForeach bof) {
			print("ERR: Found a break not blonging to any foreach.");
		}
	}
	void endForeach() {
		foreachs --;
	}

    void putLocalVar(String name, Type type) throws ItemAlreadyExistsException {
        try{
            SymbolTable.top.put(
                new SymbolTableLocalVariableItem(
                    new Variable(name, type),
                    SymbolTable.top.getOffset(Register.SP)
                )
            );
        }
        catch (ItemAlreadyExistsException iaee){
            name = name+"_temp";
            putLocalVar(name, type);
            throw iaee;
        }
    }

	void putGlobalVar(String name, Type type) throws ItemAlreadyExistsException {
        try{
            SymbolTable.top.put(
                new SymbolTableLocalVariableItem(
                    new Variable(name, type),
                    SymbolTable.top.getOffset(Register.GP)
                )
            );
        }
        catch (ItemAlreadyExistsException iaee){
            name = name+"_temp";
            putGlobalVar(name, type);
            throw iaee;
        }
    }
    
    void putReceiver(String name, ArrayList<Type> args) throws ItemAlreadyExistsException {
        try{
            SymbolTable.top.put(
                new SymbolTableReceiverItem(name, args)
            );
        }
        catch (ItemAlreadyExistsException iaee){
            name = name+"_temp";
            putReceiver(name, args);
            throw iaee;
        }
    }

    void putActor(String name, int queueLen) throws ItemAlreadyExistsException, 
													NegativeActorQueueLenException {
        try{
			if(queueLen <= 0){
				throw new NegativeActorQueueLenException(name, queueLen);
			}
            SymbolTable.top.put(
                new SymbolTableActorItem(name, queueLen)
            );
        }
        catch (ItemAlreadyExistsException iaee){
            name = name+"_temp";
            putActor(name, queueLen);
            throw iaee;
        }
		catch (NegativeActorQueueLenException naqle){
			// putActor(name, 0);
			SymbolTable.top.put(
                new SymbolTableActorItem(name, 0)
            );
			throw naqle;
		}
    }

    void beginScope() {
    	int offset = 0;
    	if(SymbolTable.top != null)
        	offset = SymbolTable.top.getOffset(Register.SP);
        SymbolTable.push(new SymbolTable());
        SymbolTable.top.setOffset(Register.SP, offset);
		SymbolTable.top.setOffset(Register.GP, offset); // chera?
    }
    
    void endScope() {
        print("Stack offset: " + SymbolTable.top.getOffset(Register.SP));
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
            if(!$hasActor) throw new NoActorException();
        }
    {endScope();}
    ; 
    catch[NoActorException nae] {printErr("ERR: No actors defined");}
    // catch[SameActorNameException sane] {printErr("ERR: there is an actor with the same name as ");}
actor
    : 'actor' name=ID '<' as=CONST_NUM '>' NL
            {
				try{
					putActor($name.getText(), $as.int );
				}
				catch (ItemAlreadyExistsException iaee){
					printErr("ERR: Actor already exists: " + iaee.getName());
				}
				catch (NegativeActorQueueLenException naqle){
					printErr("ERR: Actor '" + naqle.getName() 
					+ "' has invalid queue length: " + naqle.getQueueLen());
				}
                beginScope();
            }
        (state | receiver | NL)*
        'end'
            { endScope(); }
        (NL | EOF)
            { print("actor : " + $name.getText() + "<" + $as.getText() + ">"); }
    ;

state
	:
		tp=type nm=ID
            {
				try{
					putGlobalVar($nm.getText(), $tp.typeName);
				}
				catch (ItemAlreadyExistsException iaee){
					printErr("ERR: state already exists: " + iaee.getName());
				}
            }
            (',' nm2=ID 
                {
					try{
						putGlobalVar($nm2.getText(), $tp.typeName);
					}
					catch (ItemAlreadyExistsException iaee){
						printErr("ERR: state already exists: " + iaee.getName());
					}
                }
            )* NL
	;

receiver locals [ArrayList<Type> types = new ArrayList<Type>()]
	: 
		'receiver' name=ID '(' (tp=type 
			{
				$types.add($tp.typeName);
			}
		ID (',' tp2=type 
		 	{
				$types.add($tp2.typeName);
			}
		ID)*)? ')' NL 
			{
				try{
					putReceiver($name.getText(), $types);
				}
				catch (ItemAlreadyExistsException iaee) {
					printErr("ERR: Receiver already exists: " + iaee.getName());
				}
				beginScope();
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

                try{
					if($sz.int <= 0){		
						throw new NegativeArrayLengthException($sz.int);
					}
					else{
						// $typeName = new ArrayType(CharType.getInstance(), $sz.int);
						$dims.add($sz.int);
					}
				}
				catch (NegativeArrayLengthException nale){
					printErr("ERR: Array Length is negative.");
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
				else{
					// $typeName = new ArrayType(IntType.getInstance(), $sz.int);
					$dims.add($sz.int);
				}
			}
			catch (NegativeArrayLengthException nale){
				printErr("ERR: Array Length is negative.");
				$typeName = new ArrayType(IntType.getInstance(), 0);
			}
		})* 
		{
			if ($size == 1 && $sz.int == 0)
				$typeName = IntType.getInstance();
			else {
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
	|	stm_break { sawBreak(); }
	|	stm_tell
	|	stm_write
	|	block
	;

stm_vardef:
		tp=type nm=ID ('=' expr)?
            {
                putLocalVar($nm.getText(), $tp.typeName);
            }
            (',' nm2=ID ('=' expr)?
                {
                    putLocalVar($nm2.getText(), $tp.typeName);
                }
            )* NL
	;
    catch[ItemAlreadyExistsException iaee] {printErr("ERR: variable already exists: " + iaee.getName());}

stm_tell:
		(ID | 'sender' | 'self') '<<' ID '(' (expr (',' expr)*)? ')' NL
	;

stm_write:
		'write' '(' expr ')' NL
	;

stm_if_elseif_else:
		'if' expr NL statements
		('elseif' expr NL statements)*
		('else' NL statements)?
		'end' NL
	;

stm_foreach:
		'foreach' ID 'in' expr NL
			{
				beginForeach();
				beginScope();
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

stm_break:
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
