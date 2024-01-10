package a02mycollections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        /*
        Collections是一个工具类，工具类 - 私有化构造方法不让外界创建他的对象，方法都是静态的

        public static <> boolean addAll(Collection<T> c, T... elements) 批量添加元素
        public static void shuffle(List<?> list)                        打乱List集合元素的顺序

         */

        //addAll
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //批量添加元素
        Collections.addAll(list,"abc","qwer","asdf","zxcv","1234","hjkl","qazz");

        //打印集合
        System.out.println(list);

        //shuffle   打乱
        Collections.shuffle(list);

        System.out.println(list);
    }
}
