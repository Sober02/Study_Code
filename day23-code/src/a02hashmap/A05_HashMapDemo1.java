package a02hashmap;

import a01mymap.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A05_HashMapDemo1 {
    public static void main(String[] args) {
        /*
        存储学生对象并遍历
            需求
            创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)。
            存储三个键值对元素，并遍历
            要求:同姓名，同年龄认为是同一个学生
         */

        //1.创建一个HashMap集合
        HashMap<Student,String> hm = new HashMap<>();

        //2.创建4个学生对象
        Student s1 = new Student("xiaoming",23);
        Student s2 = new Student("xiaohong",24);
        Student s3 = new Student("xiaodong",22);
        Student s4 = new Student("xiaodong",22);

        //3.添加元素

        hm.put(s1,"广东东莞");
        hm.put(s2,"广东广州");
        hm.put(s3,"广东汕头");
        hm.put(s4,"广东茂名");

        //4.遍历集合
        //遍历方式一
        Set<Student> keySet = hm.keySet();
        for (Student key : keySet) {
            String value = hm.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("-------------------------");
        //遍历方式二
        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println("-------------------------");
        //遍历方式三
        hm.forEach((key, value) -> System.out.println(key + "=" + value));
    }
}
