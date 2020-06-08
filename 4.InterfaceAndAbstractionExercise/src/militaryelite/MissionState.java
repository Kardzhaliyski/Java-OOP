package militaryelite;

public enum MissionState {
    INPROGRESS("inProgress"),
    FINISHED("Finished");

    String name;

    MissionState(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
