package Advanceoop.a10oop_extends_demo5;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(String id,String name){
        super(id,name);
    }
    @Override
    public void work() {
        System.out.println(name + "在维护");
    }

}
