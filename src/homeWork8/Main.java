package homeWork8;

public class Main {
    public static void main(String[] args) {
        Ellipse ellipse = new Ellipse(3, 1);
        Circle circle = new Circle(5);
        circle.perimeter();
        ellipse.perimeter();
        Shape square = new Square(5);
        square.area();
        System.out.println(square.getX());
        Shape cirlce = new Circle(25, 1, 1);
        System.out.println(cirlce.getX());

        cirlce.moveCenter(2, 2);
        System.out.println(cirlce.getX());
        System.out.println(square.getX());
        square.moveCenter(2 ,2);
        System.out.println(square.getX());
        Movable rectangle = new Rectangle(10, 25);
        System.out.println(rectangle);
    }
}
