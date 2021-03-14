package homeWork8;

public abstract class Shape implements Scalable, Movable{


    public abstract void area();
    public abstract void perimeter();

    public Shape(double x, double y, int a, int b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    private double x;
    private double y;
    protected int a;
    protected int b;

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void moveCenter(int xMove, int yMove) {
        this.setX(this.getX() + xMove);
        this.setY(this.getY() + yMove);
    }
    @Override
    public void scale(int number) {
        this.a = this.a * number;
        this.b = this.b * number;
    }
}
