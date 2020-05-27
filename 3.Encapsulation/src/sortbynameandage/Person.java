package sortbynameandage;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = 0;
    }

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        if (getAge() >= 30) {
            this.setSalary(this.getSalary() * 1.2);
        } else {
            this.setSalary(this.getSalary() * 1.1);
        }
    }

    @Override
    public int compareTo(Person o) {
        int sComp = this.getFirstName().compareTo(o.getFirstName());

        if (sComp != 0) {
            return sComp;
        } else {
            return Integer.compare(this.getAge(), o.getAge());
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva",
                this.firstName, this.lastName, this.salary);
    }
}
