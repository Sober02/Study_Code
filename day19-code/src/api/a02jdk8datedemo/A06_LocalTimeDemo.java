package api.a02jdk8datedemo;

import java.time.LocalTime;

public class A06_LocalTimeDemo {
    public static void main(String[] args) {
        // 获取本地时间的日历对象。 （包含 时分秒）
        LocalTime nowTime = LocalTime.now();
        System.out.println("今天的时间：" + nowTime);

        int hour = nowTime.getHour();
        int minute = nowTime.getMinute();
        int second = nowTime.getSecond();
        int nano = nowTime.getNano();
        System.out.println("时:" + hour);
        System.out.println("分:" + minute);
        System.out.println("秒:" + second);
        System.out.println("毫秒:" + nano);

        System.out.println("-----------------------");
        System.out.println(LocalTime.of(8,20));//时分
        System.out.println(LocalTime.of(8, 20, 30));//时分秒
        System.out.println(LocalTime.of(8, 20, 30,150));//时分秒纳秒
        LocalTime mTime = LocalTime.of(8, 20, 30);

        //is系列的方法
        System.out.println(nowTime.isBefore(mTime));
        System.out.println(nowTime.isAfter(mTime));

        //with系列的方法，只能修改时、分、秒
        System.out.println(mTime.withHour(10));
        //minus系列的方法，只能减少时、分、秒
        System.out.println(mTime.minusHours(10));
        //plus系列的方法，只能增加时、分、秒
        System.out.println(mTime.plusHours(10));

    }
}
