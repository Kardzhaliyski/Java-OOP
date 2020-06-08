package collectionhierarchy.collections;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {
    public static final int MAXSIZE = 100;
    List<String> items;

    public Collection() {
        this.items = new ArrayList<>();
    }
}
