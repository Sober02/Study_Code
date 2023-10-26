public class test2_2 {
    public static void main(String[] args) {
        /*
        需求:一座寺庙里住着三个和尚，已知他们的身高
        分别为150cm、210cm、165cm
        请用程序实现获取这三个和尚的最高身高。
         */
        //1.定义3个变量-和尚的身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        //2.运用三目运算符比较
        int temp = (height1 > height2 ? height1 : height2);
        int max = temp > height3 ? temp : height3;
        System.out.println(max);

        //ctrl + alt + L  ->自动格式化代码（对齐）
    }
}
