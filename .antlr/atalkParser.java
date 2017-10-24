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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ACTOR=8, TYPE=9, 
		VALUE=10, COMMENT=11, ID=12, CHAR=13, STRING_CHAR=14, NUMBER=15, ANY_CHAR=16, 
		NEWLINE=17, Space=18;
	public static final int
		RULE_program = 0, RULE_actor = 1, RULE_actor_content = 2, RULE_state = 3, 
		RULE_var = 4, RULE_global_vardef = 5, RULE_vardef = 6, RULE_receiver = 7;
	public static final String[] ruleNames = {
		"program", "actor", "actor_content", "state", "var", "global_vardef", 
		"vardef", "receiver"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'<'", "'>'", "'end'", "','", "'='", "'as'", "'actor'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "ACTOR", "TYPE", "VALUE", 
		"COMMENT", "ID", "CHAR", "STRING_CHAR", "NUMBER", "ANY_CHAR", "NEWLINE", 
		"Space"
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
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
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
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTOR || _la==TYPE) {
				{
				setState(18);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACTOR:
					{
					setState(16);
					actor();
					}
					break;
				case TYPE:
					{
					setState(17);
					var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(22);
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
		public TerminalNode NUMBER() { return getToken(atalkParser.NUMBER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(atalkParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(atalkParser.NEWLINE, i);
		}
		public Actor_contentContext actor_content() {
			return getRuleContext(Actor_contentContext.class,0);
		}
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
			setState(23);
			match(ACTOR);
			setState(24);
			match(T__0);
			setState(25);
			match(ID);
			setState(26);
			match(T__1);
			setState(27);
			match(NUMBER);
			setState(28);
			match(T__2);
			setState(29);
			match(NEWLINE);
			setState(30);
			actor_content();
			setState(31);
			match(T__3);
			setState(32);
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==TYPE) {
				{
				setState(37);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(35);
					state();
					}
					break;
				case T__6:
					{
					setState(36);
					receiver();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 6, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(TYPE);
			setState(45);
			global_vardef();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(46);
				match(T__4);
				setState(47);
				global_vardef();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
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
		enterRule(_localctx, 8, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(TYPE);
			setState(57);
			vardef();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(58);
				match(T__4);
				setState(59);
				vardef();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
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
			setState(68);
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
			setState(71);
			match(ID);
			setState(72);
			match(T__5);
			setState(73);
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
			setState(76);
			match(T__6);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24R\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25\n\2"+
		"\f\2\16\2\30\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\7\4(\n\4\f\4\16\4+\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\63\n\5\f\5\16"+
		"\5\66\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6?\n\6\f\6\16\6B\13\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f"+
		"\16\20\2\2\2O\2\26\3\2\2\2\4\31\3\2\2\2\6)\3\2\2\2\b.\3\2\2\2\n:\3\2\2"+
		"\2\fF\3\2\2\2\16I\3\2\2\2\20N\3\2\2\2\22\25\5\4\3\2\23\25\5\n\6\2\24\22"+
		"\3\2\2\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\3"+
		"\3\2\2\2\30\26\3\2\2\2\31\32\7\n\2\2\32\33\7\3\2\2\33\34\7\16\2\2\34\35"+
		"\7\4\2\2\35\36\7\21\2\2\36\37\7\5\2\2\37 \7\23\2\2 !\5\6\4\2!\"\7\6\2"+
		"\2\"#\7\23\2\2#$\b\3\1\2$\5\3\2\2\2%(\5\b\5\2&(\5\20\t\2\'%\3\2\2\2\'"+
		"&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\b\4\1\2"+
		"-\7\3\2\2\2./\7\13\2\2/\64\5\f\7\2\60\61\7\7\2\2\61\63\5\f\7\2\62\60\3"+
		"\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3"+
		"\2\2\2\678\7\23\2\289\b\5\1\29\t\3\2\2\2:;\7\13\2\2;@\5\16\b\2<=\7\7\2"+
		"\2=?\5\16\b\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2"+
		"\2\2CD\7\23\2\2DE\b\6\1\2E\13\3\2\2\2FG\7\16\2\2GH\b\7\1\2H\r\3\2\2\2"+
		"IJ\7\16\2\2JK\7\b\2\2KL\7\f\2\2LM\b\b\1\2M\17\3\2\2\2NO\7\t\2\2OP\b\t"+
		"\1\2P\21\3\2\2\2\b\24\26\')\64@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}