package studentsystem;

import java.util.HashMap;
import java.util.Map;

public class StudentRepository {
    private Map<String, Student> students;

    public StudentRepository()
    {
        this.students = new HashMap<>();
    }

    public void registerStudent(String name, Student student) {
        this.students.put(name, student);
    }

    public boolean containsStudentByName(String name) {
        return students.containsKey(name);
    }

    public Student findOneByName(String name) {
        return students.get(name);
    }
}
