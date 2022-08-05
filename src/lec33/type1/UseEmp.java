package lec33.type1;

public class UseEmp {
    public static void main(String[] args) {
        Emp e = new Emp(21, "Ravi");
        Emp f = new Emp(24, "Amit");
        Emp g = new Emp(22, "Ajay");
        e.show();
        f.show();
        g.show();

        e.showNextId();
        f.showNextId();
        g.showNextId();

    }
}
