package jedigalaxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            var galaxySizeData = bfr.readLine().split("\\s+");
            var galaxy = new Galaxy(
                    Integer.parseInt(galaxySizeData[0]),
                    Integer.parseInt(galaxySizeData[1]));
            var jedi = new Jedi(galaxy);
            var evil = new Evil(galaxy);

            var input = bfr.readLine();
            while (!input.equals("Let the Force be with you")) {
                var jediLocation = input.split("\\s+");
                var evilLocation = bfr.readLine().split("\\s+");

                evil.destroyStars(
                        Integer.parseInt(evilLocation[0]),
                        Integer.parseInt(evilLocation[1]));

                jedi.collectPower(
                        Integer.parseInt(jediLocation[0]),
                        Integer.parseInt(jediLocation[1]));

                input = bfr.readLine();
            }

            System.out.println(jedi.getPowerAmount());

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
