package collectionhierarchy.collections;

import collectionhierarchy.interfaces.Addable;

public class AddCollection extends Collection implements Addable {

    @Override
    public int add(String element) {
        items.add(element);
        return items.size() - 1;
    }
}
