class Student {
    int roll;
    char grade;
    double per;
}

// Main Class (Driver Class)
class Lec_2UseStudent {
    public static void main(String[] args) {
        // object bhi ban gya aur uska reference bhi ban gya

        Student obj = new Student();
        // here new initializes all members with initial value to 0
        // obj contain address of student object.
        // here obj referred to student object.

        obj.roll = 10;
        obj.grade = 'A';
        obj.per = 78.5;
        System.out.println("Roll=" + obj.roll + ",Grade=" + obj.grade + ",Per=" + obj.per);

    }
}
