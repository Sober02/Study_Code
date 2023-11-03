package test4;

//定义数组存储3部汽车对象。
//汽车的属性:品牌。价格，颜色。
//创建三个汽车对象，数据通过键盘录入而来，并把数据存入到数组当中。

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //1.定义数组存储3部汽车对象
        Car[] arr = new Car[3];
        //2.录入汽车数据
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //先创建对象
            Car car = new Car();
            //录入品牌
            System.out.println("请输入汽车的品牌：");
            String brand = sc.next();
            car.setBrand(brand);
            //录入价格
            System.out.println("请输入汽车的价格：");
            int price = sc.nextInt();
            car.setPrice(price);
            //录入颜色
            System.out.println("请输入汽车的颜色：");
            String color = sc.next();
            car.setColor(color);

            //把汽车对象存入数组中
            arr[i] = car;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBrand() + " " + arr[i].getPrice() + " " + arr[i].getColor());
        }
    }
}
