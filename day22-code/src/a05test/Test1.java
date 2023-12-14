package a05test;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
/*
        需求;
        定义一个继承结构:
                                    动物
                           |                    |
                           猫                   狗
                       |        |           |        |
                     波斯猫    狸花猫       泰迪     哈士奇

        属性:名字，年龄
        行为:吃东西
            波斯猫方法体打印:一只叫做XXX的，X岁的波斯猫，正在吃小饼干
            狸花猫方法体打印:一只叫做XXX的，X岁的狸花猫，正在吃鱼
            泰迪方法体打印:一只叫做XXX的，X岁的泰迪，正在吃骨头，边吃边蹭
            哈士奇方法体打印:一只叫做XXX的，X岁的哈士奇，正在吃骨头，边吃边拆家

        测试类中定义一个方法用于饲养动物
        public static void keepPet(ArrayList<???> list){
            //遍历集合，调用动物的eat方法
        }

        要求1: 该方法能养所有品种的猫，但是不能养狗
        要求2:该方法能养所有品种的狗，但是不能养猫
        要求3: 该方法能养所有的动物，但是不能传递其他类型

*/

        ArrayList<PersianCat> list1 = new ArrayList<>();
        ArrayList<LiHuaCat> list2 = new ArrayList<>();
        ArrayList<Teddy> list3 = new ArrayList<>();
        ArrayList<Husky> list4 = new ArrayList<>();

        PersianCat persianCat = new PersianCat();
        persianCat.setName("波斯sss");
        persianCat.setAge(1);

        LiHuaCat liHuaCat = new LiHuaCat();
        liHuaCat.setName("梨花hhh");
        liHuaCat.setAge(2);

        Teddy teddy = new Teddy();
        teddy.setName("太滴");
        teddy.setAge(3);

        Husky husky = new Husky();
        husky.setName("哈萨ki");
        husky.setAge(2);

        //要求1：
        list1.add(persianCat);
        list2.add(liHuaCat);

        keepPet(list1);
        keepPet(list2);
        //keepPet(list3);//error
        //keepPet(list4);//error

        //要求2：
        list3.add(teddy);
        list4.add(husky);

        //keePet2(list1);//error
        //keePet2(list2);//error
        keepPet2(list3);
        keepPet2(list4);


        //要求3：
        keepPet3(list1);
        keepPet3(list2);
        keepPet3(list3);
        keepPet3(list4);

    }
    //要求1: 该方法能养所有品种的猫，但是不能养狗
    public static void keepPet(ArrayList<? extends Cat> list){
        for (Cat cat : list) {
            //System.out.println(cat);
            cat.eat();
        }
    }

    //要求2:该方法能养所有品种的狗，但是不能养猫
    public static void keepPet2(ArrayList<? extends Dog> list){
        Iterator<? extends Dog> it = list.iterator();
        while (it.hasNext()){
            Dog str = it.next();
            //System.out.println(str);
            str.eat();
        }
    }

    //要求3: 该方法能养所有的动物，但是不能传递其他类型
    public static void keepPet3(ArrayList<? extends Animal> list){
        for (Animal animal : list) {
            //System.out.println(animal);
            animal.eat();
        }
    }
}
