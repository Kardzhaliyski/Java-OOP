package rhombusofstars;

public class Rhombus {
    private int size;

    public Rhombus(int size) {
        setSize(size);
    }

    private void setSize(int size) {
        if (size < 1) {
            throw new IllegalArgumentException("Size must be > 0 : " + size);
        }

        this.size = size;
    }

    @Override
    public String toString() {
        int totalRows = size * 2 - 1;
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < totalRows; row++) {
            sb.append(printRow(row)).append(System.lineSeparator());
        }

        return sb.toString().stripTrailing();
    }

    private String printRow(int row) {
        StringBuilder sb = new StringBuilder();

        int whiteSpaceCount = Math.abs(this.size - (row + 1));
        int starsCount = size - whiteSpaceCount;

        sb.append(" ".repeat(whiteSpaceCount));
        sb.append("* ".repeat(starsCount));

        return sb.toString().stripTrailing();
    }

}
