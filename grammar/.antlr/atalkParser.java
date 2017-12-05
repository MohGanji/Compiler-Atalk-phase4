// Generated from /home/vmoh/uni_projs/compiler/Compiler-Atalk-phase2/grammar/atalk.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class atalkParser extends Parser {
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
	public String getGrammarFileName() { return "atalk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public atalkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public boolean hasActor = false;
		public ActorContext ac;
		public List<TerminalNode> NL() { return getTokens(atalkParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(atalkParser.NL, i);
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

			            if(!_localctx.hasActor) throw new NoActorException();
			        
			endScope();
			}
		}
		catch (NoActorException nae) {
			print("ERR: No actors defined");
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActorContext extends ParserRuleContext {
		public Token name;
		public Token as;
		public List<TerminalNode> NL() { return getTokens(atalkParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(atalkParser.NL, i);
		}
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public TerminalNode CONST_NUM() { return getToken(atalkParser.CONST_NUM, 0); }
		public TerminalNode EOF() { return getToken(atalkParser.EOF, 0); }
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

			                putActor(((ActorContext)_localctx).name.getText(), (((ActorContext)_localctx).as!=null?Integer.valueOf(((ActorContext)_localctx).as.getText()):0) );
			                beginScope();
			            
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__11) | (1L << NL))) != 0)) {
				{
				setState(91);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__11:
					{
					setState(88);
					state();
					}
					break;
				case T__5:
					{
					setState(89);
					receiver();
					}
					break;
				case NL:
					{
					setState(90);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(T__3);
			 endScope(); 
			setState(98);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 print("actor : " + ((ActorContext)_localctx).name.getText() + "<" + ((ActorContext)_localctx).as.getText() + ">"); 
			}
		}
		catch (ItemAlreadyExistsException iaee) {
			print("ERR: Actor already exists: " + iaee.getName());
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateContext extends ParserRuleContext {
		public TypeContext tp;
		public Token nm;
		public Token nm2;
		public TerminalNode NL() { return getToken(atalkParser.NL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(atalkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(atalkParser.ID, i);
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
			setState(101);
			((StateContext)_localctx).tp = type();
			setState(102);
			((StateContext)_localctx).nm = match(ID);

			                putGlobalVar(((StateContext)_localctx).nm.getText(), ((StateContext)_localctx).tp.typeName);
			            
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(104);
				match(T__4);
				setState(105);
				((StateContext)_localctx).nm2 = match(ID);

				                    putGlobalVar(((StateContext)_localctx).nm2.getText(), ((StateContext)_localctx).tp.typeName);
				                
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(NL);
			}
		}
		catch (ItemAlreadyExistsException iaee) {
			print("ERR: state already exists: " + iaee.getName());
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverContext extends ParserRuleContext {
		public Token name;
		public List<TerminalNode> NL() { return getTokens(atalkParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(atalkParser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(atalkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(atalkParser.ID, i);
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
			setState(114);
			match(T__5);
			setState(115);
			((ReceiverContext)_localctx).name = match(ID);
			setState(116);
			match(T__6);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__11) {
				{
				setState(117);
				type();
				setState(118);
				match(ID);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(119);
					match(T__4);
					setState(120);
					type();
					setState(121);
					match(ID);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(130);
			match(T__7);
			setState(131);
			match(NL);

			                putReceiver(((ReceiverContext)_localctx).name.getText());
							beginScope();
						
			setState(133);
			statements();
			setState(134);
			match(T__3);
			setState(135);
			match(NL);
			 endScope(); 
			}
		}
		catch (ItemAlreadyExistsException iaee) {
			print("ERR: Receiver already exists: " + iaee.getName());
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type typeName;
		public int size = 1;
		public Token sz;
		public List<TerminalNode> CONST_NUM() { return getTokens(atalkParser.CONST_NUM); }
		public TerminalNode CONST_NUM(int i) {
			return getToken(atalkParser.CONST_NUM, i);
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
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(T__8);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(139);
					match(T__9);
					setState(140);
					((TypeContext)_localctx).sz = match(CONST_NUM);
					setState(141);
					match(T__10);
					_localctx.size *= (((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				                if (_localctx.size == 1)
				                    ((TypeContext)_localctx).typeName =  CharType.getInstance();
				                else
				                    ((TypeContext)_localctx).typeName =  ArrayType.getInstance();
				            
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(T__11);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(150);
					match(T__9);
					setState(151);
					((TypeContext)_localctx).sz = match(CONST_NUM);
					setState(152);
					match(T__10);
					_localctx.size *= (((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				                if (_localctx.size == 1)
				                    ((TypeContext)_localctx).typeName =  IntType.getInstance();
				                else
				                    ((TypeContext)_localctx).typeName =  ArrayType.getInstance();
				            
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
		public List<TerminalNode> NL() { return getTokens(atalkParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(atalkParser.NL, i);
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
			setState(162);
			match(T__12);
			setState(163);
			match(NL);
			 beginScope(); 
			setState(165);
			statements();
			setState(166);
			match(T__3);
			setState(167);
			match(NL);
			 beginScope(); 
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
		public List<TerminalNode> NL() { return getTokens(atalkParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(atalkParser.NL, i);
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
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << NL) | (1L << ID))) != 0)) {
				{
				setState(172);
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
					setState(170);
					statement();
					}
					break;
				case NL:
					{
					setState(171);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(176);
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				stm_vardef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				stm_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				stm_foreach();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				stm_if_elseif_else();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				stm_quit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				stm_break();
				 sawBreak(); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
				stm_tell();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				stm_write();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(187);
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
		public TypeContext tp;
		public Token nm;
		public Token nm2;
		public TerminalNode NL() { return getToken(atalkParser.NL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(atalkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(atalkParser.ID, i);
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
			setState(190);
			((Stm_vardefContext)_localctx).tp = type();
			setState(191);
			((Stm_vardefContext)_localctx).nm = match(ID);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(192);
				match(T__13);
				setState(193);
				expr();
				}
			}


			                putLocalVar(((Stm_vardefContext)_localctx).nm.getText(), ((Stm_vardefContext)_localctx).tp.typeName);
			            
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(197);
				match(T__4);
				setState(198);
				((Stm_vardefContext)_localctx).nm2 = match(ID);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(199);
					match(T__13);
					setState(200);
					expr();
					}
				}


				                    putLocalVar(((Stm_vardefContext)_localctx).nm2.getText(), ((Stm_vardefContext)_localctx).tp.typeName);
				                
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(NL);
			}
		}
		catch (ItemAlreadyExistsException iaee) {
			print("ERR: variable already exists: " + iaee.getName());
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_tellContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(atalkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(atalkParser.ID, i);
		}
		public TerminalNode NL() { return getToken(atalkParser.NL, 0); }
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
			setState(211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(212);
			match(T__16);
			setState(213);
			match(ID);
			setState(214);
			match(T__6);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				setState(215);
				expr();
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(216);
					match(T__4);
					setState(217);
					expr();
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(225);
			match(T__7);
			setState(226);
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
		public TerminalNode NL() { return getToken(atalkParser.NL, 0); }
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
			setState(228);
			match(T__17);
			setState(229);
			match(T__6);
			setState(230);
			expr();
			setState(231);
			match(T__7);
			setState(232);
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
		public List<TerminalNode> NL() { return getTokens(atalkParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(atalkParser.NL, i);
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
			setState(234);
			match(T__18);
			setState(235);
			expr();
			setState(236);
			match(NL);
			setState(237);
			statements();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(238);
				match(T__19);
				setState(239);
				expr();
				setState(240);
				match(NL);
				setState(241);
				statements();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(248);
				match(T__20);
				setState(249);
				match(NL);
				setState(250);
				statements();
				}
			}

			setState(253);
			match(T__3);
			setState(254);
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

	public static class Stm_foreachContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(atalkParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(atalkParser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
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
			setState(256);
			match(T__21);
			setState(257);
			match(ID);
			setState(258);
			match(T__22);
			setState(259);
			expr();
			setState(260);
			match(NL);

							beginForeach();
							beginScope();
						
			setState(262);
			statements();
			setState(263);
			match(T__3);
			setState(264);
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
		public TerminalNode NL() { return getToken(atalkParser.NL, 0); }
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
			setState(267);
			match(T__23);
			setState(268);
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
		public TerminalNode NL() { return getToken(atalkParser.NL, 0); }
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
			setState(270);
			match(T__24);
			setState(271);
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

	public static class Stm_assignmentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(atalkParser.NL, 0); }
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
			setState(273);
			expr();
			setState(274);
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
			setState(276);
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
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				expr_or();
				setState(279);
				match(T__13);
				setState(280);
				expr_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
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
			setState(285);
			expr_and();
			setState(286);
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
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(T__25);
				setState(289);
				expr_and();
				setState(290);
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
			setState(295);
			expr_eq();
			setState(296);
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
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(T__26);
				setState(299);
				expr_eq();
				setState(300);
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
			setState(305);
			expr_cmp();
			setState(306);
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
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(309);
				expr_cmp();
				setState(310);
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
			setState(315);
			expr_add();
			setState(316);
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
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(319);
				expr_add();
				setState(320);
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
			setState(325);
			expr_mult();
			setState(326);
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
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(329);
				expr_mult();
				setState(330);
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
			setState(335);
			expr_un();
			setState(336);
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
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(339);
				expr_un();
				setState(340);
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
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__33) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(346);
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
				setState(347);
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
			setState(350);
			expr_other();
			setState(351);
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
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(T__9);
				setState(354);
				expr();
				setState(355);
				match(T__10);
				setState(356);
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
		public TerminalNode CONST_NUM() { return getToken(atalkParser.CONST_NUM, 0); }
		public TerminalNode CONST_CHAR() { return getToken(atalkParser.CONST_CHAR, 0); }
		public TerminalNode CONST_STR() { return getToken(atalkParser.CONST_STR, 0); }
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
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
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(CONST_NUM);
				}
				break;
			case CONST_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(CONST_CHAR);
				}
				break;
			case CONST_STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				match(CONST_STR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				match(ID);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(365);
				match(T__34);
				setState(366);
				expr();
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(367);
					match(T__4);
					setState(368);
					expr();
					}
					}
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(374);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 6);
				{
				setState(376);
				match(T__36);
				setState(377);
				match(T__6);
				setState(378);
				match(CONST_NUM);
				setState(379);
				match(T__7);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(380);
				match(T__6);
				setState(381);
				expr();
				setState(382);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0185\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3^\n\3\f\3\16\3a\13\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4n\n\4\f\4\16\4q\13\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5~\n\5\f\5\16\5\u0081\13\5"+
		"\5\5\u0083\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6"+
		"\u0092\n\6\f\6\16\6\u0095\13\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u009d\n\6\f"+
		"\6\16\6\u00a0\13\6\3\6\5\6\u00a3\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\7\b\u00af\n\b\f\b\16\b\u00b2\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00bf\n\t\3\n\3\n\3\n\3\n\5\n\u00c5\n\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00cc\n\n\3\n\7\n\u00cf\n\n\f\n\16\n\u00d2\13\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00dd\n\13\f\13\16\13\u00e0\13"+
		"\13\5\13\u00e2\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00f6\n\r\f\r\16\r\u00f9\13\r\3\r\3\r\3\r"+
		"\5\r\u00fe\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u011e\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0128\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u0132"+
		"\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u013c\n\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u0146\n\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u0150\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u015a\n\37\3 \3 \3 \5 \u015f\n \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u016a\n\"\3#\3#\3#\3#\3#\3#\3#\3#\7#\u0174\n#\f#\16#\u0177\13#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0183\n#\3#\2\2$\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\t\3\3++\4\2\21\22,,\3"+
		"\2\36\37\3\2\4\5\3\2 !\3\2\"#\4\2!!$$\2\u018e\2F\3\2\2\2\4S\3\2\2\2\6"+
		"g\3\2\2\2\bt\3\2\2\2\n\u00a2\3\2\2\2\f\u00a4\3\2\2\2\16\u00b0\3\2\2\2"+
		"\20\u00be\3\2\2\2\22\u00c0\3\2\2\2\24\u00d5\3\2\2\2\26\u00e6\3\2\2\2\30"+
		"\u00ec\3\2\2\2\32\u0102\3\2\2\2\34\u010d\3\2\2\2\36\u0110\3\2\2\2 \u0113"+
		"\3\2\2\2\"\u0116\3\2\2\2$\u011d\3\2\2\2&\u011f\3\2\2\2(\u0127\3\2\2\2"+
		"*\u0129\3\2\2\2,\u0131\3\2\2\2.\u0133\3\2\2\2\60\u013b\3\2\2\2\62\u013d"+
		"\3\2\2\2\64\u0145\3\2\2\2\66\u0147\3\2\2\28\u014f\3\2\2\2:\u0151\3\2\2"+
		"\2<\u0159\3\2\2\2>\u015e\3\2\2\2@\u0160\3\2\2\2B\u0169\3\2\2\2D\u0182"+
		"\3\2\2\2FM\b\2\1\2GH\5\4\3\2HI\b\2\1\2IL\3\2\2\2JL\7+\2\2KG\3\2\2\2KJ"+
		"\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\b\2\1\2Q"+
		"R\b\2\1\2R\3\3\2\2\2ST\7\3\2\2TU\7,\2\2UV\7\4\2\2VW\7(\2\2WX\7\5\2\2X"+
		"Y\7+\2\2Y_\b\3\1\2Z^\5\6\4\2[^\5\b\5\2\\^\7+\2\2]Z\3\2\2\2][\3\2\2\2]"+
		"\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\6\2\2"+
		"cd\b\3\1\2de\t\2\2\2ef\b\3\1\2f\5\3\2\2\2gh\5\n\6\2hi\7,\2\2io\b\4\1\2"+
		"jk\7\7\2\2kl\7,\2\2ln\b\4\1\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2"+
		"pr\3\2\2\2qo\3\2\2\2rs\7+\2\2s\7\3\2\2\2tu\7\b\2\2uv\7,\2\2v\u0082\7\t"+
		"\2\2wx\5\n\6\2x\177\7,\2\2yz\7\7\2\2z{\5\n\6\2{|\7,\2\2|~\3\2\2\2}y\3"+
		"\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2"+
		"\2\u0081\177\3\2\2\2\u0082w\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3"+
		"\2\2\2\u0084\u0085\7\n\2\2\u0085\u0086\7+\2\2\u0086\u0087\b\5\1\2\u0087"+
		"\u0088\5\16\b\2\u0088\u0089\7\6\2\2\u0089\u008a\7+\2\2\u008a\u008b\b\5"+
		"\1\2\u008b\t\3\2\2\2\u008c\u0093\7\13\2\2\u008d\u008e\7\f\2\2\u008e\u008f"+
		"\7(\2\2\u008f\u0090\7\r\2\2\u0090\u0092\b\6\1\2\u0091\u008d\3\2\2\2\u0092"+
		"\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0096\u00a3\b\6\1\2\u0097\u009e\7\16\2\2\u0098"+
		"\u0099\7\f\2\2\u0099\u009a\7(\2\2\u009a\u009b\7\r\2\2\u009b\u009d\b\6"+
		"\1\2\u009c\u0098\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\b\6"+
		"\1\2\u00a2\u008c\3\2\2\2\u00a2\u0097\3\2\2\2\u00a3\13\3\2\2\2\u00a4\u00a5"+
		"\7\17\2\2\u00a5\u00a6\7+\2\2\u00a6\u00a7\b\7\1\2\u00a7\u00a8\5\16\b\2"+
		"\u00a8\u00a9\7\6\2\2\u00a9\u00aa\7+\2\2\u00aa\u00ab\b\7\1\2\u00ab\r\3"+
		"\2\2\2\u00ac\u00af\5\20\t\2\u00ad\u00af\7+\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\17\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00bf\5\22\n\2\u00b4\u00bf"+
		"\5 \21\2\u00b5\u00bf\5\32\16\2\u00b6\u00bf\5\30\r\2\u00b7\u00bf\5\34\17"+
		"\2\u00b8\u00b9\5\36\20\2\u00b9\u00ba\b\t\1\2\u00ba\u00bf\3\2\2\2\u00bb"+
		"\u00bf\5\24\13\2\u00bc\u00bf\5\26\f\2\u00bd\u00bf\5\f\7\2\u00be\u00b3"+
		"\3\2\2\2\u00be\u00b4\3\2\2\2\u00be\u00b5\3\2\2\2\u00be\u00b6\3\2\2\2\u00be"+
		"\u00b7\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bd\3\2\2\2\u00bf\21\3\2\2\2\u00c0\u00c1\5\n\6\2\u00c1\u00c4"+
		"\7,\2\2\u00c2\u00c3\7\20\2\2\u00c3\u00c5\5\"\22\2\u00c4\u00c2\3\2\2\2"+
		"\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00d0\b\n\1\2\u00c7\u00c8"+
		"\7\7\2\2\u00c8\u00cb\7,\2\2\u00c9\u00ca\7\20\2\2\u00ca\u00cc\5\"\22\2"+
		"\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf"+
		"\b\n\1\2\u00ce\u00c7\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7+"+
		"\2\2\u00d4\23\3\2\2\2\u00d5\u00d6\t\3\2\2\u00d6\u00d7\7\23\2\2\u00d7\u00d8"+
		"\7,\2\2\u00d8\u00e1\7\t\2\2\u00d9\u00de\5\"\22\2\u00da\u00db\7\7\2\2\u00db"+
		"\u00dd\5\"\22\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3"+
		"\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00d9\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7\n"+
		"\2\2\u00e4\u00e5\7+\2\2\u00e5\25\3\2\2\2\u00e6\u00e7\7\24\2\2\u00e7\u00e8"+
		"\7\t\2\2\u00e8\u00e9\5\"\22\2\u00e9\u00ea\7\n\2\2\u00ea\u00eb\7+\2\2\u00eb"+
		"\27\3\2\2\2\u00ec\u00ed\7\25\2\2\u00ed\u00ee\5\"\22\2\u00ee\u00ef\7+\2"+
		"\2\u00ef\u00f7\5\16\b\2\u00f0\u00f1\7\26\2\2\u00f1\u00f2\5\"\22\2\u00f2"+
		"\u00f3\7+\2\2\u00f3\u00f4\5\16\b\2\u00f4\u00f6\3\2\2\2\u00f5\u00f0\3\2"+
		"\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00fd\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7\27\2\2\u00fb\u00fc\7"+
		"+\2\2\u00fc\u00fe\5\16\b\2\u00fd\u00fa\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\7\6\2\2\u0100\u0101\7+\2\2\u0101\31\3\2\2\2"+
		"\u0102\u0103\7\30\2\2\u0103\u0104\7,\2\2\u0104\u0105\7\31\2\2\u0105\u0106"+
		"\5\"\22\2\u0106\u0107\7+\2\2\u0107\u0108\b\16\1\2\u0108\u0109\5\16\b\2"+
		"\u0109\u010a\7\6\2\2\u010a\u010b\7+\2\2\u010b\u010c\b\16\1\2\u010c\33"+
		"\3\2\2\2\u010d\u010e\7\32\2\2\u010e\u010f\7+\2\2\u010f\35\3\2\2\2\u0110"+
		"\u0111\7\33\2\2\u0111\u0112\7+\2\2\u0112\37\3\2\2\2\u0113\u0114\5\"\22"+
		"\2\u0114\u0115\7+\2\2\u0115!\3\2\2\2\u0116\u0117\5$\23\2\u0117#\3\2\2"+
		"\2\u0118\u0119\5&\24\2\u0119\u011a\7\20\2\2\u011a\u011b\5$\23\2\u011b"+
		"\u011e\3\2\2\2\u011c\u011e\5&\24\2\u011d\u0118\3\2\2\2\u011d\u011c\3\2"+
		"\2\2\u011e%\3\2\2\2\u011f\u0120\5*\26\2\u0120\u0121\5(\25\2\u0121\'\3"+
		"\2\2\2\u0122\u0123\7\34\2\2\u0123\u0124\5*\26\2\u0124\u0125\5(\25\2\u0125"+
		"\u0128\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0122\3\2\2\2\u0127\u0126\3\2"+
		"\2\2\u0128)\3\2\2\2\u0129\u012a\5.\30\2\u012a\u012b\5,\27\2\u012b+\3\2"+
		"\2\2\u012c\u012d\7\35\2\2\u012d\u012e\5.\30\2\u012e\u012f\5,\27\2\u012f"+
		"\u0132\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012c\3\2\2\2\u0131\u0130\3\2"+
		"\2\2\u0132-\3\2\2\2\u0133\u0134\5\62\32\2\u0134\u0135\5\60\31\2\u0135"+
		"/\3\2\2\2\u0136\u0137\t\4\2\2\u0137\u0138\5\62\32\2\u0138\u0139\5\60\31"+
		"\2\u0139\u013c\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0136\3\2\2\2\u013b\u013a"+
		"\3\2\2\2\u013c\61\3\2\2\2\u013d\u013e\5\66\34\2\u013e\u013f\5\64\33\2"+
		"\u013f\63\3\2\2\2\u0140\u0141\t\5\2\2\u0141\u0142\5\66\34\2\u0142\u0143"+
		"\5\64\33\2\u0143\u0146\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0140\3\2\2\2"+
		"\u0145\u0144\3\2\2\2\u0146\65\3\2\2\2\u0147\u0148\5:\36\2\u0148\u0149"+
		"\58\35\2\u0149\67\3\2\2\2\u014a\u014b\t\6\2\2\u014b\u014c\5:\36\2\u014c"+
		"\u014d\58\35\2\u014d\u0150\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014a\3\2"+
		"\2\2\u014f\u014e\3\2\2\2\u01509\3\2\2\2\u0151\u0152\5> \2\u0152\u0153"+
		"\5<\37\2\u0153;\3\2\2\2\u0154\u0155\t\7\2\2\u0155\u0156\5> \2\u0156\u0157"+
		"\5<\37\2\u0157\u015a\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0154\3\2\2\2\u0159"+
		"\u0158\3\2\2\2\u015a=\3\2\2\2\u015b\u015c\t\b\2\2\u015c\u015f\5> \2\u015d"+
		"\u015f\5@!\2\u015e\u015b\3\2\2\2\u015e\u015d\3\2\2\2\u015f?\3\2\2\2\u0160"+
		"\u0161\5D#\2\u0161\u0162\5B\"\2\u0162A\3\2\2\2\u0163\u0164\7\f\2\2\u0164"+
		"\u0165\5\"\22\2\u0165\u0166\7\r\2\2\u0166\u0167\5B\"\2\u0167\u016a\3\2"+
		"\2\2\u0168\u016a\3\2\2\2\u0169\u0163\3\2\2\2\u0169\u0168\3\2\2\2\u016a"+
		"C\3\2\2\2\u016b\u0183\7(\2\2\u016c\u0183\7)\2\2\u016d\u0183\7*\2\2\u016e"+
		"\u0183\7,\2\2\u016f\u0170\7%\2\2\u0170\u0175\5\"\22\2\u0171\u0172\7\7"+
		"\2\2\u0172\u0174\5\"\22\2\u0173\u0171\3\2\2\2\u0174\u0177\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0178\u0179\7&\2\2\u0179\u0183\3\2\2\2\u017a\u017b\7\'\2\2\u017b"+
		"\u017c\7\t\2\2\u017c\u017d\7(\2\2\u017d\u0183\7\n\2\2\u017e\u017f\7\t"+
		"\2\2\u017f\u0180\5\"\22\2\u0180\u0181\7\n\2\2\u0181\u0183\3\2\2\2\u0182"+
		"\u016b\3\2\2\2\u0182\u016c\3\2\2\2\u0182\u016d\3\2\2\2\u0182\u016e\3\2"+
		"\2\2\u0182\u016f\3\2\2\2\u0182\u017a\3\2\2\2\u0182\u017e\3\2\2\2\u0183"+
		"E\3\2\2\2!KM]_o\177\u0082\u0093\u009e\u00a2\u00ae\u00b0\u00be\u00c4\u00cb"+
		"\u00d0\u00de\u00e1\u00f7\u00fd\u011d\u0127\u0131\u013b\u0145\u014f\u0159"+
		"\u015e\u0169\u0175\u0182";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}