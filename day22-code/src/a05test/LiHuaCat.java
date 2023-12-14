package a05test;

public class LiHuaCat extends Cat{
    //狸花猫方法体打印:一只叫做XXX的，X岁的狸花猫，正在吃鱼

    @Override
    void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的狸花猫，正在吃鱼");
    }
}
