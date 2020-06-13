package calculator;

public class MemorySaveOperation implements Operation {
    private Integer operand;

    @Override
    public void addOperand(int operand) {
        this.operand = operand;
        Memory.STACK.save(operand);
    }

    @Override
    public int getResult() {
        return operand;
    }

    @Override
    public boolean isCompleted() {
        return false;
    }
}
