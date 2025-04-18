// Generated from src/main/resources/ListQueries.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ListQueriesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Mult=4, Add=5, Mod=6, Comparator=7, Whitespace=8, 
		IntLiteral=9, Identifier=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "Mult", "Add", "Mod", "Comparator", "Whitespace", 
			"IntLiteral", "Identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'WHERE'", "'['", "']'", "'*'", "'+'", "'%'", null, null, null, 
			"'it'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "Mult", "Add", "Mod", "Comparator", "Whitespace", 
			"IntLiteral", "Identifier"
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


	public ListQueriesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ListQueries.g4"; }

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
		"\u0004\u0000\nB\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006/\b"+
		"\u0006\u0001\u0007\u0004\u00072\b\u0007\u000b\u0007\f\u00073\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0003\b9\b\b\u0001\b\u0004\b<\b\b\u000b\b\f\b=\u0001"+
		"\t\u0001\t\u0001\t\u0000\u0000\n\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0001\u0000"+
		"\u0004\u0002\u0000<<>>\u0003\u0000\t\n\r\r  \u0001\u0000--\u0001\u0000"+
		"09H\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0001"+
		"\u0015\u0001\u0000\u0000\u0000\u0003\u001b\u0001\u0000\u0000\u0000\u0005"+
		"\u001d\u0001\u0000\u0000\u0000\u0007\u001f\u0001\u0000\u0000\u0000\t!"+
		"\u0001\u0000\u0000\u0000\u000b#\u0001\u0000\u0000\u0000\r.\u0001\u0000"+
		"\u0000\u0000\u000f1\u0001\u0000\u0000\u0000\u00118\u0001\u0000\u0000\u0000"+
		"\u0013?\u0001\u0000\u0000\u0000\u0015\u0016\u0005W\u0000\u0000\u0016\u0017"+
		"\u0005H\u0000\u0000\u0017\u0018\u0005E\u0000\u0000\u0018\u0019\u0005R"+
		"\u0000\u0000\u0019\u001a\u0005E\u0000\u0000\u001a\u0002\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0005[\u0000\u0000\u001c\u0004\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0005]\u0000\u0000\u001e\u0006\u0001\u0000\u0000\u0000\u001f"+
		" \u0005*\u0000\u0000 \b\u0001\u0000\u0000\u0000!\"\u0005+\u0000\u0000"+
		"\"\n\u0001\u0000\u0000\u0000#$\u0005%\u0000\u0000$\f\u0001\u0000\u0000"+
		"\u0000%&\u0005=\u0000\u0000&/\u0005=\u0000\u0000\'(\u0005<\u0000\u0000"+
		"(/\u0005>\u0000\u0000)/\u0007\u0000\u0000\u0000*+\u0005>\u0000\u0000+"+
		"/\u0005=\u0000\u0000,-\u0005<\u0000\u0000-/\u0005=\u0000\u0000.%\u0001"+
		"\u0000\u0000\u0000.\'\u0001\u0000\u0000\u0000.)\u0001\u0000\u0000\u0000"+
		".*\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/\u000e\u0001\u0000"+
		"\u0000\u000002\u0007\u0001\u0000\u000010\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u000056\u0006\u0007\u0000\u00006\u0010\u0001\u0000"+
		"\u0000\u000079\u0007\u0002\u0000\u000087\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:<\u0007\u0003\u0000\u0000"+
		";:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000>\u0012\u0001\u0000\u0000\u0000?@\u0005"+
		"i\u0000\u0000@A\u0005t\u0000\u0000A\u0014\u0001\u0000\u0000\u0000\u0005"+
		"\u0000.38=\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}