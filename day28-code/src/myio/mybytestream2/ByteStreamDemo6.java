package myio.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo6 {
    public static void main(String[] args) throws IOException {
        /*
            利用try...catch...finally捕获拷贝文件中的代码出现的异常
         */

        FileInputStream fis = null;
        FileOutputStream fos = null;

        //1.创建对象
        try {
            fis = new FileInputStream("G:\\谢绍斌\\视频\\225921291018fa49191115914.mp4");
            fos = new FileOutputStream("E:\\aaa\\copy.mp4");
            //2.拷贝
            int len;
            byte[] bytes = new byte[5];
            while ((len = fis.read()) != -1){
                fos.write(bytes,0,len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.释放资源
            fos.close();
            fis.close();
        }
    }
}
