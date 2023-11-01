import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。
        选手的最后得分为: 去掉最高分、最低分后的4个评委的平均分，
        请完成上述过程并计算出选手的得分。*/

        //1.6名评委打分-【0-100】 - 存入数组

        int[] scores = getScores();
        /*for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }*/
        //2.遍历数组找出最高分、最低分
        int max = getMax(scores);
        int min = getMin(scores);

        //3.计算平均分
        int sum = getSum(scores);
        int avg = (sum - max - min)/(scores.length-2);
        System.out.println("选手的最终得分是：" + avg);
    }
    public static int getSum(int[] scores){
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum +scores[i];
        }
        return sum;
    }

    //我要做什么     评委打分，将分数存入数组
    //我需要什么     都不需要
    //方法的结果是否需要继续使用     需要返回
    public static int[] getScores(){
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {//防止输入范围错误将i++放在输入成功后
            System.out.println("请打分：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100){
                scores[i] = score;
                i++;//输入成功后i++
            }else{
                System.out.println("请输入0~100之间的分数");
            }
        }
        return scores;
    }

    //找到最大值
    public static int getMax(int[] scores){
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max){
                max = scores[i];
            }
        }
        return max;
    }
    //找到最小值
    public static int getMin(int[] scores){
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min){
                min = scores[i];
            }
        }
        return min;
    }

}
