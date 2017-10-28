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
		SPACE=1, COMMENT=2, NEWLINE=3, ACTOR=4, RECEIVER=5, TYPE=6, QUIT=7, IF=8, 
		ELSEIF=9, ELSE=10, END=11, FOREACH=12, BREAK=13, IN=14, SENDER=15, SELF=16, 
		BEGIN=17, AND=18, OR=19, PLUS=20, MINUS=21, MULT=22, DIV=23, EQ=24, EQEQ=25, 
		NOTEQ=26, LT=27, GT=28, POPEN=29, PCLOSE=30, BOPEN=31, BCLOSE=32, COPEN=33, 
		CCLOSE=34, SEND_OP=35, SHARP=36, COMMA=37, NOT=38, STRING=39, CHAR=40, 
		NUMBER=41, ID=42, CHARACTER=43, ANY_CHAR=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "COMMENT", "NEWLINE", "ACTOR", "RECEIVER", "TYPE", "QUIT", "IF", 
		"ELSEIF", "ELSE", "END", "FOREACH", "BREAK", "IN", "SENDER", "SELF", "BEGIN", 
		"AND", "OR", "PLUS", "MINUS", "MULT", "DIV", "EQ", "EQEQ", "NOTEQ", "LT", 
		"GT", "POPEN", "PCLOSE", "BOPEN", "BCLOSE", "COPEN", "CCLOSE", "SEND_OP", 
		"SHARP", "COMMA", "NOT", "STRING", "CHAR", "NUMBER", "ID", "CHARACTER", 
		"ANY_CHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'actor'", "'receiver'", null, "'quit'", "'if'", 
		"'elseif'", "'else'", "'end'", "'foreach'", "'break'", "'in'", "'sender'", 
		"'self'", "'begin'", "'and'", "'or'", "'+'", "'-'", "'*'", "'/'", "'='", 
		"'=='", "'<>'", "'<'", "'>'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
		"'<<'", "'#'", "','", "'not'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "COMMENT", "NEWLINE", "ACTOR", "RECEIVER", "TYPE", "QUIT", 
		"IF", "ELSEIF", "ELSE", "END", "FOREACH", "BREAK", "IN", "SENDER", "SELF", 
		"BEGIN", "AND", "OR", "PLUS", "MINUS", "MULT", "DIV", "EQ", "EQEQ", "NOTEQ", 
		"LT", "GT", "POPEN", "PCLOSE", "BOPEN", "BCLOSE", "COPEN", "CCLOSE", "SEND_OP", 
		"SHARP", "COMMA", "NOT", "STRING", "CHAR", "NUMBER", "ID", "CHARACTER", 
		"ANY_CHAR"
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
		case 0:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			ACTOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			RECEIVER_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			TYPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			QUIT_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			ELSEIF_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			ELSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			END_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			FOREACH_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			BREAK_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			IN_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			SENDER_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			SELF_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			BEGIN_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			AND_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			OR_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			PLUS_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			MINUS_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			MULT_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			DIV_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			EQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			EQEQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			NOTEQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			LT_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			GT_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			POPEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			PCLOSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			BOPEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			BCLOSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			COPEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			CCLOSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			SEND_OP_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			SHARP_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			COMMA_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			NOT_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 40:
			NUMBER_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			CHARACTER_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			print("COMMENT : " + getText());
			break;
		case 2:
			skip();
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			print("NEWLINE");
			break;
		}
	}
	private void ACTOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			print("ACTOR : " + getText());
			break;
		}
	}
	private void RECEIVER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			print("RECEIVER");
			break;
		}
	}
	private void TYPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			print("TYPE : " + getText());
			break;
		}
	}
	private void QUIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			print("QUIT");
			break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			print("IF");
			break;
		}
	}
	private void ELSEIF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			print("ELSEIF");
			break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			print("ELSE");
			break;
		}
	}
	private void END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			print("END");
			break;
		}
	}
	private void FOREACH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			print("FOREACH");
			break;
		}
	}
	private void BREAK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			print("BREAK");
			break;
		}
	}
	private void IN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			print("IN");
			break;
		}
	}
	private void SENDER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			print("SENDER");
			break;
		}
	}
	private void SELF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			print("SELF");
			break;
		}
	}
	private void BEGIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			print("BEGIN");
			break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			print("AND");
			break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19:
			print("OR");
			break;
		}
	}
	private void PLUS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:
			print("PLUS");
			break;
		}
	}
	private void MINUS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21:
			print("MINUS");
			break;
		}
	}
	private void MULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22:
			print("MULT");
			break;
		}
	}
	private void DIV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23:
			print("DIV");
			break;
		}
	}
	private void EQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24:
			print("EQ");
			break;
		}
	}
	private void EQEQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25:
			print("EQEQ");
			break;
		}
	}
	private void NOTEQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26:
			print("NOTEQ");
			break;
		}
	}
	private void LT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27:
			print("LT");
			break;
		}
	}
	private void GT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 28:
			print("GT");
			break;
		}
	}
	private void POPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 29:
			print("POPEN");
			break;
		}
	}
	private void PCLOSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 30:
			print("PCLOSE");
			break;
		}
	}
	private void BOPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 31:
			print("BOPEN");
			break;
		}
	}
	private void BCLOSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32:
			print("BCLOSE");
			break;
		}
	}
	private void COPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 33:
			print("COPEN");
			break;
		}
	}
	private void CCLOSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 34:
			print("CCLOSE");
			break;
		}
	}
	private void SEND_OP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 35:
			print("SEND_OP");
			break;
		}
	}
	private void SHARP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 36:
			print("SHARP");
			break;
		}
	}
	private void COMMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 37:
			print("COMMA");
			break;
		}
	}
	private void NOT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 38:
			print("NOT");
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 39:
			print("STRING : " + getText());
			break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 40:
			print("CHAR : " + getText());
			break;
		}
	}
	private void NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 41:
			print("NUMBER : " + getText());
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 42:
			print("ID : " + getText());
			break;
		}
	}
	private void CHARACTER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 43:
			print("CHARACTER : " + getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u017c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\6\2]\n\2\r\2\16\2^\3\2\3\2\3\3\3\3\7\3e\n\3\f\3\16\3h\13"+
		"\3\3\3\3\3\7\3l\n\3\f\3\16\3o\13\3\3\3\3\3\7\3s\n\3\f\3\16\3v\13\3\5\3"+
		"x\n\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4\u0080\n\4\3\4\7\4\u0083\n\4\f\4\16\4"+
		"\u0086\13\4\6\4\u0088\n\4\r\4\16\4\u0089\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u00a8\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\7(\u014c\n(\f(\16(\u014f"+
		"\13(\3(\3(\3(\3)\3)\3)\5)\u0157\n)\3)\3)\3)\3*\6*\u015d\n*\r*\16*\u015e"+
		"\3*\3*\3+\3+\7+\u0165\n+\f+\16+\u0168\13+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\5,\u0177\n,\3,\3,\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.\3\2\b\4\2\13\13\"\"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f$$\3"+
		"\2\f\f\2\u018d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3\\\3\2\2\2\5w\3\2\2\2"+
		"\7\u0087\3\2\2\2\t\u008d\3\2\2\2\13\u0095\3\2\2\2\r\u00a7\3\2\2\2\17\u00ab"+
		"\3\2\2\2\21\u00b2\3\2\2\2\23\u00b7\3\2\2\2\25\u00c0\3\2\2\2\27\u00c7\3"+
		"\2\2\2\31\u00cd\3\2\2\2\33\u00d7\3\2\2\2\35\u00df\3\2\2\2\37\u00e4\3\2"+
		"\2\2!\u00ed\3\2\2\2#\u00f4\3\2\2\2%\u00fc\3\2\2\2\'\u0102\3\2\2\2)\u0107"+
		"\3\2\2\2+\u010a\3\2\2\2-\u010d\3\2\2\2/\u0110\3\2\2\2\61\u0113\3\2\2\2"+
		"\63\u0116\3\2\2\2\65\u011b\3\2\2\2\67\u0120\3\2\2\29\u0123\3\2\2\2;\u0126"+
		"\3\2\2\2=\u0129\3\2\2\2?\u012c\3\2\2\2A\u012f\3\2\2\2C\u0132\3\2\2\2E"+
		"\u0135\3\2\2\2G\u0138\3\2\2\2I\u013d\3\2\2\2K\u0140\3\2\2\2M\u0143\3\2"+
		"\2\2O\u0149\3\2\2\2Q\u0153\3\2\2\2S\u015c\3\2\2\2U\u0162\3\2\2\2W\u0176"+
		"\3\2\2\2Y\u017a\3\2\2\2[]\t\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3"+
		"\2\2\2_`\3\2\2\2`a\b\2\2\2a\4\3\2\2\2bf\5\7\4\2ce\5\3\2\2dc\3\2\2\2eh"+
		"\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2im\5I%\2jl\5Y-\2kj\3\2"+
		"\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nx\3\2\2\2om\3\2\2\2pt\5I%\2qs\5Y-\2"+
		"rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wb\3\2\2\2"+
		"wp\3\2\2\2xy\3\2\2\2yz\b\3\3\2z{\b\3\4\2{\6\3\2\2\2|}\7\17\2\2}\u0080"+
		"\7\f\2\2~\u0080\7\f\2\2\177|\3\2\2\2\177~\3\2\2\2\u0080\u0084\3\2\2\2"+
		"\u0081\u0083\5\3\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\177\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\u008c\b\4\5\2\u008c\b\3\2\2\2\u008d\u008e"+
		"\7c\2\2\u008e\u008f\7e\2\2\u008f\u0090\7v\2\2\u0090\u0091\7q\2\2\u0091"+
		"\u0092\7t\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\5\6\2\u0094\n\3\2\2\2"+
		"\u0095\u0096\7t\2\2\u0096\u0097\7g\2\2\u0097\u0098\7e\2\2\u0098\u0099"+
		"\7g\2\2\u0099\u009a\7k\2\2\u009a\u009b\7x\2\2\u009b\u009c\7g\2\2\u009c"+
		"\u009d\7t\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\6\7\2\u009f\f\3\2\2\2"+
		"\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a8\7v\2\2\u00a3\u00a4"+
		"\7e\2\2\u00a4\u00a5\7j\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a8\7t\2\2\u00a7"+
		"\u00a0\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\7"+
		"\b\2\u00aa\16\3\2\2\2\u00ab\u00ac\7s\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae"+
		"\7k\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\b\t\2\u00b1"+
		"\20\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\3\2\2\2"+
		"\u00b5\u00b6\b\t\n\2\u00b6\22\3\2\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7"+
		"n\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd"+
		"\7h\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\n\13\2\u00bf\24\3\2\2\2\u00c0"+
		"\u00c1\7g\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7g\2\2"+
		"\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b\13\f\2\u00c6\26\3\2\2\2\u00c7\u00c8"+
		"\7g\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\b\f\r\2\u00cc\30\3\2\2\2\u00cd\u00ce\7h\2\2\u00ce\u00cf\7q\2\2"+
		"\u00cf\u00d0\7t\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3"+
		"\7e\2\2\u00d3\u00d4\7j\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b\r\16\2\u00d6"+
		"\32\3\2\2\2\u00d7\u00d8\7d\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7g\2\2\u00da"+
		"\u00db\7c\2\2\u00db\u00dc\7m\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b\16"+
		"\17\2\u00de\34\3\2\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e3\b\17\20\2\u00e3\36\3\2\2\2\u00e4\u00e5\7u\2\2\u00e5"+
		"\u00e6\7g\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7f\2\2\u00e8\u00e9\7g\2\2"+
		"\u00e9\u00ea\7t\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b\20\21\2\u00ec \3"+
		"\2\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7n\2\2\u00f0"+
		"\u00f1\7h\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b\21\22\2\u00f3\"\3\2\2"+
		"\2\u00f4\u00f5\7d\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7i\2\2\u00f7\u00f8"+
		"\7k\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\b\22\23\2\u00fb"+
		"$\3\2\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7f\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\b\23\24\2\u0101&\3\2\2\2\u0102\u0103\7q\2\2"+
		"\u0103\u0104\7t\2\2\u0104\u0105\3\2\2\2\u0105\u0106\b\24\25\2\u0106(\3"+
		"\2\2\2\u0107\u0108\7-\2\2\u0108\u0109\b\25\26\2\u0109*\3\2\2\2\u010a\u010b"+
		"\7/\2\2\u010b\u010c\b\26\27\2\u010c,\3\2\2\2\u010d\u010e\7,\2\2\u010e"+
		"\u010f\b\27\30\2\u010f.\3\2\2\2\u0110\u0111\7\61\2\2\u0111\u0112\b\30"+
		"\31\2\u0112\60\3\2\2\2\u0113\u0114\7?\2\2\u0114\u0115\b\31\32\2\u0115"+
		"\62\3\2\2\2\u0116\u0117\7?\2\2\u0117\u0118\7?\2\2\u0118\u0119\3\2\2\2"+
		"\u0119\u011a\b\32\33\2\u011a\64\3\2\2\2\u011b\u011c\7>\2\2\u011c\u011d"+
		"\7@\2\2\u011d\u011e\3\2\2\2\u011e\u011f\b\33\34\2\u011f\66\3\2\2\2\u0120"+
		"\u0121\7>\2\2\u0121\u0122\b\34\35\2\u01228\3\2\2\2\u0123\u0124\7@\2\2"+
		"\u0124\u0125\b\35\36\2\u0125:\3\2\2\2\u0126\u0127\7*\2\2\u0127\u0128\b"+
		"\36\37\2\u0128<\3\2\2\2\u0129\u012a\7+\2\2\u012a\u012b\b\37 \2\u012b>"+
		"\3\2\2\2\u012c\u012d\7]\2\2\u012d\u012e\b !\2\u012e@\3\2\2\2\u012f\u0130"+
		"\7_\2\2\u0130\u0131\b!\"\2\u0131B\3\2\2\2\u0132\u0133\7}\2\2\u0133\u0134"+
		"\b\"#\2\u0134D\3\2\2\2\u0135\u0136\7\177\2\2\u0136\u0137\b#$\2\u0137F"+
		"\3\2\2\2\u0138\u0139\7>\2\2\u0139\u013a\7>\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\b$%\2\u013cH\3\2\2\2\u013d\u013e\7%\2\2\u013e\u013f\b%&\2\u013f"+
		"J\3\2\2\2\u0140\u0141\7.\2\2\u0141\u0142\b&\'\2\u0142L\3\2\2\2\u0143\u0144"+
		"\7p\2\2\u0144\u0145\7q\2\2\u0145\u0146\7v\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0148\b\'(\2\u0148N\3\2\2\2\u0149\u014d\7$\2\2\u014a\u014c\5W,\2\u014b"+
		"\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7$\2\2\u0151"+
		"\u0152\b()\2\u0152P\3\2\2\2\u0153\u0156\7)\2\2\u0154\u0157\5W,\2\u0155"+
		"\u0157\7$\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0159\7)\2\2\u0159\u015a\b)*\2\u015aR\3\2\2\2\u015b\u015d\t"+
		"\3\2\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\b*+\2\u0161T\3\2\2\2\u0162"+
		"\u0166\t\4\2\2\u0163\u0165\t\5\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2"+
		"\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0169\u016a\b+,\2\u016aV\3\2\2\2\u016b\u0177\n\6\2\2\u016c"+
		"\u016d\7^\2\2\u016d\u0177\7$\2\2\u016e\u016f\7^\2\2\u016f\u0177\7v\2\2"+
		"\u0170\u0171\7^\2\2\u0171\u0177\7p\2\2\u0172\u0173\7^\2\2\u0173\u0177"+
		"\7^\2\2\u0174\u0175\7^\2\2\u0175\u0177\7)\2\2\u0176\u016b\3\2\2\2\u0176"+
		"\u016c\3\2\2\2\u0176\u016e\3\2\2\2\u0176\u0170\3\2\2\2\u0176\u0172\3\2"+
		"\2\2\u0176\u0174\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\b,-\2\u0179X"+
		"\3\2\2\2\u017a\u017b\n\7\2\2\u017bZ\3\2\2\2\21\2^fmtw\177\u0084\u0089"+
		"\u00a7\u014d\u0156\u015e\u0166\u0176.\3\2\2\3\3\3\3\3\4\3\4\5\3\5\6\3"+
		"\6\7\3\7\b\3\b\t\3\t\n\3\n\13\3\13\f\3\f\r\3\r\16\3\16\17\3\17\20\3\20"+
		"\21\3\21\22\3\22\23\3\23\24\3\24\25\3\25\26\3\26\27\3\27\30\3\30\31\3"+
		"\31\32\3\32\33\3\33\34\3\34\35\3\35\36\3\36\37\3\37 \3 !\3!\"\3\"#\3#"+
		"$\3$%\3%&\3&\'\3\'(\3()\3)*\3*+\3+,\3,-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}