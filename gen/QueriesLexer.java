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
		T__0=1, T__1=2, Mult=3, Div=4, Add=5, Sub=6, Mod=7, And=8, Or=9, Not=10, 
		Comparator=11, Whitespace=12, IntLiteral=13, Identifier=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "Mult", "Div", "Add", "Sub", "Mod", "And", "Or", "Not", 
			"Comparator", "Whitespace", "IntLiteral", "Identifier"
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
		"\u0004\u0000\u000e[\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\nD\b\n\u0001\u000b\u0004\u000bG\b\u000b\u000b\u000b\f\u000bH"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0003\fN\b\f\u0001\f\u0004\fQ\b\f\u000b"+
		"\f\f\fR\u0001\r\u0001\r\u0005\rW\b\r\n\r\f\rZ\t\r\u0000\u0000\u000e\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u0001"+
		"\u0000\u0006\u0002\u0000<<>>\u0003\u0000\t\n\r\r  \u0001\u0000--\u0001"+
		"\u000009\u0001\u0000az\u0002\u0000__azb\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003"+
		"#\u0001\u0000\u0000\u0000\u0005%\u0001\u0000\u0000\u0000\u0007\'\u0001"+
		"\u0000\u0000\u0000\t)\u0001\u0000\u0000\u0000\u000b+\u0001\u0000\u0000"+
		"\u0000\r-\u0001\u0000\u0000\u0000\u000f/\u0001\u0000\u0000\u0000\u0011"+
		"3\u0001\u0000\u0000\u0000\u00136\u0001\u0000\u0000\u0000\u0015C\u0001"+
		"\u0000\u0000\u0000\u0017F\u0001\u0000\u0000\u0000\u0019M\u0001\u0000\u0000"+
		"\u0000\u001bT\u0001\u0000\u0000\u0000\u001d\u001e\u0005W\u0000\u0000\u001e"+
		"\u001f\u0005H\u0000\u0000\u001f \u0005E\u0000\u0000 !\u0005R\u0000\u0000"+
		"!\"\u0005E\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005.\u0000"+
		"\u0000$\u0004\u0001\u0000\u0000\u0000%&\u0005*\u0000\u0000&\u0006\u0001"+
		"\u0000\u0000\u0000\'(\u0005/\u0000\u0000(\b\u0001\u0000\u0000\u0000)*"+
		"\u0005+\u0000\u0000*\n\u0001\u0000\u0000\u0000+,\u0005-\u0000\u0000,\f"+
		"\u0001\u0000\u0000\u0000-.\u0005%\u0000\u0000.\u000e\u0001\u0000\u0000"+
		"\u0000/0\u0005A\u0000\u000001\u0005N\u0000\u000012\u0005D\u0000\u0000"+
		"2\u0010\u0001\u0000\u0000\u000034\u0005O\u0000\u000045\u0005R\u0000\u0000"+
		"5\u0012\u0001\u0000\u0000\u000067\u0005N\u0000\u000078\u0005O\u0000\u0000"+
		"89\u0005T\u0000\u00009\u0014\u0001\u0000\u0000\u0000:;\u0005=\u0000\u0000"+
		";D\u0005=\u0000\u0000<=\u0005<\u0000\u0000=D\u0005>\u0000\u0000>D\u0007"+
		"\u0000\u0000\u0000?@\u0005>\u0000\u0000@D\u0005=\u0000\u0000AB\u0005<"+
		"\u0000\u0000BD\u0005=\u0000\u0000C:\u0001\u0000\u0000\u0000C<\u0001\u0000"+
		"\u0000\u0000C>\u0001\u0000\u0000\u0000C?\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000D\u0016\u0001\u0000\u0000\u0000EG\u0007\u0001\u0000"+
		"\u0000FE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0006"+
		"\u000b\u0000\u0000K\u0018\u0001\u0000\u0000\u0000LN\u0007\u0002\u0000"+
		"\u0000ML\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000"+
		"\u0000\u0000OQ\u0007\u0003\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"S\u001a\u0001\u0000\u0000\u0000TX\u0007\u0004\u0000\u0000UW\u0007\u0005"+
		"\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\u001c\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000\u0006\u0000CHMRX\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}