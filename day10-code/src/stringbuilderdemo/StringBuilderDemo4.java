package stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        /*
        对称字符串
        需求:键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
        对称字符串:123321、111
        非对称字符串:123123
         */
        //键盘接收字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        //判断是否对称 - 用StringBuilder反转方法
        //链式编程
        String sb = new StringBuilder(str).reverse().toString();
        //创建StringBuilder对象后不用定义变量接收，直接使用reverse方法，
        // 然后toString转成字符串定义sb接收
        if (str.equals(sb)){
            System.out.println("该字符串是对称字符串");
        }else{
            System.out.println("该字符串不是对称字符串");
        }
    }
}
