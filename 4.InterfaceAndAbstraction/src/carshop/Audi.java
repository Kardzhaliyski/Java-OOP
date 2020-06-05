package carshop;

public class Audi extends CarImpl implements Rentable {
    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color,
                Integer horsePower, String countryProduced,
                Integer minimumRentalDays, Double pricePerDay) {

        super(model, color, horsePower, countryProduced);
        this.minRentDay = minimumRentalDays;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        return String.format(
                super.toString() + System.lineSeparator() +
                "Minimum rental period of %d days. Price per day %f",
                this.minRentDay, this.pricePerDay);
    }
}
