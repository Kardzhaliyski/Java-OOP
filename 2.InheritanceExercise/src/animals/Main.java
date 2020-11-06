package animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {

            List<Animal> animals = new ArrayList<>();

            String animalType = bfr.readLine();
            while (!animalType.equals("Beast!")) {
                String[] animalData = bfr.readLine().split("\\s+");

                try {
                    animals.add(Utils.animalParse(animalType, animalData));
                } catch (InvalidParameterException e) {
                    System.out.println(e.getMessage());
                }

                animalType = bfr.readLine();
            }

            for (Animal animal : animals) {
                System.out.println(animal);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
