package greedytimes;

public class Identifier {
    private Identifier() {
    }

    public static boolean isGold(String name) {
        return name.equalsIgnoreCase("Gold");
    }

    public static boolean isGem(String name) {
        return name.length() >= 4 && name.substring(name.length() - 3).equalsIgnoreCase("gem");
    }

    public static boolean isCash(String name) {
        return name.length() == 3;
    }
}
