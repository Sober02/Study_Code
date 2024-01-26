package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        /*
        定义一个集合，并添加一些整数 1,2,3,4,5,6,7,8,9,10
        过滤奇数，只留下偶数。
        并将结果保存起来
         */
        //1.创建集合
        ArrayList<Integer> list = new ArrayList<>();
        //2.添加整数
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        //3.过滤奇数 保留偶数
        //如果是偶数，返回true 保留
        /*
        在第一个代码中，使用的是Collectors.toList()方法，它返回一个List的实现类，即ArrayList。
        这个方法是Java 8引入的，用于将Stream元素收集到一个新的List中。

        而在第二个代码中，使用的是Java 16中引入的toList()方法。这个方法也是用来将Stream元素收集到
        一个新的List中，但与Collectors.toList()不同的是，它是Stream接口的默认方法，
        直接在Stream对象上调用，不需要通过Collectors类。

        总的来说，这两个方法的功能是相同的，都可以将满足条件的元素收集到一个新的List中，
        只是使用的语法稍有不同。如果你使用的是Java 8或更早版本，应该使用Collectors.toList()方法；
        如果你使用的是Java 16或更高版本，可以使用toList()方法。
         */
        List<Integer> newList = list.stream().filter(n -> n % 2 == 0)
                //收集数据
                .collect(Collectors.toList());
        List<Integer> newList2 = list.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(newList);

    }
}
