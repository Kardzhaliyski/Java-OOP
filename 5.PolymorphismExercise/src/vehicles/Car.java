package vehicles;

public class Car extends Vehicle {
    public Car(double fuelQuantity, double fuelConsumptionPerKilometer) {
        super(fuelQuantity, (fuelConsumptionPerKilometer + 0.9));
    }


}
