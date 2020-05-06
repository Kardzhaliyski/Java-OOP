package rhombusofstars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            var size = Integer.parseInt(bfr.readLine());

            printRhombus(size);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printRhombus(int size) {
        for (int row = 1; row <= size; row++) {
            printRow(row, size);
        }

        for (int row = size - 1; row > 0; row--) {
            printRow(row, size);
        }
    }

    private static void printRow(int row, int size) {
        printWhitespace(row, size);
        printStars(row);
        System.out.println();
    }

    private static void printStars(int row) {
        var test = new String[row];
        Arrays.fill(test, "*");
        System.out.print(String.join(" ", test));
    }

    private static void printWhitespace(int row, int size) {
        for (int i = 0; i < (size - row); i++) {
            System.out.print(" ");
        }
    }
}
