package trafficlights;

public enum TrafficLight {
    GREEN,
    YELLOW,
    RED;

    private static final TrafficLight[] values = values();

    public static TrafficLight getByOrdinal(int ordinal) {
        return values[ordinal];
    }
}
