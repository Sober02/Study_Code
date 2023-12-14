package a05test;

public class PersianCat extends Cat {
    //波斯猫方法体打印:一只叫做XXX的，X岁的波斯猫，正在吃小饼干
    @Override
    void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的波斯猫，正在吃小饼干");
    }
}
