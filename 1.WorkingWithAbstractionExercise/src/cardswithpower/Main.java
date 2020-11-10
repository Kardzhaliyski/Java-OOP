package cardswithpower;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            String rank = bfr.readLine();
            String suit = bfr.readLine();
            int power = CardRank.valueOf(rank.toUpperCase()).getPower() +
                    CardSuit.valueOf(suit.toUpperCase()).getPower();

            System.out.printf("Card name: %s of %s; Card power: %d",
                    rank, suit, power);
        } catch (IOException e) {
            e.printStackTrace();
        }

        CardRank.valueOf("Two".toUpperCase());

    }
}
