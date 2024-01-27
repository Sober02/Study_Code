package myexception;

public class ExceptionDemo7 {
    public static void main(String[] args) {
     /*
        自己处理 (捕获异常) 灵魂四问:
            灵魂一问:如果try中没有遇到问题，怎么执行?
            灵魂二问:如果try中可能会遇到多个问题，怎么执行?
            灵魂三问:如果try中遇到的问题没有被捕获，怎么执行?
            灵魂四问:如果try中遇到了问题，那么try下面的其他代码还会执行吗?
     */
        /*灵魂三问:如果try中遇到的问题没有被捕获，怎么执行?
            相当于try...catch的代码白写了，最终还是会交给虚拟机进行处理。
         */

        int[] arr = {1,23,4,5,6};

        try{
            System.out.println(arr[10]);//new ArrayIndexOutOfBoundsException
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }

        System.out.println("看看我执行了吗");

    }
}
