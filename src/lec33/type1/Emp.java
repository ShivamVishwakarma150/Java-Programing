package lec33.type1;

class Emp {
    private int age;
    private String name;
    private int id;
    private static int nextId = 1;

    public Emp(int a, String n) {
        age = a;
        name = n;
        id = nextId++;
    }

    public void show() {
        System.out.println(id + "," + name + "," + age);
    }

    public void showNextId() {
        System.out.println("Id of the next emp will be:" + nextId);
    }
}
