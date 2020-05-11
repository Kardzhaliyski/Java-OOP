package pointinrectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {

            var coordinates = Arrays.stream(bfr.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            Rectangle rectangle = new Rectangle(new Point(coordinates[0], coordinates[1]), new Point(coordinates[2], coordinates[3]));

            var numberOfPointsToCheck = Integer.parseInt(bfr.readLine());
            for (int i = 0; i < numberOfPointsToCheck; i++) {
                var pointCoordinates = Arrays.stream(bfr.readLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                System.out.println(rectangle.contains(new Point(pointCoordinates[0], pointCoordinates[1])));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
