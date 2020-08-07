package utilities.loggers.enums;

public enum LayoutTypes {
    SIMPLE("SimpleLayout"),
    XML("XmlLayout"),
    TEST("TestLayout");

    private final String name;

    LayoutTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
