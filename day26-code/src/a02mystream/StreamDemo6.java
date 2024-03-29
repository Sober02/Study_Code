package a02mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class StreamDemo6 {
    public static void main(String[] args) {
        /*
        filter          过滤
        limit           获取前几个元素
        skip            跳过前几个元素

        注意1:中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
        注意2: 修改stream流中的数据，不会影响原来集合或者数组中的数据
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌","周正若","赵镇","张强",
                "张三丰","张深山","张良","王二麻子","谢广坤");

        //1.过滤  filter  把张开头的留下，其余数据过滤不要
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //如果返回值为true，表示当前数据留下
                //如果返回值为false，表示当前数据舍弃不要
                return s.startsWith("张");
            }
        }).forEach(s -> System.out.println(s));

        System.out.println("-----------------------");

        list.stream().filter(s -> s.startsWith("张"))
                .forEach(s -> System.out.println(s));


        System.out.println("-------获取前几个元素 limit-----");
        //2.获取前几个元素 limit
        //"张无忌","周正若","赵镇","张强","张三丰","张深山","张良","王二麻子","谢广坤"
        list.stream().limit(3).forEach(s -> System.out.println(s));

        System.out.println("--------跳过前几个元素 skip---------");
        //3.跳过前几个元素 skip
        list.stream().skip(3).forEach(s -> System.out.println(s));

        System.out.println("======================");
        //练习： 获取"张强","张三丰","张深山"
        //第一种思路：
        //先获取前面6个元素，再跳过前面3个元素
        list.stream().limit(6).skip(3).forEach(s -> System.out.println(s));

        System.out.println("======================");
        //第二种思路：
        //先获取跳过前面3个元素，再获取3个元素
        list.stream().skip(3).limit(3).forEach(s -> System.out.println(s));
    }
}
