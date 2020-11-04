package studentsystem;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public String getStudentInfo(String name) {
        if(repo.containsKey(name)){
            return repo.get(name).toString();
        }
        return null;
    }

    public void addStudent(Student student) {
        if (!repo.containsKey(student.getName())) {
                repo.put(student.getName(), student);
            }
    }
}
