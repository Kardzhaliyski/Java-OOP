package collectionhierarchy.collections;

import collectionhierarchy.interfaces.MyList;

public class MyListImpl extends Collection implements MyList {
    @Override
    public int getUsed() {
        return items.size();
    }

    @Override
    public String remove() {
        return items.remove(0);
    }

    @Override
    public int add(String element) {
        items.add(0, element);
        return 0;
    }
}
