import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //机票价格按照淡季旺季、头等舱和经济舱收费、
        // 输入机票原价、月份和头等舱或经济舱。
        // 按照如下规则计算机票价格: 旺季(5-10月)头等舱9折，经济舱8.5折，
        // 淡季(11月到来年4月)头等舱7折，经济舱6.5折。

        //价格、月份、类型

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入机票价格：");
        int ticket = sc.nextInt();
        System.out.print("请输入购票月份(1-12)：");
        int month = sc.nextInt();
        System.out.print("机票类型（头等舱 0/经济舱 1）：");
        int type = sc.nextInt();

        //计算机票价格
        switch (month) {
            case 11, 12, 1, 2, 3, 4:
                //可优化代码
                /*if (type == 0) {
                    ticket = (int)(ticket * 0.7);
                    System.out.println("优惠后价格是：" + ticket);
                } else if (type == 1) {
                    ticket = (int)(ticket * 0.65);
                    System.out.println("优惠后价格是：" + ticket);
                } else {
                    System.out.println("类型错误，请输入0或1");
                }
                break;*/
                getPrice(ticket,type,0.7,0.65);
                break;
            case 5, 6, 7, 8, 9, 10:
                /*if (type == 0) {
                    ticket = (int)(ticket * 0.9);
                    System.out.println("优惠后价格是：" + ticket);
                } else {
                    ticket = (int)(ticket * 0.85);
                    System.out.println("优惠后价格是：" + ticket);
                }
                break;*/
                getPrice(ticket,type,0.9,0.85);
                break;
            default:
                System.out.println("输入的月份不存在！");
                break;
        }
    }
    //定义方法优化代码

    //我要干什么？    计算优惠后的票价
    //我干这件事需要什么？    原票价 票类型-头等舱0 经济舱1 折扣
    //方法的结果是否需要继续使用？    需要返回
    public static int getPrice(int ticket,int seat,double v0,double v1){
        if(seat == 0){
            ticket = (int)(ticket*v0);
            System.out.println("优惠后价格是：" + ticket);
        }else if (seat == 1){
            ticket = (int)(ticket*v1);
            System.out.println("优惠后价格是：" + ticket);
        }else{
            System.out.println("类型错误，请输入0或1");
        }
        return ticket;
    }
}
