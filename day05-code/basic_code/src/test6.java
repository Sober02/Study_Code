import java.util.Random;
import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        //需求:程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少?


        //注意点:
        //1.生成随机数的代码int number = r.nextInt(1o) + 1;
        // 不能写在循环的里面的，否则每一次都会产生一个新的随机数

        //2.抽奖机制
        //用点券去抽水晶
        // 保底 360次
        //计数器
        //用来统计已经猜了多少次
//        int count = 0;

        //分析：
        //1.生成随机数
        Random r = new Random();
        int num = r.nextInt(100) + 1;//生成1~100的随机数
        //System.out.println(num);

        //2.猜数字-》 用户录入数字与随机数对比 判断
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("猜数字");
            int guessNum = sc.nextInt();
            //3，判断两个数字给出不同的提示
            // 猜的数字大了，提示 大了
            // 猜的数字小了，提示 小了
            // 猜的数字一样，提示猜中了

//            count ++;
//            if (count == 3){
//                System.out.println("猜中了！");
//            }

            if (guessNum < num) {
                System.out.println("猜小了");
            }else if (guessNum > num) {
                System.out.println("猜大了");
            } else{
                System.out.println("猜对了！");
                break;

            }
        }
    }
}
