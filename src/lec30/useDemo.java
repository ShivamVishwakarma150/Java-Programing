package lec30;

class useDemo {
    public static void main(String[] args) {
        int i = 10, j = 20;
        Demo obj = new Demo();
        System.out.println("Before increasing the value ,i = " + i + ", j = " + j);
        obj.increment(i, j);
        System.out.println("After increasing the value ,i = " + i + ", j = " + j);

    }
}
