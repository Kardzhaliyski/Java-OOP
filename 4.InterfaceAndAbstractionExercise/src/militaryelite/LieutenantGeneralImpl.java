package militaryelite;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral{
    Map<Integer, Private> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        privates = new LinkedHashMap<>();
    }


    @Override
    public void addPrivate(Private priv) {
        privates.putIfAbsent(priv.getId(),priv);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator());
        sb.append("Privates:");
        for (Private aPrivate : privates.values()) {
            sb.append(System.lineSeparator()).append(aPrivate.toString());
        }

        return sb.toString();
    }
}
