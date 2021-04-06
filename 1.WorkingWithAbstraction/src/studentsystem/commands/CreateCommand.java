package studentsystem.commands;

import studentsystem.Student;
import studentsystem.StudentRepository;

public class CreateCommand implements Command {

    @Override
    public void execute(StudentRepository repo, String[] args) {
        var name = args[1];
        var age = Integer.parseInt(args[2]);
        var grade = Double.parseDouble(args[3]);
        if (!repo.containsStudentByName(name))
        {
            var student = new Student(name, age, grade);
            repo.registerStudent(name,student);
        }
    }
}
