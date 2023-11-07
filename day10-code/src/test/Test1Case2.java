package test;

import java.util.Scanner;

public class Test1Case2 {
    public static void main(String[] args) {
        /*
        键盘录入一个字符串，
        要求1:长度为小于等于9
        要求2: 只能是数字
        将内容变成罗马数字
        下面是阿拉伯数字跟罗马数字的对比关系:
        I -1、II-2、III-3、IV-4、V-5、VI-6、VII-7、VIII-8、IX-9
        注意点:
        罗马数字里面是没有0的
        如果键盘录入的数字包含0，可以变成""(长度为0的字符串)
        */
        //1.键盘录入字符串
        // 要求1:长度为小于等于9
        // 要求2: 只能是数字    - 定义方法判断
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入0~9之间长度为小于等于9的字符串");
            str = sc.next();
            boolean flag = checkStr(str);

            if (flag) {
                break;
            } else {
                System.out.println("字符串不合法，请输入0~9之间长度为小于等于9的字符串！");
                continue;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            //获取到每一位字符
            char c = str.charAt(i);
            String LuoMaNumber = getLuoMa(c);
            sb.append(LuoMaNumber + " ");
        }
        System.out.println(sb);

    }

    //用Switch
    //I -1、II-2、III-3、IV-4、V-5、VI-6、VII-7、VIII-8、IX-9
    public static String getLuoMa(char number) {
        String str;
        switch (number) {
            //注意：case ‘0’ 是字符0 不是数字0！
            case '0' -> str = "";
            case '1' -> str = "I";
            case '2' -> str = "II";
            case '3' -> str = "III";
            case '4' -> str = "IV";
            case '5' -> str = "V";
            case '6' -> str = "VI";
            case '7' -> str = "VII";
            case '8' -> str = "VIII";
            case '9' -> str = "IX";
            default -> str = "";
        }
        return str;
    }

    //定义方法检验字符串是否符合
    public static boolean checkStr(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

}
