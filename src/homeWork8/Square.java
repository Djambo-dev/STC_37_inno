package homeWork8;

public class Square extends Rectangle {

    private int a;

    @Override
    public int getA() {
        return a;
    }

    @Override
    public void setA(int a) {
        this.a = a;
    }

    public Square(int a) {
        super(a, a);

    }

    @Override
    public void scale(int number) {
        this.a = this.a * number;

    }
}

