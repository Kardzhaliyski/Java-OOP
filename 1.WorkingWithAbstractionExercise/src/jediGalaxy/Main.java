package jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Parser.stringToIntArr(scanner.nextLine());

        int[][] matrix = new int[dimensions[0]][dimensions[1]];

        populateMatrix(matrix);
        Engine engine = new Engine(scanner, matrix);
        engine.run();



    }

    private static void populateMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = row * matrix[row].length + col;
            }
        }
    }
}
