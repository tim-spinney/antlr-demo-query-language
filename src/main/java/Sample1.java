import java.util.ArrayList;
import java.util.List;

/* Java code approxmiating sample code in BytecodeCompiler so we can see
   what the equivalent JVM bytecode would be.
 */
public class Sample1 {
    public static void main(String[] args) {
        Row[] data = new Row[]{
                new Row(1),
                new Row(2),
                new Row(4),
                new Row(8),
                new Row(16)
        };
        boolean[] matches = evaluate(data);
        for(int index = 0; index < data.length; index++) {
            System.out.println(index + ": " + (matches[index] ? "YES" : "NO"));
        }
    }

    private static boolean[] evaluate(Row[] data) {
        int length = data.length;
        boolean[] matches = new boolean[length];
        for(int index = 0; index < length; index++) {
            Row it = data[index];
            boolean result = it.a * 2 + 4 * 3 >= 16 + it.a &&
                    it.a > 0 || it.a < 10
                    && it.a % 2 == 0;
            matches[index] = result;
        }
        return matches;
    }

    private static class Row {
        public final int a;
        public Row(int a) { this.a = a; }
    }

}
