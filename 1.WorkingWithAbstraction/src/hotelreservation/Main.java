package hotelreservation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {

            String[] tokens = bfr.readLine().split("\\s+");
            double price = Double.parseDouble(tokens[0]);
            int numberOfDays = Integer.parseInt(tokens[1]);
            Season season = Season.valueOf(tokens[2].toUpperCase());
            DiscountType discountType;
            if(tokens[3].toUpperCase().equals("SECONDVISIT")) {
                discountType = DiscountType.SECOND_VISIT;
            } else {
                discountType = DiscountType.valueOf(tokens[3].toUpperCase());
            }

            Reservation reservation = new Reservation(price, numberOfDays, season, discountType);

            System.out.printf("%.2f", PriceCalculator.calculate(reservation));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
