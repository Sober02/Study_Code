package myio.mycharset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharsetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
        UTF-8不是一个字符集，是Unicode字符集的一种编码方式
        Java中编码的方法
            public byte[] getBytes()                    使用默认方式进行编码
            public byte[] getBytes(String charsetName)  使用指定方式进行编码

        Java中解码的方法
            String(byte[] bytes)                        使用默认方式进行解码
            String(byte[] bytes，String charsetName)    使用指定方式进行解码
         */

        //编码
        String str = "ai中国";
        byte[] bytes1 = str.getBytes();//当前默认编码方式是UTF-8
        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));//[97, 105, -28, -72, -83, -27, -101, -67]
        System.out.println(Arrays.toString(bytes2));//[97, 105, -42, -48, -71, -6]

        System.out.println("--------------");
        //解码
        String str1 = new String(bytes1);
        String str2 = new String(bytes1,"GBK");
        String str3 = new String(bytes2);
        String str4 = new String(bytes2,"GBK");
        System.out.println(str1);//ai中国
        System.out.println(str2);//ai涓浗(乱码) 编码和解码的方式不统一就会产生乱码
        System.out.println(str3);//ai�й�(乱码)  编码和解码的方式不统一就会产生乱码
        System.out.println(str4);//ai中国
    }
}
