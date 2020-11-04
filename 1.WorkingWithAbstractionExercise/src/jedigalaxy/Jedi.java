package jedigalaxy;

public class Jedi {
    private long power;
    private final Galaxy galaxy;

    public Jedi(Galaxy galaxy) {
        power = 0L;
        this.galaxy = galaxy;
    }

    public long getPowerAmount() {
        return this.power;
    }


    public void collectPower(int row, int col) {
        if(!insideTheGalaxy(row, col)) {
            int[] newLocation = travelToTheGalaxy(row, col);
            row = newLocation[0];
            col = newLocation[1];
        }

        while (canMove(row, col)) {
            this.power += galaxy.collectPowerFromStar(row,col);
            row--;
            col++;
        }
    }

    private int[] travelToTheGalaxy(int row, int col) {
        long tempRow = row;
        long tempCol = col;

        if(tempRow >= galaxy.getLength()) {
            long difference = tempRow - galaxy.getLength() + 1;
            tempRow = tempRow - difference;
            tempCol = tempCol + difference;
        }

        if(tempCol < 0) {
            long difference = tempCol * -1;
            tempCol = 0;
            tempRow = tempRow - difference;
        }

        int[] newLocation = new int[2];

        if(tempRow < Integer.MIN_VALUE || tempCol > Integer.MAX_VALUE) {
            tempCol = -1;
            tempRow = -1;
        }


        newLocation[0] = (int)tempRow;
        newLocation[1] = (int)tempCol;

        return newLocation;
    }

    private boolean canMove(int row, int col) {
        return row >= 0 && row < galaxy.getLength() && col < galaxy.getWidth() && col >= 0;
    }

    private boolean insideTheGalaxy(int row, int col) {
        return row >= 0 && row < galaxy.getLength() &&
                col >= 0 && col < galaxy.getWidth();
    }
}
