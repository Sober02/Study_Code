import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //概念理解+分析题目的逻辑+多多练习！
/*
        if的注意点:
        1.大括号的开头可以另起一行书写，但是建议写在第一行的末尾
        eg：if(表达式){
    }
        2.在语句体中，如果只有一句代码，大括号可省略不写。个人建议，大括号还是不要省略
        3.如果对一个布尔类型的变量进行判断，不要用==号，直接把变量写在小括号即可
 */
       /*
       假设某影院售卖了100张票，票的序号为1~100。
       其中奇数票号坐左侧，偶数票号坐右侧
       键盘录入一个整数表示电影票的票号。
       根据不同情况，给出不同的提示。
       如果票号为奇数，那么打印坐左边
       如果票号为偶数，那么打印坐右边
        */
        //1.键盘录入一个整数表示电影票的票号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电影票的票号");
        int ticket = sc.nextInt();
        //2.先判断票号是否是1~100，然后判断奇偶
        if(ticket >= 0 && ticket <=100) {
            if (ticket % 2 == 0) {
                System.out.println("坐右边");
            } else {
                System.out.println("坐左边");
            }
        }else{
            System.out.println("票号有误");
        }
    }
}
