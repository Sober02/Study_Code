package Advanceoop.a08oop_extends_demo3;

public class Test {
    public static void main(String[] args) {

        //1.创建一个哈士奇对象
        Husky husky = new Husky();
        husky.eat();
        husky.drink();
        husky.lookHome();
        husky.breakHome();

        System.out.println("--------------------");

        //2.创建一个沙皮狗对象
        SharPei sharPei = new SharPei();
        sharPei.eat();
        sharPei.drink();
        sharPei.lookHome();
    }
}
