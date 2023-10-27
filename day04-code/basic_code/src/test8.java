public class test8 {
    public static void main(String[] args) {
        /*需求:给定两个整数，被除数和除数(都是正数，且不超过int的范围)
        将两数相除，要求不使用乘法、除法和 % 运算符。得到商和余数。
         */

        //10  3     3...1
        //将被除数减去除数，当被除数小于除数时，即是余数，相减的次数是商
        //10-3=7
        //7-3 =4
        //4-3 =1
        //1-3
        int dividend = 12;//被除数
        int divisor = 5;//除数
        int count = 0; //商
        //不确定循环次数，用while

        //注意while的判断条件，是要满足这个条件才执行循环
        //被除数>=除数即执行循环体语句，当条件不符合就跳出循环
        while(dividend >= divisor){
            dividend = dividend-divisor;
            count ++;
        }
        System.out.println("商" + count);
        System.out.println("余数" + dividend);

    }
}
