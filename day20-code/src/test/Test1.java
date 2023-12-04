package test;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {

    /*
        定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
        要求1: 属性有姓名、年龄、身高。
        要求2:按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
        (姓名中不要有中文或特殊字符，会涉及到后面的知识)
     */

        //1.创建3个Girlfriend对象
        Girlfriend gf1 = new Girlfriend("xiaolili", 18, 1.60);
        Girlfriend gf2 = new Girlfriend("xiaolili2", 19, 1.63);
        Girlfriend gf3 = new Girlfriend("xiaolili3", 19, 1.67);
        Girlfriend gf4 = new Girlfriend("lily", 19, 1.67);

        //2.创建数组存储3个对象
        Girlfriend[] arr = {gf1, gf2, gf3,gf4};

        //3.将数组进行排序
        /*Arrays.sort(arr, new Comparator<Girlfriend>() {
            @Override
            public int compare(Girlfriend o1, Girlfriend o2) {
                //按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。

                //定义一个存储年龄一样的值
                double temp = o1.getAge() - o2.getAge() ;
                //年龄一样，按照身高排序
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                //身高一样按照姓名的字母进行排序
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                //判断temp的值返回对应的值
                if (temp > 0){
                    return 1;
                }else if (temp < 0){
                    return -1;
                }else{
                    return 0;
                }
            }
        });*/

        //lambda表达式
        //() -> {}
        //():对应着抽象方法的形参
        //{}:方法体
        Arrays.sort(arr, (o1, o2) -> {
                //按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。

                //定义一个存储年龄一样的值
                double temp = o1.getAge() - o2.getAge() ;
                //年龄一样，按照身高排序
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                //身高一样按照姓名的字母进行排序
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                //判断temp的值返回对应的值
                if (temp > 0){
                    return 1;
                }else if (temp < 0){
                    return -1;
                }else{
                    return 0;
                }
        });

        //4.展示一下数组中的内容
        System.out.println(Arrays.toString(arr));

    }
}
