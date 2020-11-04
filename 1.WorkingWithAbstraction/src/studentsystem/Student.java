package studentsystem;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        setName(name);
        setAge(age);
        setGrade(grade);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return this.grade;
    }

    private void setGrade(double grade) {
        this.grade = grade;
    }

    private String getDescription() {
        if (this.getGrade() >= 5.00) {
            return  "Excellent student.";
        } else if (this.getGrade() >= 3.50) {
            return  "Average student.";
        } else {
            return  "Very nice person.";
        }
    }

    @Override
    public String toString() {
        return String.format("%s is %s years old. %s",
                this.getName(), this.getAge(), this.getDescription());
    }
}
