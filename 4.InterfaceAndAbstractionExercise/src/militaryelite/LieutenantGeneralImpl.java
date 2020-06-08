package militaryelite;

import militaryelite.interfaces.LieutenantGeneral;
import militaryelite.interfaces.Private;

import java.util.*;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    Map<Integer, Private> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        privates = new TreeMap<>(Collections.reverseOrder());
    }


    @Override
    public void addPrivate(Private priv) {
        privates.putIfAbsent(priv.getId(),priv);
    }

    @Override
    public Map<Integer, Private> getPrivates() {
        return privates;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator());
        sb.append("Privates:");
        for (Private aPrivate : privates.values()) {
            sb.append(System.lineSeparator()).append("  ").append(aPrivate.toString());
        }

        return sb.toString();
    }
}
