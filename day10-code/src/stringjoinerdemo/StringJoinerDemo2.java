package stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        //1.创建一个对象，指定中间间隔符号
        StringJoiner sj1 = new StringJoiner("---");
        StringJoiner sj2 = new StringJoiner(", ", "[", "]");
        //2.添加元素
        sj1.add("aaa").add("bbb").add("ccc");
        sj2.add("asd").add("fgh").add("jkl");
        //3.打印
        System.out.println(sj1);
        System.out.println(sj2);
    }
}
