public class test1 {
    public static void main(String[] args) {
       //跳转控制语句
        /* 1。continue:跳过本次循环，继续执行下次循环
        2.break:结束整个循环*/

        //1.跳过某一次循环
        //跳过第三个包子
        /*for (int i = 1; i <= 5; i++) {
            if(i==3) {
                continue;//结束本次循环，继续下次循环！
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }*/

        //2.结束整个循环
        //只吃前3个包子
        for (int i = 1; i <= 5; i++) {
            System.out.println("小老虎在吃第" + i + "个包子");
            if(i==3){
                break;
            }
        }
    }
}
