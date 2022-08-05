package lec32;

import java.util.Scanner;

public class UseArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Please enter 5 int:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ArraySum obj = new ArraySum();

        double[] result;
        result = obj.calculate(arr);
        System.out.println("Sum is : " + result[0]);
        System.out.println("Avg is : " + result[1]);
        sc.close();
    }
}
