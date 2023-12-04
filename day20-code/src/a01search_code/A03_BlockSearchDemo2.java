package a01search_code;

public class A03_BlockSearchDemo2 {
    public static void main(String[] args) {
        /*
            拓展的分块查找（无规律的数据）
            {27,22,30,40,36,13,19,16,20,7,10,43,50,48}
         */

        //创建一个数组
        int[] arr = {27, 22, 30, 40, 36,
                    13, 19, 16, 20,
                    7, 10,
                    43, 50, 48};
        //创建4个块存储数组数据
        Block2 b1 = new Block2(22, 40, 0, 4);
        Block2 b2 = new Block2(13, 20, 5, 8);
        Block2 b3 = new Block2(7, 10, 9, 10);
        Block2 b4 = new Block2(43, 50, 11, 13);

        //将4个块存储进Block2Arr数组
        Block2[] block2Arr = {b1, b2, b3, b4};

        //3.定义一个变量用来记录要查找的元素
        int number = 48;

        //4.调用方法，传递索引表，数组，要查找的元素
        int index = getIndex(block2Arr,arr,number);

        //打印一下
        System.out.println(index);
    }

    private static int getIndex(Block2[] block2Arr, int[] arr, int number) {
        //先找到对应的块
        int block2Index = findBlock2(block2Arr, number);

        if (block2Index == -1){
            //说明要找的number不存在
            return -1;
        }

        //获取到块的起始索引和结束索引
        int startIndex = block2Arr[block2Index].getStartIndex();
        int endIndex = block2Arr[block2Index].getEndIndex();

        //遍历数组
        for (int i = startIndex; i <= endIndex; i++) {
            if (number == arr[i]){
                return i;
            }
        }
        return -1;
    }

    private static int findBlock2(Block2[] block2Arr,int number){

        for (int i = 0; i < block2Arr.length; i++) {
            int min = block2Arr[i].getMin();
            int max = block2Arr[i].getMax();
            if (number >= min && number <= max){
                return i;
            }
        }
        return -1;
    }
}

class Block2 {
    private int min;//最小值
    private int max;//最大值
    private int startIndex;//起始索引
    private int endIndex;//结束索引


    public Block2() {
    }

    public Block2(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     *
     * @return min
     */
    public int getMin() {
        return min;
    }

    /**
     * 设置
     *
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * 获取
     *
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     *
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     *
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     *
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     *
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     *
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block2{min = " + min + ", max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}

