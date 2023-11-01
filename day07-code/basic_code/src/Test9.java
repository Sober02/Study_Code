import java.util.Random;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        //双色球
//        投注号码由6个红色球号码和1个蓝色球号码组成。
//        红色球号码从1-33中选择;蓝色球号码从1-16中选择。
        //一等奖：中6+1 1000w    二等奖：6+0 500w    三等奖：5+1 3000
        //四等奖：5+0 / 4+1  200r 五等奖：4+0 / 3+1 10r六等奖：2+1 / 1+1 / 0+1 5r

        //分析：1.定义数组存储中奖号码 - 数组大小 7
        //  红球不可重复
        int arr[] = createNumber();
        //遍历数组验证代码
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //2.定义用户投注号码
        int[] userInput = userInputNumber();
//        for (int i = 0; i < userInput.length; i++) {
//            System.out.print(userInput[i] + " ");
//        }
        //3.判断是否中奖
        //定义红/蓝球中奖号码个数
        int redCount = 0;
        int blueCount = 0;
        //判断6个红球
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (userInput[i] == arr[j]){
                    redCount++;
                    break;
                }
            }
        }
        //判断蓝球
        if (userInput[userInput.length-1] == arr[arr.length-1]){
            blueCount++;
        }
        //打印中奖情况
        if (redCount == 6 && blueCount ==1){
            System.out.println("恭喜你！中奖1000万");
        }else if (redCount == 6 && blueCount == 0){
            System.out.println("恭喜你！中奖500万");
        }else if (redCount == 5 && blueCount == 1){
            System.out.println("恭喜你！中奖3000元");
        }else if (redCount == 5 && blueCount == 0 || redCount == 4 && blueCount == 1){
            System.out.println("恭喜你！中奖200元");
        }else if (redCount == 4 && blueCount == 0 || redCount == 3 && blueCount == 1){
            System.out.println("恭喜你！中奖10元");
        }else if (redCount == 2 && blueCount == 1 || redCount == 1 && blueCount == 1 || redCount == 0 && blueCount == 1){
            System.out.println("恭喜你！中奖5元");
        }else{
            System.out.println("谢谢惠顾！");
        }
    }

    //定义用户投注的号码
    //
    public static int[] userInputNumber(){
        int[] userNumber = new int[7];
        //输入6个红球
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i+1) + "个红球号码：");
            //判断号码是否符合条件 - 1.范围 2.重复
            int redNumber = sc.nextInt();
            //1.判断范围
            if (redNumber >= 1 && redNumber <=33){
            //2.判断重复
                boolean flag = contains(userNumber,redNumber);
                while (true) {
                    if (!flag){
                        userNumber[i] = redNumber;
                        i++;
                        break;
                    }else{
                        System.out.println("输入的号码重复！");
                        break;
                    }
                }
            }else{
                System.out.println("输入的号码不在范围内！");
            }
        }
        //输入蓝球
        while (true) {
            System.out.println("请输入篮球的号码：");
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <=16){
                userNumber[userNumber.length-1] = blueNumber;
                break;
            }else{
                System.out.println("输入的号码不在范围内！");
            }
        }
        return userNumber;
    }

    public static int[] createNumber() {
        int[] prizeNum = new int[7];
        Random r = new Random();
        //随机6个红球
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(prizeNum, redNumber);
            if (!flag) {
                prizeNum[i] = redNumber;
                i++;
            }
        }
        int blueNumber = r.nextInt(16) + 1;
        prizeNum[prizeNum.length-1] = blueNumber;
        return prizeNum;

    }

    //定义方法-存入数组时判断数组内是否存在此号码
    //定义随机不重复号码 - 中奖号码
    //我要干什么？    判断是否存在重复号码
    //我干这件事需要什么？    数组  号码
    //方法结果是否需要继续使用？ 需要返回true/false
    public static boolean contains(int[] arr, int number) {
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                return flag;
            }
        }
        return false;
    }
}
