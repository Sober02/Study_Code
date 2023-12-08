package a02mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class A03_ListDemo3 {
    public static void main(String[] args) {
        /*
        List集合的遍历方式
            迭代器遍历
            列表迭代器遍历
            增强for遍历
            Lambda表达式遍历
            普通for遍历（因为List集合存在索引）

         */

        //1.创建集合并添加元素
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.println("迭代器遍历");
        //1.迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

        System.out.println("增强for遍历");
        //2.增强for遍历
        //下面的变量s，其实就是一个第三方的变量而已。
        //在循环的过程中，依次表示集合中的每一个元素
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("Lambda表达式遍历");
        //3.Lambda表达式遍历
        //forEach方法的底层其实就是一个循环遍历，依次得到集合中的每一个元素
        //并把每一个元素传递给下面的accept方法
        //accept方法的形参s，依次表示集合中的每一个元素
        list.forEach(s -> System.out.println(s) );

        System.out.println("普通for遍历");
        //4.普通for遍历
        //size方法跟get方法还有循环结合的方式，利用索引获取到集合中的每一个元素
        for (int i = 0; i < list.size(); i++) {
            //i依次表示集合的每一个索引
            String s = list.get(i);
            System.out.println(s);
        }

        System.out.println("列表迭代器遍历");
        //5.列表迭代器遍历
        //获取一个列表迭代器对象，里面的指针默认也是指向0索引的

        //额外添加的方法：在遍历的过程中，可以添加元素
        ListIterator<String> it2 = list.listIterator();
        while (it2.hasNext()){
            String str = it2.next();
            if (str.equals("aaa")){
                it2.add("abc");
            }
        }
        System.out.println(list);

    }
}
