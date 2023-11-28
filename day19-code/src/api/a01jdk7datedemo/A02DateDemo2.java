package api.a01jdk7datedemo;

import java.util.Date;
import java.util.Random;

public class A02DateDemo2 {
    public static void main(String[] args) {
        /*
        需求1:打印时间原点开始一年之后的时间
        需求2:定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
         */

        //需求1:打印时间原点开始一年之后的时间
        //1.创建一个对象，表示时间原点
        Date d1 = new Date(0L);
        //2.获取d1时间的毫秒值
        long time = d1.getTime();
        //3.在这个基础上我们要加一年的毫秒值即可
        time = time + 1000L * 60 * 60 * 24 * 365;
        //4.把计算之后的时间毫秒值，再设置回d1当中
        d1.setTime(time);
        //5.打印d1
        System.out.println(d1);//Fri Jan 01 08:00:00 CST 1971

        //需求2:定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
        Random r = new Random();
        //创建两个时间对象
        Date d2 = new Date(Math.abs(r.nextInt()));
        Date d3 = new Date(Math.abs(r.nextInt()));
        System.out.println(d2);
        System.out.println(d3);

        //获取两个时间，因为d2 d3是对象，不能比较
        long time1 = d2.getTime();
        long time2 = d3.getTime();

        if (time1 > time2){
            System.out.println("第二个时间在前，第一个时间在后");
        }else if (time2 > time1){
            System.out.println("第一个时间在前，第二个时间在后");
        }else{
            System.out.println("两个时间一样");
        }
    }
}
