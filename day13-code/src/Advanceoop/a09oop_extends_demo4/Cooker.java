package Advanceoop.a09oop_extends_demo4;

public class Cooker extends Employee{

    //空参
    public Cooker() {
    }

    //带全部参数的构造
    public Cooker(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("厨师在炒菜");
    }
}
