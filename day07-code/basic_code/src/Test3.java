import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*需求:
        定义方法实现随机产生一个5位的验证码
        验证码格式:
        长度为5
        前四位是大写字母或者小写字母
        最后一位是数字*/


        //方法:
        //在以后如果我们要在一堆没有什么规律的数据中随机抽取
        // 可以先把这些数据放到数组当中
        // 再随机抽取一个索引

        //分析：1.先把大小写字母存入数组中
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            //ASCII
            arr[i] = (char) (97 + i); //97 - a
            if (i > 25) {
                //i=26, 65 - A
                arr[i] = (char) (65 + i - 26);
            }
        }
        //遍历
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        //2.随机抽取4次
        Random r = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(arr.length);
            result = result + arr[randomIndex];
        }
        //System.out.print(result);
        //3.随机抽取一个数字0~9
        int number = r.nextInt(10);//包左不包右0~9
        result = result + number;
        System.out.print(result);

    }
}
