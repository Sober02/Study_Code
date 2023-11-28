package api.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A05SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        /*
            秒杀活动: 2023年11月11日 00:00:00(毫秒值)
            结束时间: 2023年11月11日 00:10:00 (毫秒值)
            小贾下单并付款的时间为: 2023年11月11日 00:01:00
            小皮下单并付款的时间为: 2023年11月11日 00:11:00
            用代码说明这两位同学有没有参加上秒杀活动? */

        //1.定义字符串表示四个时间
        String startStr = "2023年11月11日 00:00:00";
        String endStr = "2023年11月11日 00:10:00";
        String orderStr1 = "2023年11月11日 00:01:00";//小贾
        String orderStr2 = "2023年11月11日 00:11:00";//小皮

        //2.解析上面的四个时间，得到Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(startStr);
        Date endDate = sdf.parse(endStr);
        Date orderDate1 = sdf.parse(orderStr1);
        Date orderDate2 = sdf.parse(orderStr2);

        //3.得到四个时间的毫秒值
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime1 = orderDate1.getTime();
        long orderTime2 = orderDate2.getTime();

        if (orderTime1 > startTime && orderTime1 < endTime){
            System.out.println("小贾同学参加上了秒杀活动");
        }else{
            System.out.println("小贾同学未能参加上秒杀活动");
        }

        //4.判断
        if (orderTime2 > startTime && orderTime2 <endTime){
            System.out.println("小皮同学参加上了秒杀活动");
        }else{
            System.out.println("小皮同学未能参加上秒杀活动");
        }
    }
}
