import java.util.Scanner;

public class Lec_24_userInputIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        System.out.println("Enter row and col size");
        r = sc.nextInt();
        c = sc.nextInt();
        int i, j;
        int[][] arr = new int[r][c];
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print("Enter no :");
                arr[i][j] = sc.nextInt();

            }

        }
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

        }
    }
}