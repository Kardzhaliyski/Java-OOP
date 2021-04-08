package jediGalaxy;

public class Evil {
    private final Galaxy galaxy;

    public Evil(Galaxy galaxy) {
        this.galaxy = galaxy;
    }

    public void destroy(int x, int y) {
        while (x >= 0 && y >= 0) {
            if(galaxy.contains(x,y)) {
                galaxy.set(x,y,0);
            }

            x--;
            y--;
        }
    }
}
