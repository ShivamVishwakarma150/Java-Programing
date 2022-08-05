package lec38;

public class UseCylinder {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder(10, 20);

        System.out.println("Area of Cylinder :" + obj.area());
        System.out.println("Vol of Cylinder:" + obj.volume());
    }
}
