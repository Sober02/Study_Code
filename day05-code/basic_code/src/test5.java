//1.导包
import java.util.Random;

public class test5 {
    public static void main(String[] args) {
        //先获取一个随机数。
        // 范围: 0~10

        //2.创建对象
        /*Random r = new Random();

        //3.生成随机数
        // 判断技巧:
        //在小括号中，书写的是生成随机数的范围
        //这个范围一定是从o开始的。
        //到这个数-1结束
        //口诀:包头不包尾，包左不包右
        int number = r.nextInt(10);// 0 ~ 99
        */

        //获取1~100的随机数

        Random r = new Random();
        int num = r.nextInt(100) + 1; //1~100
        System.out.println(num);
        //秘诀
        //用来生成任意数到任意数之间的随机数 7 ~15
        // 1.让这个范围头尾都减去一个值，让这个范围从0开始 -7  0~8
        // 2.尾巴+1       8+1=9
        // 3.最终的结果，再加上第一步减去的值。

        /*  Random r = new Random();
        int number = r.nextInt(9) + 7;
        // 7 ~ 15
        //0~8 +7
        system.out.println(number);*/
    }
}
