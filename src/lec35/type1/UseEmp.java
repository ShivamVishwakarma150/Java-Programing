package lec35.type1;

class UseEmp {
    public static void main(String[] args) {
        Emp e = new Emp();
        Emp f = new Emp();

        e.setEmp(23, "Neeraj", 70000);
        f.setEmp(34, "Ravi", 55000.0);

        e.displayEmp();
        f.displayEmp();

    }
}