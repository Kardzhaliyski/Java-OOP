package hotelreservation;

public class Calculator {
    private Calculator(){};

    public static double totalPrice(double pricePerDay, int days, Season season, Discount discount) {
        return pricePerDay * days * season.getMultiplier() * (1 - discount.getDiscountPercentage() / 100.0) ;
    }
}
