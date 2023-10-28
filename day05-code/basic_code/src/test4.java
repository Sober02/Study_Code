import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //需求:键盘录入一个正整数 x ，判断该整数是否为一个质数。

        //质数：只能被1和本身整除的数。

        //分析：

        //1.录入一个正整数。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int x = sc.nextInt();

        //定义一个变量，表示标记
        // 标记着number是否为一个质数
        // true: 是一个质数
        // false : 不是一个质数
        //表示最初就认为number是一个质数
        boolean flag = true;

        //2.判断：判断范围2-（x-1）
        for(int i = 2;i < x; i++){
            if (x % i == 0){
                //System.out.println(x + "不是质数");
                //若不是质数，调整flag的值
                flag = false ;
                //跳出循环
                break;
            }
        }
        //只有当这个循环结束了，表示这个范围之内所有的数字都判断完毕了
        //此时才能断定number是一个质数
        //利用flag的值来判断是否是质数
        if(flag == true){
            System.out.println(x + "是质数");
        }else{
            System.out.println(x + "不是质数");
        }

    }
}
