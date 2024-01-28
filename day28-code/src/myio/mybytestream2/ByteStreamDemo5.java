package myio.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {
        /*
            文件拷贝
            将文件G:\谢绍斌\视频\225921291018fa49191115914.mp4(13.9 MB (14,590,374 字节))
            拷贝到E:\aaa中
         */
        //1.创建对象
        FileInputStream fis = new FileInputStream("G:\\谢绍斌\\视频\\225921291018fa49191115914.mp4");
        FileOutputStream fos = new FileOutputStream("E:\\aaa\\copy.mp4");
        //2.拷贝文件
        long startTime = System.currentTimeMillis();
        byte[] bytes = new byte[1024 * 1024 * 5];
        int len;
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        //3.释放资源
        fis.close();
    }
}
