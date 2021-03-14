package homeWork8;

public class Rectangle extends Shape {



    public Rectangle(int a, int b) {
        super(0, 0, a,b );

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




}
