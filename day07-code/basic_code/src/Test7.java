public class Test7 {
    public static void main(String[] args) {
        //解密-8346
        /*某系统的数字密码(大于0)，比如1983，采用加密方式进行传输
        规则如下:
        先得到每位数，然后
        每位数都加上5，
        再对10求余，
        最后将所有数字反转，得到一串新数。
        */

        //定义数组
        int[] arr = {8, 3, 4, 6};
        //将所有数字反转-6 4 3 8
        int temp = 0;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //原来是对10求余，所以需要判断
        //因为原来求余之前+5，所以判断 5,6,7,8,9不变，0,1,2,3,4需加10
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = arr[i] + 10;
            }
        }//6 14 13 8

        //每一位减5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }//1 9 8 3

        //拼接组成解密结果
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.print(number);
    }
}
