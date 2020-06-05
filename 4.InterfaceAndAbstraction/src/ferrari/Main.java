package ferrari;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            String driverName = bfr.readLine();
            Ferrari car = new Ferrari(driverName);

            System.out.println(car);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
