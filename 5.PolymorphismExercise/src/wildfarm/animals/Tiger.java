package wildfarm.animals;

import wildfarm.animals.abstractbases.Felime;
import wildfarm.foods.Food;

public class Tiger extends Felime {

    public Tiger(String name, String type, Double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }


    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if(food.getType().getLabel().equals("Meat")) {
            super.increaseFoodEaten(food);
        } else {
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
    }
}
