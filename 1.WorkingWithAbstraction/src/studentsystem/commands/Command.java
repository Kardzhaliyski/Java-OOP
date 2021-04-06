package studentsystem.commands;

import studentsystem.StudentRepository;

public interface Command {
    void execute(StudentRepository repository, String[] args);
}
