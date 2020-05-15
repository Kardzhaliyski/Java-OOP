package reusingclasses;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {

//    public RandomArrayList() {
//        list = new ArrayList<T>();
//    }

    public T getRandomElement(){
        return super.remove(getRandomIndex());
    }

    private int getRandomIndex() {
        Random random = new Random();
        return random.nextInt(super.size());
    }


}
