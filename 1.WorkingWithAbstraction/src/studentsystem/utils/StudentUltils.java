package studentsystem.utils;

import studentsystem.Student;

public class StudentUltils {
    private StudentUltils() {
    }

    public static Student parseStudent(String[] studentData) {
        String name = studentData[1];
        int age = Integer.parseInt(studentData[2]);
        double grade = Double.parseDouble(studentData[3]);

        return new Student(name, age, grade);
    }
}
