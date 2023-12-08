package a01mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A07_CollectionDemo7 {
    public static void main(String[] args) {
        /*
            Collection系列集合三种通用的遍历方式:
                1.迭代器遍历
                2.增强for遍历
                3.lambda表达式遍历

                lambda表达式遍历:
                    default void forEach(Consumer<? super T> action):
                //快速生成方式：
                        //集合名字.for
         */

        //1.创建集合
        Collection<String> coll = new ArrayList<>();

        //2.添加元素
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        //3.使用匿名内部类的格式
        //底层原理：
        //其实也会自己遍历集合，依次得到每一个元素
        //把得到的每一个元素，传递给下面的accept方法
        //s依次表示集合中的每一个数据
        /*coll.forEach(new Consumer<String>() {
            @Override
            //s依次表示集合中的每一个数据
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //4.lambda表达式遍历
        coll.forEach(s -> System.out.println(s));



    }
}
