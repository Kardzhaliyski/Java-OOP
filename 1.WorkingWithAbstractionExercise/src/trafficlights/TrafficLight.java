package trafficlights;

public class TrafficLight {
    private TrafficLightColor color;

    public TrafficLight(TrafficLightColor color) {
        this.color = color;
    }

    public String switchColor() {
        int nextColorOrdinal = (this.color.ordinal() + 1) % TrafficLightColor.getCount();
        this.color = TrafficLightColor.getByOrdinal(nextColorOrdinal);
        return this.color.toString();
    }
}
