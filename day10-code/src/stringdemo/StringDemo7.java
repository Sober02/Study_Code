package stringdemo;

import java.util.Scanner;

/*
定义一个方法，实现字符串反转
键盘录入一个字符串，调用该方法后，在控制台输出结果
例如，键盘录入 abc，输出结果 cba
 */
public class StringDemo7 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = reverser(str);
        System.out.println(result);
    }
    //要求：字符串反转
    //需要：字符串
    //需要返回使用
    public static String reverser(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            char c = str.charAt(i);
            result = result + c;
        }
        return result;
    }
}
