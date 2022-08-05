package lec41;

class Rectangle implements Figure {
    private int l, b;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return l * b;
    }

}
