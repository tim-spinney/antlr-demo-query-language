// Generated from src/main/resources/Queries.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class QueriesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Mult=7, Div=8, Add=9, 
		Sub=10, Mod=11, And=12, Or=13, Not=14, Comparator=15, IntLiteral=16, VarName=17, 
		TypeName=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "Mult", "Div", "Add", 
			"Sub", "Mod", "And", "Or", "Not", "Comparator", "IntLiteral", "VarName", 
			"TypeName", "WS"
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


	public QueriesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Queries.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000\u0013y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e[\b\u000e\u0001\u000f\u0003\u000f^\b\u000f\u0001\u000f"+
		"\u0004\u000fa\b\u000f\u000b\u000f\f\u000fb\u0001\u0010\u0001\u0010\u0005"+
		"\u0010g\b\u0010\n\u0010\f\u0010j\t\u0010\u0001\u0011\u0001\u0011\u0005"+
		"\u0011n\b\u0011\n\u0011\f\u0011q\t\u0011\u0001\u0012\u0004\u0012t\b\u0012"+
		"\u000b\u0012\f\u0012u\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0007\u0002\u0000"+
		"<<>>\u0001\u0000--\u0001\u000009\u0001\u0000az\u0002\u0000AZaz\u0001\u0000"+
		"AZ\u0003\u0000\t\n\r\r  \u0081\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000"+
		"\u0003-\u0001\u0000\u0000\u0000\u00050\u0001\u0000\u0000\u0000\u00072"+
		"\u0001\u0000\u0000\u0000\t4\u0001\u0000\u0000\u0000\u000b:\u0001\u0000"+
		"\u0000\u0000\r<\u0001\u0000\u0000\u0000\u000f>\u0001\u0000\u0000\u0000"+
		"\u0011@\u0001\u0000\u0000\u0000\u0013B\u0001\u0000\u0000\u0000\u0015D"+
		"\u0001\u0000\u0000\u0000\u0017F\u0001\u0000\u0000\u0000\u0019J\u0001\u0000"+
		"\u0000\u0000\u001bM\u0001\u0000\u0000\u0000\u001dZ\u0001\u0000\u0000\u0000"+
		"\u001f]\u0001\u0000\u0000\u0000!d\u0001\u0000\u0000\u0000#k\u0001\u0000"+
		"\u0000\u0000%s\u0001\u0000\u0000\u0000\'(\u0005Q\u0000\u0000()\u0005U"+
		"\u0000\u0000)*\u0005E\u0000\u0000*+\u0005R\u0000\u0000+,\u0005Y\u0000"+
		"\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005O\u0000\u0000./\u0005N\u0000"+
		"\u0000/\u0004\u0001\u0000\u0000\u000001\u0005:\u0000\u00001\u0006\u0001"+
		"\u0000\u0000\u000023\u0005;\u0000\u00003\b\u0001\u0000\u0000\u000045\u0005"+
		"W\u0000\u000056\u0005H\u0000\u000067\u0005E\u0000\u000078\u0005R\u0000"+
		"\u000089\u0005E\u0000\u00009\n\u0001\u0000\u0000\u0000:;\u0005.\u0000"+
		"\u0000;\f\u0001\u0000\u0000\u0000<=\u0005*\u0000\u0000=\u000e\u0001\u0000"+
		"\u0000\u0000>?\u0005/\u0000\u0000?\u0010\u0001\u0000\u0000\u0000@A\u0005"+
		"+\u0000\u0000A\u0012\u0001\u0000\u0000\u0000BC\u0005-\u0000\u0000C\u0014"+
		"\u0001\u0000\u0000\u0000DE\u0005%\u0000\u0000E\u0016\u0001\u0000\u0000"+
		"\u0000FG\u0005A\u0000\u0000GH\u0005N\u0000\u0000HI\u0005D\u0000\u0000"+
		"I\u0018\u0001\u0000\u0000\u0000JK\u0005O\u0000\u0000KL\u0005R\u0000\u0000"+
		"L\u001a\u0001\u0000\u0000\u0000MN\u0005N\u0000\u0000NO\u0005O\u0000\u0000"+
		"OP\u0005T\u0000\u0000P\u001c\u0001\u0000\u0000\u0000QR\u0005=\u0000\u0000"+
		"R[\u0005=\u0000\u0000ST\u0005<\u0000\u0000T[\u0005>\u0000\u0000U[\u0007"+
		"\u0000\u0000\u0000VW\u0005>\u0000\u0000W[\u0005=\u0000\u0000XY\u0005<"+
		"\u0000\u0000Y[\u0005=\u0000\u0000ZQ\u0001\u0000\u0000\u0000ZS\u0001\u0000"+
		"\u0000\u0000ZU\u0001\u0000\u0000\u0000ZV\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000[\u001e\u0001\u0000\u0000\u0000\\^\u0007\u0001\u0000"+
		"\u0000]\\\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000"+
		"\u0000\u0000_a\u0007\u0002\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"c \u0001\u0000\u0000\u0000dh\u0007\u0003\u0000\u0000eg\u0007\u0004\u0000"+
		"\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000i\"\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000ko\u0007\u0005\u0000\u0000ln\u0007\u0004\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000p$\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000rt\u0007\u0006\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000wx\u0006\u0012\u0000\u0000x&\u0001\u0000\u0000"+
		"\u0000\u0007\u0000Z]bhou\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}