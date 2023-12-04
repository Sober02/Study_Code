package test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Test5 {
    public static void main(String[] args) {
        /*
            可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶,
            有的时候一次爬三个台阶，如果这个楼梯有20个台阶，小明一其有多少种爬法呢?


            出口：
            Fn(1)

            规律：
            Fn(20) = Fn(19) + Fn(18) + Fn(17)
            Fn(19) = Fn(18) + Fn(17) + Fn(16)
            Fn(18) = Fn(17) + Fn(16) + Fn(15)
            ...

            Fn(4)  = Fn(3) + Fn(2) + Fn(1) = 7
            Fn(3)  = 4
            Fn(2)  = 2
            Fn(1)  = 1

         */

        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        System.out.println(arr[arr.length-1]);


        //递归实现
        //这个递归方法虽然可以解决问题，但是效率非常低，因为在计算过程中会有大量的重复计算。
        //例如，getCount(n)需要计算getCount(n - 1)、getCount(n - 2)和getCount(n - 3)，
        //而getCount(n - 1)又需要计算getCount(n - 2)、getCount(n - 3)和getCount(n - 4)，
        //这样就产生了大量的重复计算。
        System.out.println(getCount(30));

    }

    public static int getCount(int n) {
        if (n == 3) {
            return 4;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }
        return getCount(n - 1) + getCount(n - 2) + getCount(n - 3);
    }
}
