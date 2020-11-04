package trafficlights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static trafficlights.TrafficLightsUtils.switchToNextLight;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            TrafficLight[] lights =  Arrays.stream(bfr.readLine().split("\\s+"))
                    .map(TrafficLight::valueOf)
                    .toArray(TrafficLight[]::new);

            int numberOfSwitches = Integer.parseInt(bfr.readLine());

            while (numberOfSwitches-- > 0) {
                switchToNextLight(lights);

                for (TrafficLight light : lights) {
                    System.out.print(light + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
