package pizzacalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    public String getToppingType() {
        return toppingType;
    }

    public double getWeight() {
        return weight;
    }

    private void setToppingType(String toppingType) {
        try{
            ToppingType.valueOf(toppingType.toUpperCase());
            this.toppingType = toppingType;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Cannot place "
                    + toppingType
                    + " on top of your pizza.");
        }
    }

    private void setWeight(double weight) {
        if(weight < 1 || weight > 50) {
            throw new IllegalArgumentException(
                    this.toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return this.weight * 2 * ToppingType.valueOf(this.toppingType.toUpperCase()).getModifier();
    }
}
