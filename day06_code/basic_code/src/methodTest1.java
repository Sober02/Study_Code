public class methodTest1 {
    public static void main(String[] args) {

        //定义方法，比较两个长方形的面积
        //分析：
        //方法-计算长方形面积-获取长方形的长和宽-计算面积返回结果
        //比较大小

        double area1 = getArea(4.7,7.4);
        double area2 = getArea(7.4,4);

        if (area1 > area2){
            System.out.println("第一个长方形面积大");
        }else if (area2 > area1){
            System.out.println("第二个长方形面积大");
        }else{
            System.out.println("两个长方形面积一样大");
        }

    }
    //定义一个方法求长方形的面积//1.我要干嘛? 求长方形的面积
    //2.需要什么? 长 和 宽
    //3.方法的调用处，是否需要继续使用方法的结果
    //如果要用，那么方法必须有返回值
    //如果不要用，方法可以写返回值，也可以不写返回值。
    public static double getArea(double len, double width){
        double area = len * width;
        return area;
    }

}
