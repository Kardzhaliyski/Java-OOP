package militaryelite;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private Set<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        missions = new LinkedHashSet<>();
    }

    @Override
    public void addMission(Mission mission) {
        missions.add(mission);
    }

    @Override
    public Collection<Mission> getMissions() {
        return missions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString()).append(System.lineSeparator())
                .append("Missions:");

        for (Mission mission : missions) {
            sb.append(System.lineSeparator()).append(mission);
        }

        return sb.toString();
    }
}
