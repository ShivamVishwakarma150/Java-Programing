package lec31.Assignment;

import java.util.Scanner;

public class UseArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter no:");
            arr[i] = sc.nextInt();
        }
        ArraySum obj = new ArraySum();
        int result;
        result = obj.calculate(arr);
        System.out.println("Sum is : " + result);
        sc.close();

    }
}
