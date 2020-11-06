package vehicles;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new SportCar(20,1);
        car.drive(5);
        car.drive(5);
        car.drive(5);

        System.out.println(car.DEFAULT_FUEL_CONSUMPTION);
    }
}
