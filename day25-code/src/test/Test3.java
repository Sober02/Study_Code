package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*
        实现随机点名器3
        班级里有N个学生
        要求:
        被点到的学生不会再被点到。但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。

        "范闲"，"范建"，"范统","杜子腾","宋合泛","侯笼藤","朱益群",
        "朱穆朗玛峰"，"杜琦燕"，"袁明媛"，"李猜"，"田蜜蜜”
        */

        //1.创建集合对象
        ArrayList<String> list1 = new ArrayList<>();
        //创建一个临时的集合，用来存储已经被点到学生的名字
        ArrayList<String> list2 = new ArrayList<>();

        //2.添加元素
        Collections.addAll(list1, "范闲", "范建", "范统", "杜子腾", "宋合泛", "侯笼藤",
                "朱益群", "朱穆朗玛峰", "杜琦燕", "袁明媛");
        //获取到集合的长度
        int size = list1.size();

        //3.随机点名
        Random r = new Random();
        //外循环：表示轮数
        for (int i = 1; i <= 10; i++) {
            System.out.println("=======第" + i + "轮点名开始了========");
            for (int j = 0; j < size; j++) {
                int index = r.nextInt(list1.size());
                String name = list1.remove(index);
                list2.add(name);
                System.out.println(name);
            }
            //此时表示一轮点名结束
            //list1为空，list2存了10个学生
            //System.out.println(list1);
            //System.out.println(list2);
            list1.addAll(list2);
            list2.clear();
        }
    }
}
