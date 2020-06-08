package militaryelite;

import militaryelite.interfaces.Mission;

public class MissionImpl implements Mission {
    String codeName;
    MissionState state;

    public MissionImpl(String codeName, MissionState state) {
        this.codeName = codeName;
        this.state = state;
    }

    @Override
    public void completeMission() {
        this.state = MissionState.FINISHED;
    }

    @Override
    public String getCodeName() {
        return codeName;
    }

    @Override
    public MissionState getState() {
        return state;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s",
                this.codeName, this.state.getName());
    }

    public static boolean validMissionName(String missionName) {
        for (MissionState value : MissionState.values()) {
            if (value.getName().equals(missionName)) {
                return true;
            }
        }
        return false;
    }
}
