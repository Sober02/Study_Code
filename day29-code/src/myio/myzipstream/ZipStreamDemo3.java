package myio.myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
         *   压缩流
         *      需求：
         *          把E:\\aaa\\AA文件夹压缩成一个压缩包
         */

        //1.创建File对象表示要压缩的文件夹
        File src = new File("E:\\aaa\\AA");
        //2.创建File对象表示压缩包放在哪里（压缩包的父级路径）
        File destParents = src.getParentFile();//E:\aaa
        //3.创建File对象表示压缩包的路径
        File dest = new File(destParents,src.getName() + ".zip");
        //System.out.println(dest);
        //4.创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //5.获取到src里面的每一个文件，变成ZipEntry对象，放入到压缩包当中
        //System.out.println(src.getName());//AA
        toZip(src,zos,src.getName());
        //6.释放资源
        zos.close();
    }

    /*
     *  作用：获取src里面的每一个文件，变成ZipEntry对象，放入到压缩包当中
     *  参数一：数据源
     *  参数二：压缩流
     *  参数三：压缩包内部的路径
     *
     */
    public static void toZip(File src,ZipOutputStream zos,String name) throws IOException {
        //1.进入src文件夹
        File[] files = src.listFiles();
        //2.遍历数组
        for (File file : files) {
            if (file.isFile()){
                //3.判断-文件，变成ZipEntry对象，放入到压缩包当中
                ZipEntry entry = new ZipEntry(name + "\\" + file.getName());
                zos.putNextEntry(entry);
                //System.out.println(file);//E:\aaa\AA\aaa.txt
                //读取文件中的数据，写入到压缩包里面
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1){
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();

            }else {
                //4.判断-文件夹，递归
                toZip(file,zos,name + "\\" + file.getName());
            }
        }


    }
}
