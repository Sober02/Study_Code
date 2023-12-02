package api.a04test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成
        //JDK7
        //规则: 只要对时间进行计算或者判断，都需要先获取当前时间的毫秒值

        //1.计算出生年月日的毫秒值
        String birthday = "2002年2月22日";
        //用SimpleDateFormat解析
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birthday);
        long birthdayTime = date.getTime();

        //2.获取当前时间的毫秒值
        long nowTime = System.currentTimeMillis();

        //3.计算间隔多少天
        long time = (nowTime - birthdayTime) / 1000 / 60 / 60 / 24;
        System.out.println(time);


        //JDK8
        LocalDate ld1 = LocalDate.of(2002,2,22);
        LocalDate ld2 = LocalDate.now();

        long days = ChronoUnit.DAYS.between(ld1, ld2);//第二个参数减去第一个参数
        System.out.println(days);
    }
}
