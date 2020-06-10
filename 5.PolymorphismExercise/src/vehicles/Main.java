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
                    Double.parseDouble(carData[2]),
                    Double.parseDouble(carData[3]));

            var truckData = bfr.readLine().split("\\s+");
            Truck truck = new Truck(
                    Double.parseDouble(truckData[1]),
                    Double.parseDouble(truckData[2]),
                    Double.parseDouble(truckData[3]));

            var busData = bfr.readLine().split("\\s+");
            Bus bus = new Bus(
                    Double.parseDouble(busData[1]),
                    Double.parseDouble(busData[2]),
                    Double.parseDouble(busData[3]));

            var numberOfInputs = Integer.parseInt(bfr.readLine());

            for (int i = 0; i < numberOfInputs; i++) {
                try {
                    var tokens = bfr.readLine().split("\\s+");
                    var action = tokens[0];
                    var vehicleType = tokens[1];
                    var value = Double.parseDouble(tokens[2]);

                    switch (vehicleType) {
                        case "Car":
                            if (action.equals("Drive")) {
                                System.out.println(car.drive(value));
                            } else if (action.equals("Refuel")) {
                                car.refuel(value);
                            }
                            break;
                        case "Truck":
                            if (action.equals("Drive")) {
                                System.out.println(truck.drive(value));
                            } else if (action.equals("Refuel")) {
                                truck.refuel(value);
                            }
                            break;
                        case "Bus":
                            if (action.equals("Drive")) {
                                System.out.println(bus.drive(value));
                            } else if (action.equals("Refuel")) {
                                bus.refuel(value);
                            } else if (action.equals("DriveEmpty")) {
                                System.out.println(bus.driveEmpty(value));
                            }
                            break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println(car.getFuelInfo());
            System.out.println(truck.getFuelInfo());
            System.out.println(bus.getFuelInfo());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
