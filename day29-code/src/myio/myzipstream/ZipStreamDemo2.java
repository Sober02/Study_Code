package myio.myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
         *  压缩流
         *     需求：
         *          把E:\aaa\a.txt打包成压缩包
         */
        //1.创建File对象表示要压缩的文件
        File src = new File("E:\\aaa\\a.txt");
        //2.创建File对象表示压缩包的位置
        File dest = new File("E:\\aaa\\");
        //3.调用方法
        toZip(src, dest);
    }

    private static void toZip(File src, File dest) throws IOException {
        //1.创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, "a.zip")));
        //2.创建ZipEntry对象，表示以压缩包里面的每一个文件和文件夹
        ZipEntry entry = new ZipEntry("a.txt");
        //3.把ZipEntry对象放到压缩包中
        zos.putNextEntry(entry);
        //4.把src文件中的数据写到压缩包当中
        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b = fis.read()) != -1){
            zos.write(b);
        }
        zos.closeEntry();
        zos.close();
    }
}