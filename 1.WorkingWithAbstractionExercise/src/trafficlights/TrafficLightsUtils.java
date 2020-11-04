package trafficlights;

public class TrafficLightsUtils {
    private TrafficLightsUtils(){};

    public static TrafficLight switchToNextLight(TrafficLight light) {
        return TrafficLight.getByOrdinal((light.ordinal() + 1) % 3);
    }

    public static void switchToNextLight(TrafficLight[] lights) {
        for (int index = 0; index < lights.length; index++) {
            lights[index] = TrafficLightsUtils.switchToNextLight(lights[index]);
        }
    }
}
