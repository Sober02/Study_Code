import java.util.Random;

public class ArrTest6 {
    public static void main(String[] args) {
        /*需求:生成10个1~100之间的随机数存入数组。
        1) 求出所有数据的和
        2)求所有数据的平均数
        3) 统计有多少个数据比平均值小*/

        //1.生成10个1~100之间的随机数存入数组
        Random r = new Random();
        int [] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100)+1;
        }

        //2.求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("所有数据的和为：" + sum);
        //System.out.println(sum);
        //3.求平均数
        double average = sum / arr.length ;
        System.out.println("平均值是" + average);
        //4.统计多少个数据比比平均值小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average){
                count++;
            }
        }
        System.out.println("有" + count + "个比平均值小");

        //遍历数组验证答案
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
