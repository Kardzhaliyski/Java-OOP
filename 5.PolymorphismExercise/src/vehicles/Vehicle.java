package vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumptionPerKilometer;

    public Vehicle(double fuelQuantity, double fuelConsumptionPerKilometer) {
        setFuelQuantity(fuelQuantity);
        setFuelConsumptionPerKilometer(fuelConsumptionPerKilometer);
    }

    public void setFuelConsumptionPerKilometer(double fuelConsumptionPerKilometer) {
        this.fuelConsumptionPerKilometer = fuelConsumptionPerKilometer;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumptionPerKilometer() {
        return fuelConsumptionPerKilometer;
    }

    public void refuel(double fuel) {
        increaseFuelQuantity(fuel);
    }

    public String drive(double distance) {
        var fuelNeeded = distance * getFuelConsumptionPerKilometer();

        if(getFuelQuantity() >= fuelNeeded) {

            reduceFuelQuantity(fuelNeeded);

            return String.format("%s travelled %s km",
                    this.getClass().getSimpleName(),
                    new DecimalFormat("#.##").format(distance));

        }

        return this.getClass().getSimpleName() + " needs refueling";
    }

    public String getFuelInfo() {
        return String.format("%s: %.2f",
                this.getClass().getSimpleName(),
                this.getFuelQuantity());
    }

    protected void reduceFuelQuantity(double quantity) {
        setFuelQuantity(getFuelQuantity() - quantity);
    }

    protected void increaseFuelQuantity(double quantity) {
        setFuelQuantity(getFuelQuantity() + quantity);
    }
}
