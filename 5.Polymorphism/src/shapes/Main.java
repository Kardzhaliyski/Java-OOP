package shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        Rectangle rectangle = new Rectangle(6.0 , 6.0);

        System.out.println("Circle:");
        System.out.println(String.format("  Area: %.2f" , circle.calculateArea()));
        System.out.println(String.format("  Perimeter: %.2f" , circle.calculatePerimeter()));

        System.out.println("Rectangle:");
        System.out.println("  Area: " + rectangle.calculateArea());
        System.out.println("  Perimeter: " + rectangle.calculatePerimeter());

    }
}
