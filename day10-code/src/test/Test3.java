package test;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //键盘录入任意字符串，打乱字符串内容
//        System.out.println("请输入一个字符串：");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
        String str = "abcdefg";

        //转成字符数组
        char[] arr = str.toCharArray();
        //定义随机索引
        Random r = new Random();
        //char temp ;
        //遍历字符数组与随机索引交换
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp ;
        }
        String result = new String(arr);
        System.out.println(result);
    }
}
