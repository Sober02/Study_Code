package a04mygenerics;

import java.util.ArrayList;

public class GenericsDemo3 {
    //定义一个工具类: ListUtil
    //类中定义一个静态方法addAll，用来添加多个集合的元素。
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ListUtil.addAll(list,"aaa","bbbb","cccc","ddd");
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtil.addAll(list2,123,1234,12345,666);
        System.out.println(list2);
    }
}
