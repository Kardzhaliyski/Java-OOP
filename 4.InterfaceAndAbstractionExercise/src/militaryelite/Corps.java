package militaryelite;

public enum Corps {
    MARINES,
    AIRFORCES;

    public String getLabel() {
        return this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }
}
