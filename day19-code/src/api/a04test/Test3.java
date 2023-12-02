package api.a04test;

public class Test3 {
    public static void main(String[] args) {
        //定义一个方法自己实现toBinaryString方法的效果，
        // 将一个十进制整数转成字符串表示的二进制。
        System.out.println(toBinaryString(100));
        //验证结论
        System.out.println(Integer.toBinaryString(100));

    }

    private static String toBinaryString(int number) {
        //核心逻辑:不断地去除以2，得到余数，一直到商为就结束。
        //还需要把余数倒着拼接起来

        //定义一个StringBuilder拼接字符串
        StringBuilder sb = new StringBuilder();
        //利用循环不断除以2获取余数
        while (true){
            if (number == 0 ){
                break;
            }
            //先获取余数
            int remainder = number % 2;
            //再将number/2
            number = number / 2;

            //得到余数将其倒着拼接起来
            //sb.append(remainder);//这样子就是正着拼接，要求需要倒着拼接

            //在开头插入，实现倒着拼接
            sb.insert(0,remainder);
        }
        //返回字符串 - 用sb.toString将数字转成字符串
        return sb.toString();
    }


}
