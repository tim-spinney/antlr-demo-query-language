// Generated from src/main/resources/Queries.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class QueriesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Mult=7, Div=8, Add=9, 
		Sub=10, Mod=11, And=12, Or=13, Not=14, Comparator=15, IntLiteral=16, VarName=17, 
		TypeName=18, WS=19;
	public static final int
		RULE_queries = 0, RULE_namedQuery = 1, RULE_query = 2, RULE_logicalExpression = 3, 
		RULE_numericExpression = 4, RULE_variableAccess = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"queries", "namedQuery", "query", "logicalExpression", "numericExpression", 
			"variableAccess"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'QUERY'", "'ON'", "':'", "';'", "'WHERE'", "'.'", "'*'", "'/'", 
			"'+'", "'-'", "'%'", "'AND'", "'OR'", "'NOT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "Mult", "Div", "Add", "Sub", 
			"Mod", "And", "Or", "Not", "Comparator", "IntLiteral", "VarName", "TypeName", 
			"WS"
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
	public String getGrammarFileName() { return "Queries.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QueriesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueriesContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(QueriesParser.EOF, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public QueriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueriesListener ) ((QueriesListener)listener).enterQueries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueriesListener ) ((QueriesListener)listener).exitQueries(this);
		}
	}

	public final QueriesContext queries() throws RecognitionException {
		QueriesContext _localctx = new QueriesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_queries);
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
				namedQuery();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(17);
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
	public static class NamedQueryContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(QueriesParser.VarName, 0); }
		public TerminalNode TypeName() { return getToken(QueriesParser.TypeName, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueriesListener ) ((QueriesListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueriesListener ) ((QueriesListener)listener).exitNamedQuery(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_namedQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(T__0);
			setState(20);
			match(VarName);
			setState(21);
			match(T__1);
			setState(22);
			match(TypeName);
			setState(23);
			match(T__2);
			setState(24);
			query();
			setState(25);
			match(T__3);
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
	public static class QueryContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueriesListener ) ((QueriesListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueriesListener ) ((QueriesListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__4);
			setState(28);
			logicalExpression(0);
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
	public static class LogicalExpressionContext extends ParserRuleContext {
		public Token op;
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public TerminalNode Not() { return getToken(QueriesParser.Not, 0); }
		public List<NumericExpressionContext> numericExpression() {
			return getRuleContexts(NumericExpressionContext.class);
		}
		public NumericExpressionContext numericExpression(int i) {
			return getRuleContext(NumericExpressionContext.class,i);
		}
		public TerminalNode Comparator() { return getToken(QueriesParser.Comparator, 0); }
		public TerminalNode And() { return getToken(QueriesParser.And, 0); }
		public TerminalNode Or() { return getToken(QueriesParser.Or, 0); }
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueriesListener ) ((QueriesListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueriesListener ) ((QueriesListener)listener).exitLogicalExpression(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		return logicalExpression(0);
	}

	private LogicalExpressionContext logicalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, _parentState);
		LogicalExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_logicalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				{
				setState(31);
				((LogicalExpressionContext)_localctx).op = match(Not);
				setState(32);
				logicalExpression(4);
				}
				break;
			case IntLiteral:
			case VarName:
				{
				setState(33);
				numericExpression(0);
				setState(34);
				((LogicalExpressionContext)_localctx).op = match(Comparator);
				setState(35);
				numericExpression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(39);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(40);
						((LogicalExpressionContext)_localctx).op = match(And);
						setState(41);
						logicalExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(42);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(43);
						((LogicalExpressionContext)_localctx).op = match(Or);
						setState(44);
						logicalExpression(2);
						}
						break;
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumericExpressionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode IntLiteral() { return getToken(QueriesParser.IntLiteral, 0); }
		public VariableAccessContext variableAccess() {
			return getRuleContext(VariableAccessContext.class,0);
		}
		public List<NumericExpressionContext> numericExpression() {
			return getRuleContexts(NumericExpressionContext.class);
		}
		public NumericExpressionContext numericExpression(int i) {
			return getRuleContext(NumericExpressionContext.class,i);
		}
		public TerminalNode Mult() { return getToken(QueriesParser.Mult, 0); }
		public TerminalNode Div() { return getToken(QueriesParser.Div, 0); }
		public TerminalNode Add() { return getToken(QueriesParser.Add, 0); }
		public TerminalNode Sub() { return getToken(QueriesParser.Sub, 0); }
		public TerminalNode Mod() { return getToken(QueriesParser.Mod, 0); }
		public NumericExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueriesListener ) ((QueriesListener)listener).enterNumericExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueriesListener ) ((QueriesListener)listener).exitNumericExpression(this);
		}
	}

	public final NumericExpressionContext numericExpression() throws RecognitionException {
		return numericExpression(0);
	}

	private NumericExpressionContext numericExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumericExpressionContext _localctx = new NumericExpressionContext(_ctx, _parentState);
		NumericExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_numericExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntLiteral:
				{
				setState(51);
				match(IntLiteral);
				}
				break;
			case VarName:
				{
				setState(52);
				variableAccess();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(70);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new NumericExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numericExpression);
						setState(55);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(58);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Mult:
							{
							setState(56);
							((NumericExpressionContext)_localctx).op = match(Mult);
							}
							break;
						case Div:
							{
							setState(57);
							((NumericExpressionContext)_localctx).op = match(Div);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(60);
						numericExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new NumericExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numericExpression);
						setState(61);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(64);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Add:
							{
							setState(62);
							((NumericExpressionContext)_localctx).op = match(Add);
							}
							break;
						case Sub:
							{
							setState(63);
							((NumericExpressionContext)_localctx).op = match(Sub);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(66);
						numericExpression(5);
						}
						break;
					case 3:
						{
						_localctx = new NumericExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numericExpression);
						setState(67);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(68);
						((NumericExpressionContext)_localctx).op = match(Mod);
						setState(69);
						numericExpression(4);
						}
						break;
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableAccessContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(QueriesParser.VarName, 0); }
		public VariableAccessContext variableAccess() {
			return getRuleContext(VariableAccessContext.class,0);
		}
		public VariableAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueriesListener ) ((QueriesListener)listener).enterVariableAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueriesListener ) ((QueriesListener)listener).exitVariableAccess(this);
		}
	}

	public final VariableAccessContext variableAccess() throws RecognitionException {
		VariableAccessContext _localctx = new VariableAccessContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(VarName);
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(76);
				match(T__5);
				setState(77);
				variableAccess();
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return logicalExpression_sempred((LogicalExpressionContext)_localctx, predIndex);
		case 4:
			return numericExpression_sempred((NumericExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicalExpression_sempred(LogicalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean numericExpression_sempred(NumericExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013Q\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003&\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		".\b\u0003\n\u0003\f\u00031\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u00046\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		";\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"A\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"G\b\u0004\n\u0004\f\u0004J\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005O\b\u0005\u0001\u0005\u0000\u0002\u0006\b\u0006\u0000\u0002"+
		"\u0004\u0006\b\n\u0000\u0000U\u0000\r\u0001\u0000\u0000\u0000\u0002\u0013"+
		"\u0001\u0000\u0000\u0000\u0004\u001b\u0001\u0000\u0000\u0000\u0006%\u0001"+
		"\u0000\u0000\u0000\b5\u0001\u0000\u0000\u0000\nK\u0001\u0000\u0000\u0000"+
		"\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001\u0000\u0000\u0000\u000e\u000f"+
		"\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001"+
		"\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0012\u0005"+
		"\u0000\u0000\u0001\u0012\u0001\u0001\u0000\u0000\u0000\u0013\u0014\u0005"+
		"\u0001\u0000\u0000\u0014\u0015\u0005\u0011\u0000\u0000\u0015\u0016\u0005"+
		"\u0002\u0000\u0000\u0016\u0017\u0005\u0012\u0000\u0000\u0017\u0018\u0005"+
		"\u0003\u0000\u0000\u0018\u0019\u0003\u0004\u0002\u0000\u0019\u001a\u0005"+
		"\u0004\u0000\u0000\u001a\u0003\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		"\u0005\u0000\u0000\u001c\u001d\u0003\u0006\u0003\u0000\u001d\u0005\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0006\u0003\uffff\uffff\u0000\u001f \u0005"+
		"\u000e\u0000\u0000 &\u0003\u0006\u0003\u0004!\"\u0003\b\u0004\u0000\""+
		"#\u0005\u000f\u0000\u0000#$\u0003\b\u0004\u0000$&\u0001\u0000\u0000\u0000"+
		"%\u001e\u0001\u0000\u0000\u0000%!\u0001\u0000\u0000\u0000&/\u0001\u0000"+
		"\u0000\u0000\'(\n\u0002\u0000\u0000()\u0005\f\u0000\u0000).\u0003\u0006"+
		"\u0003\u0003*+\n\u0001\u0000\u0000+,\u0005\r\u0000\u0000,.\u0003\u0006"+
		"\u0003\u0002-\'\u0001\u0000\u0000\u0000-*\u0001\u0000\u0000\u0000.1\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"0\u0007\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000023\u0006\u0004"+
		"\uffff\uffff\u000036\u0005\u0010\u0000\u000046\u0003\n\u0005\u000052\u0001"+
		"\u0000\u0000\u000054\u0001\u0000\u0000\u00006H\u0001\u0000\u0000\u0000"+
		"7:\n\u0005\u0000\u00008;\u0005\u0007\u0000\u00009;\u0005\b\u0000\u0000"+
		":8\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<G\u0003\b\u0004\u0006=@\n\u0004\u0000\u0000>A\u0005\t\u0000\u0000"+
		"?A\u0005\n\u0000\u0000@>\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BG\u0003\b\u0004\u0005CD\n\u0003\u0000\u0000"+
		"DE\u0005\u000b\u0000\u0000EG\u0003\b\u0004\u0004F7\u0001\u0000\u0000\u0000"+
		"F=\u0001\u0000\u0000\u0000FC\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\t\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000KN\u0005\u0011\u0000\u0000LM\u0005"+
		"\u0006\u0000\u0000MO\u0003\n\u0005\u0000NL\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000O\u000b\u0001\u0000\u0000\u0000\n\u000f%-/5:@FHN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}