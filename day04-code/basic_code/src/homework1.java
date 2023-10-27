public class homework1 {
    public static void main(String[] args) {
        //已知2019年是猪年，请在控制台输出从1949年到2019年中所有是猪年的年份。

        //分析：12年一次猪年，范围1949-2019

        for(int i =2019;i >= 1949;i=i-12){
            System.out.println(i);
        }
    }
}
