package Advanceoop.a10oop_extends_demo5;

public class Tutor extends Teacher {
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println(name + "在教学");
    }
}
