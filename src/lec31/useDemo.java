package lec31;

public class useDemo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println("Before Doubling");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        obj.doubler(arr);
        System.out.println("After Doubling");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

    }
}
