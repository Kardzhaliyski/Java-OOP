package trafficlights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {

            TrafficLight[] trafficLights = Arrays.stream(bfr.readLine().split("\\s+"))
                    .map(String::toUpperCase)
                    .map(TrafficLightColor::valueOf)
                    .map(TrafficLight::new)
                    .toArray(TrafficLight[]::new);

            int lightChangeCount = Integer.parseInt(bfr.readLine());

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < lightChangeCount; i++) {
                for (TrafficLight trafficLight : trafficLights) {
                    sb.append(trafficLight.switchColor()).append(" ");
                }
                sb.append(System.lineSeparator());
            }

            System.out.println(sb.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
