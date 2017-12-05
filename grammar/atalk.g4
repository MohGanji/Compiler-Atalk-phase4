grammar atalk;

@members {
    void print(String str){
        System.out.println(str);
    }
    void log(String str){
        // System.out.println(str);
    }

	int foreachs = 0;

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
    
    void putReceiver(String name) throws ItemAlreadyExistsException {
        try{
            SymbolTable.top.put(
                new SymbolTableReceiverItem(name)
            );
        }
        catch (ItemAlreadyExistsException iaee){
            name = name+"_temp";
            putReceiver(name);
            throw iaee;
        }
    }

    void putActor(String name, int queueLen) throws ItemAlreadyExistsException {
        try{
            SymbolTable.top.put(
                new SymbolTableActorItem(name, queueLen)
            );
        }
        catch (ItemAlreadyExistsException iaee){
            name = name+"_temp";
            putActor(name, queueLen);
            throw iaee;
        }
    }

    void beginScope() {
    	int offset = 0;
    	if(SymbolTable.top != null)
        	offset = SymbolTable.top.getOffset(Register.SP);
        SymbolTable.push(new SymbolTable());
        SymbolTable.top.setOffset(Register.SP, offset);
		SymbolTable.top.setOffset(Register.GP, offset);
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
    catch[NoActorException nae] {print("ERR: No actors defined");}
    // catch[SameActorNameException sane] {print("ERR: there is an actor with the same name as ");}
actor
    : 'actor' name=ID '<' as=CONST_NUM '>' NL
            {
                putActor($name.getText(), $as.int );
                beginScope();
            }
        (state | receiver | NL)*
        'end'
            { endScope(); }
        (NL | EOF)
            { print("actor : " + $name.getText() + "<" + $as.getText() + ">"); }
    ;
    catch[ItemAlreadyExistsException iaee] {print("ERR: Actor already exists: " + iaee.getName());}

state
	:
		tp=type nm=ID
            {
                putGlobalVar($nm.getText(), $tp.typeName);
            }
            (',' nm2=ID 
                {
                    putGlobalVar($nm2.getText(), $tp.typeName);
                }
            )* NL
	;
    catch[ItemAlreadyExistsException iaee] {print("ERR: state already exists: " + iaee.getName());}

receiver
	:
		'receiver' name=ID '(' (type ID (',' type ID)*)? ')' NL
			{
                putReceiver($name.getText());
				beginScope();
			}
			statements
		'end' NL
			{ endScope(); }
	;
    catch[ItemAlreadyExistsException iaee] {print("ERR: Receiver already exists: " + iaee.getName());}

type returns [Type typeName] locals [int size = 1]
    :
		'char' ('[' sz=CONST_NUM ']' {$size *= $sz.int;})*
            {
                if ($size == 1)
                    $typeName = CharType.getInstance();
                else
                    $typeName = ArrayType.getInstance();
            }
	|	'int' ('[' sz=CONST_NUM ']' {$size *= $sz.int;})* {
                if ($size == 1)
                    $typeName = IntType.getInstance();
                else
                    $typeName = ArrayType.getInstance();
            }
	;

block
	:
		'begin' NL
            { beginScope(); }
			statements
		'end' NL
            { beginScope(); }        
	;

statements:
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
    catch[ItemAlreadyExistsException iaee] {print("ERR: variable already exists: " + iaee.getName());}

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
