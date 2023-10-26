import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        /*
        数字6是一个真正伟大的数字，
        键盘录入两个整数如果其中一个为 6，最终结果输出true
        如果它们的和为 6的倍数。最终结果输出true。
        其他情况都是false。
         */

        //分析： a == 6  b == 6  (a+b) % 6 == 0 ——>true
        //满足其中一个就可以输出true

        //键盘录入两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();

        //用短路逻辑运算符连接3个判断
        boolean result = num1 == 6 || num2 == 6 || (num1+num2)%6 == 0;
        System.out.println(result);
        //
    }
}
