package homeWork8;

public class Ellipse extends Shape {

    public static final double PI = 3.14;
    private int a;
    private int b;

    public Ellipse(int a, int b) {
        super(0, 0, a, b);
        this.a = a;
        this.b = b;
    }
    public Ellipse(int a, int b, int x, int y) {
        super(x, y,a,b);

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


}
