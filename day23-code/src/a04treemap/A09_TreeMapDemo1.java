package a04treemap;

import a01mymap.Student;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class A09_TreeMapDemo1 {
    public static void main(String[] args) {
        /*
        需求2:
            键:学生对象
            值:籍贯
            要求:按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人
         */

        //用第一种方式进行排序
        //在自定义类-Student1中，实现CompareTo这个接口，重写方法即可
        //1.创建集合
        TreeMap<Student1,String> tm = new TreeMap<>();

        //创建学生对象
        Student1 s1 = new Student1("张三",23);
        Student1 s2 = new Student1("李四",24);
        Student1 s3 = new Student1("王五",25);
        Student1 s4 = new Student1("asd",25);

        //2.添加元素
        tm.put(s1,"广东东莞");
        tm.put(s2,"广东茂名");
        tm.put(s3,"广东揭阳");
        tm.put(s4,"广东湛江");

        //3.打印集合
        System.out.println(tm);

        //4.遍历集合
        Set<Map.Entry<Student1, String>> entries = tm.entrySet();
        for (Map.Entry<Student1, String> entry : entries) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

    }
}
