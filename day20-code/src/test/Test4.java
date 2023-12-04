package test;

public class Test4 {
    public static void main(String[] args) {
        /*
        可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶。
        如果这个楼梯有20个台阶，小明一其有多少种爬法呢?

            运算结果:
            1层台阶 1种爬法
            2层台阶 2种爬法
            7层台阶 21种爬法

            出口：
            Fn(1)

            规律：
            Fn(20) = Fn(19) + Fn(18)
            Fn(19) = Fn(18) + Fn(17)
            Fn(18) = Fn(17) + Fn(16)
            ...
            Fn(3)  = Fn(2) + Fn(1)
            Fn(2)  = 2
            Fn(1)  = 1

         */

        System.out.println(getCount(20));
    }

    public static int getCount(int n) {
        if (n == 2) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }
        return getCount(n - 1) + getCount(n - 2);
    }
}
