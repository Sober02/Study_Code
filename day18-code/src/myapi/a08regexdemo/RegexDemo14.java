package myapi.a08regexdemo;

public class RegexDemo14 {
    public static void main(String[] args) {
        /*
        非捕获分组：分组之后不需要再用本组数据，仅仅只是把数据括起来。

        身份证号码：
        41080119930227457x
        510801197608022309
         */

        //身份证号码的简易正则表达式
        //非捕获分组：仅仅是把数据括起来
        //特点：不占用组号

        //(?:)  (?=)    (?:) 都是非捕获分组
        //更多的使用第一个(?:)
        //这里\\1报错原因：(?:)就是非捕获分组，此时括号是不占用组号的。
        //String regex = "[1-9]\\d{16}(?:\\d|x|X)\\1";//err
        String regex = "[1-9]\\d{16}(?:\\d|x|X)";

        System.out.println("41080119930227457x".matches(regex));
    }
}
