package myiotest3;

import javax.annotation.processing.Filer;
import java.io.*;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws IOException {
        /*
        需求:写一个登陆小案例。 添加锁定账号功能
            步骤:
            将正确的用户名和密码手动保存在本地的userinfo2.txt文件中
            保存将式为:username=zhangsan&password=123&count=0
            让用户键盘求入用户名和密码
            比较用户录入的和正确的用户名密码是否一致
            如果一致则打印登陆成功
            如果不一致则打印登陆失败，连续输错3次锁定账号
         */
        //1.获取文件内容
        BufferedReader br = new BufferedReader(new FileReader("day30-code\\src\\myiotest3\\userinfo2.txt"));
        String line;
        line = br.readLine();
        //2.获取正确的账号密码
        //username=zhangsan&password=123&count=0
        String[] userinfo = line.split("&");
        //账号
        String[] arr1 = userinfo[0].split("=");
        String rightUsername = arr1[1];
        //密码
        String[] arr2 = userinfo[1].split("=");
        String rightPassword = arr2[1];
        //计数
        String[] arr3 = userinfo[2].split("=");
        String countStr = arr3[1];
        int count = Integer.parseInt(countStr);


        //3.比较
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();

        if (rightUsername.equals(username) && rightPassword.equals(password) && count < 3) {
            System.out.println("登录成功！");
            writeInfo("username=" + rightUsername + "&password=" + rightPassword + "&count=0");

        } else {
            count++;
            if (count < 3) {
                System.out.println("登录失败！你还有" + (3 - count) + "次机会");
            }else {
                System.out.println("账号已被锁定");
            }

            writeInfo("username=" + rightUsername + "&password=" + rightPassword + "&count=" + count);
        }

    }

    /*
     * 作用：
     *       写出一个字符串到本地文件中
     * 参数：
     *       要写出的字符串
     */
    public static void writeInfo(String content) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("day30-code\\src\\myiotest3\\userinfo2.txt"));
        bw.write(content);
        bw.close();
    }
}
