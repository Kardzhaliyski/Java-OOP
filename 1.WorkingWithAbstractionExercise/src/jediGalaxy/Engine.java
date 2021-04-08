package jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Engine {
    Scanner scanner;
    Jedi jedi;
    Evil evil;

    public Engine(Scanner scanner, Jedi jedi, Evil evil) {
        this.scanner = scanner;
        this.jedi = jedi;
        this.evil = evil;
    }

    public void start() {
        String command = scanner.nextLine();
        while (!command.equals("Let the Force be with you")) {
            int[] jediCoordinates = Arrays.stream(command.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int[] evilCoordinates = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int evilCoordinateX = evilCoordinates[0];
            int evilCoordinateY = evilCoordinates[1];

            evil.destroy(evilCoordinateX,evilCoordinateY);

            int jediCoordinateX = jediCoordinates[0];
            int jediCoordinateY = jediCoordinates[1];

            jedi.collectPower(jediCoordinateX,jediCoordinateY);

            command = scanner.nextLine();
        }

        System.out.println(jedi.getPower());
    }
}
