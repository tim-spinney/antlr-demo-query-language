import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;

public class BytecodeCompiler {
    public static void main(String[] args) {
        String input = "WHERE it * 2 + 4 * 3 >= 16 + it AND it > 0 OR NOT NOT it < 0";
        System.out.println(input);

        CharStream inputStream = CharStreams.fromString(input);
        QueriesLexer lexer = new QueriesLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        QueriesParser parser = new QueriesParser(tokenStream);
        QueriesParser.QueryContext queryContext = parser.query();

        InstructionGeneratingTreeListener instructionGenerator = new InstructionGeneratingTreeListener();
        new ParseTreeWalker().walk(instructionGenerator, queryContext);
        List<Instruction> instructions = instructionGenerator.getInstructions();
        for(Instruction instruction : instructions) {
            System.out.println(instruction);
        }
    }
}
