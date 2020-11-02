package figuresofstars.figures.utils;

public class StringUtils {
    private StringUtils(){}

    public static String duplicateString(String string, int numberOfTimes) {
        return String.valueOf(string).repeat(Math.max(0, numberOfTimes));
    }
}
