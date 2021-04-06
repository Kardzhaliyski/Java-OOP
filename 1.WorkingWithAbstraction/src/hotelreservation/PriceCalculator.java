package hotelreservation;

public class PriceCalculator {
    private PriceCalculator(){ }

    public static double calculate(Reservation reservation){

            return (reservation.getPrice() *
                    reservation.getNumberOfDays() *
                    reservation.getSeason().getMultiplier()) *
                    (1 - reservation.getDiscountType().getDiscount() / 100.0);

    }
}
