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
		BEGIN=17, READ=18, WRITE=19, AND=20, OR=21, PLUS=22, MINUS=23, MULT=24, 
		DIV=25, EQ=26, EQEQ=27, NOTEQ=28, LT=29, GT=30, POPEN=31, PCLOSE=32, BOPEN=33, 
		BCLOSE=34, COPEN=35, CCLOSE=36, SEND_OP=37, SHARP=38, COMMA=39, NOT=40, 
		STRING=41, CHAR=42, NUMBER=43, ID=44, CHARACTER=45, ANY_CHAR=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "COMMENT", "NEWLINE", "ACTOR", "RECEIVER", "TYPE", "QUIT", "IF", 
		"ELSEIF", "ELSE", "END", "FOREACH", "BREAK", "IN", "SENDER", "SELF", "BEGIN", 
		"READ", "WRITE", "AND", "OR", "PLUS", "MINUS", "MULT", "DIV", "EQ", "EQEQ", 
		"NOTEQ", "LT", "GT", "POPEN", "PCLOSE", "BOPEN", "BCLOSE", "COPEN", "CCLOSE", 
		"SEND_OP", "SHARP", "COMMA", "NOT", "STRING", "CHAR", "NUMBER", "ID", 
		"CHARACTER", "ANY_CHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'actor'", "'receiver'", null, "'quit'", "'if'", 
		"'elseif'", "'else'", "'end'", "'foreach'", "'break'", "'in'", "'sender'", 
		"'self'", "'begin'", "'read'", "'write'", "'and'", "'or'", "'+'", "'-'", 
		"'*'", "'/'", "'='", "'=='", "'<>'", "'<'", "'>'", "'('", "')'", "'['", 
		"']'", "'{'", "'}'", "'<<'", "'#'", "','", "'not'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "COMMENT", "NEWLINE", "ACTOR", "RECEIVER", "TYPE", "QUIT", 
		"IF", "ELSEIF", "ELSE", "END", "FOREACH", "BREAK", "IN", "SENDER", "SELF", 
		"BEGIN", "READ", "WRITE", "AND", "OR", "PLUS", "MINUS", "MULT", "DIV", 
		"EQ", "EQEQ", "NOTEQ", "LT", "GT", "POPEN", "PCLOSE", "BOPEN", "BCLOSE", 
		"COPEN", "CCLOSE", "SEND_OP", "SHARP", "COMMA", "NOT", "STRING", "CHAR", 
		"NUMBER", "ID", "CHARACTER", "ANY_CHAR"
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
			READ_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			WRITE_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			AND_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			OR_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			PLUS_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			MINUS_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			MULT_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			DIV_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			EQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			EQEQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			NOTEQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			LT_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			GT_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			POPEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			PCLOSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			BOPEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			BCLOSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			COPEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			CCLOSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			SEND_OP_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			SHARP_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			COMMA_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			NOT_action((RuleContext)_localctx, actionIndex);
			break;
		case 40:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			NUMBER_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 44:
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
	private void READ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			print("READ");
			break;
		}
	}
	private void WRITE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19:
			print("WRITE");
			break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:
			print("AND");
			break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21:
			print("OR");
			break;
		}
	}
	private void PLUS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22:
			print("PLUS");
			break;
		}
	}
	private void MINUS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23:
			print("MINUS");
			break;
		}
	}
	private void MULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24:
			print("MULT");
			break;
		}
	}
	private void DIV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25:
			print("DIV");
			break;
		}
	}
	private void EQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26:
			print("EQ");
			break;
		}
	}
	private void EQEQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27:
			print("EQEQ");
			break;
		}
	}
	private void NOTEQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 28:
			print("NOTEQ");
			break;
		}
	}
	private void LT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 29:
			print("LT");
			break;
		}
	}
	private void GT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 30:
			print("GT");
			break;
		}
	}
	private void POPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 31:
			print("POPEN");
			break;
		}
	}
	private void PCLOSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32:
			print("PCLOSE");
			break;
		}
	}
	private void BOPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 33:
			print("BOPEN");
			break;
		}
	}
	private void BCLOSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 34:
			print("BCLOSE");
			break;
		}
	}
	private void COPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 35:
			print("COPEN");
			break;
		}
	}
	private void CCLOSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 36:
			print("CCLOSE");
			break;
		}
	}
	private void SEND_OP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 37:
			print("SEND_OP");
			break;
		}
	}
	private void SHARP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 38:
			print("SHARP");
			break;
		}
	}
	private void COMMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 39:
			print("COMMA");
			break;
		}
	}
	private void NOT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 40:
			print("NOT");
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 41:
			print("STRING : " + getText());
			break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 42:
			print("CHAR : " + getText());
			break;
		}
	}
	private void NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 43:
			print("NUMBER : " + getText());
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 44:
			print("ID : " + getText());
			break;
		}
	}
	private void CHARACTER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 45:
			print("CHARACTER : " + getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u018f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\6\2a\n\2\r\2\16\2b\3\2\3\2\3\3\3\3\7\3i"+
		"\n\3\f\3\16\3l\13\3\3\3\3\3\7\3p\n\3\f\3\16\3s\13\3\3\3\3\3\7\3w\n\3\f"+
		"\3\16\3z\13\3\5\3|\n\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4\u0084\n\4\3\4\7\4\u0087"+
		"\n\4\f\4\16\4\u008a\13\4\6\4\u008c\n\4\r\4\16\4\u008d\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ac\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&"+
		"\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\7*\u015f\n*\f*\16"+
		"*\u0162\13*\3*\3*\3*\3+\3+\3+\5+\u016a\n+\3+\3+\3+\3,\6,\u0170\n,\r,\16"+
		",\u0171\3,\3,\3-\3-\7-\u0178\n-\f-\16-\u017b\13-\3-\3-\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\5.\u018a\n.\3.\3.\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60\3\2\b\4\2\13\13\"\"\3\2\62;\5\2C\\aac|\6\2\62;C\\aa"+
		"c|\4\2\f\f$$\3\2\f\f\2\u01a0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\3`\3\2\2\2\5{\3\2\2\2\7\u008b\3\2\2\2\t\u0091\3\2\2\2\13\u0099"+
		"\3\2\2\2\r\u00ab\3\2\2\2\17\u00af\3\2\2\2\21\u00b6\3\2\2\2\23\u00bb\3"+
		"\2\2\2\25\u00c4\3\2\2\2\27\u00cb\3\2\2\2\31\u00d1\3\2\2\2\33\u00db\3\2"+
		"\2\2\35\u00e3\3\2\2\2\37\u00e8\3\2\2\2!\u00f1\3\2\2\2#\u00f8\3\2\2\2%"+
		"\u0100\3\2\2\2\'\u0107\3\2\2\2)\u010f\3\2\2\2+\u0115\3\2\2\2-\u011a\3"+
		"\2\2\2/\u011d\3\2\2\2\61\u0120\3\2\2\2\63\u0123\3\2\2\2\65\u0126\3\2\2"+
		"\2\67\u0129\3\2\2\29\u012e\3\2\2\2;\u0133\3\2\2\2=\u0136\3\2\2\2?\u0139"+
		"\3\2\2\2A\u013c\3\2\2\2C\u013f\3\2\2\2E\u0142\3\2\2\2G\u0145\3\2\2\2I"+
		"\u0148\3\2\2\2K\u014b\3\2\2\2M\u0150\3\2\2\2O\u0153\3\2\2\2Q\u0156\3\2"+
		"\2\2S\u015c\3\2\2\2U\u0166\3\2\2\2W\u016f\3\2\2\2Y\u0175\3\2\2\2[\u0189"+
		"\3\2\2\2]\u018d\3\2\2\2_a\t\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2"+
		"\2\2cd\3\2\2\2de\b\2\2\2e\4\3\2\2\2fj\5\7\4\2gi\5\3\2\2hg\3\2\2\2il\3"+
		"\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mq\5M\'\2np\5]/\2on\3\2"+
		"\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r|\3\2\2\2sq\3\2\2\2tx\5M\'\2uw\5]/"+
		"\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2{f\3\2\2"+
		"\2{t\3\2\2\2|}\3\2\2\2}~\b\3\3\2~\177\b\3\4\2\177\6\3\2\2\2\u0080\u0081"+
		"\7\17\2\2\u0081\u0084\7\f\2\2\u0082\u0084\7\f\2\2\u0083\u0080\3\2\2\2"+
		"\u0083\u0082\3\2\2\2\u0084\u0088\3\2\2\2\u0085\u0087\5\3\2\2\u0086\u0085"+
		"\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u0083\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\b\4\5\2\u0090\b\3\2\2\2\u0091\u0092\7c\2\2\u0092\u0093\7e\2\2\u0093"+
		"\u0094\7v\2\2\u0094\u0095\7q\2\2\u0095\u0096\7t\2\2\u0096\u0097\3\2\2"+
		"\2\u0097\u0098\b\5\6\2\u0098\n\3\2\2\2\u0099\u009a\7t\2\2\u009a\u009b"+
		"\7g\2\2\u009b\u009c\7e\2\2\u009c\u009d\7g\2\2\u009d\u009e\7k\2\2\u009e"+
		"\u009f\7x\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\3\2\2"+
		"\2\u00a2\u00a3\b\6\7\2\u00a3\f\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6"+
		"\7p\2\2\u00a6\u00ac\7v\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7j\2\2\u00a9"+
		"\u00aa\7c\2\2\u00aa\u00ac\7t\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00a7\3\2\2"+
		"\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\b\7\b\2\u00ae\16\3\2\2\2\u00af\u00b0"+
		"\7s\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\b\b\t\2\u00b5\20\3\2\2\2\u00b6\u00b7\7k\2\2"+
		"\u00b7\u00b8\7h\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\t\n\2\u00ba\22\3"+
		"\2\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7u\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2\3\2\2"+
		"\2\u00c2\u00c3\b\n\13\2\u00c3\24\3\2\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6"+
		"\7n\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\b\13\f\2\u00ca\26\3\2\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7p\2\2"+
		"\u00cd\u00ce\7f\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b\f\r\2\u00d0\30\3"+
		"\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7t\2\2\u00d4"+
		"\u00d5\7g\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7j\2\2"+
		"\u00d8\u00d9\3\2\2\2\u00d9\u00da\b\r\16\2\u00da\32\3\2\2\2\u00db\u00dc"+
		"\7d\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7c\2\2\u00df"+
		"\u00e0\7m\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b\16\17\2\u00e2\34\3\2\2"+
		"\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7"+
		"\b\17\20\2\u00e7\36\3\2\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7g\2\2\u00ea"+
		"\u00eb\7p\2\2\u00eb\u00ec\7f\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7t\2\2"+
		"\u00ee\u00ef\3\2\2\2\u00ef\u00f0\b\20\21\2\u00f0 \3\2\2\2\u00f1\u00f2"+
		"\7u\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7h\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\b\21\22\2\u00f7\"\3\2\2\2\u00f8\u00f9\7d\2"+
		"\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7i\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd"+
		"\7p\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\b\22\23\2\u00ff$\3\2\2\2\u0100"+
		"\u0101\7t\2\2\u0101\u0102\7g\2\2\u0102\u0103\7c\2\2\u0103\u0104\7f\2\2"+
		"\u0104\u0105\3\2\2\2\u0105\u0106\b\23\24\2\u0106&\3\2\2\2\u0107\u0108"+
		"\7y\2\2\u0108\u0109\7t\2\2\u0109\u010a\7k\2\2\u010a\u010b\7v\2\2\u010b"+
		"\u010c\7g\2\2\u010c\u010d\3\2\2\2\u010d\u010e\b\24\25\2\u010e(\3\2\2\2"+
		"\u010f\u0110\7c\2\2\u0110\u0111\7p\2\2\u0111\u0112\7f\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0114\b\25\26\2\u0114*\3\2\2\2\u0115\u0116\7q\2\2\u0116"+
		"\u0117\7t\2\2\u0117\u0118\3\2\2\2\u0118\u0119\b\26\27\2\u0119,\3\2\2\2"+
		"\u011a\u011b\7-\2\2\u011b\u011c\b\27\30\2\u011c.\3\2\2\2\u011d\u011e\7"+
		"/\2\2\u011e\u011f\b\30\31\2\u011f\60\3\2\2\2\u0120\u0121\7,\2\2\u0121"+
		"\u0122\b\31\32\2\u0122\62\3\2\2\2\u0123\u0124\7\61\2\2\u0124\u0125\b\32"+
		"\33\2\u0125\64\3\2\2\2\u0126\u0127\7?\2\2\u0127\u0128\b\33\34\2\u0128"+
		"\66\3\2\2\2\u0129\u012a\7?\2\2\u012a\u012b\7?\2\2\u012b\u012c\3\2\2\2"+
		"\u012c\u012d\b\34\35\2\u012d8\3\2\2\2\u012e\u012f\7>\2\2\u012f\u0130\7"+
		"@\2\2\u0130\u0131\3\2\2\2\u0131\u0132\b\35\36\2\u0132:\3\2\2\2\u0133\u0134"+
		"\7>\2\2\u0134\u0135\b\36\37\2\u0135<\3\2\2\2\u0136\u0137\7@\2\2\u0137"+
		"\u0138\b\37 \2\u0138>\3\2\2\2\u0139\u013a\7*\2\2\u013a\u013b\b !\2\u013b"+
		"@\3\2\2\2\u013c\u013d\7+\2\2\u013d\u013e\b!\"\2\u013eB\3\2\2\2\u013f\u0140"+
		"\7]\2\2\u0140\u0141\b\"#\2\u0141D\3\2\2\2\u0142\u0143\7_\2\2\u0143\u0144"+
		"\b#$\2\u0144F\3\2\2\2\u0145\u0146\7}\2\2\u0146\u0147\b$%\2\u0147H\3\2"+
		"\2\2\u0148\u0149\7\177\2\2\u0149\u014a\b%&\2\u014aJ\3\2\2\2\u014b\u014c"+
		"\7>\2\2\u014c\u014d\7>\2\2\u014d\u014e\3\2\2\2\u014e\u014f\b&\'\2\u014f"+
		"L\3\2\2\2\u0150\u0151\7%\2\2\u0151\u0152\b\'(\2\u0152N\3\2\2\2\u0153\u0154"+
		"\7.\2\2\u0154\u0155\b()\2\u0155P\3\2\2\2\u0156\u0157\7p\2\2\u0157\u0158"+
		"\7q\2\2\u0158\u0159\7v\2\2\u0159\u015a\3\2\2\2\u015a\u015b\b)*\2\u015b"+
		"R\3\2\2\2\u015c\u0160\7$\2\2\u015d\u015f\5[.\2\u015e\u015d\3\2\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7$\2\2\u0164\u0165\b*+\2\u0165T\3"+
		"\2\2\2\u0166\u0169\7)\2\2\u0167\u016a\5[.\2\u0168\u016a\7$\2\2\u0169\u0167"+
		"\3\2\2\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\7)\2\2\u016c"+
		"\u016d\b+,\2\u016dV\3\2\2\2\u016e\u0170\t\3\2\2\u016f\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\u0174\b,-\2\u0174X\3\2\2\2\u0175\u0179\t\4\2\2\u0176\u0178"+
		"\t\5\2\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\b-"+
		".\2\u017dZ\3\2\2\2\u017e\u018a\n\6\2\2\u017f\u0180\7^\2\2\u0180\u018a"+
		"\7$\2\2\u0181\u0182\7^\2\2\u0182\u018a\7v\2\2\u0183\u0184\7^\2\2\u0184"+
		"\u018a\7p\2\2\u0185\u0186\7^\2\2\u0186\u018a\7^\2\2\u0187\u0188\7^\2\2"+
		"\u0188\u018a\7)\2\2\u0189\u017e\3\2\2\2\u0189\u017f\3\2\2\2\u0189\u0181"+
		"\3\2\2\2\u0189\u0183\3\2\2\2\u0189\u0185\3\2\2\2\u0189\u0187\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018c\b./\2\u018c\\\3\2\2\2\u018d\u018e\n\7\2\2\u018e"+
		"^\3\2\2\2\21\2bjqx{\u0083\u0088\u008d\u00ab\u0160\u0169\u0171\u0179\u0189"+
		"\60\3\2\2\3\3\3\3\3\4\3\4\5\3\5\6\3\6\7\3\7\b\3\b\t\3\t\n\3\n\13\3\13"+
		"\f\3\f\r\3\r\16\3\16\17\3\17\20\3\20\21\3\21\22\3\22\23\3\23\24\3\24\25"+
		"\3\25\26\3\26\27\3\27\30\3\30\31\3\31\32\3\32\33\3\33\34\3\34\35\3\35"+
		"\36\3\36\37\3\37 \3 !\3!\"\3\"#\3#$\3$%\3%&\3&\'\3\'(\3()\3)*\3*+\3+,"+
		"\3,-\3-.\3./";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}