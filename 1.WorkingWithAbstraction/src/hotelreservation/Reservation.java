package hotelreservation;

public class Reservation {

    private final double price;
    private final int numberOfDays;
    private final Season season;
    private final DiscountType discountType;

    public Reservation(double price, int numberOfDays, Season season, DiscountType discountType) {

        this.price = price;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discountType = discountType;
    }


    public double getPrice() {
        return this.price;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public Season getSeason() {
        return season;
    }

    public DiscountType getDiscountType() {
        return discountType;
    }
}
