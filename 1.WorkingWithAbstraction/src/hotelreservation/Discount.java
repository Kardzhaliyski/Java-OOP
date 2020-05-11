package hotelreservation;

public enum  Discount {
    VIP(20),
    SecondVisit(10),
    None(0);

    private final int discountPercents;

    Discount(int percents) {
        discountPercents = percents;
    }

    public double getDiscount() {
        return (100 - discountPercents) / 100.0;
    }
}
