package defineinterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            var input = bfr.readLine();

            List<Birthable> birthable = new ArrayList<>();
            while (!input.equals("End")) {
                var tokens = input.split("\\s+");

                switch (tokens[0]) {
                    case "Citizen": {
                        birthable.add(new Citizen(
                                tokens[1],
                                Integer.parseInt(tokens[2]),
                                tokens[3],
                                tokens[4]
                        ));
                        break;
                    }
                    case "Pet": {
                        birthable.add(new Pet(
                                tokens[1],
                                tokens[2]));
                        break;
                    }
                }

                input = bfr.readLine();
            }

            var birthYear = bfr.readLine();
            birthable.stream()
                    .filter(b -> b.getBirthDate()
                    .endsWith(birthYear))
                    .map(Birthable::getBirthDate)
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

