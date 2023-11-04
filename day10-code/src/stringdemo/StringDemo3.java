package stringdemo;
//已知正确的用户名和密码，
// 请用程序实现模拟用户登录总共给三次机会，
// 登录之后，给出相应的提示

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //定义正确的账号密码
        String username = "sober123";
        String password = "123321";
        Scanner sc = new Scanner(System.in);
        //用户输入
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String user = sc.next();
            System.out.println("请输入密码：");
            String cipher = sc.next();

            //字符串比较
            boolean flag1 = user.equals(username);
            boolean flag2 = cipher.equals(password);
            if (flag1 && flag2) {
                System.out.println("登陆成功！");
                break;
            } else {
                if (i == 2) {
                    System.out.println("账号已被锁定，请联系客服进行处理！");
                } else {
                    System.out.println("用户名或密码错误！你还有" + (2 - i) + "次机会");
                }
            }
        }
    }
}

