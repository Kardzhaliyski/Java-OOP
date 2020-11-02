package pointinrectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            int[] rectanglePointsData = Arrays.stream(bfr.readLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            Rectangle rectangle = new Rectangle(
                    new Point2D(rectanglePointsData[0], rectanglePointsData[1]),
                    new Point2D(rectanglePointsData[2], rectanglePointsData[3]));

            int numberOfPointsToCheck = Integer.parseInt(bfr.readLine());
            while (numberOfPointsToCheck-- > 0) {
                int[] pointData = Arrays.stream(bfr.readLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                Point2D point = new Point2D(pointData[0], pointData[1]);

                System.out.println(rectangle.containsPoint(point));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
