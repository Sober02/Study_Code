package a01mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A06_CollectionDemo6 {
    public static void main(String[] args) {
        /*
            Collection系列集合三种通用的遍历方式:
                1.迭代器遍历
                2.增强for遍历
                3.lambda表达式遍历

                增强for格式:
                for(数据类型 变量名: 集合/数组){

                }

                //快速生成方式：
                        //集合名字.for
         */

        //1.创建集合
        Collection<String> coll = new ArrayList<>();

        //2.添加元素
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        //3.使用增强for遍历
        //注意：
        //s其实就是一个第三方变量，在循环的过程中依次遍历每一个数据
        for (String s : coll) {
            //System.out.println(s);
            //细节：
            //在此处改变s的值是不会影响集合中的数据的。
            //改变的只是s这个第三方变量的值，没有改变集合中的内容。
            s = "ddd";
        }

        System.out.println(coll);//aaa bbb ccc

    }
}
