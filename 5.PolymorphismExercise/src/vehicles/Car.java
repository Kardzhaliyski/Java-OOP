package vehicles;

public class Car extends Vehicle {
    private static final double AIR_CONDITIONER_FUEL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumptionPerKilometer, double tankCapacity) {
        super(fuelQuantity,
                (fuelConsumptionPerKilometer + AIR_CONDITIONER_FUEL_CONSUMPTION),
                tankCapacity);
    }


}
