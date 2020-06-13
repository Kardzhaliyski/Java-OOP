package calculator;

import java.util.ArrayDeque;

public class MemoryStack {
    private ArrayDeque <Integer> stack;

    public MemoryStack() {
        this.stack = new ArrayDeque<>();
    }

    public void save(Integer value) {
        stack.push(value);
    }

    public Integer recall() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
