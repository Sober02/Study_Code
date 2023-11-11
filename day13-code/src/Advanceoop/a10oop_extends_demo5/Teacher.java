package Advanceoop.a10oop_extends_demo5;

public class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(String id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("教学研究");
    }

}
