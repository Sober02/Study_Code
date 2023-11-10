package Advanceoop.a07oopextendsdemo2;

public class Test2 {
    public static void main(String[] args) {
        Zi2 zi = new Zi2();
        zi.show();
    }
}

class Fu2 {
    String name = "Fu";
    String hobby = "喝茶";

}

class Zi2 extends Fu2 {
    String name = "Zi";
    String game = "吃鸡";

    public void show(){
        //如何打印Zi
        System.out.println(this.name);
        //如何打印Fu
        System.out.println(super.name);
        //如何打印喝茶
        System.out.println(super.hobby);
        //如何打印吃鸡
        System.out.println(this.game);
    }
}
