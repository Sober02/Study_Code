package myapi.a02systemdemo;

public class SystemDemo2 {
    public static void main(String[] args) {
        //判断1~10000之间有多少个质数

        long start = System.currentTimeMillis();

        for (int i = 1; i <= 10000; i++) {
            //boolean flag = isPrime1(i);//108毫秒
            boolean flag = isPrime2(i);//50毫秒  量越大效率更优
            if (flag) {
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        //获取程序运行的总时间
        System.out.println(end - start);//108毫秒  50毫秒
    }

    //以前的方式判断质数
    public static boolean isPrime1(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //优化的方式判断质数 --- 效率高
    public static boolean isPrime2(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
