package militaryelite.interfaces;

import militaryelite.MissionImpl;

import java.util.Collection;

public interface Commando extends SpecialisedSoldier {
    void addMission(MissionImpl mission);
    Collection<MissionImpl> getMissions();
}
