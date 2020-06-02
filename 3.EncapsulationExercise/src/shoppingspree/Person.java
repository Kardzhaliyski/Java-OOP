package shoppingspree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        Validator.validateNotEmptyName(name);
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    private void setMoney(double money) {
        Validator.validateNotNegativeMoneyAmount(money);
        this.money = money;
    }

    public void buyProduct(Product product) {
        if (this.money >= product.getCost()) {
            this.products.add(product);
            this.money -= product.getCost();
        } else {
            throw new IllegalStateException(
                    String.format("%s can't afford %s",
                            this.name,
                            product.getName()));
        }
    }

    @Override
    public String toString() {
        if (products.isEmpty()) {
            return this.name + " - Nothing bought";
        }
        return this.name + " - "
                + products.stream()
                .map(Product::getName)
                .collect(Collectors.joining(", "));
    }
}
