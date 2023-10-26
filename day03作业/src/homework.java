import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
       /*
       题目1(训练)
        身高是具有遗传性的，子女的身高和父母的身高有一定的关系。
        假定，父母和子女的身高遗传关系如下：
        儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
        女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
        现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？
        */
        /*
        int father = 177;
        int mother = 165;
        double son = (father + mother)* 1.08 / 2;
        double daughter = (father*0.923 + mother) / 2;
        System.out.println(son);
        System.out.println(daughter);

         */

        /*
        某小伙想定一份外卖，商家的优惠方式如下：
        鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。
        订单满30元8折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣
        不能同时使用。那么这个小伙要点这三样东西，最少要花多少钱？
         */
        /*
        int fish = 24;
        int fish2 = 16;
        int huashengmi = 8;
        int rice = 3;
        //方案一
        double price1 = (fish + huashengmi + rice)*0.8;
        //方案二
        double price2 = (fish2 + huashengmi + rice);
        //对比
        double price = price1 > price2 ? price1 : price2;
        System.out.println(price);

        */

        /*
        键盘录入一个三位数，求这个三位数每一位的数字和。
        eg:123 -> 1+2+3=6
         */

        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();
        //分别求百位、十位、个位，然后求和
        int bai = num/100;
        int shi = num/10%10;
        int ge  = num%10;
        int sum = bai + shi + ge;
        System.out.println(sum);
    }
}
