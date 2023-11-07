package test;
/*
调整字符串
给定两个字符串A和B
A的旋转操作就是将A最左边的字符移动到最右边
例如,若A='abcde'，在移动一次之后结果就是'bcdea'
如果在若干次调整操作之后，A 能变成B，那么返回True。
如果不能匹配成功，则返回false
 */

public class Test2Case2 {
    public static void main(String[] args) {
        //1.给定两个字符串A和B
        String strA = "abcde";
        String strB = "cdeab";

        //2.定义旋转字符串的方法

        //3.定义判断旋转完成的方法
        boolean result = check(strA, strB);
        System.out.println(result);
    }

    //判断旋转完成
    //字符串A和B
    //返回true/false
    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)) {
                return true;
            }
        }
        return false;
    }

    //旋转字符串
    //旋转前字符串
    //返回旋转后字符串
    public static String rotate(String str) {
        //套路:
        //如果我们看到要修改字符串的内容
        //可以有两个办法:
        //1.用substring进行截取，把左边的字符截取出来拼接到右侧去
        //2.可以把字符串先变成一个字符数组，然后调救字符数组里面数据，最后再把字符数组变成字符串。

        //先将str转成字符数组，再移动改变字符数组，最后创建字符串对象！返回
        // "abc" --> ['a','b','c']  -->  'a' ['b','c', ''] --> ['b','c','a'] --> new String(arr)

        char[] arr = str.toCharArray();
        //先存储第一个字符
        char first = arr[0];
        //循环修改移动字符
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        //将原来0索引上的字符放到最后一个索引
        arr[arr.length - 1] = first;

        //利用字符数组创建一个字符串对象 - 注意是创建字符串对象！ - new！！！
        String result = new String(arr);
        //进行拼接返回
        return result;
    }
}
