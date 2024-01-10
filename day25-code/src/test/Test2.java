package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        /*
        实现随机点名器2
        班级里有N个学生
        要求:
        70%的概率随机到男生 30%的概率随机到女生
        "范闲"，"范建"，"范统","杜子腾","宋合泛","侯笼藤","朱益群",
        "朱穆朗玛峰"，"杜琦燕"，"袁明媛"，"李猜"，"田蜜蜜”
        */

        //1.创建集合对象
        ArrayList<Integer> list1 = new ArrayList<>();//设置概率
        ArrayList<Student> list = new ArrayList<>();


        //2.创建学生对象
        Student s1 = new Student("范闲",20,"男");
        Student s2 = new Student("范建",21,"男");
        Student s3 = new Student("范统",22,"男");
        Student s4 = new Student("宋仁投",23,"女");
        Student s5 = new Student("袁明媛",20,"女");
        Student s6 = new Student("杜琦燕",21,"女");
        Student s7 = new Student("田蜜蜜",23,"女");

        //3.添加元素
        //list1存放10个元素，随机到1代表抽中男生，随机到0代表抽中女生
        Collections.addAll(list1, 1, 1, 1, 1, 1, 1, 1, 0,0,0);
        //打乱
        Collections.shuffle(list1);
        Collections.addAll(list,s1,s2,s3,s4,s5,s6,s7);

        //4.随机抽取
        Random r = new Random();
        int index = r.nextInt(list1.size());
        System.out.println(list1.get(index));
        int number = list1.get(index);
        if (number == 1){
            //抽中男生
            while (true) {
                Collections.shuffle(list);
                if (list.get(0).getGender().equals("男")){
                    System.out.println(list.get(0));
                    break;
                }
            }
        }else{
            //抽中女生
            while (true) {
                Collections.shuffle(list);
                if (list.get(0).getGender().equals("女")){
                    System.out.println(list.get(0));
                    break;
                }
            }
        }

    }
}
