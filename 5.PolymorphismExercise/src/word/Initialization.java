package word;

public class Initialization {

    private Initialization() {
    }

    public static CommandImpl buildCommandInterface(StringBuilder text) {
        CommandImpl textHolder = new CommandImpl(text);
        textHolder.init();
        return textHolder;
    }

}
