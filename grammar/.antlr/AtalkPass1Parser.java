// Generated from /home/vmoh/uni_projs/compiler/Compiler-Atalk-phase4/grammar/AtalkPass1.g4 by ANTLR 4.7

	import java.util.ArrayList ;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AtalkPass1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, CONST_NUM=38, 
		CONST_CHAR=39, CONST_STR=40, NL=41, ID=42, COMMENT=43, WS=44;
	public static final int
		RULE_program = 0, RULE_actor = 1, RULE_state = 2, RULE_receiver = 3, RULE_type = 4, 
		RULE_block = 5, RULE_statements = 6, RULE_statement = 7, RULE_stm_vardef = 8, 
		RULE_stm_tell = 9, RULE_stm_write = 10, RULE_stm_if_elseif_else = 11, 
		RULE_stm_foreach = 12, RULE_stm_quit = 13, RULE_stm_break = 14, RULE_stm_assignment = 15, 
		RULE_expr = 16, RULE_expr_assign = 17, RULE_expr_or = 18, RULE_expr_or_tmp = 19, 
		RULE_expr_and = 20, RULE_expr_and_tmp = 21, RULE_expr_eq = 22, RULE_expr_eq_tmp = 23, 
		RULE_expr_cmp = 24, RULE_expr_cmp_tmp = 25, RULE_expr_add = 26, RULE_expr_add_tmp = 27, 
		RULE_expr_mult = 28, RULE_expr_mult_tmp = 29, RULE_expr_un = 30, RULE_expr_mem = 31, 
		RULE_expr_mem_tmp = 32, RULE_expr_other = 33;
	public static final String[] ruleNames = {
		"program", "actor", "state", "receiver", "type", "block", "statements", 
		"statement", "stm_vardef", "stm_tell", "stm_write", "stm_if_elseif_else", 
		"stm_foreach", "stm_quit", "stm_break", "stm_assignment", "expr", "expr_assign", 
		"expr_or", "expr_or_tmp", "expr_and", "expr_and_tmp", "expr_eq", "expr_eq_tmp", 
		"expr_cmp", "expr_cmp_tmp", "expr_add", "expr_add_tmp", "expr_mult", "expr_mult_tmp", 
		"expr_un", "expr_mem", "expr_mem_tmp", "expr_other"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'actor'", "'<'", "'>'", "'end'", "','", "'receiver'", "'('", "')'", 
		"'char'", "'['", "']'", "'int'", "'begin'", "'='", "'sender'", "'self'", 
		"'<<'", "'write'", "'if'", "'elseif'", "'else'", "'foreach'", "'in'", 
		"'quit'", "'break'", "'or'", "'and'", "'=='", "'<>'", "'+'", "'-'", "'*'", 
		"'/'", "'not'", "'{'", "'}'", "'read'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "CONST_NUM", "CONST_CHAR", "CONST_STR", "NL", "ID", "COMMENT", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AtalkPass1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	    int putLocalVar(int line, String name, Type type) {
			int offset = SymbolTable.top.getOffset(Register.SP);
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

	public AtalkPass1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public boolean hasActor = false;
		public ActorContext ac;
		public List<TerminalNode> NL() { return getTokens(AtalkPass1Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass1Parser.NL, i);
		}
		public List<ActorContext> actor() {
			return getRuleContexts(ActorContext.class);
		}
		public ActorContext actor(int i) {
			return getRuleContext(ActorContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			beginScope();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==NL) {
				{
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(69);
					((ProgramContext)_localctx).ac = actor();
					 ((ProgramContext)_localctx).hasActor =  true; 
					}
					break;
				case NL:
					{
					setState(72);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

						try {
			            	if(!_localctx.hasActor) throw new NoActorException();
						} catch (NoActorException nae) {
							printErr(0, "ERR: No actors defined");
						}
			        

					endScope();
					printLogs();
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActorContext extends ParserRuleContext {
		public SymbolTableActorItem stai;
		public Token name;
		public Token as;
		public ReceiverContext rc;
		public List<TerminalNode> NL() { return getTokens(AtalkPass1Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass1Parser.NL, i);
		}
		public TerminalNode ID() { return getToken(AtalkPass1Parser.ID, 0); }
		public TerminalNode CONST_NUM() { return getToken(AtalkPass1Parser.CONST_NUM, 0); }
		public TerminalNode EOF() { return getToken(AtalkPass1Parser.EOF, 0); }
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<ReceiverContext> receiver() {
			return getRuleContexts(ReceiverContext.class);
		}
		public ReceiverContext receiver(int i) {
			return getRuleContext(ReceiverContext.class,i);
		}
		public ActorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor; }
	}

	public final ActorContext actor() throws RecognitionException {
		ActorContext _localctx = new ActorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_actor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__0);
			setState(82);
			((ActorContext)_localctx).name = match(ID);
			setState(83);
			match(T__1);
			setState(84);
			((ActorContext)_localctx).as = match(CONST_NUM);
			setState(85);
			match(T__2);
			setState(86);
			match(NL);
			 print("Actor:\n\tname: " + ((ActorContext)_localctx).name.getText() + "\n\tqueueLen: " + ((ActorContext)_localctx).as.getText()); 

							((ActorContext)_localctx).stai =  putActor(((ActorContext)_localctx).name.getLine(), ((ActorContext)_localctx).name.getText(), (((ActorContext)_localctx).as!=null?Integer.valueOf(((ActorContext)_localctx).as.getText()):0) );
			                beginScope();
			            
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__11) | (1L << NL))) != 0)) {
				{
				setState(94);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__11:
					{
					setState(89);
					state();
					}
					break;
				case T__5:
					{
					setState(90);
					((ActorContext)_localctx).rc = receiver();
					 _localctx.stai.addReceiver(((ActorContext)_localctx).rc.stri); 
					}
					break;
				case NL:
					{
					setState(93);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__3);
			 endScope(); 
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateContext extends ParserRuleContext {
		public int offset;
		public TypeContext tp;
		public Token nm;
		public Token nm2;
		public TerminalNode NL() { return getToken(AtalkPass1Parser.NL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AtalkPass1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkPass1Parser.ID, i);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			((StateContext)_localctx).tp = type();
			setState(104);
			((StateContext)_localctx).nm = match(ID);

							((StateContext)_localctx).offset =  putGlobalVar(((StateContext)_localctx).nm.getLine(), ((StateContext)_localctx).nm.getText(), ((StateContext)_localctx).tp.typeName);
							print("State:\n\tname: " + ((StateContext)_localctx).nm.getText() + "\n\ttype: " + ((StateContext)_localctx).tp.typeName.toString() + "\n\toffset: " + _localctx.offset + "\n\tsize: " + ((StateContext)_localctx).tp.typeName.size());
			            
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(106);
				match(T__4);
				setState(107);
				((StateContext)_localctx).nm2 = match(ID);

									((StateContext)_localctx).offset =  putGlobalVar(((StateContext)_localctx).nm2.getLine(), ((StateContext)_localctx).nm2.getText(), ((StateContext)_localctx).tp.typeName);
									print("State:\n\tname: " + ((StateContext)_localctx).nm2.getText() + "\n\ttype: " + ((StateContext)_localctx).tp.typeName.toString() + "\n\toffset: " + _localctx.offset + "\n\tsize: " + ((StateContext)_localctx).tp.typeName.size());
				                
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverContext extends ParserRuleContext {
		public SymbolTableReceiverItem stri;
		public ArrayList<Type> types = new ArrayList<Type>();
		public ArrayList<String> names = new ArrayList<String>();
		public int offset;
		public Token name;
		public TypeContext tp;
		public Token nm;
		public TypeContext tp2;
		public Token nm2;
		public List<TerminalNode> NL() { return getTokens(AtalkPass1Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass1Parser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AtalkPass1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkPass1Parser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_receiver);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__5);
			setState(117);
			((ReceiverContext)_localctx).name = match(ID);
			setState(118);
			match(T__6);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__11) {
				{
				setState(119);
				((ReceiverContext)_localctx).tp = type();
				setState(120);
				((ReceiverContext)_localctx).nm = match(ID);

								_localctx.types.add(((ReceiverContext)_localctx).tp.typeName);
								_localctx.names.add(((ReceiverContext)_localctx).nm.getText());
							
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(122);
					match(T__4);
					setState(123);
					((ReceiverContext)_localctx).tp2 = type();
					setState(124);
					((ReceiverContext)_localctx).nm2 = match(ID);

									_localctx.types.add(((ReceiverContext)_localctx).tp2.typeName);
									_localctx.names.add(((ReceiverContext)_localctx).nm2.getText());
								
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(134);
			match(T__7);
			setState(135);
			match(NL);

							print("Receiver:\n\tname: " + ((ReceiverContext)_localctx).name.getText());
							String args = "\targs: ";
							for (int i =0; i < _localctx.types.size(); i++) {
								if (i != 0) {
									args += ", ";
								}
								args += _localctx.types.get(i).toString();
							}
							print(args);
							((ReceiverContext)_localctx).stri =  putReceiver(((ReceiverContext)_localctx).name.getLine(), ((ReceiverContext)_localctx).name.getText(), _localctx.types);
							
							beginScope();
							for (int i = 0; i < _localctx.types.size(); i++) {
								((ReceiverContext)_localctx).offset =  putLocalVar(((ReceiverContext)_localctx).name.getLine(), _localctx.names.get(i), _localctx.types.get(i));
								print("Argument:\n\tname: " + _localctx.names.get(i) + "\n\ttype: " + _localctx.types.get(i).toString() + "\n\toffset: " + _localctx.offset + "\n\tsize: " + _localctx.types.get(i).size());
							}
						
			setState(137);
			statements();
			setState(138);
			match(T__3);
			setState(139);
			match(NL);
			 endScope(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type typeName;
		public int size = 1;
		public ArrayList<Integer> dims = new ArrayList<Integer>();
		public Type x;
		public Token sz;
		public List<TerminalNode> CONST_NUM() { return getTokens(AtalkPass1Parser.CONST_NUM); }
		public TerminalNode CONST_NUM(int i) {
			return getToken(AtalkPass1Parser.CONST_NUM, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(T__8);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(143);
					match(T__9);
					setState(144);
					((TypeContext)_localctx).sz = match(CONST_NUM);
					setState(145);
					match(T__10);

									_localctx.size *= (((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0);

					                try {
										if((((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0) <= 0) {
											throw new NegativeArrayLengthException((((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0));
										}
										else {
											_localctx.dims.add((((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0));
										}
									}
									catch (NegativeArrayLengthException nale){
										printErr(((TypeContext)_localctx).sz.getLine(), "ERR: Array Length is negative.");
										((TypeContext)_localctx).typeName =  new ArrayType(CharType.getInstance(), 0);
									}
								
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

								if (_localctx.size == 1 && (((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0) == 0)
									((TypeContext)_localctx).typeName =  CharType.getInstance();
								else {
									for(int i = _localctx.dims.size()-1; i >= 0; i--){
										if(i == _localctx.dims.size()-1)
											((TypeContext)_localctx).x =  new ArrayType(CharType.getInstance(), _localctx.dims.get(i));
										else
											((TypeContext)_localctx).x =  new ArrayType(_localctx.x, _localctx.dims.get(i));
									}
									((TypeContext)_localctx).typeName =  _localctx.x;
								}
							
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(T__11);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(154);
					match(T__9);
					setState(155);
					((TypeContext)_localctx).sz = match(CONST_NUM);
					setState(156);
					match(T__10);

								_localctx.size *= (((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0);
								try{
									if((((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0) <= 0){
										throw new NegativeArrayLengthException((((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0));
									}
									else {
										_localctx.dims.add((((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0));
									}
								}
								catch (NegativeArrayLengthException nale){
									printErr(((TypeContext)_localctx).sz.getLine(), "ERR: Array Length is negative.");
									((TypeContext)_localctx).typeName =  new ArrayType(IntType.getInstance(), 0);
								}
							
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

							if (_localctx.size == 1 && (((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0) == 0)
								((TypeContext)_localctx).typeName =  IntType.getInstance();
							else if (_localctx.size != 0 && (((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0) != 0) {
								for(int i = _localctx.dims.size()-1; i >= 0; i--){
									if(i == _localctx.dims.size()-1)
										((TypeContext)_localctx).x =  new ArrayType(IntType.getInstance(), _localctx.dims.get(i));
									else
										((TypeContext)_localctx).x =  new ArrayType(_localctx.x, _localctx.dims.get(i));
								}
								((TypeContext)_localctx).typeName =  _localctx.x;
							}
						
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(AtalkPass1Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass1Parser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__12);
			setState(167);
			match(NL);
			 beginScope(); 
			setState(169);
			statements();
			setState(170);
			match(T__3);
			setState(171);
			match(NL);
			 endScope(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(AtalkPass1Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass1Parser.NL, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << NL) | (1L << ID))) != 0)) {
				{
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
				case T__8:
				case T__11:
				case T__12:
				case T__14:
				case T__15:
				case T__17:
				case T__18:
				case T__21:
				case T__23:
				case T__24:
				case T__30:
				case T__33:
				case T__34:
				case T__36:
				case CONST_NUM:
				case CONST_CHAR:
				case CONST_STR:
				case ID:
					{
					setState(174);
					statement();
					}
					break;
				case NL:
					{
					setState(175);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Stm_breakContext sb;
		public Stm_vardefContext stm_vardef() {
			return getRuleContext(Stm_vardefContext.class,0);
		}
		public Stm_assignmentContext stm_assignment() {
			return getRuleContext(Stm_assignmentContext.class,0);
		}
		public Stm_foreachContext stm_foreach() {
			return getRuleContext(Stm_foreachContext.class,0);
		}
		public Stm_if_elseif_elseContext stm_if_elseif_else() {
			return getRuleContext(Stm_if_elseif_elseContext.class,0);
		}
		public Stm_quitContext stm_quit() {
			return getRuleContext(Stm_quitContext.class,0);
		}
		public Stm_breakContext stm_break() {
			return getRuleContext(Stm_breakContext.class,0);
		}
		public Stm_tellContext stm_tell() {
			return getRuleContext(Stm_tellContext.class,0);
		}
		public Stm_writeContext stm_write() {
			return getRuleContext(Stm_writeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				stm_vardef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				stm_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				stm_foreach();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				stm_if_elseif_else();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				stm_quit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				((StatementContext)_localctx).sb = stm_break();
				 sawBreak(((StatementContext)_localctx).sb.line); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				stm_tell();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(190);
				stm_write();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(191);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_vardefContext extends ParserRuleContext {
		public int offset;
		public TypeContext tp;
		public Token nm;
		public Token nm2;
		public TerminalNode NL() { return getToken(AtalkPass1Parser.NL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AtalkPass1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkPass1Parser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Stm_vardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_vardef; }
	}

	public final Stm_vardefContext stm_vardef() throws RecognitionException {
		Stm_vardefContext _localctx = new Stm_vardefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stm_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			((Stm_vardefContext)_localctx).tp = type();
			setState(195);
			((Stm_vardefContext)_localctx).nm = match(ID);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(196);
				match(T__13);
				setState(197);
				expr();
				}
			}


			                ((Stm_vardefContext)_localctx).offset =  putLocalVar(((Stm_vardefContext)_localctx).nm.getLine(), ((Stm_vardefContext)_localctx).nm.getText(), ((Stm_vardefContext)_localctx).tp.typeName);
							print("Variable:\n\tname: " + ((Stm_vardefContext)_localctx).nm.getText() + "\n\ttype: " + ((Stm_vardefContext)_localctx).tp.typeName.toString() + "\n\toffset: " + _localctx.offset + "\n\tsize: " + ((Stm_vardefContext)_localctx).tp.typeName.size());
			            
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(201);
				match(T__4);
				setState(202);
				((Stm_vardefContext)_localctx).nm2 = match(ID);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(203);
					match(T__13);
					setState(204);
					expr();
					}
				}


									((Stm_vardefContext)_localctx).offset =  putLocalVar(((Stm_vardefContext)_localctx).nm2.getLine(), ((Stm_vardefContext)_localctx).nm2.getText(), ((Stm_vardefContext)_localctx).tp.typeName);
									print("Variable:\n\tname: " + ((Stm_vardefContext)_localctx).nm2.getText() + "\n\ttype: " + ((Stm_vardefContext)_localctx).tp.typeName.toString() + "\n\toffset: " + _localctx.offset + "\n\tsize: " + ((Stm_vardefContext)_localctx).tp.typeName.size());
				                
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_tellContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AtalkPass1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkPass1Parser.ID, i);
		}
		public TerminalNode NL() { return getToken(AtalkPass1Parser.NL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Stm_tellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_tell; }
	}

	public final Stm_tellContext stm_tell() throws RecognitionException {
		Stm_tellContext _localctx = new Stm_tellContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stm_tell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(216);
			match(T__16);
			setState(217);
			match(ID);
			setState(218);
			match(T__6);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				setState(219);
				expr();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(220);
					match(T__4);
					setState(221);
					expr();
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(229);
			match(T__7);
			setState(230);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_writeContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(AtalkPass1Parser.NL, 0); }
		public Stm_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_write; }
	}

	public final Stm_writeContext stm_write() throws RecognitionException {
		Stm_writeContext _localctx = new Stm_writeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stm_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__17);
			setState(233);
			match(T__6);
			setState(234);
			expr();
			setState(235);
			match(T__7);
			setState(236);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_if_elseif_elseContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(AtalkPass1Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass1Parser.NL, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Stm_if_elseif_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_if_elseif_else; }
	}

	public final Stm_if_elseif_elseContext stm_if_elseif_else() throws RecognitionException {
		Stm_if_elseif_elseContext _localctx = new Stm_if_elseif_elseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stm_if_elseif_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__18);
			setState(239);
			expr();
			setState(240);
			match(NL);

							beginScope();
						
			setState(242);
			statements();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(243);
				match(T__19);
				setState(244);
				expr();
				setState(245);
				match(NL);

								endScope();
								beginScope();
							
				setState(247);
				statements();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(254);
				match(T__20);
				setState(255);
				match(NL);

								endScope();
								beginScope();
							
				setState(257);
				statements();
				}
			}

			setState(260);
			match(T__3);
			setState(261);
			match(NL);

							endScope();
						
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_foreachContext extends ParserRuleContext {
		public Token var;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AtalkPass1Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass1Parser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ID() { return getToken(AtalkPass1Parser.ID, 0); }
		public Stm_foreachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_foreach; }
	}

	public final Stm_foreachContext stm_foreach() throws RecognitionException {
		Stm_foreachContext _localctx = new Stm_foreachContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stm_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__21);
			setState(265);
			((Stm_foreachContext)_localctx).var = match(ID);
			setState(266);
			match(T__22);
			setState(267);
			expr();
			setState(268);
			match(NL);

							beginForeach();
							beginScope();
							putLocalVar(((Stm_foreachContext)_localctx).var.getLine(), ((Stm_foreachContext)_localctx).var.getText(), IntType.getInstance());
						
			setState(270);
			statements();
			setState(271);
			match(T__3);
			setState(272);
			match(NL);

							endForeach();
							endScope();
						
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_quitContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(AtalkPass1Parser.NL, 0); }
		public Stm_quitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_quit; }
	}

	public final Stm_quitContext stm_quit() throws RecognitionException {
		Stm_quitContext _localctx = new Stm_quitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stm_quit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__23);
			setState(276);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_breakContext extends ParserRuleContext {
		public int line;
		public Token brk;
		public TerminalNode NL() { return getToken(AtalkPass1Parser.NL, 0); }
		public Stm_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_break; }
	}

	public final Stm_breakContext stm_break() throws RecognitionException {
		Stm_breakContext _localctx = new Stm_breakContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stm_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			((Stm_breakContext)_localctx).brk = match(T__24);
			setState(279);
			match(NL);
			((Stm_breakContext)_localctx).line =  ((Stm_breakContext)_localctx).brk.getLine();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_assignmentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(AtalkPass1Parser.NL, 0); }
		public Stm_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_assignment; }
	}

	public final Stm_assignmentContext stm_assignment() throws RecognitionException {
		Stm_assignmentContext _localctx = new Stm_assignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stm_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			expr();
			setState(283);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Expr_assignContext expr_assign() {
			return getRuleContext(Expr_assignContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			expr_assign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_assignContext extends ParserRuleContext {
		public Expr_orContext expr_or() {
			return getRuleContext(Expr_orContext.class,0);
		}
		public Expr_assignContext expr_assign() {
			return getRuleContext(Expr_assignContext.class,0);
		}
		public Expr_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_assign; }
	}

	public final Expr_assignContext expr_assign() throws RecognitionException {
		Expr_assignContext _localctx = new Expr_assignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_assign);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				expr_or();
				setState(288);
				match(T__13);
				setState(289);
				expr_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				expr_or();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_orContext extends ParserRuleContext {
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_or_tmpContext expr_or_tmp() {
			return getRuleContext(Expr_or_tmpContext.class,0);
		}
		public Expr_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or; }
	}

	public final Expr_orContext expr_or() throws RecognitionException {
		Expr_orContext _localctx = new Expr_orContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			expr_and();
			setState(295);
			expr_or_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_or_tmpContext extends ParserRuleContext {
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_or_tmpContext expr_or_tmp() {
			return getRuleContext(Expr_or_tmpContext.class,0);
		}
		public Expr_or_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or_tmp; }
	}

	public final Expr_or_tmpContext expr_or_tmp() throws RecognitionException {
		Expr_or_tmpContext _localctx = new Expr_or_tmpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_or_tmp);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(T__25);
				setState(298);
				expr_and();
				setState(299);
				expr_or_tmp();
				}
				break;
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_andContext extends ParserRuleContext {
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_and_tmpContext expr_and_tmp() {
			return getRuleContext(Expr_and_tmpContext.class,0);
		}
		public Expr_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and; }
	}

	public final Expr_andContext expr_and() throws RecognitionException {
		Expr_andContext _localctx = new Expr_andContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			expr_eq();
			setState(305);
			expr_and_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_and_tmpContext extends ParserRuleContext {
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_and_tmpContext expr_and_tmp() {
			return getRuleContext(Expr_and_tmpContext.class,0);
		}
		public Expr_and_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and_tmp; }
	}

	public final Expr_and_tmpContext expr_and_tmp() throws RecognitionException {
		Expr_and_tmpContext _localctx = new Expr_and_tmpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr_and_tmp);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(T__26);
				setState(308);
				expr_eq();
				setState(309);
				expr_and_tmp();
				}
				break;
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_eqContext extends ParserRuleContext {
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Expr_eq_tmpContext expr_eq_tmp() {
			return getRuleContext(Expr_eq_tmpContext.class,0);
		}
		public Expr_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq; }
	}

	public final Expr_eqContext expr_eq() throws RecognitionException {
		Expr_eqContext _localctx = new Expr_eqContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			expr_cmp();
			setState(315);
			expr_eq_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_eq_tmpContext extends ParserRuleContext {
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Expr_eq_tmpContext expr_eq_tmp() {
			return getRuleContext(Expr_eq_tmpContext.class,0);
		}
		public Expr_eq_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq_tmp; }
	}

	public final Expr_eq_tmpContext expr_eq_tmp() throws RecognitionException {
		Expr_eq_tmpContext _localctx = new Expr_eq_tmpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr_eq_tmp);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(318);
				expr_cmp();
				setState(319);
				expr_eq_tmp();
				}
				break;
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__26:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_cmpContext extends ParserRuleContext {
		public Expr_addContext expr_add() {
			return getRuleContext(Expr_addContext.class,0);
		}
		public Expr_cmp_tmpContext expr_cmp_tmp() {
			return getRuleContext(Expr_cmp_tmpContext.class,0);
		}
		public Expr_cmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp; }
	}

	public final Expr_cmpContext expr_cmp() throws RecognitionException {
		Expr_cmpContext _localctx = new Expr_cmpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr_cmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			expr_add();
			setState(325);
			expr_cmp_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_cmp_tmpContext extends ParserRuleContext {
		public Expr_addContext expr_add() {
			return getRuleContext(Expr_addContext.class,0);
		}
		public Expr_cmp_tmpContext expr_cmp_tmp() {
			return getRuleContext(Expr_cmp_tmpContext.class,0);
		}
		public Expr_cmp_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp_tmp; }
	}

	public final Expr_cmp_tmpContext expr_cmp_tmp() throws RecognitionException {
		Expr_cmp_tmpContext _localctx = new Expr_cmp_tmpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr_cmp_tmp);
		int _la;
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(328);
				expr_add();
				setState(329);
				expr_cmp_tmp();
				}
				break;
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_addContext extends ParserRuleContext {
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public Expr_add_tmpContext expr_add_tmp() {
			return getRuleContext(Expr_add_tmpContext.class,0);
		}
		public Expr_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add; }
	}

	public final Expr_addContext expr_add() throws RecognitionException {
		Expr_addContext _localctx = new Expr_addContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			expr_mult();
			setState(335);
			expr_add_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_add_tmpContext extends ParserRuleContext {
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public Expr_add_tmpContext expr_add_tmp() {
			return getRuleContext(Expr_add_tmpContext.class,0);
		}
		public Expr_add_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add_tmp; }
	}

	public final Expr_add_tmpContext expr_add_tmp() throws RecognitionException {
		Expr_add_tmpContext _localctx = new Expr_add_tmpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr_add_tmp);
		int _la;
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(338);
				expr_mult();
				setState(339);
				expr_add_tmp();
				}
				break;
			case T__1:
			case T__2:
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_multContext extends ParserRuleContext {
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_mult_tmpContext expr_mult_tmp() {
			return getRuleContext(Expr_mult_tmpContext.class,0);
		}
		public Expr_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult; }
	}

	public final Expr_multContext expr_mult() throws RecognitionException {
		Expr_multContext _localctx = new Expr_multContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			expr_un();
			setState(345);
			expr_mult_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_mult_tmpContext extends ParserRuleContext {
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_mult_tmpContext expr_mult_tmp() {
			return getRuleContext(Expr_mult_tmpContext.class,0);
		}
		public Expr_mult_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult_tmp; }
	}

	public final Expr_mult_tmpContext expr_mult_tmp() throws RecognitionException {
		Expr_mult_tmpContext _localctx = new Expr_mult_tmpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expr_mult_tmp);
		int _la;
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(348);
				expr_un();
				setState(349);
				expr_mult_tmp();
				}
				break;
			case T__1:
			case T__2:
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_unContext extends ParserRuleContext {
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_memContext expr_mem() {
			return getRuleContext(Expr_memContext.class,0);
		}
		public Expr_unContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_un; }
	}

	public final Expr_unContext expr_un() throws RecognitionException {
		Expr_unContext _localctx = new Expr_unContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expr_un);
		int _la;
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__33) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(355);
				expr_un();
				}
				break;
			case T__6:
			case T__34:
			case T__36:
			case CONST_NUM:
			case CONST_CHAR:
			case CONST_STR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				expr_mem();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_memContext extends ParserRuleContext {
		public Expr_otherContext expr_other() {
			return getRuleContext(Expr_otherContext.class,0);
		}
		public Expr_mem_tmpContext expr_mem_tmp() {
			return getRuleContext(Expr_mem_tmpContext.class,0);
		}
		public Expr_memContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mem; }
	}

	public final Expr_memContext expr_mem() throws RecognitionException {
		Expr_memContext _localctx = new Expr_memContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr_mem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			expr_other();
			setState(360);
			expr_mem_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_mem_tmpContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_mem_tmpContext expr_mem_tmp() {
			return getRuleContext(Expr_mem_tmpContext.class,0);
		}
		public Expr_mem_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mem_tmp; }
	}

	public final Expr_mem_tmpContext expr_mem_tmp() throws RecognitionException {
		Expr_mem_tmpContext _localctx = new Expr_mem_tmpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr_mem_tmp);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(T__9);
				setState(363);
				expr();
				setState(364);
				match(T__10);
				setState(365);
				expr_mem_tmp();
				}
				break;
			case T__1:
			case T__2:
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_otherContext extends ParserRuleContext {
		public TerminalNode CONST_NUM() { return getToken(AtalkPass1Parser.CONST_NUM, 0); }
		public TerminalNode CONST_CHAR() { return getToken(AtalkPass1Parser.CONST_CHAR, 0); }
		public TerminalNode CONST_STR() { return getToken(AtalkPass1Parser.CONST_STR, 0); }
		public TerminalNode ID() { return getToken(AtalkPass1Parser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_otherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_other; }
	}

	public final Expr_otherContext expr_other() throws RecognitionException {
		Expr_otherContext _localctx = new Expr_otherContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expr_other);
		int _la;
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(CONST_NUM);
				}
				break;
			case CONST_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(CONST_CHAR);
				}
				break;
			case CONST_STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				match(CONST_STR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				match(ID);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(374);
				match(T__34);
				setState(375);
				expr();
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(376);
					match(T__4);
					setState(377);
					expr();
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 6);
				{
				setState(385);
				match(T__36);
				setState(386);
				match(T__6);
				setState(387);
				match(CONST_NUM);
				setState(388);
				match(T__7);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(389);
				match(T__6);
				setState(390);
				expr();
				setState(391);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u018e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3a\n\3\f\3"+
		"\16\3d\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4p\n\4\f\4\16\4"+
		"s\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0082\n"+
		"\5\f\5\16\5\u0085\13\5\5\5\u0087\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\7\6\u0096\n\6\f\6\16\6\u0099\13\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6\u00a1\n\6\f\6\16\6\u00a4\13\6\3\6\5\6\u00a7\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\b\u00b3\n\b\f\b\16\b\u00b6\13\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c3\n\t\3\n\3\n\3\n\3\n\5\n"+
		"\u00c9\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d0\n\n\3\n\7\n\u00d3\n\n\f\n\16"+
		"\n\u00d6\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00e1\n"+
		"\13\f\13\16\13\u00e4\13\13\5\13\u00e6\n\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00fc\n\r"+
		"\f\r\16\r\u00ff\13\r\3\r\3\r\3\r\3\r\5\r\u0105\n\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0127\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u0131\n\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u013b\n\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0145\n\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u014f\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0159\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37\u0163\n\37\3"+
		" \3 \3 \5 \u0168\n \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0173\n\"\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\7#\u017d\n#\f#\16#\u0180\13#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\5#\u018c\n#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BD\2\t\3\3++\4\2\21\22,,\3\2\36\37\3\2\4\5\3"+
		"\2 !\3\2\"#\4\2!!$$\2\u0197\2F\3\2\2\2\4S\3\2\2\2\6i\3\2\2\2\bv\3\2\2"+
		"\2\n\u00a6\3\2\2\2\f\u00a8\3\2\2\2\16\u00b4\3\2\2\2\20\u00c2\3\2\2\2\22"+
		"\u00c4\3\2\2\2\24\u00d9\3\2\2\2\26\u00ea\3\2\2\2\30\u00f0\3\2\2\2\32\u010a"+
		"\3\2\2\2\34\u0115\3\2\2\2\36\u0118\3\2\2\2 \u011c\3\2\2\2\"\u011f\3\2"+
		"\2\2$\u0126\3\2\2\2&\u0128\3\2\2\2(\u0130\3\2\2\2*\u0132\3\2\2\2,\u013a"+
		"\3\2\2\2.\u013c\3\2\2\2\60\u0144\3\2\2\2\62\u0146\3\2\2\2\64\u014e\3\2"+
		"\2\2\66\u0150\3\2\2\28\u0158\3\2\2\2:\u015a\3\2\2\2<\u0162\3\2\2\2>\u0167"+
		"\3\2\2\2@\u0169\3\2\2\2B\u0172\3\2\2\2D\u018b\3\2\2\2FM\b\2\1\2GH\5\4"+
		"\3\2HI\b\2\1\2IL\3\2\2\2JL\7+\2\2KG\3\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2"+
		"\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\b\2\1\2QR\b\2\1\2R\3\3\2\2\2ST\7"+
		"\3\2\2TU\7,\2\2UV\7\4\2\2VW\7(\2\2WX\7\5\2\2XY\7+\2\2YZ\b\3\1\2Zb\b\3"+
		"\1\2[a\5\6\4\2\\]\5\b\5\2]^\b\3\1\2^a\3\2\2\2_a\7+\2\2`[\3\2\2\2`\\\3"+
		"\2\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7"+
		"\6\2\2fg\b\3\1\2gh\t\2\2\2h\5\3\2\2\2ij\5\n\6\2jk\7,\2\2kq\b\4\1\2lm\7"+
		"\7\2\2mn\7,\2\2np\b\4\1\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3"+
		"\2\2\2sq\3\2\2\2tu\7+\2\2u\7\3\2\2\2vw\7\b\2\2wx\7,\2\2x\u0086\7\t\2\2"+
		"yz\5\n\6\2z{\7,\2\2{\u0083\b\5\1\2|}\7\7\2\2}~\5\n\6\2~\177\7,\2\2\177"+
		"\u0080\b\5\1\2\u0080\u0082\3\2\2\2\u0081|\3\2\2\2\u0082\u0085\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086y\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\7\n\2\2\u0089\u008a\7+\2\2\u008a\u008b\b\5\1\2\u008b\u008c\5\16"+
		"\b\2\u008c\u008d\7\6\2\2\u008d\u008e\7+\2\2\u008e\u008f\b\5\1\2\u008f"+
		"\t\3\2\2\2\u0090\u0097\7\13\2\2\u0091\u0092\7\f\2\2\u0092\u0093\7(\2\2"+
		"\u0093\u0094\7\r\2\2\u0094\u0096\b\6\1\2\u0095\u0091\3\2\2\2\u0096\u0099"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u00a7\b\6\1\2\u009b\u00a2\7\16\2\2\u009c\u009d\7"+
		"\f\2\2\u009d\u009e\7(\2\2\u009e\u009f\7\r\2\2\u009f\u00a1\b\6\1\2\u00a0"+
		"\u009c\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\b\6\1\2\u00a6"+
		"\u0090\3\2\2\2\u00a6\u009b\3\2\2\2\u00a7\13\3\2\2\2\u00a8\u00a9\7\17\2"+
		"\2\u00a9\u00aa\7+\2\2\u00aa\u00ab\b\7\1\2\u00ab\u00ac\5\16\b\2\u00ac\u00ad"+
		"\7\6\2\2\u00ad\u00ae\7+\2\2\u00ae\u00af\b\7\1\2\u00af\r\3\2\2\2\u00b0"+
		"\u00b3\5\20\t\2\u00b1\u00b3\7+\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2"+
		"\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\17\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00c3\5\22\n\2\u00b8\u00c3\5 \21"+
		"\2\u00b9\u00c3\5\32\16\2\u00ba\u00c3\5\30\r\2\u00bb\u00c3\5\34\17\2\u00bc"+
		"\u00bd\5\36\20\2\u00bd\u00be\b\t\1\2\u00be\u00c3\3\2\2\2\u00bf\u00c3\5"+
		"\24\13\2\u00c0\u00c3\5\26\f\2\u00c1\u00c3\5\f\7\2\u00c2\u00b7\3\2\2\2"+
		"\u00c2\u00b8\3\2\2\2\u00c2\u00b9\3\2\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00bb"+
		"\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\21\3\2\2\2\u00c4\u00c5\5\n\6\2\u00c5\u00c8\7,\2\2"+
		"\u00c6\u00c7\7\20\2\2\u00c7\u00c9\5\"\22\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d4\b\n\1\2\u00cb\u00cc\7\7\2\2\u00cc"+
		"\u00cf\7,\2\2\u00cd\u00ce\7\20\2\2\u00ce\u00d0\5\"\22\2\u00cf\u00cd\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\b\n\1\2\u00d2"+
		"\u00cb\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7+\2\2\u00d8"+
		"\23\3\2\2\2\u00d9\u00da\t\3\2\2\u00da\u00db\7\23\2\2\u00db\u00dc\7,\2"+
		"\2\u00dc\u00e5\7\t\2\2\u00dd\u00e2\5\"\22\2\u00de\u00df\7\7\2\2\u00df"+
		"\u00e1\5\"\22\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3"+
		"\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00dd\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7\n"+
		"\2\2\u00e8\u00e9\7+\2\2\u00e9\25\3\2\2\2\u00ea\u00eb\7\24\2\2\u00eb\u00ec"+
		"\7\t\2\2\u00ec\u00ed\5\"\22\2\u00ed\u00ee\7\n\2\2\u00ee\u00ef\7+\2\2\u00ef"+
		"\27\3\2\2\2\u00f0\u00f1\7\25\2\2\u00f1\u00f2\5\"\22\2\u00f2\u00f3\7+\2"+
		"\2\u00f3\u00f4\b\r\1\2\u00f4\u00fd\5\16\b\2\u00f5\u00f6\7\26\2\2\u00f6"+
		"\u00f7\5\"\22\2\u00f7\u00f8\7+\2\2\u00f8\u00f9\b\r\1\2\u00f9\u00fa\5\16"+
		"\b\2\u00fa\u00fc\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0104\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u0100\u0101\7\27\2\2\u0101\u0102\7+\2\2\u0102\u0103\b\r\1\2\u0103"+
		"\u0105\5\16\b\2\u0104\u0100\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3"+
		"\2\2\2\u0106\u0107\7\6\2\2\u0107\u0108\7+\2\2\u0108\u0109\b\r\1\2\u0109"+
		"\31\3\2\2\2\u010a\u010b\7\30\2\2\u010b\u010c\7,\2\2\u010c\u010d\7\31\2"+
		"\2\u010d\u010e\5\"\22\2\u010e\u010f\7+\2\2\u010f\u0110\b\16\1\2\u0110"+
		"\u0111\5\16\b\2\u0111\u0112\7\6\2\2\u0112\u0113\7+\2\2\u0113\u0114\b\16"+
		"\1\2\u0114\33\3\2\2\2\u0115\u0116\7\32\2\2\u0116\u0117\7+\2\2\u0117\35"+
		"\3\2\2\2\u0118\u0119\7\33\2\2\u0119\u011a\7+\2\2\u011a\u011b\b\20\1\2"+
		"\u011b\37\3\2\2\2\u011c\u011d\5\"\22\2\u011d\u011e\7+\2\2\u011e!\3\2\2"+
		"\2\u011f\u0120\5$\23\2\u0120#\3\2\2\2\u0121\u0122\5&\24\2\u0122\u0123"+
		"\7\20\2\2\u0123\u0124\5$\23\2\u0124\u0127\3\2\2\2\u0125\u0127\5&\24\2"+
		"\u0126\u0121\3\2\2\2\u0126\u0125\3\2\2\2\u0127%\3\2\2\2\u0128\u0129\5"+
		"*\26\2\u0129\u012a\5(\25\2\u012a\'\3\2\2\2\u012b\u012c\7\34\2\2\u012c"+
		"\u012d\5*\26\2\u012d\u012e\5(\25\2\u012e\u0131\3\2\2\2\u012f\u0131\3\2"+
		"\2\2\u0130\u012b\3\2\2\2\u0130\u012f\3\2\2\2\u0131)\3\2\2\2\u0132\u0133"+
		"\5.\30\2\u0133\u0134\5,\27\2\u0134+\3\2\2\2\u0135\u0136\7\35\2\2\u0136"+
		"\u0137\5.\30\2\u0137\u0138\5,\27\2\u0138\u013b\3\2\2\2\u0139\u013b\3\2"+
		"\2\2\u013a\u0135\3\2\2\2\u013a\u0139\3\2\2\2\u013b-\3\2\2\2\u013c\u013d"+
		"\5\62\32\2\u013d\u013e\5\60\31\2\u013e/\3\2\2\2\u013f\u0140\t\4\2\2\u0140"+
		"\u0141\5\62\32\2\u0141\u0142\5\60\31\2\u0142\u0145\3\2\2\2\u0143\u0145"+
		"\3\2\2\2\u0144\u013f\3\2\2\2\u0144\u0143\3\2\2\2\u0145\61\3\2\2\2\u0146"+
		"\u0147\5\66\34\2\u0147\u0148\5\64\33\2\u0148\63\3\2\2\2\u0149\u014a\t"+
		"\5\2\2\u014a\u014b\5\66\34\2\u014b\u014c\5\64\33\2\u014c\u014f\3\2\2\2"+
		"\u014d\u014f\3\2\2\2\u014e\u0149\3\2\2\2\u014e\u014d\3\2\2\2\u014f\65"+
		"\3\2\2\2\u0150\u0151\5:\36\2\u0151\u0152\58\35\2\u0152\67\3\2\2\2\u0153"+
		"\u0154\t\6\2\2\u0154\u0155\5:\36\2\u0155\u0156\58\35\2\u0156\u0159\3\2"+
		"\2\2\u0157\u0159\3\2\2\2\u0158\u0153\3\2\2\2\u0158\u0157\3\2\2\2\u0159"+
		"9\3\2\2\2\u015a\u015b\5> \2\u015b\u015c\5<\37\2\u015c;\3\2\2\2\u015d\u015e"+
		"\t\7\2\2\u015e\u015f\5> \2\u015f\u0160\5<\37\2\u0160\u0163\3\2\2\2\u0161"+
		"\u0163\3\2\2\2\u0162\u015d\3\2\2\2\u0162\u0161\3\2\2\2\u0163=\3\2\2\2"+
		"\u0164\u0165\t\b\2\2\u0165\u0168\5> \2\u0166\u0168\5@!\2\u0167\u0164\3"+
		"\2\2\2\u0167\u0166\3\2\2\2\u0168?\3\2\2\2\u0169\u016a\5D#\2\u016a\u016b"+
		"\5B\"\2\u016bA\3\2\2\2\u016c\u016d\7\f\2\2\u016d\u016e\5\"\22\2\u016e"+
		"\u016f\7\r\2\2\u016f\u0170\5B\"\2\u0170\u0173\3\2\2\2\u0171\u0173\3\2"+
		"\2\2\u0172\u016c\3\2\2\2\u0172\u0171\3\2\2\2\u0173C\3\2\2\2\u0174\u018c"+
		"\7(\2\2\u0175\u018c\7)\2\2\u0176\u018c\7*\2\2\u0177\u018c\7,\2\2\u0178"+
		"\u0179\7%\2\2\u0179\u017e\5\"\22\2\u017a\u017b\7\7\2\2\u017b\u017d\5\""+
		"\22\2\u017c\u017a\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\7&"+
		"\2\2\u0182\u018c\3\2\2\2\u0183\u0184\7\'\2\2\u0184\u0185\7\t\2\2\u0185"+
		"\u0186\7(\2\2\u0186\u018c\7\n\2\2\u0187\u0188\7\t\2\2\u0188\u0189\5\""+
		"\22\2\u0189\u018a\7\n\2\2\u018a\u018c\3\2\2\2\u018b\u0174\3\2\2\2\u018b"+
		"\u0175\3\2\2\2\u018b\u0176\3\2\2\2\u018b\u0177\3\2\2\2\u018b\u0178\3\2"+
		"\2\2\u018b\u0183\3\2\2\2\u018b\u0187\3\2\2\2\u018cE\3\2\2\2!KM`bq\u0083"+
		"\u0086\u0097\u00a2\u00a6\u00b2\u00b4\u00c2\u00c8\u00cf\u00d4\u00e2\u00e5"+
		"\u00fd\u0104\u0126\u0130\u013a\u0144\u014e\u0158\u0162\u0167\u0172\u017e"+
		"\u018b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}