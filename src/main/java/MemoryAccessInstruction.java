public class MemoryAccessInstruction extends Instruction {
    public final String variableName;

    public MemoryAccessInstruction(Operation operation, String variableName) {
        super(operation);
        this.variableName = variableName;
    }

    @Override
    public String toString() {
        return operation.toString() + " " + variableName;
    }
}
