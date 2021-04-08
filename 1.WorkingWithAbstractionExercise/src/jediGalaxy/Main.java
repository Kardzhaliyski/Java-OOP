package jediGalaxy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(" ");
        int verticalSize = Integer.parseInt(dimensions[0]);
        int horizontalSize = Integer.parseInt(dimensions[1]);
        Galaxy galaxy = new Galaxy(verticalSize, horizontalSize);

        Evil evil = new Evil(galaxy);
        Jedi jedi = new Jedi(galaxy);

        Engine engine = new Engine(scanner, jedi, evil);
        engine.start();

    }
}
