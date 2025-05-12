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
		T__0=1, T__1=2, Mult=3, Div=4, Add=5, Sub=6, Mod=7, And=8, Or=9, Not=10, 
		Comparator=11, Whitespace=12, IntLiteral=13, Identifier=14;
	public static final int
		RULE_query = 0, RULE_logicalExpression = 1, RULE_numericExpression = 2, 
		RULE_variableAccess = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "logicalExpression", "numericExpression", "variableAccess"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'WHERE'", "'.'", "'*'", "'/'", "'+'", "'-'", "'%'", "'AND'", "'OR'", 
			"'NOT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Mult", "Div", "Add", "Sub", "Mod", "And", "Or", "Not", 
			"Comparator", "Whitespace", "IntLiteral", "Identifier"
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
	public static class QueryContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(QueriesParser.EOF, 0); }
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
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(T__0);
			setState(9);
			logicalExpression(0);
			setState(10);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_logicalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				{
				setState(13);
				((LogicalExpressionContext)_localctx).op = match(Not);
				setState(14);
				logicalExpression(4);
				}
				break;
			case IntLiteral:
			case Identifier:
				{
				setState(15);
				numericExpression(0);
				setState(16);
				((LogicalExpressionContext)_localctx).op = match(Comparator);
				setState(17);
				numericExpression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(27);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(21);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(22);
						((LogicalExpressionContext)_localctx).op = match(And);
						setState(23);
						logicalExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(24);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(25);
						((LogicalExpressionContext)_localctx).op = match(Or);
						setState(26);
						logicalExpression(2);
						}
						break;
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_numericExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntLiteral:
				{
				setState(33);
				match(IntLiteral);
				}
				break;
			case Identifier:
				{
				setState(34);
				variableAccess();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(52);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new NumericExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numericExpression);
						setState(37);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(40);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Mult:
							{
							setState(38);
							((NumericExpressionContext)_localctx).op = match(Mult);
							}
							break;
						case Div:
							{
							setState(39);
							((NumericExpressionContext)_localctx).op = match(Div);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(42);
						numericExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new NumericExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numericExpression);
						setState(43);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(46);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Add:
							{
							setState(44);
							((NumericExpressionContext)_localctx).op = match(Add);
							}
							break;
						case Sub:
							{
							setState(45);
							((NumericExpressionContext)_localctx).op = match(Sub);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(48);
						numericExpression(5);
						}
						break;
					case 3:
						{
						_localctx = new NumericExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numericExpression);
						setState(49);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(50);
						((NumericExpressionContext)_localctx).op = match(Mod);
						setState(51);
						numericExpression(4);
						}
						break;
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public TerminalNode Identifier() { return getToken(QueriesParser.Identifier, 0); }
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
		enterRule(_localctx, 6, RULE_variableAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(Identifier);
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(58);
				match(T__1);
				setState(59);
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
		case 1:
			return logicalExpression_sempred((LogicalExpressionContext)_localctx, predIndex);
		case 2:
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
		"\u0004\u0001\u000e?\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0014\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001c"+
		"\b\u0001\n\u0001\f\u0001\u001f\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002$\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		")\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"/\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"5\b\u0002\n\u0002\f\u00028\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003=\b\u0003\u0001\u0003\u0000\u0002\u0002\u0004\u0004\u0000"+
		"\u0002\u0004\u0006\u0000\u0000D\u0000\b\u0001\u0000\u0000\u0000\u0002"+
		"\u0013\u0001\u0000\u0000\u0000\u0004#\u0001\u0000\u0000\u0000\u00069\u0001"+
		"\u0000\u0000\u0000\b\t\u0005\u0001\u0000\u0000\t\n\u0003\u0002\u0001\u0000"+
		"\n\u000b\u0005\u0000\u0000\u0001\u000b\u0001\u0001\u0000\u0000\u0000\f"+
		"\r\u0006\u0001\uffff\uffff\u0000\r\u000e\u0005\n\u0000\u0000\u000e\u0014"+
		"\u0003\u0002\u0001\u0004\u000f\u0010\u0003\u0004\u0002\u0000\u0010\u0011"+
		"\u0005\u000b\u0000\u0000\u0011\u0012\u0003\u0004\u0002\u0000\u0012\u0014"+
		"\u0001\u0000\u0000\u0000\u0013\f\u0001\u0000\u0000\u0000\u0013\u000f\u0001"+
		"\u0000\u0000\u0000\u0014\u001d\u0001\u0000\u0000\u0000\u0015\u0016\n\u0002"+
		"\u0000\u0000\u0016\u0017\u0005\b\u0000\u0000\u0017\u001c\u0003\u0002\u0001"+
		"\u0003\u0018\u0019\n\u0001\u0000\u0000\u0019\u001a\u0005\t\u0000\u0000"+
		"\u001a\u001c\u0003\u0002\u0001\u0002\u001b\u0015\u0001\u0000\u0000\u0000"+
		"\u001b\u0018\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000"+
		"\u001e\u0003\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		" !\u0006\u0002\uffff\uffff\u0000!$\u0005\r\u0000\u0000\"$\u0003\u0006"+
		"\u0003\u0000# \u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000$6\u0001"+
		"\u0000\u0000\u0000%(\n\u0005\u0000\u0000&)\u0005\u0003\u0000\u0000\')"+
		"\u0005\u0004\u0000\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*5\u0003\u0004\u0002\u0006+.\n\u0004\u0000"+
		"\u0000,/\u0005\u0005\u0000\u0000-/\u0005\u0006\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000.-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000005\u0003"+
		"\u0004\u0002\u000512\n\u0003\u0000\u000023\u0005\u0007\u0000\u000035\u0003"+
		"\u0004\u0002\u00044%\u0001\u0000\u0000\u00004+\u0001\u0000\u0000\u0000"+
		"41\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u00007\u0005\u0001\u0000\u0000\u000086\u0001"+
		"\u0000\u0000\u00009<\u0005\u000e\u0000\u0000:;\u0005\u0002\u0000\u0000"+
		";=\u0003\u0006\u0003\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=\u0007\u0001\u0000\u0000\u0000\t\u0013\u001b\u001d#(.46<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}