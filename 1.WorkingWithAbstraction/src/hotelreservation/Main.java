package hotelreservation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            var input = bfr.readLine().split("\\s+");
            var pricePerDay = Double.parseDouble(input[0]);
            var days = Integer.parseInt(input[1]);
            var season = input[2];
            var discountType = input[3];

            System.out.printf("%.2f%n",
                    PriceCalculator.getTotalPrice(
                            pricePerDay,
                            days,
                            season,
                            discountType));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
