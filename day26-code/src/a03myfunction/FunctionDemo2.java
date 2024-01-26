package a03myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {
        /*
        方法引用 (引用静态方法)格式
        类::方法名
        需求:
            集合中有以下数字，要求把他们都变成int类型
            "1","2","3","4","5"
         */

        //1.创建集合
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        Collections.addAll(list1,"1","2","3","4","5");

        //2.类型转换
        list1.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                int i = Integer.parseInt(s);
                list2.add(i);
                return i;
            }
        }).forEach(s -> System.out.println(s));


        System.out.println("==============================");
        //方法引用~
        //1.方法需要已经存储
        //2.方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
        //3.方法的功能需要把形参的字符串转换成整数
        list1.stream()
                .map(Integer::parseInt)
                .forEach(s -> System.out.println(s));
    }
}
