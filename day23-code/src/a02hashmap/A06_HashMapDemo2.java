package a02hashmap;

import java.util.*;

public class A06_HashMapDemo2 {
    public static void main(String[] args) {
/*
            某个班级80名学生，现在需要组成秋游活动，
            班长提供了四个景点依次是 (A、B、c、D)
            每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
*/
        //1.先让同学们先投票
        //定义一个数组存储4个景点
        String[] arr = {"A","B","C","D"};
        ArrayList<String> list = new ArrayList<>();
        //利用随机数模拟88个同学的投票，并把投票的结果存储起来
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            String s = arr[index];
            list.add(s);
            //System.out.println(s);
        }

        //2.如果要统计的东西比较多，不方便使用计数器思想
        //我们可以定义map集合，利用集合进行统计。
        HashMap<String,Integer> hm = new HashMap<>();
        for (String name : list) {
            //判断当前的景点在map集合当中是否存在
            if (hm.containsKey(name)){
                //景点存在
                //先获取当前景点已经被投票的次数
                int count = hm.get(name);
                //表示当前景点又被投了一次
                count++;
                //把新的次数再次添加到集合当中
                hm.put(name,count);
            }else{
                //景点不存在
                hm.put(name,1);
            }
        }
        //3.求最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int value = entry.getValue();
            if (value > max){
                max = value;
            }
        }
        System.out.println(hm);
        //System.out.println(max);

        //4.遍历集合找到和最大值一样的景点，打印该景点
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == max){
                System.out.println(entry.getKey());
            }
        }
    }
}
