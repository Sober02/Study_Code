package a03myfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionDemo7 {
    public static void main(String[] args) {
        /*
        需求:
            集合中存储一些字符串的数据，比如: 张三,23
            收集到Student类型的数组当中
         */
        //1.创建集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌,15","周芷若,14","赵敏,13","张强,20",
                "张三丰,100","张翠山,40","张良,35","王二麻了,37","谢广坤,41");

        Student[] arr1 = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Student(name, age);
            }
        }).toArray(new IntFunction<Student[]>() {
            @Override
            public Student[] apply(int value) {
                return new Student[value];
            }
        });
        System.out.println(Arrays.toString(arr1));

        //2.先把字符串变为Student对象，再把Student对象收集起来
        Student[] arr2 = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(arr2));
    }
}
