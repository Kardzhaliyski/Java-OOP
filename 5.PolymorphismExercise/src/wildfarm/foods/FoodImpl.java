package wildfarm.foods;

public class FoodImpl implements Food {

    private FoodType type;
    private Integer quantity;

    public FoodImpl(Integer quantity, FoodType type) {
        setQuantity(quantity);
        this.type = type;
    }

    @Override
    public FoodType getType() {
        return this.type;
    }

    @Override
    public Integer getQuantity() {
        return this.quantity;
    }

    private void setQuantity(Integer quantity) {
        if(0 > quantity) {
            throw new IllegalArgumentException("Food quantity cannot be a negative number");
        }

        this.quantity = quantity;
    }
}
