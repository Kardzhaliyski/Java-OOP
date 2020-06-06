package militaryelite;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    Set<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName,
                        double salary, Corps corps, Repair... repairsAr) {

        super(id, firstName, lastName, salary, corps);
        repairs = new LinkedHashSet<>();
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
            sb.append(System.lineSeparator()).append(repair.toString());
        }
    }
}
