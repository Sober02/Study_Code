package api.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A04SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        /*
            假设，你初恋的出生年月日为: 2000-11-11
            请用字符串表示这个数据，并将其转换为: 2000年11月11日
         */

        //1.定义一个字符串表示时间
        String str = "2000-11-11";
        //2.利用指定格式的构造方法创建SimpleDateFormat对象
        //细节：
        //创建对象的格式要跟字符串的格式完全一致
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        //3.获取到Date对象
        Date date = sdf1.parse(str);
        //4.格式化
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String s = sdf2.format(date);
        System.out.println(s);
    }
}
