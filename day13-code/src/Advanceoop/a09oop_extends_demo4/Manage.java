package Advanceoop.a09oop_extends_demo4;

public class Manage extends Employee{
    private double bonus;

    //空参构造
    public Manage() {
    }

    //全参构造
    //父类+子类
    public Manage(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}
