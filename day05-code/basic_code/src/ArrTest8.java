import java.util.Random;

public class ArrTest8 {
    public static void main(String[] args) {
        //需求: 定义一个数组，存入1~5。要求打乱数组中所有数据的顺序。
        // 难点:
        //如何获取数组中的随机索引
        /* int[] arr = (1,2,3,4,5};
        //索引范围: 0 1 2 3 4
        Random r = new Random();
        int randomIndex = r.nextInt(arr.length);
        System.out.printIn(randomIndex);*/

        //1.定义数组
        int[] arr = {1,2,3,4,5};
        //2.循环打乱
        //定义随机数
        Random r = new Random();
        //定义中间变量temp
        int temp = 0;
        for (int i = 0 ; i < arr.length ; i++){
            int randomIndex = r.nextInt(arr.length);
            temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp ;
        }
        //遍历数组验证代码
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
