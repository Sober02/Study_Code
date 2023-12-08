package a01mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A02_CollectionDemo2 {
    public static void main(String[] args) {
        //1.创建一个集合
        Collection<Student> coll = new ArrayList<>();

        //2.创建3个Student对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",23);

        //3.将对象添加到集合中
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        //4.判断集合中某一个学生对象是否包含
        //因为contains方法在底层依赖equals方法判断对象是否一致的。
        //如果存的是自定义对象，没有重写equals方法，那么默认使用object类中的equals方法进行判断，
        //而object类中equals方法，依赖地址值进行判断
        //需求:如果同姓名和同年龄，就认为是同一个学生。
        //所以，需要在自定义的Javabean类中，重写equals方法。
        Student s4 = new Student("zhangsan",23);
        //如果Student的Javabean类中没有重写equals方法比较的是地址值，结果就是false
        System.out.println(coll.contains(s4));//true

    }
}
