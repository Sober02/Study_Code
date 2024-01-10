package doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {

    //牌盒
    static HashMap<Integer,String> hm = new HashMap<>();
    //牌盒的序号
    static ArrayList<Integer> list = new ArrayList<>();


    static {
        //准备牌
        // "♦", "♣", "♥", "♠"
        // "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int serialNumber = 1;

        for (String n : number) {
            for (String c : color) {
                hm.put(serialNumber,n+c);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber,"小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber,"大王");
        list.add(serialNumber);
    }

    public PokerGame(){
        //System.out.println(hm);
        //洗牌
        Collections.shuffle(list);

        //发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            //i 依次表示集合中的每一个索引
            //list.get(i) 依次表示集合中的每一个元素 - 序号
            int serialNumber = list.get(i);

            //发3张地主牌
            if (i <= 2){
                lord.add(serialNumber);
                continue;
            }

            //分别给3位玩家发牌
            if (i % 3 == 0){
                player1.add(serialNumber);
            }else if (i % 3 == 1){
                player2.add(serialNumber);
            }else{
                player3.add(serialNumber);
            }

        }

        //看牌
        lookPoker("地主牌",lord);
        lookPoker("刚脑壳",player1);
        lookPoker("帅比",player2);
        lookPoker("蛋塔",player3);

    }
    //参数一：玩家的名字
    //参数二：每位玩家的牌
    public static void lookPoker(String name,TreeSet<Integer> ts){
        System.out.print(name + "：");
        for (int serialNumber : ts) {
            System.out.print(hm.get(serialNumber) + " ");
        }
        System.out.println();
    }
}
