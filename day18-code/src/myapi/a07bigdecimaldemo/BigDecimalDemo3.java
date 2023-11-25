package myapi.a07bigdecimaldemo;

import java.math.BigDecimal;

public class BigDecimalDemo3 {
    public static void main(String[] args) {
        //开断点 debug - Step Into 既可看到内部存储方式
        //用数组存储每位字符的ASCII码值
        //0.226 -> [48,46,50,50,54]  123.226 -> [49,50,51,46,50,50,54]  -1.5 -> [45,49,46,53]
        //    ['0','.','2','2','6']                                          ['-','1','.','5']
        BigDecimal bd1 = BigDecimal.valueOf(0.226);
        BigDecimal bd2 = BigDecimal.valueOf(123.226);
        BigDecimal bd3 = BigDecimal.valueOf(-1.5);
    }
}
