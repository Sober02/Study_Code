package stringbuilderdemo;
//使用stringBuilder的场景:
// 1.字符串的拼接
// 2.字符串的反转


public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder("abc");
        //2.添加元素
        sb.append(1);
        sb.append(6.6);
        sb.append(true);
        //反转
        sb.reverse();
        //获取长度
        int len = sb.length();
        System.out.println(len);
        //打印
        //普及：
        //因为StringBuilder是Java已经写好的类
        //Java在底层对他做了一些特殊处理。
        //打印对象不是地址值而是属性值
        System.out.println(sb);
    }
}
