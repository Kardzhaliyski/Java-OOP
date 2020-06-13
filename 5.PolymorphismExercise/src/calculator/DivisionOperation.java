package calculator;

import java.util.ArrayList;
import java.util.List;

public class DivisionOperation implements Operation {
    private List<Integer> operands;
    private Integer result = 0;

    public DivisionOperation() {
        operands = new ArrayList<>();
    }

    @Override
    public void addOperand(int operand) {
        operands.add(operand);

        if(this.isCompleted()) {
            this.result = this.operands.get(0) / this.operands.get(1);
        }
    }

    @Override
    public int getResult() {
        return this.result;
    }

    @Override
    public boolean isCompleted() {
        return this.operands.size() == 2;
    }
}
