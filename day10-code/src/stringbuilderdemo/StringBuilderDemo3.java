package stringbuilderdemo;
//使用stringBuilder的场景:
// 1.字符串的拼接
// 2.字符串的反转
public class StringBuilderDemo3 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder();
        //2.添加字符串
        sb.append("aa");
        sb.append("bb");
        sb.append("cc");
        sb.append("dd");

        System.out.println(sb);//aabbccdd
        //3.再把StringBuilder变回字符串
        String str = sb.toString();
        System.out.println(str);//aabbccdd
    }
}
