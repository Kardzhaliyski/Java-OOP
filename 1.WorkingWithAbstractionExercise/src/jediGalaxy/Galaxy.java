package jediGalaxy;

public class Galaxy {
    private final int[][] galaxy;

    public Galaxy(int verticalSize, int horizontalSize) {
        this.galaxy = new int[verticalSize][horizontalSize];
        populateGalaxy();
    }

    private void populateGalaxy() {
        int value = 0;
        int totalRows = galaxy.length;
        int totalCols = galaxy[0].length;
        for (int row = 0; row < totalRows; row++)
        {
            for (int col = 0; col < totalCols; col++)
            {
                galaxy[row][col] = value++;
            }
        }
    }

    public boolean contains(int x, int y) {
        return x >= 0 &&  x < this.getVerticalSize() && y >= 0 && y < this.getHorizontalSize();
    }

    public void set(int x, int y, int newValue) {
        galaxy[x][y] = newValue;
    }

    public int getHorizontalSize() {
            return galaxy[0].length;
    }

    public int getVerticalSize() {
        return galaxy.length;
    }

    public int collectPower(int x, int y) {
        return galaxy[x][y];
    }
}
