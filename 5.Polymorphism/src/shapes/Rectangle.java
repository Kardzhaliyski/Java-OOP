package shapes;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
        setPerimeter(calculatePerimeter());
        setArea(calculateArea());
    }

    public final Double getHeight() {
        return height;
    }

    public final Double getWidth() {
        return width;
    }

    @Override
    public Double calculatePerimeter() {
        return (this.height + this.width) * 2;
    }

    @Override
    public Double calculateArea() {
        return this.height * this.width;
    }
}
