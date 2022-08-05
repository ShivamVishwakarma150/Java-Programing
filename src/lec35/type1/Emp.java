package lec35.type1;

class Emp {
    // instance variable or Data Member
    private int age;
    private String name;
    private double sal;

    public void setEmp(int a, String n, double s) {
        age = a;
        name = n;
        sal = s;
    }

    public void displayEmp() {
        System.out.println(age + "," + name + ',' + sal);
    }
}