package militaryelite;

public class SpyImpl extends SoldierImpl implements Spy {
    private String codeNumber;

    public SpyImpl(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public String getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator()
                + "Code Number: " + this.codeNumber;
    }
}
