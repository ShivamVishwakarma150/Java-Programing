package lec36;

public class UseManager {
    public static void main(String[] args) {
        Manager boss;
        boss = new Manager();

        boss.setData("Ashish", 70000);

        System.out.println("Manager's name :" + boss.getName());

        System.out.println("Manager's totsl Income:" + boss.getIncome());
    }
}
