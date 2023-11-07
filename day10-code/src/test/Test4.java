package test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        /*
        生成验证码
        内容:可以是小写字母，也可以是大写字母，还可以是数字
        规则:
        长度为5
        内容中是四位字母，1位数字。
        其中数字只有1位，但是可以出现在任意的位置。
         */

        //1.定义数组存放大小写字母
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            //ASCII
            arr[i] = (char) (97 + i); //97 -> a
            if (i > 25) {
                arr[i] = (char) (65 + i - 26);
            }
            //System.out.print(arr[i] + " ");
        }

        Random r = new Random();
        //2.随机获取4次
        String str = "";
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(arr.length);
            char c = arr[index];
            str = str + c;
        }

        //3.再随机得到一位数字拼接起来
        //定义字符数字数组
        char[] numberArr = new char[10];
        for (int i = 0; i < numberArr.length; i++) {
            numberArr[i] = (char) (i + 48);
            //System.out.println(numberArr[i]);
        }
        int numIndex = r.nextInt(10);
        char number = numberArr[numIndex];
        str = str + number;
        System.out.println(str);

        //4.将最后的一位数字与随机一个字母调换位置 - 要修改字符串内容
        //ACFG7
        //思考，我们把7放到前面，修改了字符事的内容
        //把生成的验证码先变成一个字符数组
        //再让最后一个元素跟前面的随机位置的元素进行交换
        //交换完毕之后再变成字符串就可以了。
        int changeIndex = r.nextInt(4);

        //把生成的验证码先变成一个字符数组
        char[] strArr = str.toCharArray();
        //再让最后一个元素跟前面的随机位置的元素进行交换
        char temp = strArr[changeIndex];
        strArr[changeIndex] = strArr[strArr.length - 1];
        strArr[strArr.length - 1] = temp;
        //交换完毕转回字符串
        String result = new String(strArr);
        System.out.println(result);
    }
}
