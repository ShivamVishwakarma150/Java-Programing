package lec34.type2;

public class UseEmp {
    public static void main(String[] args) {
        Emp.showNextId();
        {
            Emp e = new Emp(21, "Ravi");
            Emp f = new Emp(24, "Amit");
            Emp g = new Emp(22, "Ajay");
            e.show();
            f.show();
            g.show();
            Emp.showNextId();
            {
                Emp x = new Emp(23, "Deepak");
                Emp y = new Emp(22, "Jyoti");
                x.show();
                y.show();
                Emp.showNextId();
                // step 1 set references to null
                x = y = null; // explicitly set the ref to null
                // step 2: call explicitly gc
                System.gc();
                // step 3: to remind gc to run finalizatio
                System.runFinalization();
            }
            Emp.showNextId();
            e = f = g = null;
            System.gc();
            // step 3: to remind gc to run finalizatio
            System.runFinalization();

        }

        Emp.showNextId();

    }
}
