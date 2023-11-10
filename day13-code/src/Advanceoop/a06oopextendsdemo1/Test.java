package Advanceoop.a06oopextendsdemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法

        //1.创建狸花猫的对象
        LiHua lihua = new LiHua();
        lihua.eat();
        lihua.drink();
        lihua.catchMouse();
        System.out.println("====================");
        //2.创建哈士奇对象
        Husky hsq = new Husky();
        hsq.eat();
        hsq.lookHome();
        hsq.breakHome();
    }
}
