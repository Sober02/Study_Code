public class Test10_2 {
    public static void main(String[] args) {
        /*某商城每个季度的营业额如下:单位(万元)
        第一季度:22,66,44
        第二季度:77,33,88
        第三季度: 25,45,65
        第四季度:11,66,99
        要求计算出每个季度的总营业额和全年的总营业额*/

        //1.定义二维数组-[每个季度][每个季度的营业额] ([4][3])
        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        //季度总营业额
        //表示全年的营业额
        int yearSum = 0;
        //2.遍历二维数组，得到每一个一维数组并求和
        for (int i = 0; i < arr.length; i++) {
            //i 二维数组中的每一个索引
            //arr[i] 元素 (一维数组)
            int[] quarterArr = arr[i];
            int sum = getSum(quarterArr);
            System.out.println("第" + (i+1) + "个季度的总营业额：" + sum);
            yearSum = yearSum + sum ;
        }
        System.out.println( "全年的总营业额：" + yearSum);

    }

    //每个季度营业额代码重复较多，定义方法优化代码
    //计算每个季度营业额
    //获取二维数组的索引arr[i]-一维数组的地址,返回sum
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
