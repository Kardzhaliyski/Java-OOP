package wildfarm.animals.abstractbases;

import wildfarm.animals.AnimalType;
import wildfarm.animals.interfaces.Animal;
import wildfarm.foods.Food;

public abstract class AnimalImpl implements Animal {
    private String animalName;
    private String animalType;
    private Double animalWeight;
    private Integer foodEaten;

    public AnimalImpl(String name, String type, Double weight) {
        setAnimalName(name);
        setAnimalType(type);
        setAnimalWeight(weight);
        this.foodEaten = 0;
    }

    protected String getAnimalName() {
        return animalName;
    }

    protected String getAnimalType() {
        return animalType;
    }

    protected Double getAnimalWeight() {
        return animalWeight;
    }

    protected Integer getFoodEaten() {
        return foodEaten;
    }

    private void setAnimalName(String name) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty or null!");
        }

        this.animalName = name;
    }

    private void setAnimalType(String type) {
        if(type == null) {
            throw new IllegalArgumentException("Animal type cannot be Null!");
        }

        if(!AnimalType.valueOf(type.toUpperCase()).getTypeName().equals(type)) {
            throw new IllegalArgumentException("Wrong Animal Type!");
        }

        this.animalType = type;
    }

    private void setAnimalWeight(Double weight) {
        if(weight == null || weight <= 0) {
            throw new IllegalArgumentException("Weight cannot be null, 0 or negative number!");
        }

        this.animalWeight = weight;
    }

    protected void increaseFoodEaten(Food foodEaten) {
        if(foodEaten == null) {
            throw new IllegalArgumentException("Food eaten cannot be null!");
        }

        if(foodEaten.getQuantity() == null) {
            throw new IllegalArgumentException("Food eaten cannot be null!");
        }

        if(0 > foodEaten.getQuantity()) {
            throw new IllegalArgumentException("Food eaten must be a positive Number!");
        }

        this.foodEaten += foodEaten.getQuantity();
    }


}
