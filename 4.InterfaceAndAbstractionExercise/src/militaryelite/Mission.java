package militaryelite;

public class Mission {
    String codeName;
    MissionState state;

    public Mission(String codeName, MissionState state) {
        this.codeName = codeName;
        this.state = state;
    }

    public void completeMission() {
        this.state = MissionState.FINISHED;
    }
}
