package animals;

import java.security.InvalidParameterException;

public class Utils {
    public static Animal animalParse(String type, String... animalData) {
        String name = animalData[0];
        int age = Integer.parseInt(animalData[1]);
        String gender = "";
        if(animalData.length > 2) {
            gender = animalData[2];
        }

        switch (type) {
            case "Dog": {
                return new Dog(name, age, gender);
            } case "Frog": {
                return new Frog(name, age, gender);
            } case "Cat": {
                return new Cat(name, age, gender);
            } case "Kitten": {
                return new Kitten(name, age);
            } case "Tomcat": {
                return new Tomcat(name, age);
            }
        }

        throw new InvalidParameterException("Invalid input!");
    }
}
