package a05myset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class A04_LinkHashSetDemo {
    public static void main(String[] args) {
        /*

         */
        //创建一个存储学生对象的集合
        LinkedHashSet<Student2> hs = new LinkedHashSet<>();

        //创建学生对象
        Student2 s1 = new Student2("张三",23);
        Student2 s2 = new Student2("李四",24);
        Student2 s3 = new Student2("王五",25);
        Student2 s4 = new Student2("张三",23);

        //添加学生对象
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));

        //打印集合
        System.out.println(hs);//按存储顺序打印
    }
}
