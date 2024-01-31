package myio.mybufferedstream1;

import java.io.*;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
    需求:
        利用字节缓冲流拷贝文件
        字节缓冲输入流的构造方法:
            public BufferedInputStream(InputStream is)
        字节缓冲输出流的构造方法:
            public BufferedOutputStream(OutputStream os)
     */

        //1.创建字节缓冲输入流的对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day29-code\\a.txt"));
        //2.创建字节缓冲输出流的对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day29-code\\copy.txt"));
        int b;
        while ((b = bis.read()) != -1){
            bos.write(b);
        }
        bos.close();
        bis.close();
    }
}
