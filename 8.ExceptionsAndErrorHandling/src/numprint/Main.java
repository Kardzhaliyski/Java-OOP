package numprint;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {

            String input1 = scanner.nextLine();
            String input2 = scanner.nextLine();

            try {
                int num1 = Integer.parseInt(input1);
                int num2 = Integer.parseInt(input2);

                printNumbers(num1, num2);
            } catch (NumberFormatException | InvalidParameterException e) {
                System.out.println(e.getMessage());
                continue;
            }

            break;
        }
    }

    private static void printNumbers(int start, int end) {
        if(!(1 < start && start < end && end < 100)) {
            throw new InvalidParameterException(
                    String.format("Invalid number for range [0...100]"
                            ,start,end));
        }

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
