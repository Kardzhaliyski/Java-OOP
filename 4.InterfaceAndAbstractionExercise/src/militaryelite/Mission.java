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

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s",
                this.codeName, this.state.getLable());
    }
}
