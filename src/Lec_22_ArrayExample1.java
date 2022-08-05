import java.util.Scanner;

public class Lec_22_ArrayExample1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " Values :-");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0, avg = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            avg = sum / n;
            System.out.println("Sum is : " + sum + " Avg is : " + avg);
        }
    }
}
