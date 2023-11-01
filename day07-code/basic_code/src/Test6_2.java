public class Test6_2 {
    public static void main(String[] args) {
        //需求:
        // 把整数上的每一位都添加到数组当中
        // 反向推导

        //计算数组长度
        int number = 12345;
        int temp = number;
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        //System.out.println(count);
        //定义数组
        int[] arr = new int[count];

        //把整数添加进数组中
        //获取到他的每一位
        int index = arr.length - 1;
        while (temp != 0) {
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }
        //验证代码
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
