public class JumpInstruction extends Instruction {
    public final int destinationInstructionLabel;

    public JumpInstruction(Operation operation, int destinationInstructionIndex) {
        super(operation);
        this.destinationInstructionLabel = destinationInstructionIndex;
    }

    @Override
    public String toString() {
        return operation.toString() + " L" + destinationInstructionLabel;
    }
}
