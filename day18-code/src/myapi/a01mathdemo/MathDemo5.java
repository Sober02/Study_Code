package myapi.a01mathdemo;

public class MathDemo5 {
    public static void main(String[] args) {
        //要求3:(课后作业)分别统计有多少个四叶玫瑰数和五角星数。(答案: 都是3个)

        //四叶玫瑰数 - ge^4 + shi^4 + bai^4 + qian^4
        //五角星数   - ge^5 + shi^5 + bai^5 + qian^5 + wan^5

        int count1 = 0;
        int count2 = 0;
        for (int i = 1000; i <= 9999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;

            double sum = Math.pow(ge, 4) + Math.pow(shi, 4) + Math.pow(bai, 4) + Math.pow(qian, 4);
            if (i == sum) {
                System.out.println(i);
                count1++;
            }
        }
        System.out.println("有" + count1 + "个四叶玫瑰数");

        for (int i = 10000; i <= 99999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000 % 10;

            double sum = Math.pow(ge, 5) + Math.pow(shi, 5) + Math.pow(bai, 5) + Math.pow(qian, 5) + Math.pow(wan, 5);
            if (i == sum) {
                System.out.println(i);
                count2++;
            }
        }
        System.out.println("有" + count2 + "个五角星数");
    }
}
