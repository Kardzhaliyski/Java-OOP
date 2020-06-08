package militaryelite;

import militaryelite.interfaces.Commando;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private Set<MissionImpl> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        missions = new LinkedHashSet<>();
    }

    @Override
    public void addMission(MissionImpl mission) {
        missions.add(mission);
    }

    @Override
    public Collection<MissionImpl> getMissions() {
        return missions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString()).append(System.lineSeparator())
                .append("Missions:");

        for (MissionImpl mission : missions) {
//            if(mission.state.equals(MissionState.INPROGRESS)) {
                sb.append(System.lineSeparator()).append("  ").append(mission);
//            }
        }

        return sb.toString();
    }
}
