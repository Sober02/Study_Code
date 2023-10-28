public class test7 {
    public static void main(String[] args) {
        /*数组:是一种容器，可以用来存储同种数据类型的多个值
        数组容器在存储数据的时候，需要结合隐式转换考虑。
        例如:int类型的数组容器(boolean byte short int double)
        例如: double类型的数组容器( byte short int long float double)*/

        //格式
        //静态初始化
        //完整格式：
        //数据类型 [] 数组名 = new 数据类型[] {元素1，元素2...};
        //简写格式：
        //数据类型 [] 数组名 = {元素1,元素2...};

        //需求1: 定义数组存储5个学生的年龄
        int[] arr1 = new int[]{13,14,15,16,17};
        int[] arr2 = {13,14,15,16,17};
        //需求2: 定义数组存储3个学生的姓名
        String [] arr3 = new String[] {"张三","李四","小明"};
        String [] arr4 = {"张三","李四","小明"};
        //需求3:定义数组存储4个学生的身高
        double[] arr5 = new double[] {1.83,1.77,1.76,1.78};
        double[] arr6 ={1.83,1.77,1.76,1.78};

        System.out.println(arr1);//打印的是地址- [I@776ec8df
        System.out.println(arr5);//[D@4eec7777
        //[ : 表示当前是一个数组
        // I: 表示当前数组里面的元素都是int类型的
        // D: 表示当前数组里面的元素都是double类型的
        //@: 表示一个间隔符号。 (固定格式)
        // 776ec8df: 才是数组真正的地址值， (十六进制)
        // 平时我们习惯性的会把这个整体叫做数组的地址值。

        //利用索引对数组中的元素进行访问
        // 1.获取数组里面的元素
        // 格式: 数组名[索引]
        int[] arr = {1,2,3,4,5};
        //获取数组中的第一个元素
        // 其实就是@索引上对应的元素
        // int number = arr[o];
        // System.out.println(number);// 1
        // 获取数组中1索引上对应的数据，并直接打印出来
        // system.out.println(arr[1]);//2

        //2.把数据存储到数组当中
        // 格式:数组名[索引] = 具体数据/变量;
        // 细节:一旦覆盖之后，原来的数据就不存在了。
        arr[0] = 100;
        System.out.println(arr[0]);//100
    }
}
