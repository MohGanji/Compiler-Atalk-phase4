// Generated from /home/vmoh/uni_projs/compiler/Compiler-Atalk-phase4/grammar/AtalkPass2.g4 by ANTLR 4.7

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
public class AtalkPass2Parser extends Parser {
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
	public String getGrammarFileName() { return "AtalkPass2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		boolean hasErr = false;
		ArrayList<String> logs = new ArrayList<String>();
		String currentActor;
		int labelCounter = 0;
		Stack<String> foreachEndLabels = new Stack<String>();;


		void cerr(String str) {
			System.out.println(str);
		}
	    void print(String str){
			// logs.add(str);
	    }
		void printErr(int line, String str){
			hasErr = true;
	        System.out.println("line " + line + ": " + str);
	    }
		void printLogs() {
			if (hasErr)
				return;
			for (int i = 0; i < logs.size(); i++) {
				System.out.println(logs.get(i));
			}
		}

	    void beginScope() {
	        SymbolTable.push();
			// cerr(" --- " + SymbolTable.top.localStackSize());
	    }

	    void endScope() {
	        // print("Stack offset: " + SymbolTable.top.getOffset(Register.SP) + ", Global offset: " + SymbolTable.top.getOffset(Register.GP));
			mips.popStack(SymbolTable.top.localStackSize());
	        SymbolTable.pop();
	    }

		int putLocalVar(String name, Type type) throws ItemAlreadyExistsException {
			int offset = SymbolTable.top.getOffset(Register.SP);
	        try{
	            SymbolTable.top.put(
	                new SymbolTableLocalVariableItem(
	                    new Variable(name, type),
	                    offset
	                )
	            );
	        }
	        catch (ItemAlreadyExistsException iaee){
	            name = name+"_temp";
	            offset = putLocalVar(name, type);
	            throw iaee;
	        }
			return offset;
	    }

		Type checkVariableExistance(int line, String name) {
			SymbolTableItem sti = SymbolTable.top.get(name);
			try {
				if(sti == null || !(sti instanceof SymbolTableVariableItem)) {
					throw new UndefinedVariableException();
				}
				else {
					Variable var = ((SymbolTableVariableItem) sti).getVariable();
					return var.getType();			
				}
			} catch (UndefinedVariableException uve) {
				try {
					SymbolTable.define();
					putLocalVar(name, NoType.getInstance());
					printErr(line, "ERR: Item " + name + " doesn't exist.");
					return NoType.getInstance();
				} catch (ItemAlreadyExistsException iaee) {
					// printErr(line, "ERR: variable already exists: " + iaee.getName());
					return NoType.getInstance();
				}
			}
		}
		void checkActorExistance(int line, String name) {
			SymbolTableItem sti = SymbolTable.top.get(name);
			try {
				if(sti == null) {
					throw new UndefinedActorException();
				} else {
					// cerr("actor hast " + name);
				}
			} catch (UndefinedActorException uae) {
				printErr(line, "ERR: Actor " + name + " doesn't exist.");
			}
		}
		SymbolTableReceiverItem checkReceiverExistance(int line, String actor, String receiverKey) {
			SymbolTableActorItem stai = (SymbolTableActorItem) SymbolTable.top.get(actor);
			try {
				if (stai != null && !stai.hasReceiver(receiverKey)) {
					// stai.printReceivers();
					throw new UndefinedReceiverException();
				}
				return stai.getReceiver(receiverKey);
			} catch (UndefinedReceiverException ure) {
				printErr(line, "ERR: Receiver " + receiverKey + " doesn't exist in Actor " + actor + ".");
			}
			return null;
		}
		Type typeCheck(int line, Type t1, Type t2) {
			try {
				if (!t1.equals(t2)) {
					throw new TypeErrorException();
				}
				return t1;
			} catch (TypeErrorException tee) {
				printErr(line, "ERR: Can't convert type " + t2.toString() + " to " + t1.toString());
				return NoType.getInstance();
			}
		}
		Type checkArrayDim(int line, Type type, int dim) {
			try {
				if (dim == 0)
					return type;
				if ((type instanceof ArrayType && !(dim <= ((ArrayType) type).dim())) || !(type instanceof ArrayType)) {
					throw new TypeErrorException();
				}
				Type returnType = ((ArrayType) type).type();
				for (int i = 1; i < dim; i++) {
					returnType = ((ArrayType) returnType).type();
				} 
				return returnType;
			} catch (TypeErrorException tee) {
				printErr(line, "ERR: " + type.toString() + " object doesn't support index access");
				return NoType.getInstance();
			}
		}
		void checkLValue(int line, boolean is_lvalue) {
			try {
				if (!is_lvalue) {
					throw new LValueException();
				}
			} catch (LValueException lve) {
				printErr(line, "ERR: Can't assign to RValue");
			}
		}
		void checkForeach(int line, Type exp) {
			try {
				if (!(exp instanceof ArrayType)) {
					throw new ForeachIterativeException();
				} /* else if (!exp.type().equals(var)) {
					throw new ForeachIteratorException();
				} */
			} catch (ForeachIterativeException ftie) {
				printErr(line, "ERR: Foreach iterative must be an array");
			} /* catch (ForeachIteratorException ftoe) {
				printErr(line, "ERR: Foreach iterator '" + var.toString() + "' doesn't match '" + exp.type().toString() + "'");
			} */
		}
		void checkInit(int line, boolean callsSender){
			try{
				if(callsSender)
					throw new InitCallsSenderException();
			} catch (InitCallsSenderException icse){
				printErr(line, "Init receiver can't call sender");
			}
		}
		void checkWrite(int line, Type type){
			String ret = type.toString();
			try{
				if( !(ret.equals("char") 
				 || ret.equals("int") 
				 || ret.equals("array_char_")) 
				)
					throw new WriteException();
			} catch (WriteException we) {
				printErr(line, "ERR: Write function only accepts int, char or string");
			}
		}

		Translator mips = new Translator();

		void p4addVarToStack(String name, boolean left) {
			SymbolTableItem item = SymbolTable.top.get(name);
			SymbolTableVariableItem var = (SymbolTableVariableItem) item;

			int size = 1;
			if (var.getVariable().getType() instanceof ArrayType) {
				size = ((ArrayType) var.getVariable().getType()).len();
			}
			
			if (var.getBaseRegister() == Register.SP){
				if (left == false) mips.addVariableToStack(name, var.getOffset()*-1, size);
				else mips.addVariableAddressToStack(name, var.getOffset()*-1, size);
			}
			else {
				if (left == false) mips.addGlobalToStack(var.getOffset(), size);
				else mips.addGlobalVariableAddressToStack(name, var.getOffset(), size);
			}
		}

		void addArrayAddress(String name) {
			SymbolTableItem item = SymbolTable.top.get(name);
			SymbolTableVariableItem var = (SymbolTableVariableItem) item;

			if (var.getBaseRegister() == Register.SP){
				mips.addVariableAddressToStack(name, var.getOffset()*-1, 1);
			}
			else {
				mips.addGlobalVariableAddressToStack(name, var.getOffset(), 1);
			}
		}

		String generateIfLabel() {
			String s = "IF_LABEL________________" + labelCounter;
			labelCounter += 1;
			return s;
		}
		String generateForeachStartLabel() {
			String s = "FOREACH_START___________" + labelCounter;
			labelCounter += 1;
			return s;
		}
		String generateForeachEndLabel() {
			String s = "FOREACH_END_____________" + labelCounter;
			foreachEndLabels.push(s);
			labelCounter += 1;
			return s;
		}
		String getLastForeachEndLabel() {
			return foreachEndLabels.top();
		}
		void endForeachLabel() {
			foreachEndLabels.pop();
		}
		String generateReceiverLabel(String actorLabel, String receiverKey) {
			return actorLabel + "__RECEIVER_" + receiverKey + "____";
		}
		String generateActorLabel(String actorName) {
			return "___ACTOR_" + actorName;
		}

	public AtalkPass2Parser(TokenStream input) {
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
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
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
					mips.scheduler();
				
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==NL) {
				{
				setState(71);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(69);
					actor();
					}
					break;
				case NL:
					{
					setState(70);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

					endScope();
					printLogs();
					mips.makeOutput();
				
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
		public String actorLabel;
		public Token act;
		public Token qLen;
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
		}
		public TerminalNode ID() { return getToken(AtalkPass2Parser.ID, 0); }
		public TerminalNode CONST_NUM() { return getToken(AtalkPass2Parser.CONST_NUM, 0); }
		public TerminalNode EOF() { return getToken(AtalkPass2Parser.EOF, 0); }
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

				
			setState(79);
			match(T__0);
			setState(80);
			((ActorContext)_localctx).act = match(ID);

							currentActor = ((ActorContext)_localctx).act.getText();
							((ActorContext)_localctx).actorLabel =  generateActorLabel(((ActorContext)_localctx).act.getText());
						
			setState(82);
			match(T__1);
			setState(83);
			((ActorContext)_localctx).qLen = match(CONST_NUM);
			setState(84);
			match(T__2);
			setState(85);
			match(NL);

							mips.actorStart(_localctx.actorLabel, (((ActorContext)_localctx).qLen!=null?Integer.valueOf(((ActorContext)_localctx).qLen.getText()):0));
							beginScope();
						
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__11) | (1L << NL))) != 0)) {
				{
				setState(90);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__11:
					{
					setState(87);
					state();
					}
					break;
				case T__5:
					{
					setState(88);
					receiver(_localctx.actorLabel);
					}
					break;
				case NL:
					{
					setState(89);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(T__3);
			 endScope(); 
			setState(97);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AtalkPass2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkPass2Parser.ID, i);
		}
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
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
			setState(99);
			type();
			setState(100);
			match(ID);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(101);
				match(T__4);
				setState(102);
				match(ID);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
		public String actorLabel;
		public boolean hasInit = false;
		public String receiverLabel;
		public String rcKey;
		public Token rec;
		public TypeContext tp;
		public Token arg1;
		public TypeContext tp2;
		public Token arg2;
		public StatementsContext s;
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
		}
		public List<TerminalNode> ID() { return getTokens(AtalkPass2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkPass2Parser.ID, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ReceiverContext(ParserRuleContext parent, int invokingState, String actorLabel) {
			super(parent, invokingState);
			this.actorLabel = actorLabel;
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
	}

	public final ReceiverContext receiver(String actorLabel) throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState(), actorLabel);
		enterRule(_localctx, 6, RULE_receiver);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__5);
			setState(111);
			((ReceiverContext)_localctx).rec = match(ID);

						((ReceiverContext)_localctx).rcKey =  ((ReceiverContext)_localctx).rec.getText();
						// System.out.println("****************" + ((ReceiverContext)_localctx).rec.getText());
						// System.out.println("****************" + ((ReceiverContext)_localctx).rec.getText());
						// System.out.println(stri);
					
			setState(113);
			match(T__6);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__11) {
				{
				setState(114);
				((ReceiverContext)_localctx).tp = type();
				setState(115);
				((ReceiverContext)_localctx).arg1 = match(ID);
				SymbolTable.define();
				_localctx.rcKey += "_" + ((ReceiverContext)_localctx).tp.retType.toString();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(118);
					match(T__4);
					setState(119);
					((ReceiverContext)_localctx).tp2 = type();
					setState(120);
					((ReceiverContext)_localctx).arg2 = match(ID);
					SymbolTable.define();
					_localctx.rcKey += "_" + ((ReceiverContext)_localctx).tp2.retType.toString();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(131);
			match(T__7);
			setState(132);
			match(NL);

							SymbolTableReceiverItem stri = (SymbolTableReceiverItem) SymbolTable.top.get(_localctx.rcKey);
							((ReceiverContext)_localctx).receiverLabel =  generateReceiverLabel(actorLabel, stri.getKey());
							mips.receiverStart(_localctx.receiverLabel);
							if(((ReceiverContext)_localctx).rec.getText().equals("init") && ((ReceiverContext)_localctx).arg1 == null){
								((ReceiverContext)_localctx).hasInit =  true;
								mips.addMessageToActorQueueInit(_localctx.actorLabel, _localctx.receiverLabel);
							}
							beginScope();
							mips.getParamsFromDataSegment(stri.getTypes());
						
			setState(134);
			((ReceiverContext)_localctx).s = statements();

						if(_localctx.hasInit)
							checkInit(((ReceiverContext)_localctx).s.senderLine, ((ReceiverContext)_localctx).s.callsSender);
					
			setState(136);
			match(T__3);
			setState(137);
			match(NL);

							endScope();
							mips.endReceiver();
						
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
		public Type retType;
		public int size = 1;
		public ArrayList<Integer> dims = new ArrayList<Integer>();
		public Type x;
		public Token sz;
		public List<TerminalNode> CONST_NUM() { return getTokens(AtalkPass2Parser.CONST_NUM); }
		public TerminalNode CONST_NUM(int i) {
			return getToken(AtalkPass2Parser.CONST_NUM, i);
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
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(T__8);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(141);
					match(T__9);
					setState(142);
					((TypeContext)_localctx).sz = match(CONST_NUM);
					setState(143);
					match(T__10);

								_localctx.size *= (((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0);

								if((((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0) <= 0) {
									((TypeContext)_localctx).retType =  new ArrayType(CharType.getInstance(), 0);
								}
								_localctx.dims.add((((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0));
							
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

							((TypeContext)_localctx).retType =  CharType.getInstance();
							if (_localctx.size == 1 && (((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0) == 0)
								((TypeContext)_localctx).retType =  CharType.getInstance();
							else {
								for(int i = _localctx.dims.size()-1; i >= 0; i--){
									if(i == _localctx.dims.size()-1)
										((TypeContext)_localctx).x =  new ArrayType(CharType.getInstance(), _localctx.dims.get(i));
									else
										((TypeContext)_localctx).x =  new ArrayType(_localctx.x, _localctx.dims.get(i));
								}
								((TypeContext)_localctx).retType =  _localctx.x;
							}
						
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__11);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(152);
					match(T__9);
					setState(153);
					((TypeContext)_localctx).sz = match(CONST_NUM);
					setState(154);
					match(T__10);

								_localctx.size *= (((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0);
								if((((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0) <= 0){
									((TypeContext)_localctx).retType =  new ArrayType(IntType.getInstance(), 0);
								}
								_localctx.dims.add((((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0));
							
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

							((TypeContext)_localctx).retType =  IntType.getInstance();
							if (_localctx.size == 1 && (((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0) == 0)
								((TypeContext)_localctx).retType =  IntType.getInstance();
							else if (_localctx.size != 0 && (((TypeContext)_localctx).sz!=null?Integer.valueOf(((TypeContext)_localctx).sz.getText()):0) != 0) {
								for(int i = _localctx.dims.size()-1; i >= 0; i--){
									if(i == _localctx.dims.size()-1)
										((TypeContext)_localctx).x =  new ArrayType(IntType.getInstance(), _localctx.dims.get(i));
									else
										((TypeContext)_localctx).x =  new ArrayType(_localctx.x, _localctx.dims.get(i));
								}
								((TypeContext)_localctx).retType =  _localctx.x;
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
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
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
			setState(164);
			match(T__12);
			setState(165);
			match(NL);
			 beginScope(); 
			setState(167);
			statements();
			setState(168);
			match(T__3);
			setState(169);
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
		public boolean callsSender = false;
		public int senderLine;
		public StatementContext s;
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
					setState(172);
					((StatementsContext)_localctx).s = statement();

								if(((StatementsContext)_localctx).s.callsSender){
									((StatementsContext)_localctx).callsSender =  true;
									((StatementsContext)_localctx).senderLine =  ((StatementsContext)_localctx).s.senderLine;
								}
							
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
		public boolean callsSender = false;
		public int senderLine;
		public Stm_tellContext s;
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
				stm_break();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(187);
				((StatementContext)_localctx).s = stm_tell();
				((StatementContext)_localctx).callsSender =  ((StatementContext)_localctx).s.callsSender; ((StatementContext)_localctx).senderLine =  ((StatementContext)_localctx).s.senderLine;
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
		public Type exp2LastType = NoType.getInstance();
		public int size;
		public TypeContext tp;
		public Token var;
		public ExprContext exp;
		public Token var2;
		public ExprContext exp2;
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AtalkPass2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkPass2Parser.ID, i);
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
			((Stm_vardefContext)_localctx).var = match(ID);

						SymbolTable.define();

						SymbolTableVariableItem v = (SymbolTableVariableItem) SymbolTable.top.get(((Stm_vardefContext)_localctx).var.getText());
						((Stm_vardefContext)_localctx).size =  1;
						if (v.getVariable().getType() instanceof ArrayType) {
							((Stm_vardefContext)_localctx).size =  ((ArrayType) v.getVariable().getType()).len();
						}

						mips.addVariableToStack(0, _localctx.size);
					
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(197);
				match(T__13);

							mips.popStack(_localctx.size * 4);
							mips.addVariableAddressToStack(((Stm_vardefContext)_localctx).var.getText(), v.getOffset()*-1, _localctx.size);
						
				setState(199);
				((Stm_vardefContext)_localctx).exp = expr();

							typeCheck((((Stm_vardefContext)_localctx).var!=null?((Stm_vardefContext)_localctx).var.getLine():0), ((Stm_vardefContext)_localctx).tp.retType, ((Stm_vardefContext)_localctx).exp.retType);
							mips.assignCommand(true, _localctx.size);
						
				}
			}

			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(204);
				match(T__4);
				setState(205);
				((Stm_vardefContext)_localctx).var2 = match(ID);

							SymbolTable.define();
						
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(207);
					match(T__13);
					setState(208);
					((Stm_vardefContext)_localctx).exp2 = expr();

								/* if (_localctx.exp2LastType.equals(NoType.getInstance())) {
									checkLValue((((Stm_vardefContext)_localctx).var!=null?((Stm_vardefContext)_localctx).var.getLine():0), ((Stm_vardefContext)_localctx).exp.is_lvalue);
								} else {
									checkLValue((((Stm_vardefContext)_localctx).var!=null?((Stm_vardefContext)_localctx).var.getLine():0), ((Stm_vardefContext)_localctx).exp2.is_lvalue);
								} */
								((Stm_vardefContext)_localctx).exp2LastType =  ((Stm_vardefContext)_localctx).exp2.retType;
								typeCheck((((Stm_vardefContext)_localctx).var!=null?((Stm_vardefContext)_localctx).var.getLine():0), ((Stm_vardefContext)_localctx).tp.retType, ((Stm_vardefContext)_localctx).exp2.retType);
							
					}
				}

				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
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
		public boolean callsSender = false;
		public int senderLine;
		public String rcKey;
		public String actorName;
		public Token act;
		public Token l;
		public Token rc;
		public ExprContext ex;
		public ExprContext ex2;
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
		public List<TerminalNode> ID() { return getTokens(AtalkPass2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkPass2Parser.ID, i);
		}
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
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(220);
				((Stm_tellContext)_localctx).act = match(ID);

							((Stm_tellContext)_localctx).actorName =  ((Stm_tellContext)_localctx).act.getText();
							checkActorExistance((((Stm_tellContext)_localctx).act!=null?((Stm_tellContext)_localctx).act.getLine():0), _localctx.actorName);
						
				}
				break;
			case T__14:
				{
				setState(222);
				((Stm_tellContext)_localctx).l = match(T__14);

							((Stm_tellContext)_localctx).senderLine =  (((Stm_tellContext)_localctx).l!=null?((Stm_tellContext)_localctx).l.getLine():0);
							((Stm_tellContext)_localctx).callsSender =  true;
						
				}
				break;
			case T__15:
				{
				setState(224);
				match(T__15);

							((Stm_tellContext)_localctx).actorName =  currentActor;
						
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(228);
			match(T__16);
			setState(229);
			((Stm_tellContext)_localctx).rc = match(ID);

						((Stm_tellContext)_localctx).rcKey =  ((Stm_tellContext)_localctx).rc.getText();
					
			setState(231);
			match(T__6);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				setState(232);
				((Stm_tellContext)_localctx).ex = expr();
				_localctx.rcKey += "_" + ((Stm_tellContext)_localctx).ex.retType.toString();
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(234);
					match(T__4);
					setState(235);
					((Stm_tellContext)_localctx).ex2 = expr();
					_localctx.rcKey += "_" + ((Stm_tellContext)_localctx).ex2.retType.toString();
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(245);
			match(T__7);
			setState(246);
			match(NL);

						SymbolTableReceiverItem stri = checkReceiverExistance((((Stm_tellContext)_localctx).rc!=null?((Stm_tellContext)_localctx).rc.getLine():0), _localctx.actorName, _localctx.rcKey);
						String actorLabel = generateActorLabel(_localctx.actorName);
						mips.addMessageToActorQueue(actorLabel, generateReceiverLabel(actorLabel, stri.getKey()));
						mips.addReceiverParamsToDataSegment(stri.getTypes());
					
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
		public ExprContext exp;
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
			setState(249);
			match(T__17);
			setState(250);
			match(T__6);
			setState(251);
			((Stm_writeContext)_localctx).exp = expr();

						checkWrite(((Stm_writeContext)_localctx).exp.line, ((Stm_writeContext)_localctx).exp.retType);
					
			setState(253);
			match(T__7);
			setState(254);
			match(NL);

						mips.write(((Stm_writeContext)_localctx).exp.retType);
					
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
		public String ifLabel;
		public ExprContext exp;
		public ExprContext exp2;
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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

					((Stm_if_elseif_elseContext)_localctx).ifLabel =  generateIfLabel();
				
			setState(258);
			match(T__18);

							beginScope();
						
			setState(260);
			((Stm_if_elseif_elseContext)_localctx).exp = expr();

							typeCheck(((Stm_if_elseif_elseContext)_localctx).exp.line, IntType.getInstance(), ((Stm_if_elseif_elseContext)_localctx).exp.retType);
							mips.ifStatement();
						
			setState(262);
			match(NL);
			setState(263);
			statements();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(264);
				match(T__19);

								mips.jumpLabel(_localctx.ifLabel);
								mips.putLabel();
								endScope();
								beginScope();
							
				setState(266);
				((Stm_if_elseif_elseContext)_localctx).exp2 = expr();

								typeCheck(((Stm_if_elseif_elseContext)_localctx).exp2.line, IntType.getInstance(), ((Stm_if_elseif_elseContext)_localctx).exp2.retType);
								mips.ifStatement();
							
				setState(268);
				match(NL);
				setState(269);
				statements();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(276);
				match(T__20);

								mips.jumpLabel(_localctx.ifLabel);
								mips.putLabel();
								endScope();
								beginScope();
							
				setState(278);
				match(NL);

								mips.generateLabel();
							
				setState(280);
				statements();
				}
			}

			setState(283);
			match(T__3);
			setState(284);
			match(NL);

							endScope();
							mips.putLabel();
							mips.putLabel(_localctx.ifLabel);
						
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
		public String startLabel;
		public String endLabel;
		public Token var;
		public ExprContext exp;
		public List<TerminalNode> NL() { return getTokens(AtalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkPass2Parser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ID() { return getToken(AtalkPass2Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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

					((Stm_foreachContext)_localctx).startLabel =  generateForeachStartLabel();
					((Stm_foreachContext)_localctx).endLabel =  generateForeachEndLabel();
				
			setState(288);
			match(T__21);
			setState(289);
			((Stm_foreachContext)_localctx).var = match(ID);

							SymbolTable.define();
							mips.addVariableToStack(0, 1); // element
						
			setState(291);
			match(T__22);
			setState(292);
			((Stm_foreachContext)_localctx).exp = expr();
			setState(293);
			match(NL);

							checkForeach((((Stm_foreachContext)_localctx).var!=null?((Stm_foreachContext)_localctx).var.getLine():0), ((Stm_foreachContext)_localctx).exp.retType);
							beginScope();
							mips.addVariableToStack(((ArrayType) ((Stm_foreachContext)_localctx).exp.retType).len(), 1); // len
							mips.foreachStatement(_localctx.startLabel, _localctx.endLabel, ((ArrayType) ((Stm_foreachContext)_localctx).exp.retType).len());
							mips.addVariableToStack(0, 1); // array index :\
						
			setState(295);
			statements();
			setState(296);
			match(T__3);
			setState(297);
			match(NL);

							endScope();
							mips.decForeachIndex();
							mips.jumpLabel(_localctx.startLabel);
							mips.putLabel(_localctx.endLabel);
							mips.popStack((((ArrayType) ((Stm_foreachContext)_localctx).exp.retType).len() + 1) * 4); // pop array and index
							mips.popStack(); // pop element
							endForeachLabel();
						
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
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
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
			setState(300);
			match(T__23);
			setState(301);
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
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
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
			setState(303);
			match(T__24);
			setState(304);
			match(NL);

						mips.jumpLabel(getLastForeachEndLabel());
					
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
		public TerminalNode NL() { return getToken(AtalkPass2Parser.NL, 0); }
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
			setState(307);
			expr();
			setState(308);
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
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_assignContext exp;
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
			setState(310);
			((ExprContext)_localctx).exp = expr_assign();

						((ExprContext)_localctx).line =  ((ExprContext)_localctx).exp.line;
						((ExprContext)_localctx).is_lvalue =  ((ExprContext)_localctx).exp.is_lvalue;
						((ExprContext)_localctx).retType =  ((ExprContext)_localctx).exp.retType;
					
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
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public int size;
		public Expr_orContext exp;
		public Expr_assignContext exp2;
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
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				((Expr_assignContext)_localctx).exp = expr_or(true);
				setState(314);
				match(T__13);
				setState(315);
				((Expr_assignContext)_localctx).exp2 = expr_assign();

							((Expr_assignContext)_localctx).retType =  typeCheck(((Expr_assignContext)_localctx).exp.line, ((Expr_assignContext)_localctx).exp.retType, ((Expr_assignContext)_localctx).exp2.retType);
							checkLValue(((Expr_assignContext)_localctx).exp.line, ((Expr_assignContext)_localctx).exp.is_lvalue);
							((Expr_assignContext)_localctx).is_lvalue =  ((Expr_assignContext)_localctx).exp2.is_lvalue;
							((Expr_assignContext)_localctx).line =  ((Expr_assignContext)_localctx).exp.line;

							((Expr_assignContext)_localctx).size =  1;
							if (_localctx.retType instanceof ArrayType) {
								((Expr_assignContext)_localctx).size =  ((ArrayType) _localctx.retType).len();
							}

							mips.assignCommand(false, _localctx.size);
						
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				((Expr_assignContext)_localctx).exp = expr_or(false);

							((Expr_assignContext)_localctx).line =  ((Expr_assignContext)_localctx).exp.line;
							((Expr_assignContext)_localctx).is_lvalue =  ((Expr_assignContext)_localctx).exp.is_lvalue;
							((Expr_assignContext)_localctx).retType =  ((Expr_assignContext)_localctx).exp.retType;
						
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
		public boolean left;
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_andContext exp;
		public Expr_or_tmpContext exp2;
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_or_tmpContext expr_or_tmp() {
			return getRuleContext(Expr_or_tmpContext.class,0);
		}
		public Expr_orContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_orContext(ParserRuleContext parent, int invokingState, boolean left) {
			super(parent, invokingState);
			this.left = left;
		}
		@Override public int getRuleIndex() { return RULE_expr_or; }
	}

	public final Expr_orContext expr_or(boolean left) throws RecognitionException {
		Expr_orContext _localctx = new Expr_orContext(_ctx, getState(), left);
		enterRule(_localctx, 36, RULE_expr_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			((Expr_orContext)_localctx).exp = expr_and(_localctx.left);
			setState(324);
			((Expr_orContext)_localctx).exp2 = expr_or_tmp(_localctx.left);

						((Expr_orContext)_localctx).retType =  ((Expr_orContext)_localctx).exp.retType;
						if (!((Expr_orContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
							((Expr_orContext)_localctx).retType =  typeCheck(((Expr_orContext)_localctx).exp.line, ((Expr_orContext)_localctx).exp.retType, ((Expr_orContext)_localctx).exp2.retType);
						}
						((Expr_orContext)_localctx).is_lvalue =  ((Expr_orContext)_localctx).exp.is_lvalue && ((Expr_orContext)_localctx).exp2.is_lvalue;
						((Expr_orContext)_localctx).line =  ((Expr_orContext)_localctx).exp.line;
					
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
		public boolean left;
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Token op;
		public Expr_andContext exp;
		public Expr_or_tmpContext exp2;
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_or_tmpContext expr_or_tmp() {
			return getRuleContext(Expr_or_tmpContext.class,0);
		}
		public Expr_or_tmpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_or_tmpContext(ParserRuleContext parent, int invokingState, boolean left) {
			super(parent, invokingState);
			this.left = left;
		}
		@Override public int getRuleIndex() { return RULE_expr_or_tmp; }
	}

	public final Expr_or_tmpContext expr_or_tmp(boolean left) throws RecognitionException {
		Expr_or_tmpContext _localctx = new Expr_or_tmpContext(_ctx, getState(), left);
		enterRule(_localctx, 38, RULE_expr_or_tmp);
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				((Expr_or_tmpContext)_localctx).op = match(T__25);
				setState(328);
				((Expr_or_tmpContext)_localctx).exp = expr_and(_localctx.left);

							mips.operationCommand((((Expr_or_tmpContext)_localctx).op!=null?((Expr_or_tmpContext)_localctx).op.getText():null));
						
				setState(330);
				((Expr_or_tmpContext)_localctx).exp2 = expr_or_tmp(_localctx.left);

							((Expr_or_tmpContext)_localctx).retType =  ((Expr_or_tmpContext)_localctx).exp.retType;
							if (!((Expr_or_tmpContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
								((Expr_or_tmpContext)_localctx).retType =  typeCheck(((Expr_or_tmpContext)_localctx).exp.line, ((Expr_or_tmpContext)_localctx).exp.retType, ((Expr_or_tmpContext)_localctx).exp2.retType);
							}
							((Expr_or_tmpContext)_localctx).is_lvalue =  false;
							((Expr_or_tmpContext)_localctx).line =  ((Expr_or_tmpContext)_localctx).exp.line;
						
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

							((Expr_or_tmpContext)_localctx).is_lvalue =  true;
							((Expr_or_tmpContext)_localctx).retType =  NoType.getInstance();
							((Expr_or_tmpContext)_localctx).line =  0;
						
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
		public boolean left;
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_eqContext exp;
		public Expr_and_tmpContext exp2;
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_and_tmpContext expr_and_tmp() {
			return getRuleContext(Expr_and_tmpContext.class,0);
		}
		public Expr_andContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_andContext(ParserRuleContext parent, int invokingState, boolean left) {
			super(parent, invokingState);
			this.left = left;
		}
		@Override public int getRuleIndex() { return RULE_expr_and; }
	}

	public final Expr_andContext expr_and(boolean left) throws RecognitionException {
		Expr_andContext _localctx = new Expr_andContext(_ctx, getState(), left);
		enterRule(_localctx, 40, RULE_expr_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			((Expr_andContext)_localctx).exp = expr_eq(_localctx.left);
			setState(337);
			((Expr_andContext)_localctx).exp2 = expr_and_tmp(_localctx.left);

						((Expr_andContext)_localctx).retType =  ((Expr_andContext)_localctx).exp.retType;
						if (!((Expr_andContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
							((Expr_andContext)_localctx).retType =  typeCheck(((Expr_andContext)_localctx).exp.line, ((Expr_andContext)_localctx).exp.retType, ((Expr_andContext)_localctx).exp2.retType);
						}
						((Expr_andContext)_localctx).is_lvalue =  ((Expr_andContext)_localctx).exp.is_lvalue && ((Expr_andContext)_localctx).exp2.is_lvalue;
						((Expr_andContext)_localctx).line =  ((Expr_andContext)_localctx).exp.line;
					
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
		public boolean left;
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Token op;
		public Expr_eqContext exp;
		public Expr_and_tmpContext exp2;
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_and_tmpContext expr_and_tmp() {
			return getRuleContext(Expr_and_tmpContext.class,0);
		}
		public Expr_and_tmpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_and_tmpContext(ParserRuleContext parent, int invokingState, boolean left) {
			super(parent, invokingState);
			this.left = left;
		}
		@Override public int getRuleIndex() { return RULE_expr_and_tmp; }
	}

	public final Expr_and_tmpContext expr_and_tmp(boolean left) throws RecognitionException {
		Expr_and_tmpContext _localctx = new Expr_and_tmpContext(_ctx, getState(), left);
		enterRule(_localctx, 42, RULE_expr_and_tmp);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				((Expr_and_tmpContext)_localctx).op = match(T__26);
				setState(341);
				((Expr_and_tmpContext)_localctx).exp = expr_eq(_localctx.left);

							mips.operationCommand((((Expr_and_tmpContext)_localctx).op!=null?((Expr_and_tmpContext)_localctx).op.getText():null));
						
				setState(343);
				((Expr_and_tmpContext)_localctx).exp2 = expr_and_tmp(_localctx.left);

							((Expr_and_tmpContext)_localctx).retType =  ((Expr_and_tmpContext)_localctx).exp.retType;
							if (!((Expr_and_tmpContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
								((Expr_and_tmpContext)_localctx).retType =  typeCheck(((Expr_and_tmpContext)_localctx).exp.line, ((Expr_and_tmpContext)_localctx).exp.retType, ((Expr_and_tmpContext)_localctx).exp2.retType);
							}
							((Expr_and_tmpContext)_localctx).is_lvalue =  false;
							((Expr_and_tmpContext)_localctx).line =  ((Expr_and_tmpContext)_localctx).exp.line;
						
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

							((Expr_and_tmpContext)_localctx).is_lvalue =  true;
							((Expr_and_tmpContext)_localctx).retType =  NoType.getInstance();
							((Expr_and_tmpContext)_localctx).line =  0;
						
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
		public boolean left;
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_cmpContext exp;
		public Expr_eq_tmpContext exp2;
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Expr_eq_tmpContext expr_eq_tmp() {
			return getRuleContext(Expr_eq_tmpContext.class,0);
		}
		public Expr_eqContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_eqContext(ParserRuleContext parent, int invokingState, boolean left) {
			super(parent, invokingState);
			this.left = left;
		}
		@Override public int getRuleIndex() { return RULE_expr_eq; }
	}

	public final Expr_eqContext expr_eq(boolean left) throws RecognitionException {
		Expr_eqContext _localctx = new Expr_eqContext(_ctx, getState(), left);
		enterRule(_localctx, 44, RULE_expr_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			((Expr_eqContext)_localctx).exp = expr_cmp(_localctx.left);
			setState(350);
			((Expr_eqContext)_localctx).exp2 = expr_eq_tmp(_localctx.left);

						((Expr_eqContext)_localctx).retType =  ((Expr_eqContext)_localctx).exp.retType;
						if (!((Expr_eqContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
							((Expr_eqContext)_localctx).retType =  typeCheck(((Expr_eqContext)_localctx).exp.line, ((Expr_eqContext)_localctx).exp.retType, ((Expr_eqContext)_localctx).exp2.retType);
						}
						((Expr_eqContext)_localctx).is_lvalue =  ((Expr_eqContext)_localctx).exp.is_lvalue && ((Expr_eqContext)_localctx).exp2.is_lvalue;
						((Expr_eqContext)_localctx).line =  ((Expr_eqContext)_localctx).exp.line;
					
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
		public boolean left;
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Token op;
		public Expr_cmpContext exp;
		public Expr_eq_tmpContext exp2;
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Expr_eq_tmpContext expr_eq_tmp() {
			return getRuleContext(Expr_eq_tmpContext.class,0);
		}
		public Expr_eq_tmpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_eq_tmpContext(ParserRuleContext parent, int invokingState, boolean left) {
			super(parent, invokingState);
			this.left = left;
		}
		@Override public int getRuleIndex() { return RULE_expr_eq_tmp; }
	}

	public final Expr_eq_tmpContext expr_eq_tmp(boolean left) throws RecognitionException {
		Expr_eq_tmpContext _localctx = new Expr_eq_tmpContext(_ctx, getState(), left);
		enterRule(_localctx, 46, RULE_expr_eq_tmp);
		int _la;
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				((Expr_eq_tmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
					((Expr_eq_tmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(354);
				((Expr_eq_tmpContext)_localctx).exp = expr_cmp(_localctx.left);

							mips.operationCommand((((Expr_eq_tmpContext)_localctx).op!=null?((Expr_eq_tmpContext)_localctx).op.getText():null));
						
				setState(356);
				((Expr_eq_tmpContext)_localctx).exp2 = expr_eq_tmp(_localctx.left);

							((Expr_eq_tmpContext)_localctx).retType =  ((Expr_eq_tmpContext)_localctx).exp.retType;
							if (!((Expr_eq_tmpContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
								((Expr_eq_tmpContext)_localctx).retType =  typeCheck(((Expr_eq_tmpContext)_localctx).exp.line, ((Expr_eq_tmpContext)_localctx).exp.retType, ((Expr_eq_tmpContext)_localctx).exp2.retType);
							}
							((Expr_eq_tmpContext)_localctx).is_lvalue =  false;
							((Expr_eq_tmpContext)_localctx).line =  ((Expr_eq_tmpContext)_localctx).exp.line;
						
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

							((Expr_eq_tmpContext)_localctx).is_lvalue =  true;
							((Expr_eq_tmpContext)_localctx).retType =  NoType.getInstance();
							((Expr_eq_tmpContext)_localctx).line =  0;
						
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
		public boolean left;
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_addContext exp;
		public Expr_cmp_tmpContext exp2;
		public Expr_addContext expr_add() {
			return getRuleContext(Expr_addContext.class,0);
		}
		public Expr_cmp_tmpContext expr_cmp_tmp() {
			return getRuleContext(Expr_cmp_tmpContext.class,0);
		}
		public Expr_cmpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_cmpContext(ParserRuleContext parent, int invokingState, boolean left) {
			super(parent, invokingState);
			this.left = left;
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp; }
	}

	public final Expr_cmpContext expr_cmp(boolean left) throws RecognitionException {
		Expr_cmpContext _localctx = new Expr_cmpContext(_ctx, getState(), left);
		enterRule(_localctx, 48, RULE_expr_cmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			((Expr_cmpContext)_localctx).exp = expr_add(_localctx.left);
			setState(363);
			((Expr_cmpContext)_localctx).exp2 = expr_cmp_tmp(_localctx.left);

						((Expr_cmpContext)_localctx).retType =  ((Expr_cmpContext)_localctx).exp.retType;
						if (!((Expr_cmpContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
							((Expr_cmpContext)_localctx).retType =  typeCheck(((Expr_cmpContext)_localctx).exp.line, ((Expr_cmpContext)_localctx).exp.retType, ((Expr_cmpContext)_localctx).exp2.retType);
						}
						((Expr_cmpContext)_localctx).is_lvalue =  ((Expr_cmpContext)_localctx).exp.is_lvalue && ((Expr_cmpContext)_localctx).exp2.is_lvalue;
						((Expr_cmpContext)_localctx).line =  ((Expr_cmpContext)_localctx).exp.line;
					
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
		public boolean left;
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Token op;
		public Expr_addContext exp;
		public Expr_cmp_tmpContext exp2;
		public Expr_addContext expr_add() {
			return getRuleContext(Expr_addContext.class,0);
		}
		public Expr_cmp_tmpContext expr_cmp_tmp() {
			return getRuleContext(Expr_cmp_tmpContext.class,0);
		}
		public Expr_cmp_tmpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_cmp_tmpContext(ParserRuleContext parent, int invokingState, boolean left) {
			super(parent, invokingState);
			this.left = left;
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp_tmp; }
	}

	public final Expr_cmp_tmpContext expr_cmp_tmp(boolean left) throws RecognitionException {
		Expr_cmp_tmpContext _localctx = new Expr_cmp_tmpContext(_ctx, getState(), left);
		enterRule(_localctx, 50, RULE_expr_cmp_tmp);
		int _la;
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				((Expr_cmp_tmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
					((Expr_cmp_tmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(367);
				((Expr_cmp_tmpContext)_localctx).exp = expr_add(_localctx.left);

							mips.operationCommand((((Expr_cmp_tmpContext)_localctx).op!=null?((Expr_cmp_tmpContext)_localctx).op.getText():null));
						
				setState(369);
				((Expr_cmp_tmpContext)_localctx).exp2 = expr_cmp_tmp(_localctx.left);

							((Expr_cmp_tmpContext)_localctx).retType =  ((Expr_cmp_tmpContext)_localctx).exp.retType;
							if (!((Expr_cmp_tmpContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
								((Expr_cmp_tmpContext)_localctx).retType =  typeCheck(((Expr_cmp_tmpContext)_localctx).exp.line, ((Expr_cmp_tmpContext)_localctx).exp.retType, ((Expr_cmp_tmpContext)_localctx).exp2.retType);
							}
							((Expr_cmp_tmpContext)_localctx).is_lvalue =  false;
							((Expr_cmp_tmpContext)_localctx).line =  ((Expr_cmp_tmpContext)_localctx).exp.line;
						
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

							((Expr_cmp_tmpContext)_localctx).is_lvalue =  true;
							((Expr_cmp_tmpContext)_localctx).retType =  NoType.getInstance();
							((Expr_cmp_tmpContext)_localctx).line =  0;
						
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
		public boolean left;
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_multContext exp;
		public Expr_add_tmpContext exp2;
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public Expr_add_tmpContext expr_add_tmp() {
			return getRuleContext(Expr_add_tmpContext.class,0);
		}
		public Expr_addContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_addContext(ParserRuleContext parent, int invokingState, boolean left) {
			super(parent, invokingState);
			this.left = left;
		}
		@Override public int getRuleIndex() { return RULE_expr_add; }
	}

	public final Expr_addContext expr_add(boolean left) throws RecognitionException {
		Expr_addContext _localctx = new Expr_addContext(_ctx, getState(), left);
		enterRule(_localctx, 52, RULE_expr_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			((Expr_addContext)_localctx).exp = expr_mult(_localctx.left);
			setState(376);
			((Expr_addContext)_localctx).exp2 = expr_add_tmp(_localctx.left);

						((Expr_addContext)_localctx).retType =  ((Expr_addContext)_localctx).exp.retType;
						if (!((Expr_addContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
							((Expr_addContext)_localctx).retType =  typeCheck(((Expr_addContext)_localctx).exp.line, ((Expr_addContext)_localctx).exp.retType, ((Expr_addContext)_localctx).exp2.retType);
						}
						((Expr_addContext)_localctx).is_lvalue =  ((Expr_addContext)_localctx).exp.is_lvalue && ((Expr_addContext)_localctx).exp2.is_lvalue;
						((Expr_addContext)_localctx).line =  ((Expr_addContext)_localctx).exp.line;
					
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
		public boolean left;
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Token op;
		public Expr_multContext exp;
		public Expr_add_tmpContext exp2;
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public Expr_add_tmpContext expr_add_tmp() {
			return getRuleContext(Expr_add_tmpContext.class,0);
		}
		public Expr_add_tmpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_add_tmpContext(ParserRuleContext parent, int invokingState, boolean left) {
			super(parent, invokingState);
			this.left = left;
		}
		@Override public int getRuleIndex() { return RULE_expr_add_tmp; }
	}

	public final Expr_add_tmpContext expr_add_tmp(boolean left) throws RecognitionException {
		Expr_add_tmpContext _localctx = new Expr_add_tmpContext(_ctx, getState(), left);
		enterRule(_localctx, 54, RULE_expr_add_tmp);
		int _la;
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				((Expr_add_tmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
					((Expr_add_tmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(380);
				((Expr_add_tmpContext)_localctx).exp = expr_mult(_localctx.left);

							mips.operationCommand((((Expr_add_tmpContext)_localctx).op!=null?((Expr_add_tmpContext)_localctx).op.getText():null));
						
				setState(382);
				((Expr_add_tmpContext)_localctx).exp2 = expr_add_tmp(_localctx.left);

							((Expr_add_tmpContext)_localctx).retType =  ((Expr_add_tmpContext)_localctx).exp.retType;
							if (!((Expr_add_tmpContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
								((Expr_add_tmpContext)_localctx).retType =  typeCheck(((Expr_add_tmpContext)_localctx).exp.line, ((Expr_add_tmpContext)_localctx).exp.retType, ((Expr_add_tmpContext)_localctx).exp2.retType);
							}
							((Expr_add_tmpContext)_localctx).is_lvalue =  false;
							((Expr_add_tmpContext)_localctx).line =  ((Expr_add_tmpContext)_localctx).exp.line;
						
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

							((Expr_add_tmpContext)_localctx).is_lvalue =  true;
							((Expr_add_tmpContext)_localctx).retType =  NoType.getInstance();
							((Expr_add_tmpContext)_localctx).line =  0;
						
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
		public boolean left;
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Expr_unContext exp;
		public Expr_mult_tmpContext exp2;
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_mult_tmpContext expr_mult_tmp() {
			return getRuleContext(Expr_mult_tmpContext.class,0);
		}
		public Expr_multContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_multContext(ParserRuleContext parent, int invokingState, boolean left) {
			super(parent, invokingState);
			this.left = left;
		}
		@Override public int getRuleIndex() { return RULE_expr_mult; }
	}

	public final Expr_multContext expr_mult(boolean left) throws RecognitionException {
		Expr_multContext _localctx = new Expr_multContext(_ctx, getState(), left);
		enterRule(_localctx, 56, RULE_expr_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			((Expr_multContext)_localctx).exp = expr_un(_localctx.left);
			setState(389);
			((Expr_multContext)_localctx).exp2 = expr_mult_tmp(_localctx.left);

						((Expr_multContext)_localctx).retType =  ((Expr_multContext)_localctx).exp.retType;
						if (!((Expr_multContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
							((Expr_multContext)_localctx).retType =  typeCheck(((Expr_multContext)_localctx).exp.line, ((Expr_multContext)_localctx).exp.retType, ((Expr_multContext)_localctx).exp2.retType);
						}
						((Expr_multContext)_localctx).is_lvalue =  ((Expr_multContext)_localctx).exp.is_lvalue && ((Expr_multContext)_localctx).exp2.is_lvalue;
						((Expr_multContext)_localctx).line =  ((Expr_multContext)_localctx).exp.line;
					
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
		public boolean left;
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Token op;
		public Expr_unContext exp;
		public Expr_mult_tmpContext exp2;
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_mult_tmpContext expr_mult_tmp() {
			return getRuleContext(Expr_mult_tmpContext.class,0);
		}
		public Expr_mult_tmpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_mult_tmpContext(ParserRuleContext parent, int invokingState, boolean left) {
			super(parent, invokingState);
			this.left = left;
		}
		@Override public int getRuleIndex() { return RULE_expr_mult_tmp; }
	}

	public final Expr_mult_tmpContext expr_mult_tmp(boolean left) throws RecognitionException {
		Expr_mult_tmpContext _localctx = new Expr_mult_tmpContext(_ctx, getState(), left);
		enterRule(_localctx, 58, RULE_expr_mult_tmp);
		int _la;
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				((Expr_mult_tmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
					((Expr_mult_tmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(393);
				((Expr_mult_tmpContext)_localctx).exp = expr_un(_localctx.left);

							mips.operationCommand((((Expr_mult_tmpContext)_localctx).op!=null?((Expr_mult_tmpContext)_localctx).op.getText():null));
						
				setState(395);
				((Expr_mult_tmpContext)_localctx).exp2 = expr_mult_tmp(_localctx.left);

							((Expr_mult_tmpContext)_localctx).retType =  ((Expr_mult_tmpContext)_localctx).exp.retType;
							if (!((Expr_mult_tmpContext)_localctx).exp2.retType.equals(NoType.getInstance())) {
								((Expr_mult_tmpContext)_localctx).retType =  typeCheck(((Expr_mult_tmpContext)_localctx).exp.line, ((Expr_mult_tmpContext)_localctx).exp.retType, ((Expr_mult_tmpContext)_localctx).exp2.retType);
							}
							((Expr_mult_tmpContext)_localctx).is_lvalue =  false;
							((Expr_mult_tmpContext)_localctx).line =  ((Expr_mult_tmpContext)_localctx).exp.line;
						
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

							((Expr_mult_tmpContext)_localctx).is_lvalue =  true;
							((Expr_mult_tmpContext)_localctx).retType =  NoType.getInstance();
							((Expr_mult_tmpContext)_localctx).line =  0;
						
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
		public boolean left;
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public Token op;
		public Expr_unContext exp;
		public Expr_memContext exp2;
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_memContext expr_mem() {
			return getRuleContext(Expr_memContext.class,0);
		}
		public Expr_unContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_unContext(ParserRuleContext parent, int invokingState, boolean left) {
			super(parent, invokingState);
			this.left = left;
		}
		@Override public int getRuleIndex() { return RULE_expr_un; }
	}

	public final Expr_unContext expr_un(boolean left) throws RecognitionException {
		Expr_unContext _localctx = new Expr_unContext(_ctx, getState(), left);
		enterRule(_localctx, 60, RULE_expr_un);
		int _la;
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				((Expr_unContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__33) ) {
					((Expr_unContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(402);
				((Expr_unContext)_localctx).exp = expr_un(_localctx.left);

							mips.operationCommand(((Expr_unContext)_localctx).op.getText().equals("not") ? "not" : "neg");
							((Expr_unContext)_localctx).is_lvalue =  false;
							((Expr_unContext)_localctx).retType =  ((Expr_unContext)_localctx).exp.retType;
							((Expr_unContext)_localctx).line =  ((Expr_unContext)_localctx).exp.line;
						
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
				setState(405);
				((Expr_unContext)_localctx).exp2 = expr_mem(_localctx.left);

							((Expr_unContext)_localctx).is_lvalue =  ((Expr_unContext)_localctx).exp2.is_lvalue;
							((Expr_unContext)_localctx).retType =  ((Expr_unContext)_localctx).exp2.retType;
							((Expr_unContext)_localctx).line =  ((Expr_unContext)_localctx).exp2.line;
						
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
		public boolean left;
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public int size;
		public Expr_otherContext exp;
		public Expr_mem_tmpContext expmt;
		public Expr_otherContext expr_other() {
			return getRuleContext(Expr_otherContext.class,0);
		}
		public Expr_mem_tmpContext expr_mem_tmp() {
			return getRuleContext(Expr_mem_tmpContext.class,0);
		}
		public Expr_memContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_memContext(ParserRuleContext parent, int invokingState, boolean left) {
			super(parent, invokingState);
			this.left = left;
		}
		@Override public int getRuleIndex() { return RULE_expr_mem; }
	}

	public final Expr_memContext expr_mem(boolean left) throws RecognitionException {
		Expr_memContext _localctx = new Expr_memContext(_ctx, getState(), left);
		enterRule(_localctx, 62, RULE_expr_mem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			((Expr_memContext)_localctx).exp = expr_other(_localctx.left);

						((Expr_memContext)_localctx).is_lvalue =  ((Expr_memContext)_localctx).exp.is_lvalue;
						((Expr_memContext)_localctx).retType =  ((Expr_memContext)_localctx).exp.retType;
						((Expr_memContext)_localctx).line =  ((Expr_memContext)_localctx).exp.line;

					
			setState(412);
			((Expr_memContext)_localctx).expmt = expr_mem_tmp(_localctx.left, true, _localctx.retType.len());

						((Expr_memContext)_localctx).retType =  checkArrayDim(_localctx.line, _localctx.retType, ((Expr_memContext)_localctx).expmt.dim);
						if (((Expr_memContext)_localctx).expmt.dim != 0 && !((Expr_memContext)_localctx).exp.varName.equals("")) {
							addArrayAddress(((Expr_memContext)_localctx).exp.varName);
							mips.accessArray();
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

	public static class Expr_mem_tmpContext extends ParserRuleContext {
		public boolean left;
		public boolean first;
		public int size;
		public int dim;
		public Expr_mem_tmpContext expmt;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_mem_tmpContext expr_mem_tmp() {
			return getRuleContext(Expr_mem_tmpContext.class,0);
		}
		public Expr_mem_tmpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_mem_tmpContext(ParserRuleContext parent, int invokingState, boolean left, boolean first, int size) {
			super(parent, invokingState);
			this.left = left;
			this.first = first;
			this.size = size;
		}
		@Override public int getRuleIndex() { return RULE_expr_mem_tmp; }
	}

	public final Expr_mem_tmpContext expr_mem_tmp(boolean left,boolean first,int size) throws RecognitionException {
		Expr_mem_tmpContext _localctx = new Expr_mem_tmpContext(_ctx, getState(), left, first, size);
		enterRule(_localctx, 64, RULE_expr_mem_tmp);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(T__9);

								if (_localctx.first) {
									mips.popStack(_localctx.size * 4);
								}
							
				setState(417);
				expr();
				setState(418);
				match(T__10);
				setState(419);
				((Expr_mem_tmpContext)_localctx).expmt = expr_mem_tmp(_localctx.left, false, 0);

							((Expr_mem_tmpContext)_localctx).dim =  ((Expr_mem_tmpContext)_localctx).expmt.dim + 1;
						
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

						((Expr_mem_tmpContext)_localctx).dim =  0;
						
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
		public boolean left;
		public int line;
		public boolean is_lvalue;
		public Type retType;
		public String varName = "";
		public int arrayLength = 0;
		public boolean exists;
		public Token l;
		public Token l2;
		public Token str;
		public Token var;
		public ExprContext exp;
		public ExprContext exp2;
		public Token alen;
		public TerminalNode CONST_NUM() { return getToken(AtalkPass2Parser.CONST_NUM, 0); }
		public TerminalNode CONST_CHAR() { return getToken(AtalkPass2Parser.CONST_CHAR, 0); }
		public TerminalNode CONST_STR() { return getToken(AtalkPass2Parser.CONST_STR, 0); }
		public TerminalNode ID() { return getToken(AtalkPass2Parser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_otherContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_otherContext(ParserRuleContext parent, int invokingState, boolean left) {
			super(parent, invokingState);
			this.left = left;
		}
		@Override public int getRuleIndex() { return RULE_expr_other; }
	}

	public final Expr_otherContext expr_other(boolean left) throws RecognitionException {
		Expr_otherContext _localctx = new Expr_otherContext(_ctx, getState(), left);
		enterRule(_localctx, 66, RULE_expr_other);
		int _la;
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				((Expr_otherContext)_localctx).l = match(CONST_NUM);

							((Expr_otherContext)_localctx).is_lvalue =  false;
							((Expr_otherContext)_localctx).retType =  IntType.getInstance();
							((Expr_otherContext)_localctx).line =  (((Expr_otherContext)_localctx).l!=null?((Expr_otherContext)_localctx).l.getLine():0);
							mips.addVariableToStack((((Expr_otherContext)_localctx).l!=null?Integer.valueOf(((Expr_otherContext)_localctx).l.getText()):0), 1);
						
				}
				break;
			case CONST_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				((Expr_otherContext)_localctx).l2 = match(CONST_CHAR);

							((Expr_otherContext)_localctx).is_lvalue =  false;
							((Expr_otherContext)_localctx).retType =  CharType.getInstance();
							((Expr_otherContext)_localctx).line =  (((Expr_otherContext)_localctx).l2!=null?((Expr_otherContext)_localctx).l2.getLine():0);
							mips.addVariableToStack(((Expr_otherContext)_localctx).l2.getText().charAt(1), 1);
						
				}
				break;
			case CONST_STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				((Expr_otherContext)_localctx).str = match(CONST_STR);

							((Expr_otherContext)_localctx).is_lvalue =  false;
							((Expr_otherContext)_localctx).retType =  new ArrayType(CharType.getInstance(), ((Expr_otherContext)_localctx).str.getText().length()-2); ((Expr_otherContext)_localctx).line =  (((Expr_otherContext)_localctx).str!=null?((Expr_otherContext)_localctx).str.getLine():0);
							mips.addStringToStack(((Expr_otherContext)_localctx).str.getText().substring(1, ((Expr_otherContext)_localctx).str.getText().length()-1));
						
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
				((Expr_otherContext)_localctx).var = match(ID);

							((Expr_otherContext)_localctx).retType =  checkVariableExistance((((Expr_otherContext)_localctx).var!=null?((Expr_otherContext)_localctx).var.getLine():0), ((Expr_otherContext)_localctx).var.getText());
							((Expr_otherContext)_localctx).is_lvalue =  true;
							((Expr_otherContext)_localctx).line =  (((Expr_otherContext)_localctx).var!=null?((Expr_otherContext)_localctx).var.getLine():0);
							
							p4addVarToStack(((Expr_otherContext)_localctx).var.getText(), _localctx.left);
							((Expr_otherContext)_localctx).varName =  ((Expr_otherContext)_localctx).var.getText();
						
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(433);
				match(T__34);
				setState(434);
				((Expr_otherContext)_localctx).exp = expr();

							((Expr_otherContext)_localctx).arrayLength =  1;
						
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(436);
					match(T__4);
					setState(437);
					((Expr_otherContext)_localctx).exp2 = expr();

								((Expr_otherContext)_localctx).line =  ((Expr_otherContext)_localctx).exp.line;
								typeCheck(_localctx.line, ((Expr_otherContext)_localctx).exp2.retType, ((Expr_otherContext)_localctx).exp.retType);
								_localctx.arrayLength += 1;
							
					}
					}
					setState(444);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(445);
				match(T__35);

							((Expr_otherContext)_localctx).is_lvalue =  false; ((Expr_otherContext)_localctx).retType =  new ArrayType(((Expr_otherContext)_localctx).exp.retType, _localctx.arrayLength);
						
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 6);
				{
				setState(448);
				match(T__36);
				setState(449);
				match(T__6);
				setState(450);
				((Expr_otherContext)_localctx).alen = match(CONST_NUM);
				setState(451);
				match(T__7);

							((Expr_otherContext)_localctx).is_lvalue =  false;
							((Expr_otherContext)_localctx).retType =  new ArrayType(CharType.getInstance(), (((Expr_otherContext)_localctx).alen!=null?Integer.valueOf(((Expr_otherContext)_localctx).alen.getText()):0));
							((Expr_otherContext)_localctx).line =  (((Expr_otherContext)_localctx).alen!=null?((Expr_otherContext)_localctx).alen.getLine():0);
							mips.read((((Expr_otherContext)_localctx).alen!=null?Integer.valueOf(((Expr_otherContext)_localctx).alen.getText()):0));
						
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(453);
				match(T__6);
				setState(454);
				((Expr_otherContext)_localctx).exp = expr();
				setState(455);
				match(T__7);

							((Expr_otherContext)_localctx).is_lvalue =  ((Expr_otherContext)_localctx).exp.is_lvalue;
							((Expr_otherContext)_localctx).retType =  ((Expr_otherContext)_localctx).exp.retType;
							((Expr_otherContext)_localctx).line =  ((Expr_otherContext)_localctx).exp.line;
						
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u01cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3]\n\3\f\3\16\3`\13\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4j\n\4\f\4\16\4m\13\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\177\n\5\f\5\16\5\u0082"+
		"\13\5\5\5\u0084\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\7\6\u0094\n\6\f\6\16\6\u0097\13\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u009f"+
		"\n\6\f\6\16\6\u00a2\13\6\3\6\5\6\u00a5\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\7\b\u00b3\n\b\f\b\16\b\u00b6\13\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c3\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00cd\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d6\n\n\7\n\u00d8"+
		"\n\n\f\n\16\n\u00db\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e5"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00f1\n\13"+
		"\f\13\16\13\u00f4\13\13\5\13\u00f6\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u0112\n\r\f\r\16\r\u0115\13\r\3\r\3\r\3\r\3\r\3\r\5\r\u011c"+
		"\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0144\n\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0151\n\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u015e\n\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u016b\n\31\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0178\n\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0185\n\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0192\n\37\3 "+
		"\3 \3 \3 \3 \3 \3 \5 \u019b\n \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\5\"\u01aa\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7"+
		"#\u01bb\n#\f#\16#\u01be\13#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#"+
		"\u01cd\n#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BD\2\b\3\3++\3\2\36\37\3\2\4\5\3\2 !\3\2\"#\4\2!!$$\2\u01da"+
		"\2F\3\2\2\2\4P\3\2\2\2\6e\3\2\2\2\bp\3\2\2\2\n\u00a4\3\2\2\2\f\u00a6\3"+
		"\2\2\2\16\u00b4\3\2\2\2\20\u00c2\3\2\2\2\22\u00c4\3\2\2\2\24\u00e4\3\2"+
		"\2\2\26\u00fb\3\2\2\2\30\u0103\3\2\2\2\32\u0121\3\2\2\2\34\u012e\3\2\2"+
		"\2\36\u0131\3\2\2\2 \u0135\3\2\2\2\"\u0138\3\2\2\2$\u0143\3\2\2\2&\u0145"+
		"\3\2\2\2(\u0150\3\2\2\2*\u0152\3\2\2\2,\u015d\3\2\2\2.\u015f\3\2\2\2\60"+
		"\u016a\3\2\2\2\62\u016c\3\2\2\2\64\u0177\3\2\2\2\66\u0179\3\2\2\28\u0184"+
		"\3\2\2\2:\u0186\3\2\2\2<\u0191\3\2\2\2>\u019a\3\2\2\2@\u019c\3\2\2\2B"+
		"\u01a9\3\2\2\2D\u01cc\3\2\2\2FK\b\2\1\2GJ\5\4\3\2HJ\7+\2\2IG\3\2\2\2I"+
		"H\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\b\2\1\2"+
		"O\3\3\2\2\2PQ\b\3\1\2QR\7\3\2\2RS\7,\2\2ST\b\3\1\2TU\7\4\2\2UV\7(\2\2"+
		"VW\7\5\2\2WX\7+\2\2X^\b\3\1\2Y]\5\6\4\2Z]\5\b\5\2[]\7+\2\2\\Y\3\2\2\2"+
		"\\Z\3\2\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2"+
		"\2\2ab\7\6\2\2bc\b\3\1\2cd\t\2\2\2d\5\3\2\2\2ef\5\n\6\2fk\7,\2\2gh\7\7"+
		"\2\2hj\7,\2\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2"+
		"\2\2no\7+\2\2o\7\3\2\2\2pq\7\b\2\2qr\7,\2\2rs\b\5\1\2s\u0083\7\t\2\2t"+
		"u\5\n\6\2uv\7,\2\2vw\b\5\1\2w\u0080\b\5\1\2xy\7\7\2\2yz\5\n\6\2z{\7,\2"+
		"\2{|\b\5\1\2|}\b\5\1\2}\177\3\2\2\2~x\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0083t\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7"+
		"\n\2\2\u0086\u0087\7+\2\2\u0087\u0088\b\5\1\2\u0088\u0089\5\16\b\2\u0089"+
		"\u008a\b\5\1\2\u008a\u008b\7\6\2\2\u008b\u008c\7+\2\2\u008c\u008d\b\5"+
		"\1\2\u008d\t\3\2\2\2\u008e\u0095\7\13\2\2\u008f\u0090\7\f\2\2\u0090\u0091"+
		"\7(\2\2\u0091\u0092\7\r\2\2\u0092\u0094\b\6\1\2\u0093\u008f\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0098\u00a5\b\6\1\2\u0099\u00a0\7\16\2\2\u009a"+
		"\u009b\7\f\2\2\u009b\u009c\7(\2\2\u009c\u009d\7\r\2\2\u009d\u009f\b\6"+
		"\1\2\u009e\u009a\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\b\6"+
		"\1\2\u00a4\u008e\3\2\2\2\u00a4\u0099\3\2\2\2\u00a5\13\3\2\2\2\u00a6\u00a7"+
		"\7\17\2\2\u00a7\u00a8\7+\2\2\u00a8\u00a9\b\7\1\2\u00a9\u00aa\5\16\b\2"+
		"\u00aa\u00ab\7\6\2\2\u00ab\u00ac\7+\2\2\u00ac\u00ad\b\7\1\2\u00ad\r\3"+
		"\2\2\2\u00ae\u00af\5\20\t\2\u00af\u00b0\b\b\1\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00b3\7+\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\17\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b7\u00c3\5\22\n\2\u00b8\u00c3\5 \21\2\u00b9\u00c3\5\32\16"+
		"\2\u00ba\u00c3\5\30\r\2\u00bb\u00c3\5\34\17\2\u00bc\u00c3\5\36\20\2\u00bd"+
		"\u00be\5\24\13\2\u00be\u00bf\b\t\1\2\u00bf\u00c3\3\2\2\2\u00c0\u00c3\5"+
		"\26\f\2\u00c1\u00c3\5\f\7\2\u00c2\u00b7\3\2\2\2\u00c2\u00b8\3\2\2\2\u00c2"+
		"\u00b9\3\2\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c2\u00bc\3\2"+
		"\2\2\u00c2\u00bd\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\21\3\2\2\2\u00c4\u00c5\5\n\6\2\u00c5\u00c6\7,\2\2\u00c6\u00cc\b\n\1\2"+
		"\u00c7\u00c8\7\20\2\2\u00c8\u00c9\b\n\1\2\u00c9\u00ca\5\"\22\2\u00ca\u00cb"+
		"\b\n\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00d9\3\2\2\2\u00ce\u00cf\7\7\2\2\u00cf\u00d0\7,\2\2\u00d0\u00d5\b\n"+
		"\1\2\u00d1\u00d2\7\20\2\2\u00d2\u00d3\5\"\22\2\u00d3\u00d4\b\n\1\2\u00d4"+
		"\u00d6\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2"+
		"\2\2\u00d7\u00ce\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7+"+
		"\2\2\u00dd\23\3\2\2\2\u00de\u00df\7,\2\2\u00df\u00e5\b\13\1\2\u00e0\u00e1"+
		"\7\21\2\2\u00e1\u00e5\b\13\1\2\u00e2\u00e3\7\22\2\2\u00e3\u00e5\b\13\1"+
		"\2\u00e4\u00de\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e7\7\23\2\2\u00e7\u00e8\7,\2\2\u00e8\u00e9\b\13\1\2"+
		"\u00e9\u00f5\7\t\2\2\u00ea\u00eb\5\"\22\2\u00eb\u00f2\b\13\1\2\u00ec\u00ed"+
		"\7\7\2\2\u00ed\u00ee\5\"\22\2\u00ee\u00ef\b\13\1\2\u00ef\u00f1\3\2\2\2"+
		"\u00f0\u00ec\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00ea\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\n\2\2\u00f8\u00f9\7+"+
		"\2\2\u00f9\u00fa\b\13\1\2\u00fa\25\3\2\2\2\u00fb\u00fc\7\24\2\2\u00fc"+
		"\u00fd\7\t\2\2\u00fd\u00fe\5\"\22\2\u00fe\u00ff\b\f\1\2\u00ff\u0100\7"+
		"\n\2\2\u0100\u0101\7+\2\2\u0101\u0102\b\f\1\2\u0102\27\3\2\2\2\u0103\u0104"+
		"\b\r\1\2\u0104\u0105\7\25\2\2\u0105\u0106\b\r\1\2\u0106\u0107\5\"\22\2"+
		"\u0107\u0108\b\r\1\2\u0108\u0109\7+\2\2\u0109\u0113\5\16\b\2\u010a\u010b"+
		"\7\26\2\2\u010b\u010c\b\r\1\2\u010c\u010d\5\"\22\2\u010d\u010e\b\r\1\2"+
		"\u010e\u010f\7+\2\2\u010f\u0110\5\16\b\2\u0110\u0112\3\2\2\2\u0111\u010a"+
		"\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u011b\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\27\2\2\u0117\u0118\b"+
		"\r\1\2\u0118\u0119\7+\2\2\u0119\u011a\b\r\1\2\u011a\u011c\5\16\b\2\u011b"+
		"\u0116\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7\6"+
		"\2\2\u011e\u011f\7+\2\2\u011f\u0120\b\r\1\2\u0120\31\3\2\2\2\u0121\u0122"+
		"\b\16\1\2\u0122\u0123\7\30\2\2\u0123\u0124\7,\2\2\u0124\u0125\b\16\1\2"+
		"\u0125\u0126\7\31\2\2\u0126\u0127\5\"\22\2\u0127\u0128\7+\2\2\u0128\u0129"+
		"\b\16\1\2\u0129\u012a\5\16\b\2\u012a\u012b\7\6\2\2\u012b\u012c\7+\2\2"+
		"\u012c\u012d\b\16\1\2\u012d\33\3\2\2\2\u012e\u012f\7\32\2\2\u012f\u0130"+
		"\7+\2\2\u0130\35\3\2\2\2\u0131\u0132\7\33\2\2\u0132\u0133\7+\2\2\u0133"+
		"\u0134\b\20\1\2\u0134\37\3\2\2\2\u0135\u0136\5\"\22\2\u0136\u0137\7+\2"+
		"\2\u0137!\3\2\2\2\u0138\u0139\5$\23\2\u0139\u013a\b\22\1\2\u013a#\3\2"+
		"\2\2\u013b\u013c\5&\24\2\u013c\u013d\7\20\2\2\u013d\u013e\5$\23\2\u013e"+
		"\u013f\b\23\1\2\u013f\u0144\3\2\2\2\u0140\u0141\5&\24\2\u0141\u0142\b"+
		"\23\1\2\u0142\u0144\3\2\2\2\u0143\u013b\3\2\2\2\u0143\u0140\3\2\2\2\u0144"+
		"%\3\2\2\2\u0145\u0146\5*\26\2\u0146\u0147\5(\25\2\u0147\u0148\b\24\1\2"+
		"\u0148\'\3\2\2\2\u0149\u014a\7\34\2\2\u014a\u014b\5*\26\2\u014b\u014c"+
		"\b\25\1\2\u014c\u014d\5(\25\2\u014d\u014e\b\25\1\2\u014e\u0151\3\2\2\2"+
		"\u014f\u0151\b\25\1\2\u0150\u0149\3\2\2\2\u0150\u014f\3\2\2\2\u0151)\3"+
		"\2\2\2\u0152\u0153\5.\30\2\u0153\u0154\5,\27\2\u0154\u0155\b\26\1\2\u0155"+
		"+\3\2\2\2\u0156\u0157\7\35\2\2\u0157\u0158\5.\30\2\u0158\u0159\b\27\1"+
		"\2\u0159\u015a\5,\27\2\u015a\u015b\b\27\1\2\u015b\u015e\3\2\2\2\u015c"+
		"\u015e\b\27\1\2\u015d\u0156\3\2\2\2\u015d\u015c\3\2\2\2\u015e-\3\2\2\2"+
		"\u015f\u0160\5\62\32\2\u0160\u0161\5\60\31\2\u0161\u0162\b\30\1\2\u0162"+
		"/\3\2\2\2\u0163\u0164\t\3\2\2\u0164\u0165\5\62\32\2\u0165\u0166\b\31\1"+
		"\2\u0166\u0167\5\60\31\2\u0167\u0168\b\31\1\2\u0168\u016b\3\2\2\2\u0169"+
		"\u016b\b\31\1\2\u016a\u0163\3\2\2\2\u016a\u0169\3\2\2\2\u016b\61\3\2\2"+
		"\2\u016c\u016d\5\66\34\2\u016d\u016e\5\64\33\2\u016e\u016f\b\32\1\2\u016f"+
		"\63\3\2\2\2\u0170\u0171\t\4\2\2\u0171\u0172\5\66\34\2\u0172\u0173\b\33"+
		"\1\2\u0173\u0174\5\64\33\2\u0174\u0175\b\33\1\2\u0175\u0178\3\2\2\2\u0176"+
		"\u0178\b\33\1\2\u0177\u0170\3\2\2\2\u0177\u0176\3\2\2\2\u0178\65\3\2\2"+
		"\2\u0179\u017a\5:\36\2\u017a\u017b\58\35\2\u017b\u017c\b\34\1\2\u017c"+
		"\67\3\2\2\2\u017d\u017e\t\5\2\2\u017e\u017f\5:\36\2\u017f\u0180\b\35\1"+
		"\2\u0180\u0181\58\35\2\u0181\u0182\b\35\1\2\u0182\u0185\3\2\2\2\u0183"+
		"\u0185\b\35\1\2\u0184\u017d\3\2\2\2\u0184\u0183\3\2\2\2\u01859\3\2\2\2"+
		"\u0186\u0187\5> \2\u0187\u0188\5<\37\2\u0188\u0189\b\36\1\2\u0189;\3\2"+
		"\2\2\u018a\u018b\t\6\2\2\u018b\u018c\5> \2\u018c\u018d\b\37\1\2\u018d"+
		"\u018e\5<\37\2\u018e\u018f\b\37\1\2\u018f\u0192\3\2\2\2\u0190\u0192\b"+
		"\37\1\2\u0191\u018a\3\2\2\2\u0191\u0190\3\2\2\2\u0192=\3\2\2\2\u0193\u0194"+
		"\t\7\2\2\u0194\u0195\5> \2\u0195\u0196\b \1\2\u0196\u019b\3\2\2\2\u0197"+
		"\u0198\5@!\2\u0198\u0199\b \1\2\u0199\u019b\3\2\2\2\u019a\u0193\3\2\2"+
		"\2\u019a\u0197\3\2\2\2\u019b?\3\2\2\2\u019c\u019d\5D#\2\u019d\u019e\b"+
		"!\1\2\u019e\u019f\5B\"\2\u019f\u01a0\b!\1\2\u01a0A\3\2\2\2\u01a1\u01a2"+
		"\7\f\2\2\u01a2\u01a3\b\"\1\2\u01a3\u01a4\5\"\22\2\u01a4\u01a5\7\r\2\2"+
		"\u01a5\u01a6\5B\"\2\u01a6\u01a7\b\"\1\2\u01a7\u01aa\3\2\2\2\u01a8\u01aa"+
		"\b\"\1\2\u01a9\u01a1\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aaC\3\2\2\2\u01ab"+
		"\u01ac\7(\2\2\u01ac\u01cd\b#\1\2\u01ad\u01ae\7)\2\2\u01ae\u01cd\b#\1\2"+
		"\u01af\u01b0\7*\2\2\u01b0\u01cd\b#\1\2\u01b1\u01b2\7,\2\2\u01b2\u01cd"+
		"\b#\1\2\u01b3\u01b4\7%\2\2\u01b4\u01b5\5\"\22\2\u01b5\u01bc\b#\1\2\u01b6"+
		"\u01b7\7\7\2\2\u01b7\u01b8\5\"\22\2\u01b8\u01b9\b#\1\2\u01b9\u01bb\3\2"+
		"\2\2\u01ba\u01b6\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\7&"+
		"\2\2\u01c0\u01c1\b#\1\2\u01c1\u01cd\3\2\2\2\u01c2\u01c3\7\'\2\2\u01c3"+
		"\u01c4\7\t\2\2\u01c4\u01c5\7(\2\2\u01c5\u01c6\7\n\2\2\u01c6\u01cd\b#\1"+
		"\2\u01c7\u01c8\7\t\2\2\u01c8\u01c9\5\"\22\2\u01c9\u01ca\7\n\2\2\u01ca"+
		"\u01cb\b#\1\2\u01cb\u01cd\3\2\2\2\u01cc\u01ab\3\2\2\2\u01cc\u01ad\3\2"+
		"\2\2\u01cc\u01af\3\2\2\2\u01cc\u01b1\3\2\2\2\u01cc\u01b3\3\2\2\2\u01cc"+
		"\u01c2\3\2\2\2\u01cc\u01c7\3\2\2\2\u01cdE\3\2\2\2\"IK\\^k\u0080\u0083"+
		"\u0095\u00a0\u00a4\u00b2\u00b4\u00c2\u00cc\u00d5\u00d9\u00e4\u00f2\u00f5"+
		"\u0113\u011b\u0143\u0150\u015d\u016a\u0177\u0184\u0191\u019a\u01a9\u01bc"+
		"\u01cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}