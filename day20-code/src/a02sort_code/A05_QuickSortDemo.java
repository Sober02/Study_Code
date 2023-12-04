package a02sort_code;

public class A05_QuickSortDemo {
    public static void main(String[] args) {
        /*
            快速排序:
             第一轮: 以0索引的数字为基准数，确定基准数在数组中正确的位置。
             比基准数小的全部在左边，比基准数大的全部在右边。
             后面以此类推。

             注意事项：
             一定要先确定执行后面的指针(end)找出第一个比基准数小的数字，再执行start

             双指针的遍历要注意顺序问题，默认情况我们选取的参考值baseNumber是数组索引0的数字，
             那么逻辑上就应该先让end指针向前遍历，这样才能确保左边数组一定都小于baseNumber值。
             否则，begin指针将会在一个大于baseNumber值的位置停下，这个数会与baseNumber交换，
             但是显然也被归到了左边数组
         */

        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};


        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    //参数一: 我们要排序的数组
    //参数二:要排序数组的起始索引
    //参数三:要排序数组的结束索引
    private static void quickSort(int[] arr, int i, int j) {

        //定义两个变量记录start和end
        int start = i;
        int end = j;

        //递归的出口
        if (start > end){
            return;
        }

        //定义基准数
        int baseNumber = arr[i];

        //利用循环找到要交换的数字
        while(start != end){

            //利用end从后往前找比基准数小的数字
            while (true){
                if (start >= end || arr[end] < baseNumber){
                    //找到了比基准数小的就跳出while(true)
                    break;
                }
                //没有找到就继续往后找
                end--;
            }
            //利用start从前往后找比基准数大的数字
            while (true){
                if (start >= end || arr[start] > baseNumber){
                    //找到了比基准数大的就跳出while(true)
                    break;
                }
                //没有找到就继续往后找
                start++;
            }
            //把end和start指向的元素进行交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //当end和start指向了同一个元素的时候，那么上面的循环结束
        //表示已经找到了基准数在数组中应存入的位置
        //基准数归位
        //就是拿着这个范围中的第一个数字，跟start指向的元素进行交换
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        //基准数归位后利用递归循环操作
        //确定基准数(6)左边的范围，重复刚刚所做的事情
        quickSort(arr,i,start-1);

        //确定基准数(6)右边的范围，重复刚刚所做的事情
        quickSort(arr,start+1,j);
    }
}
