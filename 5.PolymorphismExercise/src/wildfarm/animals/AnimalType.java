package wildfarm.animals;

public enum AnimalType {
    MOUSE("Mouse"),
    CAT("Cat"),
    TIGER("Tiger"),
    ZEBRA("Zebra");

    private final String typeName;

    AnimalType(String type) {
        this.typeName = type;
    }

    public String getTypeName() {
        return typeName;
    }

}
