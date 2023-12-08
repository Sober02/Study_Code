package a02mylist;

import java.util.ArrayList;
import java.util.List;

public class A02_ListDemo2 {
    public static void main(String[] args) {
        //List系列集合中的两个删除的方法
        //1.直接删除元素
        //2.通过索引进行删除

        //1.创建集合并添加元素
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        //2.删除元素
        //通过索引进行删除
        //此时，删除的是索引1上的元素
        //原因：
        //因为在调用方法的时候，如果方法出现了重载现象
        //优先调用，实参跟形参类型一致的那个方法
        //集合中的1的类型是Integer，而传入的实参是int类型，所以调用索引删除的方法
        //list.remove(1);


        //直接删除元素
        //手动装箱，手动把基本数据类型的1，变成Integer类型
        Integer i = Integer.valueOf(1);
        list.remove(i);

        System.out.println(list);
    }
}
