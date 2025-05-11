import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BytecodeCompiler {
    public static void main(String[] args) {
        String input = "WHERE it * 2 + 4 * 3 >= 16 + it AND it > 0 AND it < 10 AND it % 2 == 0";
        System.out.println(input);

        CharStream inputStream = CharStreams.fromString(input);
        QueriesLexer lexer = new QueriesLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        QueriesParser parser = new QueriesParser(tokenStream);
        QueriesParser.QueryContext queryContext = parser.query();

        InstructionGeneratingTreeListener instructionGenerator = new InstructionGeneratingTreeListener();
        new ParseTreeWalker().walk(instructionGenerator, queryContext);
        List<Instruction> instructions = instructionGenerator.getInstructions();
        List<Integer> labelIndices = instructionGenerator.getLabels();
        Map<Integer, Integer> labelIndicesByLocation = new HashMap<>();
        for(int i = 0; i < labelIndices.size(); i++) {
            labelIndicesByLocation.put(labelIndices.get(i), i);
        }
        for(int i = 0; i < instructions.size(); i++) {
            if(labelIndicesByLocation.containsKey(i)) {
                System.out.println("L" + labelIndicesByLocation.get(i) + ":");
            }
            Instruction instruction = instructions.get(i);
            System.out.println(String.format("%2d", i) + " " + instruction);
        }
    }
}
