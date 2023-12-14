package a05test;

public class Husky extends Dog{
    //一只叫做XXX的，X岁的哈士奇，正在吃骨头，边吃边拆家
    @Override
    void eat() {
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"岁的哈士奇，正在吃骨头，边吃边拆家");
    }
}
