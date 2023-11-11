package Advanceoop.a10oop_extends_demo5;

public class AdminStaff extends Employee{
    public AdminStaff() {
    }

    public AdminStaff(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("处理行政事务");
    }
}
