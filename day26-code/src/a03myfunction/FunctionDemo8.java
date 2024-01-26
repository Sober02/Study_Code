package a03myfunction;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionDemo8 {
    public static void main(String[] args) {
        /*
        需求:
            创建集合添加学生对象
            学生对象属性: name， age

        要求:
            获取姓名并放到数组当中
            使用方法引用完成

        技巧：
            1.现在有没有一个方法符合我当前的需求
            2.如果有这样的方法，这个方法是否满足引用的规则
            静态      类名::方法名
            成员方法   类名::方法名  或  其他类对象名::方法名    或(本类中)  this/super::
            构造方法   类名::new

         */
        //1.创建集合添加学生对象
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",24));
        list.add(new Student("wangwu",25));

        //2.获取姓名并放到数组当中
        //list.stream() -> 是Student对象  将Student对象类型转为String类型（姓名）
        //再把String类型的姓名放到数组中
        String[] arr = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
