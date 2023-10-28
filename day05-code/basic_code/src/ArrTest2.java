public class ArrTest2 {
    public static void main(String[] args) {
        /*定义一个数组，存储1,2,3,4,5,6,7,8,9,10遍历数组得到每一个元素，
        统计数组里面一共有多少个能被3整除的数字*/

        //1.先遍历数组，遍历的同时判断是否能被3整除
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0){
                count++;//2.符合条件count++
            }
        }
        System.out.println("能被3整除的数字有" + count + "个");

    }
}
