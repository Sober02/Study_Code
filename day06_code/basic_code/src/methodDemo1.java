public class methodDemo1 {
    public static void main(String[] args) {

        //了解：掌握带返回值方法的定义和调用

        //直接调用
        //getSum(10,20,30);

        //赋值调用
        //int Sum = getSum(20,30,40);
        //System.out.println(Sum);

        //输出调用
        //System.out.println(getSum(20,30,40));

        //需求:定义一个方法，求一家商场每个季度的营业额
        // 根据方法结果再计算出全年营业额

        //先计算第一个季度营业额
        int num1 = getSum(10,20,30);

        //第二季度
        int num2 = getSum(20,30,40);
        //第三季度
        int num3 = getSum(30,40,50);
        //第四季度
        int num4 = getSum(40,50,60);

        //全年营业额
        int sum = num1 + num2 + num3 + num4 ;
        System.out.println(sum);
    }

    public static int getSum(int num1,int num2,int num3){
        int result = num1 + num2 + num3 ;
        return result;
    }
}
