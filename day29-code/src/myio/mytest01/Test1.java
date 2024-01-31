package myio.mytest01;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*
         拷贝文件
            四种方式拷贝文件，并统计各自用时

            字节流的基本流:一次读写一个字节
            字节流的基本流:一次读写一个字节数组
            字节缓冲流:一次读写一个字节
            字节缓冲流:一次读写一个字节数组

         */


        File src = new File("E:\\aaa");
        File dest = new File("E:\\bbb");
        long start = System.currentTimeMillis();
        //1.字节流的基本流:一次读写一个字节
        //method1(src,dest);// start - end = -180168
        //2.字节流的基本流:一次读写一个字节数组
        //method2(src,dest);//284
        //3.字节缓冲流:一次读写一个字节
        //method3(src,dest);//2981
        //4.字节缓冲流:一次读写一个字节数组
        method4(src,dest);//920

        long end = System.currentTimeMillis();
        System.out.println(end - start);





    }



    //1.字节流的基本流:一次读写一个字节
    /*
     * 作用：拷贝文件夹
     * 参数一：数据源
     * 参数二：目的地
     */
    public static void method1(File src,File dest) throws IOException {
        dest.mkdirs();
        //1.进入src文件夹
        File[] files = src.listFiles();
        //2.遍历数组
        for (File file : files) {
        //3.拷贝
            if (file.isFile()){
                //判断，如果是文件，拷贝
                //用字节基本流
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));
                int b;
                while ((b = fis.read()) != -1){
                    fos.write(b);
                }
                //释放资源
                fos.close();
                fis.close();
            }else{
                //判断，如果是文件夹，递归
                method1(file,new File(dest,file.getName()));
            }
        }
    }

    //2.字节流的基本流:一次读写一个字节数组
    public static void method2(File src,File dest) throws IOException {
        dest.mkdirs();
        //1.进入数据源文件夹
        File[] files = src.listFiles();
        //2.遍历数组
        for (File file : files) {
            if (file.isFile()){
                //3.判断，文件 拷贝
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));
                int len;
                byte[] bytes = new byte[1024 * 1024 * 5];
                while ((len = fis.read(bytes)) != -1){
                    fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();
            }else {
                //4.判断，文件夹 递归
                method2(file,new File(dest,file.getName()));
            }
        }
    }

    //3.字节缓冲流:一次读写一个字节
    public static void method3(File src,File dest) throws IOException {
        dest.mkdirs();
        //1.进入数据源文件
        File[] files = src.listFiles();
        //2.遍历数组
        for (File file : files) {
            if (file.isFile()){
                //3.判断，文件，拷贝
                //用字节缓冲流拷贝
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(dest,file.getName())));
                int b;
                while ((b = bis.read()) != -1){
                    bos.write(b);
                }
                //释放资源
                bos.close();
                bis.close();

            }else {
                //4.判断，文件夹，递归
                method3(file,new File(dest,file.getName()));
            }
        }
    }

    //4.字节缓冲流:一次读写一个字节数组
    private static void method4(File src, File dest) throws IOException {
        dest.mkdirs();
        //1.进入数据源文件夹
        File[] files = src.listFiles();
        //2.遍历数组
        for (File file : files) {
            if (file.isFile()){
                //3.判断 文件 拷贝
                //用字节缓冲流拷贝
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(dest,file.getName())));
                int len;
                byte[] bytes = new byte[1024 * 1024 * 5];
                while ((len = bis.read(bytes)) != -1) {
                    bos.write(bytes,0,len);
                }
                bos.close();
                bis.close();

            }else {
                //4.判断 文件夹 递归
                method4(file,new File(dest,file.getName()));

            }
        }
    }
}
