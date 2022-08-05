package lec36;

class Emp {
    private String name;
    private double sal;

    public void setData(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }
}

class Manager extends Emp {
    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getIncome() {
        double amt;
        amt = getSal() + bonus;
        return amt;
    }
}