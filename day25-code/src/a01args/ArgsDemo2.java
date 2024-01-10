package a01args;

public class ArgsDemo2 {
    public static void main(String[] args) {
        /*
        假如需要定义一个方法求和，该方法可以灵活的完成如下需求:
            计算n个数据的和
         */

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(getSum(arr));


    }
    //计算n个数据的和
    public static int getSum(int[] arr){
        int sum=0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }


}
