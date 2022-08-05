package lec37.type1;

class A {
    public A(int i) {
        System.out.println("In constrctor of A " + i);
    }

    public A() {

    }
}

class B extends A {
    public B() {

        System.out.println("In programmer of B...");
    }
}

class UseB {
    public static void main(String[] args) {
        // B obj = new B();
    }
}
