package lec44.Demo2;

import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter fist No:");
            int a = sc.nextInt();
            System.out.println("enter sec no");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("div is" + c);
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0");
        } finally {
            System.out.println("have a Good Day!!");
        }
        System.out.println("BYE");
        sc.close();
    }
}
