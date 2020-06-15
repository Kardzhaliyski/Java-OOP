package utilities.loggers.enums;

public enum AppenderType {
    FILE("FileAppender"),
    CONSOLE("ConsoleAppender");

    private final String name;

    AppenderType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
