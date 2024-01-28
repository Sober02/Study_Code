package myio.mytest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //拷贝一个文件夹，考虑子文件夹 E:\aaa\aaa

        //1.创建对象表示数据源
        File src = new File("E:\\aaa\\aaa");
        //2.创建对象表示目的地
        File dest = new File("E:\\aaa\\bbb");

        //3.调用方法开始拷贝
        copydir(src,dest);

    }

    /*
    * 作用：拷贝文件夹
    * 参数一：数据源
    * 参数二：目的地
     */
    private static void copydir(File src, File dest) throws IOException {
        dest.mkdirs();
        //1.进入数据源文件夹
        File[] files = src.listFiles();
        //2.遍历数组
        for (File file : files) {
            if (file.isFile()){
                //3.判断，如果是文件就拷贝
                //用字节流拷贝
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));
                int len;
                byte[] bytes = new byte[1024];
                while ((len = fis.read(bytes)) != -1){
                    fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();
            }else {
                //4.判断，如果是文件夹就递归
                copydir(file,new File(dest,file.getName()));
            }
        }
    }


}
