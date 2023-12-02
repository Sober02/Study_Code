package api.a04test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Test5 {
    public static void main(String[] args) throws ParseException {
        /*
        判断任意的一个年份是闰年还是平年要求:
            用JDK7和JDK8两种方式判断
            提示:
            二月有29天是闰年
            一年有366天是闰年
         */

        //JDK7
        //用日历 Calendar
        //1.把时间设置为2023年3月1日
        //往前减一天看看是28天还是29天
        Calendar c1 = Calendar.getInstance();
        c1.set(2023,2,1);//月份的范围是0~11
        //再把日历往前减一天
        c1.add(Calendar.DAY_OF_MONTH,-1);
        //看看时间是28号还是29号
        int day = c1.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        if (day == 29){
            System.out.println("闰年");
        }else{
            System.out.println("不是闰年");
        }

        //2.将时间设置为2024 1 1 减一天 看看时间是365天还是366天
        Calendar c2 = Calendar.getInstance();
        c2.set(2024,0,1);
        c2.add(Calendar.DAY_OF_YEAR,-1);
        int day2 = c2.get(Calendar.DAY_OF_YEAR);
        System.out.println(day2);
        if (day2 == 366){
            System.out.println("闰年");
        }else{
            System.out.println("不是闰年");
        }

        //2023-02-1 00:00:00
        //2023-03-1 00:00:00
        //3.用毫秒
        /*String str1 = "2023年2月1日 0:0:0";
        String str2 = "2023年3月1日 0:0:0";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date1 = sdf1.parse(str1);
        Date date2 = sdf2.parse(str2);
        long time1 = date1.getTime();
        long time2 = date2.getTime();
        long result = time2 - time1;
        System.out.println(result / 1000 / 60 / 60 / 24);
        if (result / 1000 / 60 / 60 / 24 > 28){
            System.out.println("闰年");
        }else {
            System.out.println("不是闰年");
        }*/


        //JDK8
        LocalDate ld1 = LocalDate.of(2023, 3, 1);
        LocalDate ld2 = ld1.minusDays(1);
        System.out.println(ld2.getDayOfMonth());
        if (ld2.getDayOfMonth() == 29){
            System.out.println("闰年");
        }else{
            System.out.println("平年");
        }

        System.out.println(ld1.isLeapYear());//true - 闰年  false - 平年


    }
}
