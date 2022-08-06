package lec43;

class UsePerson {
    public static void main(String[] args) {
        Person p = new Person("Vishal", 45);
        System.out.println(p); // converted into p.toString()
        // it return alphanumeric string.
        // it generally gives encrypted form of object address.
    }
}
