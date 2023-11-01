public class Test10 {
    public static void main(String[] args) {
        /*某商城每个季度的营业额如下:单位(万元)
        第一季度:22,66,44
        第二季度:77,33,88
        第三季度: 25,45,65
        第四季度:11,66,99
        要求计算出每个季度的总营业额和全年的总营业额*/

        //二维数组-[每个季度][每个季度的营业额] ([4][3])
        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        //第一季度总营业额
        int sum1 = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum1 = sum1 + arr[i][j];
            }
        }
        System.out.println("第一季度营业额：" + sum1 + "万");
        //第二季度
        int sum2 = 0;
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum2 = sum2 + arr[i][j];
            }
        }
        System.out.println("第二季度营业额：" + sum2 + "万");
        //第三季度
        int sum3 = 0;
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum3 = sum3 + arr[i][j];
            }
        }
        System.out.println("第三季度营业额：" + sum3 + "万");
        //第四季度
        int sum4 = 0;
        for (int i = 3; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum4 = sum4 + arr[i][j];
            }
        }
        System.out.println("第四季度营业额：" + sum4 + "万");
        //全年总营业额
        int sum = sum1 + sum2 + sum3 + sum4;
        System.out.println("全年的总营业额：" + sum + "万");
    }
}
