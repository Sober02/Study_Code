package a01immutable;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ImmutableDemo2 {
    public static void main(String[] args) {
        /*
            创建不可变的set集合
            "张三", "李四", "王五", "赵六"

            细节：
                当我们要获取一个不可变的Set集合的时候，要保证参数的唯一性！
         */

        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        Set<String> set = Set.of("张三", "李四", "王五", "赵六");
        //Set<String> set2 = Set.of("张三", "张三", "李四", "王五", "赵六");//error

        System.out.println("------------------------");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("------------------------");
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

        System.out.println("------------------------");
        //set.remove(0);//error
        //set.add("aaa");//error

    }
}
