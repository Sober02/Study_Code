import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //需求:动物园里有两只老虎，体重分别为通过键盘录入获得
        // 请用程序实现判断两只老虎的体重是否相同

        //1.键盘录入两个老虎的体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个老虎的体重/kg：");
        double tiger1 = sc.nextDouble();
        System.out.println("请输入第二个老虎的体重/kg：");
        double tiger2 = sc.nextDouble();

        //2.判断
        String result = tiger1 == tiger2 ? "相同" : "不同";
        System.out.println(result);
    }
}
