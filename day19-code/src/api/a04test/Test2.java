package api.a04test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*
        自己实现parseInt方法的效果，将字符串形式的数据转成整数要求:
        字符串中只能是数字不能有其他字符
        最少一位，最多10位
        0不能开头
         */

        //判断字符串形式 - 正则表达式
        String regex = "[1-9]\\d{0,9}";
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入一个正确数字字符串");
            String str = sc.nextLine();
            boolean b = str.matches(regex);
            if (!b){
                System.out.println("字符串形式有误");
                continue;
            }
            //将字符串转成字符数组
            char[] chars = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            int result = 0;
            //遍历字符串得到里面的每一个字符
            for (int i = 0; i < chars.length; i++) {
                int num = chars[i] - '0';
                //把每一位数字放到result中
                result = result * 10 + num;
            }
            System.out.println(result);
            System.out.println(result + 1);
            break;
        }

    }
}
