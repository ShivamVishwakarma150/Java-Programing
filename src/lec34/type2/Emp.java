package lec34.type2;

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

    public static void showNextId() {
        System.out.println("Id of the next emp will be:" + nextId);
    }

    // here we use finalize as we use it in destructor in c++
    protected void finalize() {
        --nextId;
    }
}
