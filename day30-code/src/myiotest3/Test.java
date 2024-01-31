package myiotest3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        /*
        需求:写一个登陆小案例。
            步骤:
            将正确的用户名和密码手动保存在本地的userinfo.txt文件中
            保存将式为:username=zhangsan&password=123
            让用户键盘求入用户名和密码
            比较用户录入的和正确的用户名密码是否一致
            如果一致则打印登陆成功
            如果不一致则打印登陆失败
         */
        //1.读取文件
        BufferedReader br = new BufferedReader(new FileReader("day30-code\\src\\myiotest3\\userinfo.txt"));
        String line = br.readLine();
        //System.out.println(line);
        //2.获取正确的用户名和密码
        //username=zhangsan&password=123
        String[] userInfo = line.split("&");
        //用户名
        String[] arr1 = userInfo[0].split("=");
        String rightUsername = arr1[1];
        //密码
        String[] arr2 = userInfo[1].split("=");
        String rightPassword = arr2[1];

        //System.out.println(rightUsername);
        //System.out.println(rightPassword);

        //3.比较
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        if (rightUsername.equals(username) && rightPassword.equals(password)){
            System.out.println("登录成功！");
        }else {
            System.out.println("登录失败！");
        }


    }
}
