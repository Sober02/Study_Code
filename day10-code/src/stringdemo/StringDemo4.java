package stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        //public char charAt(int index): 根据索引返回字符
        //public int length(): 返回此字符串的长度
        //数组的长度:数组名.length
        //字符串的长度: 字符串对象.length()

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //遍历字符串
        for (int i = 0; i < str.length(); i++) {
            //i依次表示字符串每一个索引
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
