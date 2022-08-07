package lec44.Demo3;

import java.util.Scanner;

class NegativeNumeratorException extends Exception {
    public NegativeNumeratorException(String str) {
        super(str);
    }
}

class CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter 2 int:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a <= 0) {
                NegativeNumeratorException obj = new NegativeNumeratorException("Numerator must be positive");

                throw obj;

            }
            int c = a / b;
            System.out.println("Div is : " + c);

        }
        // Multicatch Exception Handling
        catch (ArithmeticException | NegativeNumeratorException e) {
            System.out.println(e.getMessage());
        }

    }
}
