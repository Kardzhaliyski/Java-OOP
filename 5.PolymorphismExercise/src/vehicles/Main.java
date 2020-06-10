package vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {

            var carData = bfr.readLine().split("\\s+");
            Car car = new Car(
                    Double.parseDouble(carData[1]),
                    Double.parseDouble(carData[2]));

            var truckData = bfr.readLine().split("\\s+");
            Truck truck = new Truck(
                    Double.parseDouble(truckData[1]),
                    Double.parseDouble(truckData[2]));

            var numberOfInputs = Integer.parseInt(bfr.readLine());

            for (int i = 0; i < numberOfInputs; i++) {
                var tokens = bfr.readLine().split("\\s+");
                var action = tokens[0];
                var vehicleType = tokens[1];
                var value = Double.parseDouble(tokens[2]);

                if (vehicleType.equals("Car")) {
                    if (action.equals("Drive")) {
                        System.out.println(car.drive(value));
                    } else if (action.equals("Refuel")) {
                        car.refuel(value);
                    }
                } else if (vehicleType.equals("Truck")) {
                    if (action.equals("Drive")) {
                        System.out.println(truck.drive(value));
                    } else if (action.equals("Refuel")) {
                        truck.refuel(value);
                    }
                }
            }

            System.out.println(car.getFuelInfo());
            System.out.println(truck.getFuelInfo());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
