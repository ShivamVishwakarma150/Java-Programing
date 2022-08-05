package lec39.Demo1;

class TestPoly {
    public static void main(String[] args) {
        A ref;
        ref = new A();

        // Here show ko ham polymorphism behavior karenge
        ref.show();
        ref.display();

        ref = new B();
        ref.show();
        ref.display();
    }
}
