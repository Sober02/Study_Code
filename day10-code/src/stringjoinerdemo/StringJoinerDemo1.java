package stringjoinerdemo;
/*
StringJoiner概述
JDK8出现的一个可变的操作字符串的容器，可以高效，方便的拼接字符串
在拼接的时候，可以指定间隔符号，开始符号，结束符号
 */
public class StringJoinerDemo1 {
    public static void main(String[] args) {
        /*
StringJoiner的构造方法
        方法名                                                       说明
public StringJoiner (间隔符号)                     创建一个StringJoiner对象，指定拼接时的间隔符号
public StringJoiner(间隔符号，开始符号，结束符号)   创建一个StringJoiner对象，指定拼接时的间隔符号开始符号、结束符号
        StringJoiner sj = new StringJoiner("--");
         */
        /*
StringJoiner 的成员方法
        方法名                                     说明
public StringJoiner add(添加的内容)      添加数据，并返回对象本身
public int length()                     返回长度(字符出现的个数)
public String toString()                返回一个字符串 (该字符串就是拼接之后的结果)
         */
    }
}
