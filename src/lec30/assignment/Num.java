package lec30.assignment;

class Num {
    private int a, b;

    public void setNum(int i, int j) {
        a = i;
        b = j;
    }

    public void swap(Num P, Num Q) {
        int x;
        x = P.a;
        P.a = Q.a;
        Q.a = x;

        x = P.b;
        P.b = Q.b;
        Q.b = x;
    }

    public void showNum() {
        System.out.println("a:-" + a + ",b=" + b);
    }
}
