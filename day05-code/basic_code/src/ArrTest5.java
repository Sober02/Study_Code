public class ArrTest5 {
    public static void main(String[] args) {
//        需求:已知数组元素为{33,5,22,44,55]
//            请找出数组中最大值并打印在控制台

        //1.定义数组
        //2.遍历数组，arr[0]-arr[1]对比，找出最大值

        int [] arr = {33,86,77,44,55};
        int max = arr[0];
        //max的值一定是数组中的元素
        //int max = 0;
        // 不要赋值0，如果数组中都是负数，那么0就是最大值了
        //3.循环中开始条件一定是0吗?
//循环的开始条件如果为0，那么第一次循环就是自己跟自己比，对结果没有影响，但是效率偏低
// 为了提高效率，减少一次循环的次数，循环开始条件可以写1.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
