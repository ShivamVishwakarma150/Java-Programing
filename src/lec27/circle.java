package lec27;

class circle {
    private int radius;

    public void setRadius(int r) {
        radius = r;

    }

    public double calArea() {
        double ar = Math.PI * Math.pow(radius, 2);
        return ar;
    }

    public double calCircumfeerence() {
        double circ = 2 * Math.PI * radius;
        return circ;

    }
}
