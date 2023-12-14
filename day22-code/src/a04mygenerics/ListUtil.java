package a04mygenerics;

import java.util.ArrayList;

public class ListUtil {
    //因为是工具类，所以应该私有化构造方法，不让外界创建他的对象
    private ListUtil(){}

    //类中定义一个静态方法addAll，用来添加多个集合的元素。

    public static<E> void addAll(ArrayList<E> list,E e1,E e2,E e3,E e4){
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
    }

    public void show(){
        System.out.println("show方法");
    }
}
