package employees;

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
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        try {
            this.validateName(firstName);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("First " + e.getMessage());
        }

        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        try {
            validateName(lastName);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Last " + e.getMessage());
        }

        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        validateSalary(salary);
        this.salary = salary;
    }

    private void validateName(String name) {
        if (name.length() < 3) throw new IllegalArgumentException("name cannot be less then 3 symbols");
    }

    private void validateAge(int age) {
        if (age <= 0) throw new IllegalArgumentException("Age cannot be zero or negative integer");
    }

    private void validateSalary(double salary) {
        if (salary < 460) throw new IllegalArgumentException("Salary cannot be less then 460 leva");
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
