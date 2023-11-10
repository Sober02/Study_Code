package Advanceoop.a07oopextendsdemo2;

public class Test {
    public static void main(String[] args) {
        Zi z =  new Zi();
        z.ziShow();
    }
}
class Fu{
    String name = "Fu";
}
class Zi extends Fu{
    String name = "Zi";
//1.继承中成员变量访问特点: 就近原则
//先在局部位置找，本类成员位置找，父类成员位置找，逐级往上。
//2.如果出现了重名的成员变量怎么办?
//System.out.println(name);     从局部位置开始往上找
//System.out.println(this.name);从本类成员位置开始往上找
//System.out.println(super.name);从父类成员位置开始往上找
    public void ziShow(){
        String name = "ZiShow";
        System.out.println(name);//就近原则 ZiShow
        System.out.println(this.name);//Zi
        System.out.println(super.name);//Fu
    }
}
