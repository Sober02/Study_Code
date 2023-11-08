package test;

import java.util.ArrayList;

public class test7 {
    public static void main(String[] args) {
        /*
        添加手机对象并返回要求的数据
        需求:
        定义Javabean类:Phone
        Phone属性:品牌，价格。
        main方法中定义一个集合，存入三个手机对象。
        分别为:小米，1000。苹果，8000。锤子2999。
        定义一个方法，将价格低于3000的手机信息返回
         */
        //1.定义一个集合
        ArrayList<Phone> list = new ArrayList<>();
        //2.创建手机对象
        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("苹果",8000);
        Phone p3 = new Phone("锤子",2999);

        //3.将对象存入集合
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //4.调用方法
        ArrayList<Phone> phoneInfoList = getInfo(list);
        //5.遍历集合 - 打印满足条件的手机信息
        for (int i = 0; i < phoneInfoList.size(); i++) {
            String brand = phoneInfoList.get(i).getBrand();
            int price = phoneInfoList.get(i).getPrice();
            System.out.println(brand + ", " + price);
        }
    }
    //将价格低于3000的手机信息返回
    //需要： 集合
    //返回满足条件的手机信息

    //技巧：
    //如果我们要返回多个数据，可以先把数据放到一个容器中，再把容器返回
    //容器：集合  数组
    public static ArrayList<Phone> getInfo(ArrayList<Phone> list){
        //定义一个集合用于存储价格低于3000的手机对象
        ArrayList<Phone> resultList = new ArrayList<>();
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            //如果当前手机价格低于3000，将手机对象添加到resultList中
            if (p.getPrice() < 3000){
                resultList.add(p);
            }
        }
        return resultList;
    }
}
