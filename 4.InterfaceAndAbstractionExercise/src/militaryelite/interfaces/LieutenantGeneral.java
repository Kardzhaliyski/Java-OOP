package militaryelite.interfaces;

import java.util.Map;

public interface LieutenantGeneral extends Private {
    void addPrivate(Private priv);
     Map<Integer, Private> getPrivates();
}
