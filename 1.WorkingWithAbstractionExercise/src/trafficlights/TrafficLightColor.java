package trafficlights;

public enum TrafficLightColor {
    GREEN,
    YELLOW,
    RED;

    private static final TrafficLightColor[] colors = TrafficLightColor.values();

    public static TrafficLightColor getByOrdinal(int ordinal) {
        return colors[ordinal];
    }

    public static int getCount() {
        return colors.length;
    }
}
