package pointinrectangle;

public class Rectangle {
    private Point bottomLeftPoint;
    private Point topRightPoint;

    public Rectangle(Point bottomLeftPoint, Point topRightPoint) {
        this.bottomLeftPoint = bottomLeftPoint;
        this.topRightPoint = topRightPoint;
    }

    public boolean contains(Point point) {
        return insideFromTop(point) && insideFromRight(point)
                && insideFromBottom(point) && insideFromLeft(point);
    }

    private boolean insideFromTop(Point point) {
        return this.topRightPoint.getY() >= point.getY();
    }

    private boolean insideFromRight(Point point) {
        return this.topRightPoint.getX() >= point.getX();
    }

    private boolean insideFromBottom(Point point) {
        return this.bottomLeftPoint.getY() <= point.getY();
    }

    private boolean insideFromLeft(Point point) {
        return this.bottomLeftPoint.getX() <= point.getX();
    }
}
