package lec30.assignment;

public class useNum {
    public static void main(String[] args) {
        Num N1 = new Num();
        Num N2 = new Num();
        Num temp = new Num();

        N1.setNum(10, 20);
        N2.setNum(30, 40);
        temp.swap(N1, N2);

        N1.showNum();
        N2.showNum();
    }
}
