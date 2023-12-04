package test;

public class Test2 {
    public static void main(String[] args) {
        /*
        有一个很有名的数学逻辑题叫做不死神兔问题，有一对兔子，从出生后第三个月起每个月都生一对兔子,
        小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第十二个月的兔子对数为多少?
                1月: 1
                2月: 1
                3月: 2
                4月: 3
                5月: 5
                6月: 8
                特点: 从第三个数据开始，是前两个数据和 (斐波那契数列)
         */

        //求解1：
        //1.创建一个数组存储每个月的兔子对数
        int[] arr = new int[12];
        //2.给索引0（第一个月）和索引1（第二个月）赋值为1
        arr[0] = 1;
        arr[1] = 1;
        //3.循环遍历数组，从索引2开始
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        //4.输出结果
        System.out.println(arr[arr.length-1]);

        //求解2：
        //利用递归实现
        //1.递归的规律
        //2.递归的出口
        //getSum(12) = getSum(11) + getSum(10)
        //getSum(11) = getSum(10) + getSum(9)
        //getSum(10) = getSum(9) + getSum(8)
        //...
        //getSum(2) = 1 //出口
        //getSum(1) = 1 //出口
        System.out.println(getSum(12));
    }

    public static int getSum(int month) {
        if (month == 1 || month == 2){
            return 1;
        }
        return getSum(month-1) + getSum(month - 2);
    }
}
