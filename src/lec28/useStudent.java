package lec28;

class Student {
    private int roll;
    private String name;
    private double per;

    public Student() {
        System.out.println("Constructor calledd ... ");
        roll = 10;
        name = new String("Amit");
        per = 67.8;
    }

    // Here default values is given by new keyword
    public void show() {
        System.out.println("Roll= " + roll + " , Name= " + name + " , Per= " + per);
    }
}

class UseStudent {
    public static void main(String[] args) {
        Student obj;
        obj = new Student();
        obj.show();
    }
}