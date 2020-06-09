package shapes;

public class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
        setPerimeter(calculatePerimeter());
        setArea(calculateArea());
    }

    public final Double getRadius() {
        return radius;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}
