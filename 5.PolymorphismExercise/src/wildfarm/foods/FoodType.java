package wildfarm.foods;

public enum FoodType {
    VEGETABLE("Vegetable"),
    MEAT("Meat");

    private final String label;

    FoodType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
