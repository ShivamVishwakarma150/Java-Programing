package lec41;

class UseFigure {
    public static void main(String[] args) {
        Figure F;
        F = new Circle(10.0);

        System.out.println("Figure is " + F.getName());
        System.out.println("Area:" + F.getArea());

        F = new Rectangle(5, 9);

        System.out.println("Figure is " + F.getName());
        System.out.println("Area:" + F.getArea());

    }
}

// Here line 8,9 and 13,14 shows run time polymorphism