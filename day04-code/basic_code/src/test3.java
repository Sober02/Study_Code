import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
//        需求:键盘录入星期数，输出工作日、休息日。
//        (1-5)工作日，(6-7)休息日。
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数（1-7）");
        int day = sc.nextInt();
        //2.判断星期数
        /*switch(day){
            case 1:
                System.out.println("工作日");
                break;
            case 2:
                System.out.println("工作日");
                break;
            case 3:
                System.out.println("工作日");
                break;
            case 4:
                System.out.println("工作日");
                break;
            case 5:
                System.out.println("工作日");
                break;
            case 6:
                System.out.println("休息日");
                break;
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }*/
        //重复代码过多，使用case穿透！
        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }
    }
}
