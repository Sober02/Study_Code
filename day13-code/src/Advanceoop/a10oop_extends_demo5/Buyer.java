package Advanceoop.a10oop_extends_demo5;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println(name + "在采购");
    }
}
