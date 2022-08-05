package lec40;

class Student {
    private final int rollno;
    private int marks;
    private double per;
    private final int max_marks = 100;

    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
        per = (double) marks * 100 / max_marks;
    }
}
