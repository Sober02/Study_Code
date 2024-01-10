package doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {

    //牌盒
    //静态里面只能访问静态，所以要加static关键字
    static ArrayList<String> list = new ArrayList<>();

    //静态代码块
    //特点：随着类的加载而加载的，而且只执行一次

    static {
        //准备牌
        // "♦", "♣", "♥", "♠"
        // "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String c : color) {
            //c 依次表示每一种花色
            for (String n : number) {
                //n 依次表示每一个数字
                list.add(c + n);
            }
        }
        list.add("小王");
        list.add("大王");
    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);

        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        //使用普通for循环遍历，因为需要用到索引
        for (int i = 0; i < list.size(); i++) {
            String n = list.get(i);
            //先发前三张地主牌
            if (i <= 2){
                lord.add(n);
                continue;
            }
            //分别给三个玩家发牌
            if (i%3 == 0){
                player1.add(n);
            }else if (i%3 == 1){
                player2.add(n);
            }else{
                player3.add(n);
            }
        }

        //看牌
        lookPoker("底牌",lord);
        lookPoker("张三",player1);
        lookPoker("帅逼",player2);
        lookPoker("李四",player3);
    }

    //参数一：玩家的名字
    //参数二：每位玩家的牌
    private void lookPoker(String name,ArrayList<String> list) {
        System.out.print(name + "：");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }

}
