package oop_interface.a01interfacedemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象
        //1.兔子
        Rabbit r = new Rabbit("小白",3);
        System.out.println(r.getName() + ", " + r.getAge());
        r.eat();

        //2.青蛙
        Frog f = new Frog("小绿",1);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.swim();

        //3.小狗
        Dog d = new Dog("小汪",5);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
        d.swim();
    }

}
