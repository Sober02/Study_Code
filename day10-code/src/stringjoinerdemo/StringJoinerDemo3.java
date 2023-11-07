package stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo3 {
    public static void main(String[] args) {
        //1.创建对象
        StringJoiner sj = new StringJoiner("——","[","]");

        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");

        //3.查看长度
        int len = sj.length();
        System.out.println(len);

        //4.转成字符串
        String str = sj.toString();

        //5.打印
        System.out.println(sj);
        System.out.println(str);
    }
}
