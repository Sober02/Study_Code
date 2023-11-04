package APIdemo;

import java.util.Scanner;

/*
需求:按照帮助文档的使用步骤学习 Scanner 类的使用，并实现接收键盘录入一个小数，最后输出在控制台
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        System.out.println(v);
    }
}
