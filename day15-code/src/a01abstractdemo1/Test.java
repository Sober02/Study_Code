package a01abstractdemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法
        Frog f = new Frog("小绿",1);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.drink();

        Dog d = new Dog("阿旺",5);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
        d.drink();

        Sheep s = new Sheep("阿咩",3);
        System.out.println(s.getName() + ", " + s.getAge());
        s.eat();
        s.drink();

    }
}
