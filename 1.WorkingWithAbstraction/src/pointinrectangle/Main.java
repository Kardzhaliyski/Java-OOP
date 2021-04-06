package pointinrectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {

            int[] rectanglePointsCoordinate = Arrays.stream(bfr.readLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            Point bottomLeftPoint = new Point(rectanglePointsCoordinate[0], rectanglePointsCoordinate[1]);
            Point topRightPoint = new Point(rectanglePointsCoordinate[2], rectanglePointsCoordinate[3]);
            Rectangle rectangle = new Rectangle(bottomLeftPoint, topRightPoint);

            int pointsToCheck = Integer.parseInt(bfr.readLine());
            while (pointsToCheck-- > 0) {
                int[] pointCoordinates = Arrays.stream(bfr.readLine().split("\\s+"))
                        .mapToInt(Integer::parseInt).toArray();
                Point point = new Point(pointCoordinates[0], pointCoordinates[1]);
                System.out.println(rectangle.contains(point));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
