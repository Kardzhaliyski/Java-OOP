package vehicles;

public class Bus extends Vehicle {
    private static final double AIR_CONDITIONER_FUEL_CONSUMPTION = 1.4;

    public Bus(double fuelQuantity, double fuelConsumptionPerKilometer, double tankCapacity) {
        super(fuelQuantity,
                (fuelConsumptionPerKilometer + AIR_CONDITIONER_FUEL_CONSUMPTION),
                tankCapacity);
    }

    public String driveEmpty(double distance) {
        return drive(distance,
                getFuelConsumptionPerKilometer() - AIR_CONDITIONER_FUEL_CONSUMPTION);
    }
}
