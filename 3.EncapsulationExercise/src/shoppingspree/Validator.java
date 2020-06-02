package shoppingspree;

public class Validator {
    public static void validateNotNegativeMoneyAmount(Double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }

    public static void validateNotEmptyName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }
}
