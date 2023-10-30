public class methodTest3 {
    public static void main(String[] args) {
        //需求:设计一个方法求数组的最大值，并将最大值返回

        //1.定义数组
        int[] arr = {92,44,6,77,83,46,96};
        //2.调用方法求最大值
        System.out.println(getMax(arr));
    }

    //设计方法：
    //1.我要干什么？          求最大值
    //2.我干这件事需要什么？   数组
    //3.这件事是否需要返回一个值？ 返回最大值

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
        }
        return max;
    }
}
