package jediGalaxy;

import java.util.Scanner;

public class Engine {

    Scanner scanner;
    int[][] matrix;

    public Engine(Scanner scanner, int[][] matrix) {
        this.scanner = scanner;
        this.matrix = matrix;
    }

    public void run() {
        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] player = Parser.stringToIntArr(command);
            int[] evil = Parser.stringToIntArr(scanner.nextLine());
            int evilRow = evil[0];
            int evilCol = evil[1];

            while (evilRow >= 0 && evilCol >= 0) {
                if (evilRow < matrix.length && evilCol < matrix[0].length) {
                    matrix[evilRow][evilCol] = 0;
                }
                evilRow--;
                evilCol--;
            }

            int playerRow = player[0];
            int playerCol = player[1];

            while (playerRow >= 0 && playerCol < matrix[0].length) {
                if (playerRow < matrix.length && playerCol >= 0) {
                    sum += matrix[playerRow][playerCol];
                }

                playerCol++;
                playerRow--;
            }

            command = scanner.nextLine();
        }

        System.out.println(sum);
    }
}
