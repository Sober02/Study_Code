package a01mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A05_CollectionDemo5 {
    public static void main(String[] args) {
        /*
        迭代器的四个细节:
            1.如果当前位置没有元素，还要强行获取，会报NoSuchElementException
            2.迭代器遍历完毕，指针不会复位
            3.循环中只能用一次next方法
            4.迭代器遍历时，不能用集合的方法进行增加或者删除
            暂时当做一个结论先行记忆，在今天我们会讲解源码详细的再来分析。
            如果我实在要剧除: 那么可以用达代器提供的remove方法进行删除。
            如果我要添加，暂时没有办法。
         */


        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("eee");
        coll.add("ddd");


        //如果要继续第二次遍历集合，只能再次获取一个新的迭代器对象
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            //System.out.println(it2.next());//aaa ccc eee
            //循环中只能用一次next方法 使用第二次有可能会报错
            //System.out.println(it2.next());//bbb ddd NoSuchElementException

            String str = it.next();
            //迭代器遍历时，不能用集合的方法进行增加或者删除
            if (str == "bbb"){
                //coll.remove("bbb");//error - ConcurrentModificationException
                //如果要删除元素，使用迭代器内部的方法
                it.remove();
            }
        }
        System.out.println(coll);



    }
}
