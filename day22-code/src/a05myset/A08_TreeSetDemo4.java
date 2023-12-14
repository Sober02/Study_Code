package a05myset;

import java.util.TreeSet;

public class A08_TreeSetDemo4 {
    public static void main(String[] args) {
        /*
        需求: 创建5个学生对象
            属性:(姓名,年龄，语文成绩,数学成绩,英语成绩)
            按照总分从高到低输出到控制台
            如果总分一样，按照语文成绩排
            如果语文一样，按照数学成绩排
            如果数学成绩一样，按照英语成绩排
            如果英文成绩一样，按照年龄排
            如果年龄一样，按照姓名的字母顺序排排
            如果都一样，认为是同一个学生，不存。

            第一种:默认排序/自然排序
            第二种:比较器排序
            默认情况下，用第一种排序方式，如果第一种不能满足当前的需求，采取第二种方式。
         */

        //1.创建5个学生对象
        Student_A08 s1 = new Student_A08("zhangsan",23,90,90,90);
        Student_A08 s2 = new Student_A08("lisi",24,80,70,70);
        Student_A08 s3 = new Student_A08("wangwu",25,70,90,90);
        Student_A08 s4 = new Student_A08("zhaoliu",26,70,90,50);
        Student_A08 s5 = new Student_A08("qianqi",27,80,60,60);

        //2.创建集合 - （去重、排序）使用 TreeSet
        TreeSet<Student_A08> ts = new TreeSet<>();

        //3.添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //4.遍历集合
        for (Student_A08 t : ts) {
            int sum = t.getChinese() + t.getMath() + t.getEnglish();
            System.out.println(t +  "总分：" + sum);
        }

    }
}
