package myio.myprintstream;

import java.io.*;
import java.nio.charset.Charset;

public class PrintStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
            字符打印流:
             构造方法
             public PrintWriter(write/File/String)                  关联字节输出流/文件/文件路径
             public PrintWriter(String fileName, Charset charset)   指定字符编码
             public PrintWriter(write，boolean autoFlush)            自动刷新
             public PrintWriter(write out, boolean autoFlush, String encoding) 指定字符编码且自动刷新

             成员方法:
             public void write(int b)       常规方法:规则跟之前一样，写出字节或者字符串
             public void println(Xxx xx)    特有方法:打印任意数据，自动刷新，自动换行
             public void print(Xxx xx)      特有方法:打印任意数据，不换行
             public void printf(String format，object...args)  特有方法:带有占位符的打印语句，不换行
         */

        //1.创建字符打印流的对象
        //两种常用方式
        PrintWriter pw = new PrintWriter(new FileWriter("day29-code\\Aa.txt"),true);
        //PrintWriter pw = new PrintWriter(new FileOutputStream("day29-code\\Aa.txt"),true);

        //2.打印
        pw.write(97);
        pw.println();
        pw.println(97);
        pw.print(97);
        pw.println();
        pw.printf("%s爱上了%s","Ta","她");

        //3.释放资源
        pw.close();
    }
}
