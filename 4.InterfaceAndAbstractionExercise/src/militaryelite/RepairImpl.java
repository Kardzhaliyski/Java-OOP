package militaryelite;

import militaryelite.interfaces.Repair;

public class RepairImpl implements Repair {
    String partName;
    int hoursWorked;

    public RepairImpl(String partName, int hoursWorked) {
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getPartName() {
        return partName;
    }

    @Override
    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("Part Name: %s Hours Worked: %d",
                this.partName, this.hoursWorked);
    }
}
