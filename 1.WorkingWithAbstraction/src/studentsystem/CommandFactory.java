package studentsystem;

import studentsystem.commands.Command;
import studentsystem.commands.CreateCommand;
import studentsystem.commands.ShowCommand;

import java.security.InvalidParameterException;

public class CommandFactory {
    public static Command createCommand(String commandType) {
        switch (commandType){
            case "Create": {
                return new CreateCommand();
            }
            case "Show": {
                return new ShowCommand();
            }
        }

        throw new InvalidParameterException("Invalid Command Type for:" + commandType);
    }
}
