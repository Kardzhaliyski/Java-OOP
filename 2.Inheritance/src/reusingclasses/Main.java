package reusingclasses;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<String> list = new RandomArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        System.out.println(list.getRandomElement());
        System.out.println(list.getRandomElement());
        System.out.println(list.getRandomElement());
        System.out.println(list.getRandomElement());
        System.out.println(list.getRandomElement());
        System.out.println(list.getRandomElement());
        System.out.println(list.getRandomElement());
        System.out.println(list.getRandomElement());
        System.out.println(list.getRandomElement());

        for (String s : list) {
            System.out.println(s);
        }

    }
}
