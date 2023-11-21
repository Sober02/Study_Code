package myapi.a01mathdemo;

public class MathDemo2 {
    public static void main(String[] args) {
        //判断一个数是否为质数
        System.out.println(isPrime(997));

        //997  2~996  循环955次

        //优化 - 30次
    }

    public static boolean isPrime(int number){
        int count = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            count++;
            if (number % i ==0){
                return false;
            }
        }
        System.out.println(count);
        return true;
    }
}
