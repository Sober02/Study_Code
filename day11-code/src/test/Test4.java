package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /*
        添加学生对象并遍历
        需求:定义一个集合，添加一些学生对象，并进行遍历学生
        类的属性为:姓名，年龄。
        要求:对象的数据来自键盘录入
         */
        //1.创建一个集合
        ArrayList<Student> list = new ArrayList<>();


        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            //2.创建学生对象
            Student stu = new Student();
            //3.键盘录入学生对象数据
            System.out.println("请输入学生的姓名：");
            String name = sc.next();
            System.out.println("请输入学生的年龄：");
            int age = sc.nextInt();
            //4.将学生数据存储到对象
            stu.setName(name);
            stu.setAge(age);
            //5.添加对象到集合
            list.add(stu);

        }
        //4.遍历
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + ", " + s.getAge());
        }
    }
}
