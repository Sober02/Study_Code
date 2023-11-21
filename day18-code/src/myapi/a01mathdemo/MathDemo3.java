package myapi.a01mathdemo;

public class MathDemo3 {
    public static void main(String[] args) {
        /*
        自幂数，一个n位自然数等于自身各个数位上数字的n次幂之和

        举例1:三位数     1^3 + 5^3 + 3^3=153
        举例2:四位数     1^4 + 6^4 +3^4+ 4^4 =1634

        如果自幂数是一位数，也叫做: 独身数
        三位自幂数:水仙花数       四位自幂数:四叶玫瑰数
        五位自幂数:五角星数       六位自幂数:六合数
        七位自幂数:北斗七星数     八位自幂数:八仙数
        九位自幂数:九九重阳数     十位自幂数:十全十美数
        要求1:统计一共有多少个水仙花数。
        要求2:(课后作业)证明没有两位的自幂数。
        要求3:(课后作业)分别统计有多少个四叶玫瑰数和五角星数。(答案: 都是3个)

         */
        //要求1:统计一共有多少个水仙花数。
        //100~999
        //获取 个位  十位  百位
        //三位数     sum = 个位^3 + 个位^3 + 个位^3
        int count = 0;
        for (int i = 100; i <= 999; i++) {

            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (sum == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("有" + count + "个水仙花数");
    }
}
