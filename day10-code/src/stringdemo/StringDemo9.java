package stringdemo;
//截取号码 ---  13112346984  ---  131****6984
public class StringDemo9 {
    public static void main(String[] args) {
        //1.定义号码
        String phoneNumber = "13112346984";
        //2.截取开头部分 subString(n1,n2) n1n2是索引 --> 包头不包尾  [0,3)
        String start = phoneNumber.substring(0,3);
        //3.截取末尾部分 subString(n1)  -->  n1索引开始截取到末尾
        String end = phoneNumber.substring(7); //6984
        //4.拼接打印
        String result = "";
        result = start + "****" + end ;
        System.out.println(result);
    }
}
