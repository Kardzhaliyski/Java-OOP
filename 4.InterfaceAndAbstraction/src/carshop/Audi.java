package carshop;

public class Audi extends CarImpl implements Rentable {
    private Integer minimumRentalDays;
    private Double pricePerDay;

    public Audi(String model, String color,
                Integer horsePower, String countryProduced,
                Integer minimumRentalDays, Double pricePerDay) {

        super(model, color, horsePower, countryProduced);
        this.minimumRentalDays = minimumRentalDays;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinimumRentalDays() {
        return this.minimumRentalDays;
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
                this.minimumRentalDays, this.pricePerDay);
    }
}
