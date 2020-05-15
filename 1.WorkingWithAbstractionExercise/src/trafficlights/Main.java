package trafficlights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            TrafficLights[] trafficLights = Arrays.stream(bfr.readLine().split("\\s+"))
                    .map(s -> TrafficLights.valueOf(s))
                    .toArray(TrafficLights[]::new);

            int updateCount = Integer.parseInt(bfr.readLine());

            TrafficLights[] lights = TrafficLights.values();

            StringBuilder sb = new StringBuilder();

            while (updateCount-- > 0) {
                for (int i = 0; i < trafficLights.length; i++) {
                    var index = (trafficLights[i].ordinal() + 1) % lights.length;
                    trafficLights[i] = lights[index];
                    sb.append(trafficLights[i]).append(" ");
                }

                sb.append(System.lineSeparator());
            }

            System.out.println(sb.toString());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
