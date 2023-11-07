package test;

public class Test5 {
    public static void main(String[] args) {
/*      给定两个以字符串形式表示的非负整数num1和num2，
        返回num1和num2的乘积，它们的乘积也表示为字符串形式。
        注意:需要用已有的知识完成。
 */
        //1.字符串形式表示的非负整数num1和num2
        String num1 = "123456";
        String num2 = "1234";

        //2.返回num1和num2的乘积
        int result1 = 0;
        int result2 = 0;
        //遍历字符串得到每一位字符 -> 将字符转成数字 -> 合并数字 -> 计算结果
        for (int i = 0; i < num1.length(); i++) {
            char c = num1.charAt(i);
            //将字符转成数字
            int n = c - 48;
            //合并数字
            result1 = result1 * 10 + n;
            //System.out.println(n);
        }
        System.out.println(result1);
        for (int i = 0; i < num2.length(); i++) {
            char c = num2.charAt(i);
            //将字符转成数字
            int n = c - 48;
            //合并数字
            result2 = result2 * 10 + n;
            //System.out.println(n);
        }
        System.out.println(result2);
        //计算乘积
        int result = result1 * result2;
        System.out.println("整数乘积结果：" + result);
        //3.将结果转成字符串
        String resultStr = "";
        while (result > 0) {
            int ge = result % 10;
            resultStr = (char)(ge + 48) + resultStr;
            result = result / 10;
        }
        System.out.println(resultStr);
    }
}
