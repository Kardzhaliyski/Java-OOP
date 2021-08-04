package sqru;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        try {
            int num = Integer.parseInt(input);
            double sqrt = Math.sqrt(num);
            System.out.println(sqrt);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        } finally {
            System.out.println("Good bye");
        }
    }
}
