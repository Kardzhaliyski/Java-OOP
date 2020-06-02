package shoppingspree;


public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        setName(name);
        setCost(cost);
    }

    private void setCost(double cost) {
        Validator.validateNotNegativeMoneyAmount(cost);
        this.cost = cost;
    }

    private void setName(String name) {
        Validator.validateNotEmptyName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
