package lec35.type2;

class Box {
    private int l, b, h;

    public Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public Box(int a) {
        this(a, a, a);
    }

    public Box() {
        this(0, 0, 0);
    }

    public void show() {
        System.out.println(l + " " + b + " " + h);
    }
}

public class UseBox {
    public static void main(String[] args) {
        Box B1 = new Box(10);
        Box B2 = new Box(5, 6, 7);
        Box B3 = new Box();
        B1.show();
        B2.show();
        B3.show();

    }
}
