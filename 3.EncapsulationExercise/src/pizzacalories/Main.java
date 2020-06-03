package pizzacalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            String[] pizzaData = bfr.readLine().split("\\s+");
            Pizza pizza = new Pizza(pizzaData[1], Integer.parseInt(pizzaData[2]));
            String[] doughData = bfr.readLine().split("\\s+");
            Dough dough = new Dough(
                    doughData[1],
                    doughData[2],
                    Double.parseDouble(doughData[3]));

            pizza.setDough(dough);

            String input = bfr.readLine();
            while (!input.equals("END")) {
                String[] toppingData = input.split("\\s+");
                Topping topping = new Topping(toppingData[1], Double.parseDouble(toppingData[2]));
                pizza.addTopping(topping);

                input = bfr.readLine();
            }

            System.out.println(pizza);

        } catch (IllegalArgumentException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
