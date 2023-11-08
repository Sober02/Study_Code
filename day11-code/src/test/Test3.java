package test;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        /*
        需求:定义一个集合，添加一些学生对象，并进行遍历
        学生类的属性为:姓名，年龄。
         */
        //1.创建一个集合
        ArrayList<Student> list = new ArrayList<>();
        //注意先创建学生对象一会才能添加学生对象
        //2.创建学生对象
        Student stu1= new Student("张三",20);
        Student stu2= new Student("李四",24);
        Student stu3= new Student("王五",22);

        //3.添加学生对象
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //3.遍历
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + " ," + stu.getAge());
        }
    }
}
