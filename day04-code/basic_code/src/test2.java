import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        /*
        在实际开发中，多种情况判断时，会用到if的第三种格式:
        需求:
        商场都会有VIP的会员制，根据不同的会员会有不同的折扣
        假设商品总价为1000。
        键盘录入会员级别，并计算出实际支付的钱
        会员1级:打9折。
        会员2级:打8折。
        会员3级:打7折。
        非会员:不打折，要打也是打骨折
         */

        //键盘录入会员级别
        int goods = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员等级(1,2,3)");
        int level =  sc.nextInt();
        //判断会员等级
        if (level == 1){
            double price = goods * 0.9;
            System.out.println("请支付：" + price);
        }else if(level == 2){
            double price = goods * 0.8;
            System.out.println("请支付：" + price);
        }else if (level == 3){
            //double price = goods * 0.7;
            //System.out.println("请支付：" + price);
            System.out.println("请支付：" + (goods * 0.7));
        }else{
            System.out.println("请支付：" + goods);
        }

    }
}
