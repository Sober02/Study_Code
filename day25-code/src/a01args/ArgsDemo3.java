package a01args;

public class ArgsDemo3 {
    public static void main(String[] args) {
        /*
        //JDK5
        //可变参数
        //方法形参的个数是可以发生变化的，0 1 2 3
        //格式:属性类型...名字
        //int...args

        //可变参数的小细节:
        //1.在方法的形参中最多只能写一个可变参数
        //可变参数，理解为一个大胖子，有多少吃多少

        //2.在方法当中，如果出了可变参数以外，还有其他的形参，那么可变参数要写在最后
         */

        System.out.println(getSum());
        System.out.println(getSum(1,2,3));
        System.out.println(getSum(1,2,3,4));
        System.out.println(getSum(1,2,3,4,5,6,7,8,9,10));


    }
    //计算n个数据的和
    //底层:
    //可变参数底层就是一个数组
    //只不过不需要我们自己创建了，Java会帮我们创建好
    public static int getSum(int...args){
        System.out.println(args);//[I@776ec8df - 地址值 '['表示数组 'I'表示int类型 @是固定格式
        int sum=0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }
}
