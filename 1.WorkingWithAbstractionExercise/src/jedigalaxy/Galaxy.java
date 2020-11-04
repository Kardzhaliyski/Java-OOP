package jedigalaxy;

public class Galaxy {
    private int[][] galaxy;

    public Galaxy(int row, int col) {
        this.galaxy = new int[row][col];
        populateGalaxy();
    }

    private void populateGalaxy() {
        for (int row = 0; row < galaxy.length; row++) {
            for (int col = 0; col < galaxy[row].length; col++) {
                galaxy[row][col] = row * galaxy[row].length + col;
            }
        }
    }

    public void print() {
        for (int row = 0; row < galaxy.length; row++) {
            for (int col = 0; col < galaxy[row].length; col++) {
                System.out.print(galaxy[row][col] + " ");
            }
            System.out.println();
        }
    }

    public int getLength() {
        return galaxy.length;
    }

    public int getWidth() {
        return galaxy[0].length;
    }

    public int collectPowerFromStar(int row, int col) {
        return galaxy[row][col];
    }

    public void destroyStar(int row, int col) {
        if (row < 0
                || col < 0
                || row >= galaxy.length
                || col >= galaxy[0].length
        ) {
            return;
        }
            galaxy[row][col] = 0;
    }
}
