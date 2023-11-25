package myapi.a07bigdecimaldemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo2 {
    public static void main(String[] args) {
        /*
            public BigDecimal add(BigDecimal val)                       加法
            public BigDecimal subtract(BigDecimal val)                  减法
            public BigDecimal multiply(BigDecimal val)                  乘法
            public BigDecimal divide(BigDecimal val)                  除法
            public BigDecimal divide(BigDecimal val, 精确几位, 舍入模式)  除法
         */

        //1.加法
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(2.0);
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        //2.减法
        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);

        //3.乘法
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);

        //4.除法
        BigDecimal bd6 = bd1.divide(bd2);//如果除不尽就会报错 需要使用第二种
        System.out.println(bd6);

        BigDecimal bd7 = bd1.divide(bd2, 2, RoundingMode.HALF_UP);//保留两位小数 四舍五入
        System.out.println(bd7);
    }
}
