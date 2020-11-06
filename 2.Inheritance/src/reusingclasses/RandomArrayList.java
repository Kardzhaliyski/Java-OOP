package reusingclasses;

import java.util.ArrayList;
import java.util.Random;

public class  RandomArrayList<T> extends ArrayList<T> {
    private Random random ;

    public RandomArrayList() {
        super();
        this.random = new Random();
    }

    public T getRandomElement() {
        if(super.isEmpty()) {
            throw new IndexOutOfBoundsException("List must not be empty!");
        }
        return super.remove(random.nextInt(super.size()));
    }
}
