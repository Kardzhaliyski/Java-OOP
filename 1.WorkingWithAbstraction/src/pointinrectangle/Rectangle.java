package pointinrectangle;



public class Rectangle {
    private Point2D firstPoint;
    private Point2D secondPoint;

    public Rectangle(Point2D first, Point2D second) {
        this.firstPoint = first;
        this.secondPoint = second;
    }

    public boolean containsPoint(Point2D point) {
        return containsPointInHorizontalAxis(point) && containsPointInVerticalAxis(point);
    }

    private boolean containsPointInHorizontalAxis(Point2D point) {
        return Math.min(firstPoint.getX(), secondPoint.getX()) <= point.getX() &&
                Math.max(firstPoint.getX(), secondPoint.getX()) >= point.getX();
    }

    private boolean containsPointInVerticalAxis(Point2D point) {
        return Math.min(firstPoint.getY(), secondPoint.getY()) <= point.getY() &&
                Math.max(firstPoint.getY(), secondPoint.getY()) >= point.getY();
     }
}
