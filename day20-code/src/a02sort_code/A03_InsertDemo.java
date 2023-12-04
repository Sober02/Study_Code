package a02sort_code;

public class A03_InsertDemo {
    public static void main(String[] args) {
        /*
            插入排序:
            将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成是无序的。
            遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
            N的范围: 0~最大索引
         */

        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        //1.找到无序的哪一组数组是从哪个索引开始的。2
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i+1]){
                startIndex = i + 1;
                //System.out.println(startIndex);
                break;
            }
        }

        //2.遍历从startIndex开始到最后一个元素，依次得到无序的哪一组数据中的每一个元素
        for (int i = startIndex; i < arr.length; i++) {
            //问题: 如何把遍历到的数据，插入到前面有序的这一组当中

            //记录当前要插入数据的索引
            int j = i;

            while (j > 0 && arr[j] < arr[j-1]){
                //交换位置
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        //打印数组
        printArr(arr);


    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
