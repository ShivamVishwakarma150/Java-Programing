import java.util.Scanner;

class Student2 {
    private int roll;
    private String name;
    private double per;

    public void setStudent(int r, String n, double p) {

        roll = r;
        name = n;
        per = p;

    }

    public void showStudent() {
        System.out.println("Roll=" + roll + ",Grade=" + name + ",Per=" + per);
    }
}

public class Lec_26_useStudent1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll,name,and per : ");
        int r = sc.nextInt();
        String n = sc.next();
        double p = sc.nextDouble();
        Student2 obj = new Student2();
        obj.setStudent(r, n, p);
        obj.showStudent();
        sc.close();
    }
}
