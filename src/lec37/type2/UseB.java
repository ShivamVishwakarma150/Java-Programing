package lec37.type2;

class A {
    public A(int i) {
        System.out.println("In constrctor of A " + i);
    }

    public A() {

    }
}

class B extends A {
    public B(int c) {

    }
}

class C extends B {
    public C() {
        super(25);
        System.out.println("In programmer of B...");
    }
}

class UseB {
    public static void main(String[] args) {
        // C obj = new C();
    }
}
