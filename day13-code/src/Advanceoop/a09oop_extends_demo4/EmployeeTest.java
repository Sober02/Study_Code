package Advanceoop.a09oop_extends_demo4;

public class EmployeeTest {
    public static void main(String[] args) {
        //1.创建对象
        Manage m = new Manage("heima001","张三",12000,4000);
        //2.调用方法
        m.work();
        m.eat();
        System.out.println(m.getId() + ", " + m.getName() +
                ", " + m.getSalary() + ", " + m.getBonus());

        System.out.println("----------------------------------sdc");

        Cooker cooker = new Cooker();
        cooker.setId("heima002");
        cooker.setName("李四");
        cooker.setSalary(8000);
        cooker.work();
        cooker.eat();
        System.out.println(m.getId() + ", " + m.getName() + ", " + m.getSalary());
    }
}
