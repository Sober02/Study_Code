public class Test4 {
    public static void main(String[] args) {
        /*需求:
        把一个数组中的元索复制到另一个新数组中去。*/
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] newArr = getArr(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    //我要干什么？    复制数组元素到新的数组
    //我干这件事需要什么?    原数组
    //方法的结果是否需要继续使用？  返回新数组
    public static int[] getArr(int[] arr) {
        int[] getArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            getArr[i] = arr[i];
        }
        return getArr;
    }
}
