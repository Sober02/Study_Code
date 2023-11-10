package Advanceoop.a02staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {3.5,4.5,6.6,5,5,7.4};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
