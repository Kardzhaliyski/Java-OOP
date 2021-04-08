package jediGalaxy;

public class Jedi {
    private Galaxy galaxy;
    private long power;

    public Jedi(Galaxy galaxy) {
        this.galaxy = galaxy;
        this.power = 0;
    }

    public void collectPower(int x, int y) {
        while (x >= 0 && y < galaxy.getHorizontalSize()) {
            if (galaxy.contains(x,y)) {
                this.power += galaxy.collectPower(x,y);
            }

            y++;
            x--;
        }
    }

    public long getPower() {
        return this.power;
    }
}
