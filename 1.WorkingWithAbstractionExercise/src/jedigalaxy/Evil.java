package jedigalaxy;

public class Evil {
    private Galaxy galaxy;

    public Evil(Galaxy galaxy) {
        this.galaxy = galaxy;
    }

    public void destroyStars(int row, int col) {
        if(!insideTheGalaxy(row, col)) {
            int[] newLocation = travelToTheGalaxy(row, col);
            row = newLocation[0];
            col = newLocation[1];
        }

        while (canMove(row, col)) {
            galaxy.destroyStar(row, col);
            row--;
            col--;
        }
    }

    private boolean insideTheGalaxy(int row, int col) {
        return row >= 0 && row < galaxy.getLength() &&
                col >= 0 && col < galaxy.getWidth();
    }


    private int[] travelToTheGalaxy(int row, int col) {
        long tempRow = row;
        long tempCol = col;

        if (tempRow >= galaxy.getLength()) {
            long difference = (tempRow - galaxy.getLength()) + 1;
            tempRow = tempRow - difference;
            tempCol = tempCol - difference;
        }

        if (tempCol >= galaxy.getWidth()) {
            long difference = (tempCol - galaxy.getWidth()) + 1;
            tempRow = tempRow - difference;
            tempCol = tempCol - difference;
        }

        int[] newLocation = new int[2];
        if (tempRow < Integer.MIN_VALUE || tempCol < Integer.MIN_VALUE) {
            tempCol = -1;
            tempRow = -1;
        }

        newLocation[0] = (int)tempRow;
        newLocation[1] = (int)tempCol;
        return newLocation;
    }

    private boolean canMove(int row, int col) {
        return row >= 0 && col >= 0 && row < galaxy.getLength() && col < galaxy.getWidth();
    }
}

