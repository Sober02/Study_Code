package myapi.a08regexdemo;

import java.util.Scanner;

public class RegexDemo1 {
    public static void main(String[] args) {
        /*
        假如现在要求校验一个qq号码是否正确。
        规则: 6位及20位之内，0不能在开头，必须全部是数字
        先使用目前所学知识完成校验需求然后体验一下正则表达式检验。
        */

        Scanner sc = new Scanner(System.in);
        /*while (true) {
            System.out.println("请输入你的QQ号");
            String qq = sc.next();
            if (checkQQ(qq)){
                System.out.println("号码输入正确");
                break;
            }else {
                System.out.println("号码输入格式错误，请重新输入");
                continue;
            }
        }*/

        //正则表达式
        String qq = "1234567890";
        System.out.println(qq.matches("[1-9]\\d{5,19}"));

    }

    public static boolean checkQQ(String qq){
        //6位及20位之内，0不能在开头，必须全部是数字
        //核心思想：
        //先把异常数据过滤
        //下面就是满足要求的数据了
        int len = qq.length();
        if (len < 6 || len >20){
            return false;
        }

        //0不能在开头，
        //qq.charAt(0);也可以
        if (qq.startsWith("0")){
            return false;
        }

        //必须全部是数字
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9'){
                return false;
            }
        }

        return true;

    }
}
