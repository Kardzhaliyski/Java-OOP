package box;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {

            var length = Double.parseDouble(bfr.readLine());
            var width = Double.parseDouble(bfr.readLine());
            var height = Double.parseDouble(bfr.readLine());

            Box box = null;
            try {
                box = new Box(length, width, height);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            if(box != null) {
                System.out.println(box);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
