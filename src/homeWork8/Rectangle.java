package homeWork8;

public class Rectangle extends Shape {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        super(0, 0);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void area() {
        int area = a * b;
        System.out.println("Area of rectangle = " + area );
    }

    @Override
    public void perimeter() {
        int perimeter = 2 * (a + b);
        System.out.println("Perimeter of rectangle = " + perimeter);
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
