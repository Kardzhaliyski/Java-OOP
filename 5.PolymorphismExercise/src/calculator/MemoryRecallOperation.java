package calculator;

public class MemoryRecallOperation implements Operation {
    @Override
    public void addOperand(int operand) {
        //
    }

    @Override
    public int getResult() {
        return Memory.STACK.recall();
    }

    @Override
    public boolean isCompleted() {
        return true;
    }
}
