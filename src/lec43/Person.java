package lec43;

class Person {
    private String name;
    private int age;

    public Person(String str, int a) {
        name = str;
        age = a;
    }

    public String toString() {
        return name + "," + age;
    }
}
