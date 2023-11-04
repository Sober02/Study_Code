package stringbuilderdemo;
/*
拼接字符串
需求:定义一个方法，把int[]数组中的数据按照指定的格式拼接成一个字符串返回调用该方法，
并在控制台输出结果。
例如:数组为int[] arr ={1,2,3);
执行方法后的输出结果为:[1,2,3]
 */
public class StringBuilderDemo5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(getArrToString(arr));
    }
    public static String getArrToString(int[] arr){
        StringBuilder sb = new StringBuilder().append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                sb.append(arr[i] + "]");
            }else{
                sb.append(arr[i] + ", ");
            }
        }
        return sb.toString();
    }
}
