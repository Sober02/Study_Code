package a05myset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class A07_TreeSetDemo3 {
    public static void main(String[] args) {
        /*
        需求: 请自行选择比较器排序和自然排序两种方式;
        要求:存入四个字符串，“c”，“ab”，“df”,"qwer"
        按照长度排序，如果一样长则按照首字母排序

        采取第二种排序方式:比较器排序
         */

        //1.创建TreeSet集合对象
        //o1:表示当前添加的元素
        //o2:表示当前红黑树中存在的元素
        //返回值规则：
        //负数：表示当前添加的元素是小的，存左边
        //正数：表示当前添加的元素是大的，存右边
        //0 ：表示当前添加的元素已存在，舍弃
        //new Comparator是函数式接口 可以改成lambda表达式
        TreeSet<String> ts = new TreeSet<>(( o1,  o2) -> {
                //按照长度排序
                int i = o1.length() - o2.length();
                //如果一样长则按照首字母排序
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
        });

        //2.添加元素
        ts.add("qwer");
        ts.add("df");
        ts.add("c");
        ts.add("ab");

        //3.打印集合
        System.out.println(ts);//[c,ab,df,qwer]

    }
}
