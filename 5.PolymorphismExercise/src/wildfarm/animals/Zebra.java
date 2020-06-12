package wildfarm.animals;

import wildfarm.animals.abstractbases.Mammal;
import wildfarm.foods.Food;

public class Zebra extends Mammal {
    public Zebra(String name, String type, Double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if(food.getType().getLabel().equals("Vegetable")) {
            super.increaseFoodEaten(food);
        } else {
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
    }
}
