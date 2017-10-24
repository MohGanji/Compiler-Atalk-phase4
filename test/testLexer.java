// Generated from test.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NewLine=3, Space=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "NewLine", "Space"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ali'", "'vahid'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "NewLine", "Space"
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
	    private boolean keepNewLine = false;


	public testLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

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
		case 2:
			NewLine_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			Space_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NewLine_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			if(!keepNewLine) skip();
			break;
		}
	}
	private void Space_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6!\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\5\4"+
		"\27\n\4\3\4\3\4\5\4\33\n\4\3\4\3\4\3\5\3\5\3\5\2\2\6\3\3\5\4\7\5\t\6\3"+
		"\2\3\4\2\13\13\"\"\2\"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\3\13\3\2\2\2\5\17\3\2\2\2\7\32\3\2\2\2\t\36\3\2\2\2\13\f\7c\2\2\f\r\7"+
		"n\2\2\r\16\7k\2\2\16\4\3\2\2\2\17\20\7x\2\2\20\21\7c\2\2\21\22\7j\2\2"+
		"\22\23\7k\2\2\23\24\7f\2\2\24\6\3\2\2\2\25\27\7\17\2\2\26\25\3\2\2\2\26"+
		"\27\3\2\2\2\27\30\3\2\2\2\30\33\7\f\2\2\31\33\7\17\2\2\32\26\3\2\2\2\32"+
		"\31\3\2\2\2\33\34\3\2\2\2\34\35\b\4\2\2\35\b\3\2\2\2\36\37\t\2\2\2\37"+
		" \b\5\3\2 \n\3\2\2\2\5\2\26\32\4\3\4\2\3\5\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}