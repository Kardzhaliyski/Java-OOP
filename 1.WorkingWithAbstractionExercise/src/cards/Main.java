package cards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            CardRank rank = CardRank.valueOf(bfr.readLine().toUpperCase());
            CardSuit suit = CardSuit.valueOf(bfr.readLine().toUpperCase());
            Card card = new Card(rank, suit);
            System.out.println(card);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
