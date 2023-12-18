package a04treemap;

import a01mymap.Student;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class A09_TreeMapDemo2 {
    public static void main(String[] args) {
        /*
        需求2:
            键:学生对象
            值:籍贯
            要求:按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人
         */

        //用第二种方式进行排序
        //在创建集合中实现Comparator这个接口，重写方法
        //1.创建集合
        TreeMap<Student,String> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o1.getAge() - o2.getAge();
                i = i == 0 ? o1.getName().compareTo(o2.getName()) : i;
                return i;
            }
        });

        //创建学生对象
        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",25);
        Student s4 = new Student("asd",25);

        //2.添加元素
        tm.put(s1,"广东东莞");
        tm.put(s2,"广东茂名");
        tm.put(s3,"广东揭阳");
        tm.put(s4,"广东湛江");

        //3.打印集合
        System.out.println(tm);

        //4.遍历集合
        Set<Map.Entry<Student, String>> entries = tm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

    }
}
