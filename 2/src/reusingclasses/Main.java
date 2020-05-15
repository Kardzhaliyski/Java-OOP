package reusingclasses;

public class Main {
    public static void main(String[] args) {
        var stack = new StackOfStrings();
        stack.push("test");
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

    }
}
