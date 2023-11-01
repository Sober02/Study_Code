import java.util.Random;

public class Test8 {
    public static void main(String[] args) {
        /*一个大V直播抽奖，奖品是现金红包，分别有{2，588 ，888，1000，10000小五个奖金。
        请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
        打印效果如下:(随机顺序，不一定是下面的顺序)
            888元的奖金被抽出
            588元的奖金被抽出
            1000元的奖金被抽出
            10000元的奖金被抽出
            2元的奖金被抽出*/

        //分析：
        //1.定义数组存放奖池
        int[] arr = {888,588,1000,10000,2};
        //2.定义存放抽到奖的数组
        int[] newArr = new int[arr.length];
        //3.输出抽奖
        //定义随机索引
        Random r = new Random();

        for (int i = 0; i < arr.length; ) {
            //获取随机索引
            int randomIndex = r.nextInt(arr.length);
            //获取奖项
            int prize = arr[randomIndex];
            //判断奖项是否存在
            boolean flag = contains(newArr,prize);
            if (!flag){
                //将抽取到的奖项添加到newArr中
                newArr[i] = prize;
                //添加完毕 移动索引
                i++;
            }
        }
        //遍历验证代码
        for (int i = 0; i < arr.length; i++) {
            System.out.println("你抽到的奖项是：" + newArr[i]);
        }
    }
    //定义方法判断是否重复抽奖

    //1.判断数组内是否存在此奖项
    //2.需要  存放奖的数组  抽到的奖项
    //3.需要返回  true  false

    public static boolean contains(int[] newArr,int prize){
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == prize){
                return true;
            }
        }
        return false;
    }
}
