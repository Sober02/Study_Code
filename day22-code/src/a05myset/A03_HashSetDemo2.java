package a05myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A03_HashSetDemo2 {
    public static void main(String[] args) {
        /*
        需求:创建一个存储学生对象的集合，存储多个学生对象。
        使用程序实现在控制台遍历该集合
        要求:学生对象的成员变量值相同，我们就认为是同一个对象
        */

        //创建一个存储学生对象的集合
        HashSet<Student2> hs = new HashSet<>();

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
        System.out.println(hs);

        //遍历集合
        for (Student2 str : hs) {
            System.out.println(str);
        }
        /*Iterator<Student2> it = hs.iterator();
        while (it.hasNext()){
            Student2 str = it.next();
            System.out.println(str);
        }*/

    }
}
