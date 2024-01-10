package a02mycollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        /*
        Collections是一个工具类，工具类 - 私有化构造方法不让外界创建他的对象，方法都是静态的

        public static <T> void sort(List<T> list)                   排序
        public static <T> void sort(List<T> list, Comparator<T> c)  根据指定的规则进行排序
        public static <T> int binarySearch (List<T> list, T key)    以二分查找法查找元素
        public static <T> void copy(List<T> dest, List<T> src)      拷贝集合中的元素
        public static <T> int fill (List<T> list, T obj)            使用指定的元素填充集合
        public static <T> void max/min(Collection<T> coll)          根据默认的自然排序获取最大/小值
        public static <T> void swap(List<?> list, int i, int j)     交换集合中指定位置的元素

         */

        System.out.println("-----------------sort默认规则-----------------");
        //默认规则，需要重写Comparable接口compareTo方法。Integer已经实现，按照从小到大顺序排列
        //如果是自定义对象，需要自己指定规则
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 6, 7, 5, 1, 3, 2, 4, 10, 9, 8);
        Collections.sort(list1);
        System.out.println(list1);

        System.out.println("------------根据指定的规则进行排序------------");
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 6, 7, 5, 1, 3, 2, 4, 10, 9, 8);
        Collections.sort(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list1);

        Collections.sort(list2, (o1, o2) -> o2 - o1);
        System.out.println(list2);

        System.out.println("------------binarySearch------------");
        //需要元素有序
        ArrayList<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int i = Collections.binarySearch(list3, 6);
        System.out.println(i);
        System.out.println(Collections.binarySearch(list3, 3));
        System.out.println(Collections.binarySearch(list3, 11));

        System.out.println("------------copy拷贝集合中的元素------------");
        //把list3的元素拷贝到list4中
        //会覆盖原来的元素
        //注意点：如果list3的长度 > list4的长度，方法会报错
        ArrayList<Integer> list4 = new ArrayList<>();
        Collections.addAll(list4,0,0,0,0,1,1,1,1,1,1,1,1);
        Collections.copy(list4,list3);
        System.out.println(list3);
        System.out.println(list4);

        System.out.println("-----------fill使用指定的元素填充集合-----------");
        //把集合中现有的所有数据，都修改为指定的数据
        ArrayList<Integer> list5 = new ArrayList<>();
        Collections.addAll(list5,1,2,3,4,5,6,3,2,1,0);
        Collections.fill(list5,22);
        System.out.println(list5);

        System.out.println("-----max/min根据默认的自然排序获取最大/小值-----");
        //默认规则
        ArrayList<Integer> list6 = new ArrayList<>();
        Collections.addAll(list6,1,3,2,4,5,7,8,22,10);
        System.out.println(Collections.max(list6));
        System.out.println(Collections.min(list6));
        //String中默认是按照字母的abcdefg顺序进行排列的
        //现在我要求最长的字符串
        //默认的规则无法满足，可以自己指定规则
        //求指定规则的最大值或者最小值
        ArrayList<String> list7 = new ArrayList<>();
        Collections.addAll(list7,"a","aaa","aaaaaa","aaaa");
        System.out.println(Collections.max(list7, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //求长度最大的字符串
                return o1.length() - o2.length();
                //求长度最小的字符串
                //return o2.length() - o1.length();
            }
        }));
        System.out.println(Collections.min(list7, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //求长度最小的字符串
                return o1.length() - o2.length();
                //求长度最大的字符串
                //return o2.length() - o1.length();
            }
        }));


        System.out.println("-------swap交换集合中指定位置的元素-------");
        ArrayList<String> list8 = new ArrayList<>();
        Collections.addAll(list8,"aaa","bbb","ccc","ddd","123","456");
        Collections.swap(list8,2,5);
        System.out.println(list8);

    }
}
