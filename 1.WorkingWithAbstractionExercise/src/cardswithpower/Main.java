package cardswithpower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            String rank = bfr.readLine();
            String suit = bfr.readLine();
            Card card = new Card(rank, suit);
            System.out.println(card);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
