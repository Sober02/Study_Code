package api.a02jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class A04_DateTimeFormatterDemo {
    public static void main(String[] args) {
        /*
            static DateTimeFormatter ofPattern(格式)    获取格式对象
            String format(时间对象)                     按照指定方式格式化
         */

        //1.创建时间对象 带时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        //2.获取格式对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss EE a");

        //3.按照指定方式格式化
        String str = dtf.format(time);
        System.out.println(str);
    }
}
