// Generated from src/main/resources/Processor.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ProcessorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		StringLiteral=10, Types=11, Queries=12, VarName=13, TypeName=14, WS=15;
	public static final int
		RULE_script = 0, RULE_includeStatement = 1, RULE_executableStatement = 2, 
		RULE_loadStatement = 3, RULE_runQueryStatement = 4, RULE_saveStatement = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "includeStatement", "executableStatement", "loadStatement", 
			"runQueryStatement", "saveStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'INCLUDE'", "';'", "'LOAD'", "'INTO'", "'AS'", "'RUN'", "'ON'", 
			"'SAVE'", "'TO'", null, "'TYPES'", "'QUERIES'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "StringLiteral", 
			"Types", "Queries", "VarName", "TypeName", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Processor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProcessorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ProcessorParser.EOF, 0); }
		public List<IncludeStatementContext> includeStatement() {
			return getRuleContexts(IncludeStatementContext.class);
		}
		public IncludeStatementContext includeStatement(int i) {
			return getRuleContext(IncludeStatementContext.class,i);
		}
		public List<ExecutableStatementContext> executableStatement() {
			return getRuleContexts(ExecutableStatementContext.class);
		}
		public ExecutableStatementContext executableStatement(int i) {
			return getRuleContext(ExecutableStatementContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessorListener ) ((ProcessorListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessorListener ) ((ProcessorListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				includeStatement();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				executableStatement();
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 328L) != 0) );
			setState(22);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncludeStatementContext extends ParserRuleContext {
		public Token type;
		public TerminalNode StringLiteral() { return getToken(ProcessorParser.StringLiteral, 0); }
		public TerminalNode Types() { return getToken(ProcessorParser.Types, 0); }
		public TerminalNode Queries() { return getToken(ProcessorParser.Queries, 0); }
		public IncludeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessorListener ) ((ProcessorListener)listener).enterIncludeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessorListener ) ((ProcessorListener)listener).exitIncludeStatement(this);
		}
	}

	public final IncludeStatementContext includeStatement() throws RecognitionException {
		IncludeStatementContext _localctx = new IncludeStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_includeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(25);
			((IncludeStatementContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Types || _la==Queries) ) {
				((IncludeStatementContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(26);
			match(StringLiteral);
			setState(27);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExecutableStatementContext extends ParserRuleContext {
		public LoadStatementContext loadStatement() {
			return getRuleContext(LoadStatementContext.class,0);
		}
		public RunQueryStatementContext runQueryStatement() {
			return getRuleContext(RunQueryStatementContext.class,0);
		}
		public SaveStatementContext saveStatement() {
			return getRuleContext(SaveStatementContext.class,0);
		}
		public ExecutableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessorListener ) ((ProcessorListener)listener).enterExecutableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessorListener ) ((ProcessorListener)listener).exitExecutableStatement(this);
		}
	}

	public final ExecutableStatementContext executableStatement() throws RecognitionException {
		ExecutableStatementContext _localctx = new ExecutableStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_executableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(29);
				loadStatement();
				}
				break;
			case T__5:
				{
				setState(30);
				runQueryStatement();
				}
				break;
			case T__7:
				{
				setState(31);
				saveStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(34);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoadStatementContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(ProcessorParser.StringLiteral, 0); }
		public TerminalNode VarName() { return getToken(ProcessorParser.VarName, 0); }
		public TerminalNode TypeName() { return getToken(ProcessorParser.TypeName, 0); }
		public LoadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loadStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessorListener ) ((ProcessorListener)listener).enterLoadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessorListener ) ((ProcessorListener)listener).exitLoadStatement(this);
		}
	}

	public final LoadStatementContext loadStatement() throws RecognitionException {
		LoadStatementContext _localctx = new LoadStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loadStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__2);
			setState(37);
			match(StringLiteral);
			setState(38);
			match(T__3);
			setState(39);
			match(VarName);
			setState(40);
			match(T__4);
			setState(41);
			match(TypeName);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RunQueryStatementContext extends ParserRuleContext {
		public List<TerminalNode> VarName() { return getTokens(ProcessorParser.VarName); }
		public TerminalNode VarName(int i) {
			return getToken(ProcessorParser.VarName, i);
		}
		public RunQueryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runQueryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessorListener ) ((ProcessorListener)listener).enterRunQueryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessorListener ) ((ProcessorListener)listener).exitRunQueryStatement(this);
		}
	}

	public final RunQueryStatementContext runQueryStatement() throws RecognitionException {
		RunQueryStatementContext _localctx = new RunQueryStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_runQueryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__5);
			setState(44);
			match(VarName);
			setState(45);
			match(T__6);
			setState(46);
			match(VarName);
			setState(47);
			match(T__3);
			setState(48);
			match(VarName);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SaveStatementContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(ProcessorParser.VarName, 0); }
		public TerminalNode StringLiteral() { return getToken(ProcessorParser.StringLiteral, 0); }
		public SaveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessorListener ) ((ProcessorListener)listener).enterSaveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcessorListener ) ((ProcessorListener)listener).exitSaveStatement(this);
		}
	}

	public final SaveStatementContext saveStatement() throws RecognitionException {
		SaveStatementContext _localctx = new SaveStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_saveStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__7);
			setState(51);
			match(VarName);
			setState(52);
			match(T__8);
			setState(53);
			match(StringLiteral);
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
		"\u0004\u0001\u000f8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0000\u0004\u0000\u0013\b\u0000\u000b\u0000\f\u0000"+
		"\u0014\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002!\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0000\u0000\u0006"+
		"\u0000\u0002\u0004\u0006\b\n\u0000\u0001\u0001\u0000\u000b\f5\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0002\u0018\u0001\u0000\u0000\u0000\u0004 \u0001"+
		"\u0000\u0000\u0000\u0006$\u0001\u0000\u0000\u0000\b+\u0001\u0000\u0000"+
		"\u0000\n2\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f"+
		"\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001"+
		"\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0012\u0001"+
		"\u0000\u0000\u0000\u0011\u0013\u0003\u0004\u0002\u0000\u0012\u0011\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0012\u0001"+
		"\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0005\u0000\u0000\u0001\u0017\u0001\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0005\u0001\u0000\u0000\u0019\u001a\u0007"+
		"\u0000\u0000\u0000\u001a\u001b\u0005\n\u0000\u0000\u001b\u001c\u0005\u0002"+
		"\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000\u001d!\u0003\u0006\u0003"+
		"\u0000\u001e!\u0003\b\u0004\u0000\u001f!\u0003\n\u0005\u0000 \u001d\u0001"+
		"\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 \u001f\u0001\u0000\u0000"+
		"\u0000!\"\u0001\u0000\u0000\u0000\"#\u0005\u0002\u0000\u0000#\u0005\u0001"+
		"\u0000\u0000\u0000$%\u0005\u0003\u0000\u0000%&\u0005\n\u0000\u0000&\'"+
		"\u0005\u0004\u0000\u0000\'(\u0005\r\u0000\u0000()\u0005\u0005\u0000\u0000"+
		")*\u0005\u000e\u0000\u0000*\u0007\u0001\u0000\u0000\u0000+,\u0005\u0006"+
		"\u0000\u0000,-\u0005\r\u0000\u0000-.\u0005\u0007\u0000\u0000./\u0005\r"+
		"\u0000\u0000/0\u0005\u0004\u0000\u000001\u0005\r\u0000\u00001\t\u0001"+
		"\u0000\u0000\u000023\u0005\b\u0000\u000034\u0005\r\u0000\u000045\u0005"+
		"\t\u0000\u000056\u0005\n\u0000\u00006\u000b\u0001\u0000\u0000\u0000\u0003"+
		"\u000f\u0014 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}