package carshop;

public interface Rentable extends Car {
    Integer getMinimumRentalDays();
    Double getPricePerDay();
}
