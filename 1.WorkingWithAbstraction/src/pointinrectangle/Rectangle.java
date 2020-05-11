package pointinrectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point toCheck) {
        if (toCheck.getX() < bottomLeft.getX() || toCheck.getX() > topRight.getX()) {
            return false;
        }
        if (toCheck.getY() < bottomLeft.getY() || toCheck.getY() > topRight.getY()) {
            return false;
        }

        return true;
    }


}
