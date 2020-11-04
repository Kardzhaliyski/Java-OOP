package hotelreservation;

public enum Discount {
    NONE(0),
    SECONDVISIT(10),
    VIP(20);

    private final int discountPercentage;

    private Discount(int discount) {
        this.discountPercentage = discount;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }
}
