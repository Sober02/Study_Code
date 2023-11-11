package Advanceoop.a10oop_extends_demo5;

public class EmployeeTest {
    public static void main(String[] args) {
        //创建对象
        //子类Lecturer调用父类Teacher,Teacher再调用Employee
        Lecturer l = new Lecturer("heima001","张三");
        //调用方法
        l.work();
        System.out.println(l.getId()+", "+l.getName());

        System.out.println("---------------------------");

        Tutor t = new Tutor("heima002","李四");
        t.work();
        System.out.println(t.getId()+", "+t.getName());

        System.out.println("---------------------------");

        Maintainer m = new Maintainer("heima0003","王五");
        m.work();
        System.out.println(m.getId()+", "+m.getName());

        System.out.println("---------------------------");

        Buyer b = new Buyer("heima004","小红");
        b.work();
        System.out.println(b.getId()+", "+b.getName());

    }
}
