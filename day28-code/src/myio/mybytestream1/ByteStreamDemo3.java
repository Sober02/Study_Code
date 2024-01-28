package myio.mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
            void write(int b)                    一次写一个字节数据
            void write(byte[] b)                 一次写一个字节数组数据
            void write(byte[] b,int off,int len) 一次写一个字节数组的部分数据
            参数一：数组
            参数二：起始索引
            参数三：个数

         */

        //1.创建对象
        FileOutputStream fos = new FileOutputStream("day28-code\\a.txt");
        //2.写数据
        //write(int b)
        //fos.write(65);

        byte[] bytes = {65, 66, 67, 68, 69, 70};
        //write(byte[] b)
        //fos.write(bytes);

        //write(byte[] b,int off,int len)
        fos.write(bytes,2,3);

        //3.释放资源
        fos.close();
    }
}
