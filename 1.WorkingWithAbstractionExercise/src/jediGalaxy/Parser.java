package jediGalaxy;

import java.util.Arrays;

public class Parser {
    public static int[] stringToIntArr(String string) {
        return Arrays.stream(string.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
