package wildfarm.animals;

import wildfarm.animals.abstractbases.Felime;
import wildfarm.foods.Food;

public class Cat extends Felime {
    private String breed;

    public Cat(String name, String type, Double weight, String livingRegion, String breed) {
        super(name, type, weight, livingRegion);
        setBreed(breed);
    }

    private void setBreed(String breed) {
        if (breed == null || breed.trim().isEmpty()) {
            throw new IllegalArgumentException("Breed cannot be null or empty!");
        }

        this.breed = breed;
    }

    private String getBreed() {
        return this.breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        super.increaseFoodEaten(food);
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %s, %d]",
                getAnimalType(),
                getAnimalName(),
                getBreed(),
                formatter.format(getAnimalWeight()),
                getLivingRegion(),
                getFoodEaten());
    }
}
