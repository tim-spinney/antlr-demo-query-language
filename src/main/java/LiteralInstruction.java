public class LiteralInstruction extends Instruction {
    public final Object value;


    public LiteralInstruction(Operation operation, Object value) {
        super(operation);
        this.value = value;
    }

    @Override
    public String toString() {
        return operation.toString() + " " + value;
    }
}
