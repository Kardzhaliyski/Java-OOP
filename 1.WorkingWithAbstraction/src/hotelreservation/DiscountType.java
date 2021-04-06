package hotelreservation;

public enum DiscountType {
    VIP(20),
    SECOND_VISIT(10),
    NONE(0);

    private final int discount;

    DiscountType(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
}
