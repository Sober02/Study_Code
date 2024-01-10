package a01args;

public class ArgsDemo1 {
    public static void main(String[] args) {
        /*
        假如需要定义一个方法求和，该方法可以灵活的完成如下需求:
            计算2个数据的和
            计算3个数据的和
            计算4个数据的和
            计算n个数据的和
         */
        System.out.println(getSum1(10,20));
        System.out.println(getSum2(10,20,30));
        System.out.println(getSum3(10,20,30,40));
    }
    //计算2个数据的和
    public static int getSum1(int a,int b){
        return a+b;
    }

    //计算3个数据的和
    public static int getSum2(int a,int b,int c){
        return a+b+c;
    }

    //计算4个数据的和
    public static int getSum3(int a,int b,int c,int d){
        return a+b+c+d;
    }

}
