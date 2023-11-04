package stringdemo;

/*
定义一个方法，把int 数组中的数据按照指定的格式
拼接成一个字符串返回调用该方法，并在控制台输出结果。例如:
数组为int[] arr={1,2,3};
执行方法后的输出结果为:[1,2,3]
 */
public class StringDemo6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4};
        String str = arrToString(arr);
        System.out.println(str);
    }

    //1.遍历数组  拼接字符串
    //2.需要： 数组
    //3.需要返回拼接好的字符串
    public static String arrToString(int[] arr) {
        //先判断数组是否为空或者长度为0
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) { //int[] arr =new arr[0]
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            //i 索引 arr[i] 元素
            int str = arr[i];
            if (i == arr.length - 1) {
                result = result + str + "]";
            } else {
                result = result + str + ", ";
            }
        }
        return result;
    }
}
