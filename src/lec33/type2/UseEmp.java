package lec33.type2;

public class UseEmp {
    public static void main(String[] args) {
        Emp e = new Emp(21, "Ravi");
        Emp f = new Emp(24, "Amit");
        Emp g = new Emp(22, "Ajay");
        e.show();
        f.show();
        g.show();
        e.showNextId();
        {
            Emp x = new Emp(23, "Deepak");
            Emp y = new Emp(22, "Jyoti");
            x.show();
            y.show();
            x.showNextId();
            // step 1 set references to null
            x = y = null; // explicitly set the ref to null
            // step 2: call explicitly gc
            System.gc();
            // step 3: to remind gc to run finalizatio
            System.runFinalization();
        }
        // x , y becomes garbage block
        // because x, y are interns and kam hone ke bad employees kam ho jane chahiye
        // whenever jvm send gc to clean memory then gc object ko destroys karne ke thik
        // pahle ek
        // special method called karta hai jiska name hota hai finalize
        // call Garbage collector explicitly
        // finalize ko call gc karta hai memory cleaning
        // ke sath finalize ko call karta hai ye utni bar
        // call karta hai jitne references ki value ko ham
        // null karte hai

        e.showNextId();

    }
}
