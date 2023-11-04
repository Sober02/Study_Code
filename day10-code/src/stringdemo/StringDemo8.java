package stringdemo;
//金额转换  ---------  2135 --> 贰壹叁伍

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        //键盘录入金额
        Scanner sc = new Scanner(System.in);
        int money;
        //判断金额是否合法
        while (true) {
            System.out.println("请输入金额：");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("输入的金额不合法，请重新输入！");
            }
        }
        String moneyStr = "";
        //得到每一位数字 - 2135 - 转成大写
        while (true) {
            int ge = money % 10; // 5
            money = money / 10; //去掉得到的个位
            String str = getCapitalNumber(ge);
            moneyStr = str + moneyStr;
            if (money == 0) {
                break;
            }
        }
        //System.out.println(result);

        //得到大写数字后在前面补零
        //因为是7位数，所以定义一个count计数
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }

        //System.out.println(result);

        //最后逐个插入单位  -
        //  佰  拾  万  仟  佰  拾  元
        //0   0   0   2   1   3   5
        String result = "";
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            char c = moneyStr.charAt(i);

            //直接打印完成
//            System.out.print(c);
//            System.out.print(str);
            //拼接
            result = result + c + str ;
        }
        System.out.println(result);

    }

    //定义方法将小谢数字转成大写
    public static String getCapitalNumber(int number) {
        //定义一个数组存储大写数字 - 查表法
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        //                0    1    2   3    4     5...
        String str = arr[number];
        return str;
    }
}
