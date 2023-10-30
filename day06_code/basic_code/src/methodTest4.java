public class methodTest4 {
    public static void main(String[] args) {
        //定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处

        //1.定义数组
        int [] arr = {1,3,4,6,7,9,19};
        //2.调用方法
        System.out.println(contains(arr,2));
    }
    //1.我要干什么？          判断数组的一个数
    //2.我干这件事需要什么？     数组  数字
    //3.调用处是否需要继续使用结果？  返回 true/false

    public static boolean contains(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]){
                return true;
            }
        }
        return false;
    }
    //return break关键字的区别
    //return:其实跟循环没有什么关系，跟方法有关的，
    //表示1.结束方法 2.返回结果如果方法执行到了return，
    // 那么整个方法全部结束，里面的循环也会随之结束了。
}
