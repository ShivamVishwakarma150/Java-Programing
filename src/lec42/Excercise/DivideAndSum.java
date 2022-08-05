package lec42.Excercise;

import java.util.InputMismatchException;
import java.util.Scanner;

class DivideAndSum {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = 0, b = 0;
        try {
            System.out.println("Enter two numbers");
            a = kb.nextInt();
            b = kb.nextInt();
            int c = a / b;
            System.out.println("Division is " + c);
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0");
        } catch (InputMismatchException ex) {
            System.out.println("Please enter integers only");
            System.exit(0);
        }
        int d = a + b;
        System.out.println("Sum is " + d);
        kb.close();
    }
}