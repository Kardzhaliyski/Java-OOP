package animals;

public class Cat extends Animal{
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return "Meow meow";
    }

    @Override
    public String getTypeName() {
        return "Cat";
    }
}
