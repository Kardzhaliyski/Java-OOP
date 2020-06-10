package vehicles;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelConsumptionPerKilometer) {
        super(fuelQuantity, (fuelConsumptionPerKilometer + 1.6));
    }


    @Override
    public void refuel(double fuel) {
        super.refuel(fuel * 0.95);
    }
}
