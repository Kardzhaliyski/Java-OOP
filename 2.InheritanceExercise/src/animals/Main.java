package animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            ArrayList<Animal> animals = new ArrayList<>();

            var animalType = bfr.readLine();
            while (!animalType.equals("Beast!")) {
                var animalData = bfr.readLine().split("\\s+");
                var name = animalData[0];
                var age = Integer.parseInt(animalData[1]);

                if (!Animal.isAgeValid(age)) {
                    System.out.println("Invalid input!");
                    animalType = bfr.readLine();
                    continue;
                }

                var gender = "";
                if (!animalType.equals("Tomcat") && !animalType.equals("Kittens")) {
                    gender = animalData[2];
                }

                switch (animalType) {
                    case "Frog": {
                        Frog frog = new Frog(name, age, gender);
                        animals.add(frog);
                        break;
                    }
                    case "Dog": {
                        Dog dog = new Dog(name, age, gender);
                        animals.add(dog);
                        break;
                    }
                    case "Cat": {
                        Cat cat = new Cat(name, age, gender);
                        animals.add(cat);
                        break;
                    }
                    case "Tomcat": {
                        Tomcat tomcat = new Tomcat(name, age);
                        animals.add(tomcat);
                        break;
                    }
                    case "Kittens": {
                        Kitten kittens = new Kitten(name, age);
                        animals.add(kittens);
                        break;
                    } default: {
                        System.out.println("Invalid input!");
                    }
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
