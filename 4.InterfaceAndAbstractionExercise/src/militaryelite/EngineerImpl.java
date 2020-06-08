package militaryelite;

import militaryelite.interfaces.Engineer;
import militaryelite.interfaces.Repair;

import java.util.*;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    List<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName,
                        double salary, Corps corps) {

        super(id, firstName, lastName, salary, corps);
        repairs = new ArrayList<>();
    }

    @Override
    public void addRepair(Repair repair) {
        repairs.add(repair);
    }

    @Override
    public Collection<Repair> getRepairs() {
        return repairs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator())
                .append("Repairs:");

        for (Repair repair : repairs) {
            sb.append(System.lineSeparator()).append("  ").append(repair.toString());
        }

        return sb.toString();
    }
}
