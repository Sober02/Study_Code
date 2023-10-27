public class test7 {
    public static void main(String[] args) {
        /*需求:给你一个整数 x 。如果 x 是一个回文整数，打印 true ，
          否则，返回 false 。解释: 回文数是指正序《从左向右)
          和倒序(从右向左) 读都是一样的整数。
          例如，121 是回文，而 123 不是。*/

        //分析：
        //1.定义变量x 12345，要判断是否是回文整数，分别获取每一位的数字
        //利用循环，因为不确定循环的次数，所以使用while循环。
        //x%10  ge==5   num =num*10+5 =>5
        //x%10  ge==4   num =5*10+4   =>54...

        int  x = 124;
        int temp = x;//存储x的初始值
        int num = 0;
        while(x != 0){//最后x值为0
            int ge = x % 10;
            x = x / 10;//！！！不要忘记改变x的值，x值如果没变化，就是死循环
            num = num * 10 + ge;
        }//获取回文数
        //与原来x值对比是否符合回文数。
        //System.out.println(x);
        if(temp == num){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
