package figuresofstars.figures;

import figuresofstars.figures.utils.StringUtils;

public class Square implements Figure {

    private final int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return (getHorizontalSide() + System.lineSeparator()
                + (size >= 3 ? getMiddlePart() + System.lineSeparator() : "")
                + (size >= 2 ? getHorizontalSide() : ""))
                .trim();
    }

    private String getHorizontalSide() {
        return StringUtils.duplicateString("* ", size);
    }

    private String getMiddlePart() {
        return StringUtils.duplicateString((getMiddleRow() + System.lineSeparator() )
                , size - 2).trim();
    }

    private String getMiddleRow() {
        return "* " +  StringUtils.duplicateString("  ", size - 2) + "*";
    }


}
