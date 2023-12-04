package a01search_code;

public class A03_BlockSearchDemo1 {
    public static void main(String[] args) {
        /*
            分块查找
            核心思想:
            块内无序，块间有序
            实现步骤:
            1.创建数组blockArr存放每一个块对象的信息
            2.先查找blockArr确定要查找的数据属于哪一块
            3.再单独遍历这一块数据即可
         */

        int[] arr = {16, 5, 9, 12, 21, 18,
                    32, 23, 37, 26, 45, 34,
                    50, 48, 61, 52, 73, 66};

        //1.创建三个块的对象
        Block b1 = new Block(21,0,5);
        Block b2 = new Block(45,6,11);
        Block b3 = new Block(73,12,17);

        //2.定义数组用来管理三个块的对象(索引表)
        Block[] blockArr = {b1,b2,b3};

        //3.定义一个变量用来记录要查找的元素
        int number = 18;

        //4.调用方法，传递索引表，数组，要查找的元素
        int index = getIndex(blockArr,arr,number);

        //打印一下
        System.out.println(index);

    }

    //利用分块查找的原理，查询number的索引
    private static int getIndex(Block[] blockArr, int[] arr, int number) {
        //先查找blockArr确定要查找的数据属于哪一块
        int indexBlock = findBlock(blockArr, number);

        if (indexBlock == -1){
            //表示number不在数组中
            return -1;
        }

        //获取到这一块数据的起始索引和结束索引
        int startIndex = blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();


        //再单独遍历这一块数据即可
        for (int i = startIndex; i <= endIndex; i++) {
            //System.out.print(arr[i] + ", ");
            if (arr[i] == number){
                return i;
            }
        }
        return -1;
    }
    //定义方法查找对应的数据块 findBlock
    public static int findBlock(Block[] blockArr,int number){
        //从0索引开始遍历blockArr，如果number小于max，那么就表示number是在这一块当中的
        for (int i = 0; i < blockArr.length; i++) {
            //比较块中的最大值和number
            if (number <= blockArr[i].getMax()){
                return i;
            }
        }
        //循环结束未找到对应的数据块
        return -1;
    }

}
class Block{
    private int max;//块内最大值
    private int startIndex;//块内起始索引
    private int endIndex;//快内结束索引


    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
