package homeWork8;

public class Circle extends Ellipse {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void scale(int number) {
        this.radius = this.radius * number;

    }

    public Circle(int radius) {
        super(2 * radius, 2 * radius);
        this.radius = radius;
    }

    public Circle(int radius, int x, int y) {
        super(2 * radius, 2 * radius, x, y);
        this.radius = radius;
    }

    @Override
    public void area() {
        double area = PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }

    @Override
    public void perimeter() {
        double perimeter = 2 * PI * radius;
        System.out.println("Perimeter of Circle = " + perimeter);
    }
}
