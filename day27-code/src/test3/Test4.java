package test3;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        /*
        删除一个多级文件夹
        如果要删除一个有内容的文件夹
        1.先删除文件夹里面的所有内容
        2.再删除自己
         */

        File f = new File("E:\\aaa\\ddd");
        delFile(f);
    }

    /*
    * 作用：删除src文件夹
    * 参数：要删除的文件夹
     */
    public static void delFile(File src){
        //1.先删除文件夹里面的所有内容
        //进入src
        File[] files = src.listFiles();
        //2.遍历数组
        for (File file : files) {
            if (file.isFile()){
                //3.判断，如果是文件，删除
                file.delete();
            }else {
                //4.判断，如果是文件夹，递归
                delFile(file);
            }
        }
        //2.再删除自己
        src.delete();
    }
}
