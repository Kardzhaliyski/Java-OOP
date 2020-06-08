package militaryelite.interfaces;

import militaryelite.MissionState;

public interface Mission {
    String getCodeName();
    MissionState getState();
    void completeMission();

}
