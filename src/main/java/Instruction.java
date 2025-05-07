public class Instruction {
    public final Operation operation;

    public Instruction(Operation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return operation.toString();
    }
}
