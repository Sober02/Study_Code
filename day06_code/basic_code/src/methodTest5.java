public class methodTest5 {
    public static void main(String[] args) {
        /*
            需求:定义一个方法copyOfRange(int[] arr,int from,int to)功能:
            将数组arr中从索引from (包含from)开始到索引to
            结束(不包含to)的元素复制到新数组中将新数组返回
         */
        //1.定义数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //2.调用方法
        int[] newArr = copyOfRange(arr, 3, 7);
        //3.遍历新数组
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    //1.我要干什么？      定义一个复制数组元素到新数组的方法
    //2.干这件事需要什么？   原数组  索引from  索引to
    //3.方法的结果是否需要继续使用？  返回新数组- 方法类型Int[]

    public static int[] copyOfRange(int[] arr, int from, int to) {
        //定义一个新的数组存储元素
        int[] arr2 = new int[to - from];

        //伪造索引的思想
        int Index = 0;

            for (int i = from; i < to; i++) {
                //格式: 数组名[索引] = 数据值;
                arr2[Index] = arr[i];
                Index++;
            }
        //3.把新数组返回
        return arr2;
    }
}
