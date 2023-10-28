import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        /*需求:键盘录入一个大于等于2的整数 x ，
        计算并返回x的平方恨结果只保留整数部分,小数部分将被舍去 。*/

        //分析：4的平方根是2
        //      9的平方根是3
        //      结果保留整数  10的平方根  3~4之间 取3
        //1.要求录入大于2整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入大于2的整数x");
        int x = sc.nextInt();

        //2. 10  1*1    1<10
        //       2*2    4<10
        //       3*3    9<10
        //       4*4    16>10
        //在代码当中
        //从1开始循环，拿着数字的平方跟原来的数字进行比较
        // 如果小于的，那么继续往后判断
        // 如果相等，那么当前数字就是平方根
        // 如果大于的，那么前一个数宇就是平方跟的整数部分
        for(int i = 1 ; i <= x ; i++){
            if(i*i == x){
                System.out.println(i + "就是" + x + "的平方根");
                //如果找到了，循环就可以停止了，后面代码无需执行，提高代码运行效率
                break;
            }else if (i*i > x){
                System.out.println((i-1) + "就是" + x + "平方根的整数部分");
                break;
            }
        }
    }
}
