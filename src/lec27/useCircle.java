package lec27;

import java.util.Scanner;

class useCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle obj = new circle();
        System.out.println("Enter Radius : ");
        int r = sc.nextInt();
        obj.setRadius(r);

        System.out.println("Area is : " + obj.calArea());
        System.out.println("Circumference is :" + obj.calCircumfeerence());

        sc.close();

    }
}
