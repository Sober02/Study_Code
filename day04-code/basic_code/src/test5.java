import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        /*案例7: 统计满足条件的数字
        需求:键盘录入两个数字，表示一个范围
                统计这个范围中
        既能被3整除，又能被5整除数字有多少个?*/

        //分析：
        //1.键盘录入两数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字表示一个范围开始");
        int num1 = sc.nextInt();
        System.out.println("请输入一个数字表示一个范围结束");
        int num2 = sc.nextInt();
        //2.循环跑范围
        //开始是num1，结束是num2
        //定义一个count计数
        int count = 0;
        for(int i = num1 ;i <= num2 ; i++ ){
        //3.根据要求找出符合条件的数字
            if(i%3 == 0 && i%5 == 0){
                count++;
            }
        }
        System.out.println("既能被3整除，又能被5整除数字有" + count + "个");

    }
}
