package api.a04test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
        键盘录入一些1~100之间的整数，并添加到集合中。
        直到集合中所有数据和超过200为止。
         */

        //1.创建一个集合
        ArrayList<Integer> list = new ArrayList<>();
        //2.键盘录入整数
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            //先过滤异常数据 - 不在1~100之间
            if (num < 1 || num > 100) {
                System.out.println("输入的数据有误，请重新输入");
                continue;
            }
            //数据正常，继续执行下面代码

            //3.添加整数到集合中
            //细节:
            //num: 基本数据类型
            //集合里面的数据是Integer
            //在添加数据的时候触发了自动装箱
            list.add(num);

            //4.判断集合中的数据和是否超过200
            //定义一个方法求和
            int sum = getSum(list);
            //对sum进行判断
            if (sum > 200) {
                System.out.println("集合中的数据和超过200");
                break;
            }
        }
        //验证结论
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
    }

    public static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        if (list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                //i : 索引
                //list.get(i);
                //可以直接写 int num = list.get(i)  因为java会进行自动拆箱
                Integer num = list.get(i);
                sum += num;
            }
            return sum;
        }
        return 0;

    }
}
