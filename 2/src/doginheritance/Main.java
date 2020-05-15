package doginheritance;

public class Main {
    public static void main(String[] args) {
        var ani = new Puppy();
        ani.eat();
        ani.bark();
//        ani.weep();
        var caty = new Cat();
        caty.eat();
        caty.meow();
    }
}
