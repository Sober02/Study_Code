package myfile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo3 {
    public static void main(String[] args) {
        /*
        public long length()                返回文件的大小 (字节数量)
        public string getAbsolutePath()     返回文件的绝对路径
        public string getPath()             返回定义文件时使用的路径
        public string getName( )            返回文件的名称，带后缀
        public long lastModified()          返回文件的最后修改时间(时间毫秒值)
         */

        //1.long length()  返回文件的大小 (字节数量)
        //细节1：这个方法只能获取文件的大小，单位是字节
        //如果单位要是M,G,可以不断除以1024
        //len / 1024 -> KB
        //len / 1024 / 1024-> MB
        //细节2：这个方法无法获取文件夹的大小
        //如果我们要获取一个文件夹的大小，需要把这个文件夹里面所有的文件大小都累加在一起。
        File f1 = new File("E:\\aaa\\a.txt");
        System.out.println(f1.length());

        System.out.println("================================");
        //2.string getAbsolutePath()     返回文件的绝对路径
        File f2 = new File("E:\\aaa\\a.txt");
        System.out.println(f2.getAbsolutePath());

        File f22 = new File("day27-code\\A.txt");
        System.out.println(f22.getAbsolutePath());

        System.out.println("================================");
        //3.string getPath()  返回定义文件时使用的路径
        File f3 = new File("E:\\aaa\\bbb");
        System.out.println(f3.getPath());

        File f33 = new File("day27-code\\A.txt");
        System.out.println(f33.getPath());

        System.out.println("================================");
        //4.string getName( )   返回文件的名称，带后缀
        //细节1：如果是文件，返回的是文件名以及文件的后缀名
        //细节2：如果是文件夹，返回的是文件夹的名字
        File f4 = new File("E:\\aaa\\b.txt");
        System.out.println(f4.getName());

        File f44 = new File("E:\\aaa\\bbb");
        System.out.println(f44.getName());

        System.out.println("================================");
        //5.long lastModified()  返回文件的最后修改时间(时间毫秒值)
        File f5 = new File("E:\\aaa\\a.txt");
        long time = f5.lastModified();
        System.out.println(time);

        //如何把时间的毫秒值变为字符串表示的时间？
        //yyyy年MM月dd日 HH:mm:ss
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String dateTime = sdf.format(date);
        System.out.println(dateTime);
    }
}
