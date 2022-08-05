package lec38;

class Circle {
    private int radius;

    public Circle(int radius) {
        // your code
        this.radius = radius;
    }

    public double area() {
        // your code
        return Math.PI * Math.pow(radius, 2);
    }

    public int getRadius() {
        // your code
        return radius;
    }
}

class Cylinder extends Circle {
    private int height;

    // Initialize
    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    // Area
    public double area() {
        return 2 * super.area() + 2 * Math.PI * getRadius() * height;
    }

    // Volume
    public double volume() {
        return super.area() * height;
    }
}
