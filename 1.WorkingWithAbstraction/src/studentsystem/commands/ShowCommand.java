package studentsystem.commands;

import studentsystem.Student;
import studentsystem.StudentRepository;

public class ShowCommand implements Command {

    @Override
    public void execute(StudentRepository repo, String[] args) {

        var name = args[1];
        if (repo.containsStudentByName(name))
        {
            Student student = repo.findOneByName(name);
            String view = String.format("%s is %s years old.",student.getName(),student.getAge());

            if (student.getGrade() >= 5.00)
            {
                view += " Excellent student.";
            }
            else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50)
            {
                view += " Average student.";
            }
            else
            {
                view += " Very nice person.";
            }

            System.out.println(view);
        }
    }
}
