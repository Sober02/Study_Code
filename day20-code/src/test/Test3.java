package test;

public class Test3 {
    public static void main(String[] args) {
        /*
            有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个!
            以后每天猴了都吃当前剩下米的一半，然后再多吃一个，
            第10天的时候(还没吃) ，发现只剩下一个桃子了，请问，最初总共多少个桃子?

            day10:  1
            day9:  (day10+1) *2 = 4
            day8:  (day9 +1) *2 = 10
            day7:  (day8 +1) *2 = 22

            //1.出口
                day == 10  剩下1

            //2.规律
                每一天的桃子数量都是后一天数量加1，乘以2
         */
        System.out.println(getCount(8));


    }
    public static int getCount(int day){
        if (day <= 0 || day >= 11){
            System.out.println("不在有效数据内");
            return -1;
        }

        if (day == 10){
            return 1;
        }else {
            return (getCount(day+1) + 1) * 2;
        }

    }
}
