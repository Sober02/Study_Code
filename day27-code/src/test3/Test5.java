package test3;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        /*
        需求：
            统计一个文件夹的总大小
         */

        File file = new File("E:\\aaa");
        System.out.println(getLen(file));//62828
    }

    /*
    * 作用：
    *       统计一个文件夹的总大小
    * 参数：
    *       表示要统计的那个文件夹
    * 返回值：
    *       统计之后的结果
    * 文件夹的总大小：
    *       所有文件的总和
     */
    public static long getLen(File src){
        //定义统计文件大小的变量
        long len = 0;
        //1.进入src文件夹，获取到src文件内的所有文件
        File[] files = src.listFiles();
        //2.遍历数组
        for (File file : files) {
            if (file.isFile()){
        //3.判断如果是文件，进行累加
                len += file.length();
            }else {
        //4.判断如果是文件夹，递归
                len += getLen(file);
            }
        }
        return len;
    }
}
