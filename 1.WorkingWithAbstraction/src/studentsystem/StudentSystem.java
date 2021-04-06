package studentsystem;

import studentsystem.commands.Command;

public class StudentSystem {
    private StudentRepository repo;

    public StudentSystem() {
        this.repo = new StudentRepository();
    }

    public StudentRepository getRepo() {
        return this.repo;
    }

    public void ParseCommand(String[] args) {
        Command command = CommandFactory.createCommand(args[0]);
        command.execute(repo, args);
    }
}
