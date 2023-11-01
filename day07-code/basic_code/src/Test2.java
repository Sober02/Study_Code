public class Test2 {
    public static void main(String[] args) {
        //判断101~200之间有多少个素数（质数），并打印出来。

        //分析：
        //1.先获取101~200之间的数-循环
        //2.判断每个一数是否是质数

        //判断质数
        //int i =7;

        //计算质数的个数
        int count = 0;
        //外循环:遍历101~20这个范围，依次得到这个范围之内的每一个数字
        for (int i = 101; i <= 200; i++) {
            //i表示循环中的每一个数字
            //记录flag的值来判断
            boolean flag = true;
            //内循环:判断当前数字是否为一个质数。
            for (int j = 2; j < i; j++) {
                //j 表示2~199之间的每一个数字
                if (i % j == 0) {
                    flag = false;
                    //跳出单层循环(内循环）
                    break;
                }
            }
            if (flag) {
                System.out.println("当前数字" + i + "是质数");
                count++;
            }
        }
        System.out.println("一共有" + count + "个质数");
    }
}