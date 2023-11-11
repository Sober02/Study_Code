package Advanceoop.a08oop_extends_demo3;

public class SharPei extends Dog{
    //方法的重写
    //因为沙皮狗吃的狗粮和骨头
    //父类中的方法不能满足我们的需求了，所以需要进行重写
    @Override
    public void eat(){
        super.eat();
        System.out.println("沙皮狗在吃骨头");
    }

}
