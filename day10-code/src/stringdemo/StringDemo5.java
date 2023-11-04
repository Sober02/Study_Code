package stringdemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        //键盘录入一个字符串，统计该字符串中
        // 大写字母字符，小写字母字符，数字字符出现的次数

        //1.键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //定义计数器
        int smallCount = 0;
        int bigCount = 0;
        int numberCount = 0;
        //2.遍历字符串 - 判断字符 - 计数器++
        for (int i = 0; i < str.length(); i++) {
            //i依次表示字符串每一个索引
            char c = str.charAt(i);
            //char类型的变量在参与计算的时候自动类型提升为int 查询ASCII码表
            if (c >= 'a' && c <= 'z') { // 'a'==97  'z' == 122
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') { //'A' == 65
                bigCount++;
            } else if (c >= '0' && c <= '9') { //'0'== 48  '9'== 57
                numberCount++;
            }
        }
        System.out.println("小写字母字符有" + smallCount + "个");
        System.out.println("大写字母字符有" + bigCount + "个");
        System.out.println("数字字符有" + numberCount + "个");
    }
}
