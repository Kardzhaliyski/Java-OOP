package hotelreservation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            String[] reservationData = bfr.readLine().split("\\s+");
            double pricePerDay = Double.parseDouble(reservationData[0]);
            int numberOfDays = Integer.parseInt(reservationData[1]);
            Season season = Season.valueOf(reservationData[2].toUpperCase());
            Discount discount = Discount.valueOf(reservationData[3].toUpperCase());

            System.out.printf("%.2f", Calculator.totalPrice(pricePerDay, numberOfDays, season, discount));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
