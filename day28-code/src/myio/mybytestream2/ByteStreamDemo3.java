package myio.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
        * 练习：
        *   文件拷贝
        *   把E:\aaa\word.docx拷贝到当前模块下
        *
        *   注意：
        *       暂时选择一个较小的文件。
        *
        *   统计一下拷贝时间,单位 毫秒
        */

        //1.创建对象
        FileInputStream fis = new FileInputStream("E:\\aaa\\word.docx");
        FileOutputStream fos = new FileOutputStream("day28-code\\copy.docx");
        //2.拷贝
        //核心思想：边读边写
        int b;
        long startTime = System.currentTimeMillis();
        //System.out.println(time);
        while ((b = fis.read()) != -1){
            fos.write(b);
        }
        long endTime = System.currentTimeMillis();
        //拷贝时间,单位 毫秒
        System.out.println(endTime - startTime);
        //3.释放资源
        //规则：先开的流最后关闭
        fos.close();
        fis.close();
    }
}
