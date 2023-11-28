package api.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A03SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        /*
            public SimpleDateFormat()               默认格式
            public SimpleDateFormat(String pattern) 指定格式

            public final String format(Date date)   格式化(日期对象 -> 字符串)
            public Date parse(String source)        解析(字符串 -> 日期对象)
         */

        //method();

        //1.定义一个字符串表示时间
        String str = "2023-11-11 11:11:11";
        //2.利用指定格式的构造方法创建SimpleDateFormat对象
        //细节：
        //创建对象的格式要跟字符串的格式完全一致
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        //获取到date后可以用getDate获取时间的毫秒值进行加减或判断
        //3.打印结果
        System.out.println(date.getTime());//1699672271000

    }

    private static void method() {
        //1.利用空参构造创建SimpleDateFormat对象，默认格式
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String str1 = sdf1.format(d1);
        System.out.println(str1);//1970/1/1 上午8:00

        //2.利用带参构造创建SimpleDateFormat对象，指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str2 = sdf2.format(d1);
        System.out.println(str2);//1970年01月01日 08:00:00

        //练习：yyyy年MM月dd日 时:分:秒 星期E
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str3 = sdf3.format(d1);
        System.out.println(str3);
    }
}
