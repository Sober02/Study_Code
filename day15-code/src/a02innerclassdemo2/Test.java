package a02innerclassdemo2;

public class Test {
    public static void main(String[] args) {

/*
        匿名内部类的格式

        new 类/接口(){
            重写的方法;
        };
*/
        new Swim(){

            @Override
            public void swim() {
                System.out.println("重写了swim这个接口的方法");
            }
        };
       // s.swim();

        //在测试类中调用下面的method方法?
        //以前的方式如何调用?
        //要自己写一个子类继承Anima1类
        //再创建子类的对象，传递给method方法
//                Dog d = new Dog();
//                method(d);
        //如果Dog类我只要用一次，那么还需要单独定义一个类太麻烦了。


        method(
        //直接用匿名内部类

        //new Animal()是创建了这个类的对象，不是Animal的对象！
                new Animal() {//类的开始
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }//类的结束
                //从类的开始到类的结束 - 是Animal的子类，他们是继承关系，重写了eat这个方法
        );

    }

    public static void method(Animal a){//Animal a = 子类对象  多态
        a.eat();//编译看左边，运行看右边
    }
/*
//创建对象(多态方式)
//Fu f = new Zi();
Animal a = new Dog();
//调用成员变量: 编译看左边，运行也看左边
//编译看左边:javac编译代码的时候，会看左边的父类中有没有这个变量，如果有，编译成功，如果没有编译失败
//运行也看左边:java运行代码的时候，实际获取的就是左边父类中成员变量的值

//调用成员方法: 编译看左边，运行看右边
//编译看左边:javac编译代码的时候，会看左边的父类中有没有这个方法，如果有，编译成功，如果没有编译失败。
//运行看右边: java运行代码的时候，实际上运行的是子类中的方法。
a.eat();///Dog --- eat方法
*/
}
