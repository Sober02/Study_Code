package myio.myconvertstream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //利用转换流按照指定字符编码写出

        //淘汰
        //1.创建转换流的对象
        /*OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day29-code\\b.txt"),"GBK");

        //2. 写出数据
        osw.write("你好你好！hello！");
        //3. 释放资源
        osw.close();*/

        //代替方法！
        FileWriter fw = new FileWriter("day29-code\\b.txt", Charset.forName("GBK"));
        fw.write("你好你好！hello！");
        fw.close();
    }
}
