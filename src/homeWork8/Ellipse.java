package homeWork8;

public class Ellipse extends Shape {

    public static final double PI = 3.14;
    private double a;
    private double b;

    public Ellipse(double a, double b) {
        super(0, 0);
        this.a = a;
        this.b = b;
    }
    public Ellipse(double a, double b, double x, double y) {
        super(x, y);
        this.a = a;
        this.b = b;
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public void area() {
    double area = PI * a * b;
        System.out.println("Area of Ellipse = " + area);
    }

    @Override
    public void perimeter() {
        double perimeter = 4 * ((PI * a * b) + (a - b)) / (a + b);
        System.out.println("Perimeter of Ellipse = " + perimeter);
    }

    @Override
    public void scale(int number) {
        this.a = this.a * number;
        this.b = this.b * number;
    }

    @Override
    public void moveCenter(int xMove, int yMove) {
    super.setX(super.getX() + xMove);
    super.setY(super.getY() + yMove);
    }
}
