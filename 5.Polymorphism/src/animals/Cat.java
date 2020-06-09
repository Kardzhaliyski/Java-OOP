package animals;

public class Cat extends Animal {
    public static String VOICE = "MEEOW";

    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s%n%s",
                this.getName(),
                this.getFavouriteFood(),
                this.voice());
    }




    @Override
    protected String voice() {
        return this.VOICE;
    }
}
