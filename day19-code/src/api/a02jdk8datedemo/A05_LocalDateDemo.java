package api.a02jdk8datedemo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class A05_LocalDateDemo {
    public static void main(String[] args) {
        //1.获取当前时间的日历对象（包含 年月日）
        LocalDate nowDate = LocalDate.now();
        System.out.println("今天的日期：" + nowDate);

        //2.获取指定的时间的日历对象
        LocalDate ldDate = LocalDate.of(2023, 12, 22);
        System.out.println("指定日期：" + ldDate);

        //3.get系列方法获取日历中的每一个属性值
        //获取年
        int year = ldDate.getYear();
        //获取月
        //方式一：
        Month m = ldDate.getMonth();//获取对象
        System.out.println(m);//DECEMBER
        System.out.println(m.getValue());//12

        //方式二：
        int month = ldDate.getMonthValue();
        System.out.println("month：" + month);//12

        //获取日
        int day = ldDate.getDayOfMonth();
        System.out.println("day: " + day);

        //获取一年的第几天
        int dayOfYear = ldDate.getDayOfYear();
        System.out.println("dayOfYear: " + dayOfYear);

        //获取星期
        DayOfWeek dayOfWeek = ldDate.getDayOfWeek();
        System.out.println("dayOfWeek: " + dayOfWeek);
        System.out.println("dayOfWeek: " + dayOfWeek.getValue());


        //is开头的方法表示判断
        System.out.println("is开头的方法表示判断");
        System.out.println(ldDate.isBefore(ldDate));
        System.out.println(ldDate.isAfter(ldDate));


        System.out.println("with开头的方法表示修改，只能修改年月日");
        //with开头的方法表示修改，只能修改年月日
        //细节：
        //每次修改后是创建了一个新的对象存储，而不是修改原来的对象属性
        LocalDate withYear = ldDate.withYear(2020);
        LocalDate withMonth = ldDate.withMonth(9);
        LocalDate withDayOfMonth = ldDate.withDayOfMonth(9);
        System.out.println(withYear);
        System.out.println(withMonth);
        System.out.println(withDayOfMonth);


        System.out.println("minus开头的方法表示修改，只能减少年月日");
        //minus开头的方法表示修改，只能减少年月日
        LocalDate minusYears = ldDate.minusYears(1);
        LocalDate minusMonths = ldDate.minusMonths(1);
        LocalDate minusDays = ldDate.minusDays(1);
        System.out.println(minusYears);
        System.out.println(minusMonths);
        System.out.println(minusDays);

        System.out.println("plus开头的方法表示修改，只能增加年月日");
        //plus开头的方法表示修改，只能增加年月日
        LocalDate plusYears = ldDate.plusYears(1);
        LocalDate plusMonths = ldDate.plusMonths(1);
        LocalDate plusDays = ldDate.plusDays(1);
        System.out.println(plusYears);
        System.out.println(plusMonths);
        System.out.println(plusDays);

        System.out.println("====================================");
        // 判断今天是否是你的生日
        LocalDate birDate = LocalDate.of(2002, 11, 3);
        LocalDate nowDate1 = LocalDate.now();

        MonthDay birMd = MonthDay.of(birDate.getMonth(), birDate.getDayOfMonth());
        MonthDay nowMd = MonthDay.from(nowDate1);

        System.out.println("今天是你的生日吗？" + birMd.equals(nowMd));

    }
}
