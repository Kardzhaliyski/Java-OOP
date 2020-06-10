package vehicles;

public class Truck extends Vehicle {
    private static final double AIR_CONDITIONER_FUEL_CONSUMPTION = 1.6;

    public Truck(double fuelQuantity, double fuelConsumptionPerKilometer, double fuelTankCapacity) {
        super(fuelQuantity,
                (fuelConsumptionPerKilometer + AIR_CONDITIONER_FUEL_CONSUMPTION),
                fuelTankCapacity);
    }

    @Override
    public void refuel(double fuel) {
        super.refuel(fuel * 0.95);
    }
}
