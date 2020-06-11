package wildfarm.food;

public abstract class Food {
    private Integer quantity;

    public Food(Integer quantity) {
        setQuantity(quantity);
    }

    public Integer getQuantity() {
        return quantity;
    }

    protected void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
