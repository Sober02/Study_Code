package a04treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class A08_TreeMapDemo1 {
    public static void main(String[] args) {
        /*
        需求1:
            键:整数表示id
            值:字符串表示商品名称
            要求1:按照id的升序排列
            要求2:按照id的降序排列

         */

        //需求1：
        //1.创建集合
        //Integer Double 默认情况下都是按照升序排列的
        //string 按照字母在ASCII码表中对应的数字升序进行排列
        // abcdefg ...
        TreeMap<Integer,String> tm = new TreeMap<>();

        //2.添加元素
        tm.put(5,"小米手机");
        tm.put(3,"华为手机");
        tm.put(1,"笔记本电脑");
        tm.put(2,"保温杯");
        tm.put(4,"键盘鼠标");

        //3.打印集合
        //默认情况下是升序
        System.out.println(tm);

        //要求2：
        TreeMap<Integer,String> tm2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1 表示当前要添加的元素
                //o2 表示已经在红黑树中存在的元素
                return o2-o1;
            }
        });

        tm2.put(5,"小米手机");
        tm2.put(3,"华为手机");
        tm2.put(1,"笔记本电脑");
        tm2.put(2,"保温杯");
        tm2.put(4,"键盘鼠标");

        System.out.println(tm2);
    }
}
