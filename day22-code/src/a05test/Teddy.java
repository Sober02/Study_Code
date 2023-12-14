package a05test;

public class Teddy extends Dog{
    //泰迪方法体打印:一只叫做XXX的，X岁的泰迪，正在吃骨头，边吃边蹭
    @Override
    void eat() {
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"岁的泰迪，正在吃骨头，边吃边蹭");
    }
}
