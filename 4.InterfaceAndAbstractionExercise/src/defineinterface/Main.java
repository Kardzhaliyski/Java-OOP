package defineinterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            var numberOfPeopleToInput = Integer.parseInt(bfr.readLine());
            Map<String, Buyer> buyers = new HashMap<>();

            while (numberOfPeopleToInput-- > 0) {
                var tokens = bfr.readLine().split("\\s+");
                if(tokens.length == 3) {
                    buyers.putIfAbsent(
                            tokens[0],
                            new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]));
                } else {
                    buyers.putIfAbsent(
                            tokens[0],
                            new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]));
                }
            }

            var buyer = bfr.readLine();
            while (!buyer.equals("End")) {
                if(buyers.containsKey(buyer)){
                    buyers.get(buyer).buyFood();
                }

                buyer = bfr.readLine();
            }

            var totalBoughtFood = buyers.values().stream()
                    .map(Buyer::getFood)
                    .reduce(Integer::sum)
                    .orElse(0);

            System.out.println(totalBoughtFood);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

