package animalfarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            var name = bfr.readLine();
            var age = Integer.parseInt(bfr.readLine());

            Chicken chicken;
            try{
                chicken = new Chicken(name, age);
                System.out.println(chicken);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
