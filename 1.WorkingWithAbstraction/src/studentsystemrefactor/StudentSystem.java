package studentsystemrefactor;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public void executeCommand(StudentSystem studentSystem, String[] input) {
        if (input[0].equals("Create")) {
            executeCreateCommand(studentSystem, input);
        } else if (input[0].equals("Show")) {
            var name = input[1];
            studentSystem.printInfo(name);
        }
    }

    private void executeCreateCommand(StudentSystem studentSystem, String[] input) {
        var name = input[1];
        if (!repo.containsKey(name)) {
            var age = Integer.parseInt(input[2]);
            var grade = Double.parseDouble(input[3]);
            repo.put(name, new Student(name, age, grade));
        }
    }

    public void printInfo(String name) {
        if (repo.containsKey(name)) {
            System.out.println(repo.get(name));
        }
    }
}

