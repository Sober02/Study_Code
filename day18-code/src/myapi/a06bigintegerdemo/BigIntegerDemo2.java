package myapi.a06bigintegerdemo;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        /*
        public BigInteger add(BigInteger val)                   加法
        public BigInteger subtract(BigInteger val)              减法
        public BigInteger multiply(BigInteger val)              乘法
        public BigInteger divide(BigInteger val)                除法，获取商
        public BigInteger[] divideAndRemainder(BigInteger val)  除法，获取商和余数
        public boolean equals(Object x)                         比较是否相同
        public BigInteger pow(int exponent )                    次幂
        public BigInteger max/min(BigInteger val)               返回较大值/较小值
        public int intValue(BigInteger val)                     转为int类型整数，超出范围数据有误
         */

        //1.创建两个BigInteger对象
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(5);

        //2.加法
        BigInteger result = bd1.add(bd2);
        System.out.println(result);

        //3.除法，获取商和余数
        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println(arr[0]);//商2
        System.out.println(arr[1]);//余0

        //4.比较是否相同
        boolean equals = bd1.equals(bd2);
        System.out.println(equals);

        //5.次幂
        BigInteger pow = bd1.pow(2);
        System.out.println(pow);//10^2 = 100

        //6.返回较大值/较小值
        BigInteger max = bd1.max(bd2);
        BigInteger min = bd1.min(bd2);
        System.out.println(max);//10
        System.out.println(min);//5

        //7.转为int类型整数，超出范围数据有误
        BigInteger bd6 = BigInteger.valueOf(1000);
        int i = bd6.intValue();
        System.out.println(i);
    }
}
