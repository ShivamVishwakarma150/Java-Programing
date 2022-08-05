package lec31.Assignment;

public class ArraySum {
    public int calculate(int[] brr) {
        int sum = 0;
        for (int x : brr) {
            sum = sum + x;
        }
        return sum;
    }

}
