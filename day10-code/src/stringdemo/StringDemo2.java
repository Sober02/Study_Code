package stringdemo;

/*

 */
public class StringDemo2 {
    public static void main(String[] args) {
        //1.==号比较  -->  基本数据类型比较的是数据值   引用数据类型比较的是地址值

        //s1先定义了字符串"abc" --> 先在串池查找，没有找到 -->  开辟了一个存放"abc"的空间
        //s2再定义字符串"abc" --> 先在串池查找 --> 找到了 --> 所以用的是同一个地址的数据
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2); //true (地址相同)

        String s3 = new String("abc"); //new -->在堆内新开辟的空间 地址和s4肯定不一样
        String s4 = "abc";
        System.out.println(s3 == s4);//false

        String s5 = new String("abc"); //new -->在堆内开辟一个存储的空间 地址1
        String s6 = new String("abc"); //再次new一个新的空间存储  地址2
        System.out.println(s3 == s4);//false

        System.out.println("======================================");
        //2.比较字符串内容

        //boolean equals方法(要比较的字符串)             完全一样结果才是true，否则为false
        //boolean equalsIgnoreCase(要比较的字符串)       忽略大小写的比较

        String s11 = "abc";
        String s22 = new String("Abc");

        boolean result1 = s11.equals(s22);
        System.out.println(result1);

        boolean result2 = s11.equalsIgnoreCase(s22); //忽略大小写
        System.out.println(result2);
    }
}
