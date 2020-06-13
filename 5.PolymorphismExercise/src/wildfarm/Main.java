package wildfarm;

import wildfarm.animals.Cat;
import wildfarm.animals.Mouse;
import wildfarm.animals.Tiger;
import wildfarm.animals.Zebra;
import wildfarm.animals.interfaces.Animal;
import wildfarm.foods.Food;
import wildfarm.foods.FoodType;
import wildfarm.foods.Meat;
import wildfarm.foods.Vegetable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            List<Animal> animals = new ArrayList<>();

            String input = bfr.readLine();
            while (!input.equals("End")) {
                Animal animal = readAnimalInput(input);
                Food food = readFoodInput(bfr.readLine());

                animal.makeSound();



                try {
                    animal.eat(food);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }

                animals.add(animal);

                input = bfr.readLine();
            }

            for (Animal animal : animals) {
                System.out.println(animal);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Food readFoodInput(String input) {
        var tokens = input.split("\\s+");
        var foodType = tokens[0];
        validateFoodType(foodType);
        var foodQuantity = Integer.parseInt(tokens[1]);

        if(FoodType.VEGETABLE.getLabel().equals(foodType)) {
            return new Vegetable(foodQuantity);
        } else if(FoodType.MEAT.getLabel().equals(foodType)) {
            return new Meat(foodQuantity);
        }

        throw new IllegalArgumentException("Wrong food type!");
    }

    private static void validateFoodType(String foodType) {
        for (FoodType value : FoodType.values()) {
            if(value.getLabel().equals(foodType)) {
                return;
            }
        }

        throw new IllegalArgumentException("Wrong food type!");
    }

    private static Animal readAnimalInput(String input) {
        var tokens = input.split("\\s+");
        var type = tokens[0];
        var name = tokens[1];
        var weight = Double.parseDouble(tokens[2]);
        var livingRegion = tokens[3];

        switch (type) {
            case "Mouse": {
                return new Mouse(name, type, weight, livingRegion);
            }
            case "Zebra": {
                return new Zebra(name, type, weight, livingRegion);
            }
            case "Tiger": {
                return new Tiger(name, type,weight, livingRegion);
            }
            case "Cat": {
                var breed = tokens[4];
                return new Cat(name, type, weight, livingRegion, breed);
            }
        }

        throw new IllegalArgumentException("Wrong animal type!");
    }
}
