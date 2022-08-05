package lec42;

import java.util.InputMismatchException;
import java.util.Scanner;

class DivideAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fist No:");
        int a = sc.nextInt();
        System.out.println("enter sec no");
        int b = 0;

        try {
            b = sc.nextInt();
            int c = a / b;
            System.out.println("div is" + c);
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0");
        } catch (InputMismatchException ex2) {
            System.out.println("Please Input Digits Only");
        }

        int d = a + b;
        System.out.println("Sum is : " + d);
        sc.close();
    }
}
