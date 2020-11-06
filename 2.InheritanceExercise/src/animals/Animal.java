package animals;

import java.security.InvalidParameterException;

public abstract class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public abstract String produceSound();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name.length() == 0) {
            throw new InvalidParameterException("Invalid input!");
        }

        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if(age < 0) {
            throw new InvalidParameterException("Invalid input!");
        }

        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        if(!gender.equals("Female") && !gender.equals("Male")) {
            throw new InvalidParameterException("Invalid input!");
        }

        this.gender = gender;
    }

    public abstract String getTypeName();

    @Override
    public String toString() {
        return this.getTypeName() + System.lineSeparator()
                + String.format("%s %s %s",
                    this.getName(), this.getAge(), this.getGender()) + System.lineSeparator()
                + produceSound();
    }
}
