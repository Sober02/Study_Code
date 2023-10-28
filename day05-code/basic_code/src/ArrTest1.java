public class ArrTest1 {
    public static void main(String[] args) {
        /*定义一个数组，存储1,2,3,4,5遍历数组
        得到每一个元素，求数组里面所有的数据和*/

        int sum = 0;
        int [] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
