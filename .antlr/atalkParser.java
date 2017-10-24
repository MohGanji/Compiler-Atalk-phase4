// Generated from /home/vmoh/uni_projs/compiler/CAD-Atalk-phase1/atalk.g4 by ANTLR 4.7
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, COMMENT=7, NEWLINE=8, 
		SPACE=9, ACTOR=10, RECEIVER=11, TYPE=12, END=13, STRING=14, CHAR=15, NUMBER=16, 
		VALUE=17, ID=18, ANY_CHAR=19;
	public static final int
		RULE_program = 0, RULE_actor = 1, RULE_actor_content = 2, RULE_actor_size = 3, 
		RULE_state = 4, RULE_global_vardef = 5, RULE_vardef = 6, RULE_receiver = 7, 
		RULE_arguments = 8, RULE_arg_var = 9, RULE_receiver_content = 10, RULE_var = 11;
	public static final String[] ruleNames = {
		"program", "actor", "actor_content", "actor_size", "state", "global_vardef", 
		"vardef", "receiver", "arguments", "arg_var", "receiver_content", "var"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", "'>'", "','", "'='", "'('", "')'", null, null, null, "'actor'", 
		"'receiver'", null, "'end'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "COMMENT", "NEWLINE", "SPACE", 
		"ACTOR", "RECEIVER", "TYPE", "END", "STRING", "CHAR", "NUMBER", "VALUE", 
		"ID", "ANY_CHAR"
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

	public atalkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ActorContext> actor() {
			return getRuleContexts(ActorContext.class);
		}
		public ActorContext actor(int i) {
			return getRuleContext(ActorContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(atalkParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(atalkParser.NEWLINE, i);
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
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==ACTOR) {
				{
				setState(26);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACTOR:
					{
					setState(24);
					actor();
					}
					break;
				case NEWLINE:
					{
					setState(25);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(30);
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

	public static class ActorContext extends ParserRuleContext {
		public TerminalNode ACTOR() { return getToken(atalkParser.ACTOR, 0); }
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public Actor_sizeContext actor_size() {
			return getRuleContext(Actor_sizeContext.class,0);
		}
		public Actor_contentContext actor_content() {
			return getRuleContext(Actor_contentContext.class,0);
		}
		public TerminalNode END() { return getToken(atalkParser.END, 0); }
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public ActorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor; }
	}

	public final ActorContext actor() throws RecognitionException {
		ActorContext _localctx = new ActorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_actor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(ACTOR);
			setState(32);
			match(ID);
			setState(33);
			actor_size();
			setState(34);
			actor_content();
			setState(35);
			match(END);
			setState(36);
			match(NEWLINE);
			print("actor");
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

	public static class Actor_contentContext extends ParserRuleContext {
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
		public Actor_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor_content; }
	}

	public final Actor_contentContext actor_content() throws RecognitionException {
		Actor_contentContext _localctx = new Actor_contentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_actor_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(41);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(39);
					state();
					}
					break;
				case RECEIVER:
					{
					setState(40);
					receiver();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RECEIVER || _la==TYPE );
			print("actor content");
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

	public static class Actor_sizeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(atalkParser.NUMBER, 0); }
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public Actor_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor_size; }
	}

	public final Actor_sizeContext actor_size() throws RecognitionException {
		Actor_sizeContext _localctx = new Actor_sizeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_actor_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__0);
			setState(48);
			match(NUMBER);
			setState(49);
			match(T__1);
			setState(50);
			match(NEWLINE);
			print("actor size");
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
		public TerminalNode TYPE() { return getToken(atalkParser.TYPE, 0); }
		public List<Global_vardefContext> global_vardef() {
			return getRuleContexts(Global_vardefContext.class);
		}
		public Global_vardefContext global_vardef(int i) {
			return getRuleContext(Global_vardefContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("state start");
			setState(54);
			match(TYPE);
			setState(55);
			global_vardef();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(56);
				match(T__2);
				setState(57);
				global_vardef();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(NEWLINE);
			print("state");
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

	public static class Global_vardefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public Global_vardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_vardef; }
	}

	public final Global_vardefContext global_vardef() throws RecognitionException {
		Global_vardefContext _localctx = new Global_vardefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_global_vardef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ID);
			print("global vardef");
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

	public static class VardefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public TerminalNode VALUE() { return getToken(atalkParser.VALUE, 0); }
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vardef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ID);
			setState(70);
			match(T__3);
			setState(71);
			match(VALUE);
			print("vardef");
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
		public TerminalNode RECEIVER() { return getToken(atalkParser.RECEIVER, 0); }
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Receiver_contentContext receiver_content() {
			return getRuleContext(Receiver_contentContext.class,0);
		}
		public TerminalNode END() { return getToken(atalkParser.END, 0); }
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(RECEIVER);
			setState(75);
			match(ID);
			setState(76);
			arguments();
			setState(77);
			receiver_content();
			setState(78);
			match(END);
			setState(79);
			match(NEWLINE);
			print("receiver");
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public List<Arg_varContext> arg_var() {
			return getRuleContexts(Arg_varContext.class);
		}
		public Arg_varContext arg_var(int i) {
			return getRuleContext(Arg_varContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__4);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(83);
				arg_var();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(T__5);
			setState(90);
			match(NEWLINE);
			print("arguments");
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

	public static class Arg_varContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(atalkParser.TYPE, 0); }
		public Global_vardefContext global_vardef() {
			return getRuleContext(Global_vardefContext.class,0);
		}
		public Arg_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_var; }
	}

	public final Arg_varContext arg_var() throws RecognitionException {
		Arg_varContext _localctx = new Arg_varContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arg_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(TYPE);
			setState(94);
			global_vardef();
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

	public static class Receiver_contentContext extends ParserRuleContext {
		public Receiver_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver_content; }
	}

	public final Receiver_contentContext receiver_content() throws RecognitionException {
		Receiver_contentContext _localctx = new Receiver_contentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_receiver_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(atalkParser.TYPE, 0); }
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(TYPE);
			setState(99);
			vardef();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(100);
				match(T__2);
				setState(101);
				vardef();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(NEWLINE);
			print("var");
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\6\4,\n\4\r\4\16\4-\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\7\nW\n\n\f"+
		"\n\16\nZ\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\7"+
		"\ri\n\r\f\r\16\rl\13\r\3\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\2\2\2k\2\36\3\2\2\2\4!\3\2\2\2\6+\3\2\2\2\b\61\3\2\2\2\n\67\3\2"+
		"\2\2\fD\3\2\2\2\16G\3\2\2\2\20L\3\2\2\2\22T\3\2\2\2\24_\3\2\2\2\26b\3"+
		"\2\2\2\30d\3\2\2\2\32\35\5\4\3\2\33\35\7\n\2\2\34\32\3\2\2\2\34\33\3\2"+
		"\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\3\3\2\2\2 \36\3\2\2\2"+
		"!\"\7\f\2\2\"#\7\24\2\2#$\5\b\5\2$%\5\6\4\2%&\7\17\2\2&\'\7\n\2\2\'(\b"+
		"\3\1\2(\5\3\2\2\2),\5\n\6\2*,\5\20\t\2+)\3\2\2\2+*\3\2\2\2,-\3\2\2\2-"+
		"+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\b\4\1\2\60\7\3\2\2\2\61\62\7\3\2\2\62"+
		"\63\7\22\2\2\63\64\7\4\2\2\64\65\7\n\2\2\65\66\b\5\1\2\66\t\3\2\2\2\67"+
		"8\b\6\1\289\7\16\2\29>\5\f\7\2:;\7\5\2\2;=\5\f\7\2<:\3\2\2\2=@\3\2\2\2"+
		"><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\n\2\2BC\b\6\1\2C\13\3\2\2"+
		"\2DE\7\24\2\2EF\b\7\1\2F\r\3\2\2\2GH\7\24\2\2HI\7\6\2\2IJ\7\23\2\2JK\b"+
		"\b\1\2K\17\3\2\2\2LM\7\r\2\2MN\7\24\2\2NO\5\22\n\2OP\5\26\f\2PQ\7\17\2"+
		"\2QR\7\n\2\2RS\b\t\1\2S\21\3\2\2\2TX\7\7\2\2UW\5\24\13\2VU\3\2\2\2WZ\3"+
		"\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\b\2\2\\]\7\n\2\2]"+
		"^\b\n\1\2^\23\3\2\2\2_`\7\16\2\2`a\5\f\7\2a\25\3\2\2\2bc\3\2\2\2c\27\3"+
		"\2\2\2de\7\16\2\2ej\5\16\b\2fg\7\5\2\2gi\5\16\b\2hf\3\2\2\2il\3\2\2\2"+
		"jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\n\2\2no\b\r\1\2o\31\3\2\2"+
		"\2\t\34\36+->Xj";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}