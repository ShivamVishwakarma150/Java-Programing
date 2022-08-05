package lec28;

import java.util.Scanner;

class Account {
    private int accId;
    private String name;
    private double bal;

    public Account(int id, String str, double amt) {
        accId = id;
        name = str;
        bal = amt;
    }

    // Here default values is given by new keyword
    public void show() {
        System.out.println("acctid= " + accId + " , Name= " + name + " , Bal= " + bal);
    }
}

class UseAccount {
    public static void main(String[] args) {
        Account[] A = new Account[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("enter accid, name and bal :");
            int id = sc.nextInt();
            String str = sc.next();
            double amt = sc.nextDouble();
            A[i] = new Account(id, str, amt);
        }

        // for (int i = 0; i < 2; i++) {
        // A[i].show();
        // }

        for (Account x : A) {
            x.show();
        }

        sc.close();
    }
}