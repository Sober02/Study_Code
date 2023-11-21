package myapi.a01mathdemo;

public class MathDemo4 {
    public static void main(String[] args) {
        //要求2:(课后作业)证明没有两位的自幂数。

        //范围10~99
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            double sum = Math.pow(ge, 2) + Math.pow(shi, 2);
            if (i == sum) {
                count++;
                System.out.println(i);
            }
        }
        //循环结束
        if (count == 0) {
            System.out.println("证明没有两位的自幂数");
        } else {
            System.out.println("有" + count + "个自幂数");
        }
    }
}
