package lec41;

class Circle implements Figure {
    private double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    public String getName() {
        return "Circle";
    }

    public double getArea() {
        return Math.PI * Math.pow(rad, 2);
    }
}
