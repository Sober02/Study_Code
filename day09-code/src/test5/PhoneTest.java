package test5;

//定义数组存储3部手机对象
//手机的属性:品牌，价格，颜色。
//要求，计算出三部手机的平均价格
public class PhoneTest {
    public static void main(String[] args) {
        //1.定义数组
        Phone[] phones = new Phone[3];
        //2.创建3个手机对象
        Phone p1 = new Phone("小米13Pro+", 8990, "经典黑");
        Phone p2 = new Phone("苹果15Promax", 15990, "经典白");
        Phone p3 = new Phone("华为mate60pro", 12999, "炫彩黑");

        //3.将手机对象存入数组
        phones[0] = p1;
        phones[1] = p2;
        phones[2] = p3;
        //打印一下手机属性
        for (int i = 0; i < phones.length; i++) {
            Phone p = phones[i];
            System.out.println(p.getBrand() + "  " + p.getPrice() + "  " + p.getColor());
        }
        //4.遍历数组找到手机价格求和
        int sum = 0;
        for (int i = 0; i < phones.length; i++) {
            Phone p = phones[i];
            int price = p.getPrice();
            sum = sum + price;
        }
        //System.out.println(sum);
        //5.根据总价格和求平均价格
        double avg = 0;
        avg = sum / phones.length;
        System.out.println("三部手机的平均价格是：" + avg);
    }
}
