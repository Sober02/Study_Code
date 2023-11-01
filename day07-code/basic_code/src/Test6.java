public class Test6 {
    public static void main(String[] args) {
        //数字加密
        /*某系统的数字密码(大于0)，比如1983，采用加密方式进行传输
        规则如下:
        先得到每位数，然后
        每位数都加上5，
        再对10求余，
        最后将所有数字反转，得到一串新数。
        */

        //1.定义一个数组存储密码
        int[] arr = {1, 9, 8, 3};
        //2.加密：
        //每位数加5   6,14,13,8
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
            //System.out.println(arr[i]);
        }
        //对10求余    6,4,3,8
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
            //System.out.println(arr[i]);
        }
        //所有数字反转 6438 - 8346
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
        }
        //输出加密后的结果
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);
    }
}
