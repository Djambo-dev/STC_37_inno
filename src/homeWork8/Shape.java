package homeWork8;

public abstract class Shape implements Scalable, Movable{


    public abstract void area();
    public abstract void perimeter();

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private double x;
    private double y;

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
}
