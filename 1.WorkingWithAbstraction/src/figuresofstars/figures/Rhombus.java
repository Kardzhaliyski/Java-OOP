package figuresofstars.figures;

import figuresofstars.figures.utils.StringUtils;

public class Rhombus implements Figure {
    private int size;

    public Rhombus(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return getTopPartString()  + getBottomPartString();
    }

    private String getBottomPartString() {
        StringBuilder sb = new StringBuilder();

        for (int i = size - 1; i > 0; i--) {
            sb.append(StringUtils.duplicateString(" ", size - i + 1))
                    .append(StringUtils.duplicateString("* ", i))
                    .append(System.lineSeparator());
        }

        return sb.toString();
    }

    private String getTopPartString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            sb.append(StringUtils.duplicateString(" ", size - i))
                    .append(StringUtils.duplicateString("* ", (i + 1)))
                    .append(System.lineSeparator());
        }

        return sb.toString();
    }


}
