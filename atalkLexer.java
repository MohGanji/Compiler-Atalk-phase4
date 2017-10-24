// Generated from atalk.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class atalkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, COMMENT=5, SPACE=6, ACTOR=7, ACTOR_SIZE=8, 
		TYPE=9, STRING=10, CHAR=11, NUMBER=12, VALUE=13, ID=14, ANY_CHAR=15, NEWLINE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "COMMENT", "SPACE", "ACTOR", "ACTOR_SIZE", 
		"TYPE", "STRING", "CHAR", "NUMBER", "VALUE", "ID", "ANY_CHAR", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'end'", "','", "'='", "'as'", null, null, "'actor'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "COMMENT", "SPACE", "ACTOR", "ACTOR_SIZE", 
		"TYPE", "STRING", "CHAR", "NUMBER", "VALUE", "ID", "ANY_CHAR", "NEWLINE"
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


	    void print(String str){
	        System.out.println(str);
	    }


	public atalkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "atalk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 4:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			ACTOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			ACTOR_SIZE_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			TYPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			NUMBER_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			VALUE_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			print("COMMENT");
			break;
		case 1:
			skip();
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			skip();
			break;
		}
	}
	private void ACTOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			print("ACTOR : " + getText());
			break;
		}
	}
	private void ACTOR_SIZE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			print("actor size : " + getText());
			break;
		}
	}
	private void TYPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			print("TYPE : " + getText());
			break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			print("CHAR : " + getText());
			break;
		}
	}
	private void NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			print("NUMBER : " + getText());
			break;
		}
	}
	private void VALUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			print("VALUE : " + getText());
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			print("ID : " + getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0092\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\7\6\61\n\6\f\6\16\6\64"+
		"\13\6\3\6\3\6\3\6\3\7\6\7:\n\7\r\7\16\7;\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nT\n\n\3"+
		"\n\3\n\3\13\3\13\7\13Z\n\13\f\13\16\13]\13\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fn\n\f\3\f\3\f\3\f\3\r\6\rt\n"+
		"\r\r\r\16\ru\3\r\3\r\3\16\3\16\3\16\5\16}\n\16\3\16\3\16\3\17\3\17\7\17"+
		"\u0083\n\17\f\17\16\17\u0086\13\17\3\17\3\17\3\20\3\20\3\21\5\21\u008d"+
		"\n\21\3\21\3\21\5\21\u0091\n\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\b\4\2\13\13\"\"\4\2"+
		"\f\f$$\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\3\2\f\f\2\u00a1\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5\'\3\2\2"+
		"\2\7)\3\2\2\2\t+\3\2\2\2\13.\3\2\2\2\r9\3\2\2\2\17?\3\2\2\2\21G\3\2\2"+
		"\2\23S\3\2\2\2\25W\3\2\2\2\27`\3\2\2\2\31s\3\2\2\2\33|\3\2\2\2\35\u0080"+
		"\3\2\2\2\37\u0089\3\2\2\2!\u0090\3\2\2\2#$\7g\2\2$%\7p\2\2%&\7f\2\2&\4"+
		"\3\2\2\2\'(\7.\2\2(\6\3\2\2\2)*\7?\2\2*\b\3\2\2\2+,\7c\2\2,-\7u\2\2-\n"+
		"\3\2\2\2.\62\7%\2\2/\61\5\37\20\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2"+
		"\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\b\6\2\2\66\67\b\6"+
		"\3\2\67\f\3\2\2\28:\t\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<="+
		"\3\2\2\2=>\b\7\4\2>\16\3\2\2\2?@\7c\2\2@A\7e\2\2AB\7v\2\2BC\7q\2\2CD\7"+
		"t\2\2DE\3\2\2\2EF\b\b\5\2F\20\3\2\2\2GH\7>\2\2HI\5\31\r\2IJ\7@\2\2JK\b"+
		"\t\6\2K\22\3\2\2\2LM\7k\2\2MN\7p\2\2NT\7v\2\2OP\7e\2\2PQ\7j\2\2QR\7c\2"+
		"\2RT\7t\2\2SL\3\2\2\2SO\3\2\2\2TU\3\2\2\2UV\b\n\7\2V\24\3\2\2\2W[\7$\2"+
		"\2XZ\5\27\f\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3"+
		"\2\2\2^_\7$\2\2_\26\3\2\2\2`m\7)\2\2an\n\3\2\2bc\7^\2\2cn\7$\2\2de\7^"+
		"\2\2en\7v\2\2fg\7^\2\2gn\7p\2\2hi\7^\2\2in\7^\2\2jn\7$\2\2kl\7^\2\2ln"+
		"\7)\2\2ma\3\2\2\2mb\3\2\2\2md\3\2\2\2mf\3\2\2\2mh\3\2\2\2mj\3\2\2\2mk"+
		"\3\2\2\2no\3\2\2\2op\7)\2\2pq\b\f\b\2q\30\3\2\2\2rt\t\4\2\2sr\3\2\2\2"+
		"tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\b\r\t\2x\32\3\2\2\2y}\5\25"+
		"\13\2z}\5\31\r\2{}\5\27\f\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}~\3\2\2\2~\177"+
		"\b\16\n\2\177\34\3\2\2\2\u0080\u0084\t\5\2\2\u0081\u0083\t\6\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\b\17\13\2\u0088"+
		"\36\3\2\2\2\u0089\u008a\n\7\2\2\u008a \3\2\2\2\u008b\u008d\7\17\2\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\7\f"+
		"\2\2\u008f\u0091\7\17\2\2\u0090\u008c\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\"\3\2\2\2\r\2\62;S[mu|\u0084\u008c\u0090\f\3\6\2\3\6\3\3\7\4\3\b\5\3"+
		"\t\6\3\n\7\3\f\b\3\r\t\3\16\n\3\17\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}