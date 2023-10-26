public class yuanfanbu {
    public static void main(String[] args) {
        //原码  反码  补码
        /*
        原码:十进制数据的二进制表现形式，最左边是符号位，0为正，1为负
        反码:正数的补码反码是其本身，负数的反码是符号位保持不变，其余位取反
        补码: 正数的补码是其本身，负数的补码是在其反码的基础上+1
         */

        //隐式转换
        byte a = 10; // 0000 1010
        int b = a;   // 0000 0000 0000 0000 0000 0000 0000 1010
        System.out.println(b);

        //强制转换
        int c =300;      //0000 0000 0000 0000 0000 0000 0010 1100
        byte d = (byte)c;//0010 1100
        System.out.println(d);//44
    }
}
