package wildfarm;

import wildfarm.animals.*;
import wildfarm.food.Food;
import wildfarm.food.Meat;
import wildfarm.food.Vegetable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            List<Animal> animals = new ArrayList<>();

            var input = bfr.readLine();
            while (!input.equals("End")) {
                var tokens = input.split("\\s+");
                var foodData = bfr.readLine().split("\\s+");

                Food food;

                if (foodData[0].equals("Vegetable")) {
                    food = new Vegetable(Integer.parseInt(foodData[1]));
                } else {
                    food = new Meat(Integer.parseInt(foodData[1]));
                }

                var type = tokens[0];
                var name = tokens[1];
                var weight = tokens[2];
                var livingRegion = tokens[3];
                Animal animal = null;

                switch (type) {
                    case "Mouse":
                        animal = new Mouse(
                                name,
                                type,
                                Double.parseDouble(weight),
                                livingRegion);
                        break;
                    case "Zebra":
                        animal = new Zebra(
                                name,
                                type,
                                Double.parseDouble(weight),
                                livingRegion);
                        break;
                    case "Tiger":
                        animal = new Tiger(
                                name,
                                type,
                                Double.parseDouble(weight),
                                livingRegion);
                        break;
                    case "Cat":
                        var breed = tokens[4];
                        animal = new Cat(
                                name,
                                type,
                                Double.parseDouble(weight),
                                livingRegion,
                                breed);
                        break;
                }

                animals.add(animal);
                animal.makeSound();

                try {
                    animal.eat(food);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }

                input = bfr.readLine();
            }


            for (Animal animal : animals) {
                System.out.println(animal.toString());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
