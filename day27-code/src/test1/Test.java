package test1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        需求:
            键盘录入自己心仪的女朋友姓名和年龄
            姓名的长度在 3 - 10之间，
            年龄的范围为 18 - 30岁，
            超出这个范围是异常数据不能赋值，需要重新录入，一直录到正确为止
        提示:
            需要考虑用户在键盘录入时的所有情况
            比如:录入年龄时超出范围，录入年龄时录入了abc等情况
         */
        //1.创建女朋友对象
        GirlFriend gf = new GirlFriend();
        //2.键盘录入女朋友的姓名和年龄
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("请输入女朋友的姓名：");
                String name = sc.nextLine();
                gf.setName(name);

                System.out.println("请输入女朋友的年龄：");
                String strAge = sc.nextLine();
                int age = Integer.parseInt(strAge);
                gf.setAge(age);
                //如果所有数据都是正确的，跳出循环
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄的格式有误，请输入正确的年龄（18-30）！");
                //e.printStackTrace();
                //continue;//可写可不写
                //RuntimeException一定要写在下面，因为是NumberFormatException父类的父类
            }catch (RuntimeException e) {
                System.out.println("姓名的长度或年龄的范围有误！");
                //e.printStackTrace();
                //continue;//可写可不写
            }
        }

        //3.打印
        System.out.println(gf);
    }
}
