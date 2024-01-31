package myio.mybufferedstream1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo4 {
    public static void main(String[] args) throws IOException {
        /*
         *    字符缓冲输出流：
         *        构造方法：
         *            public BufferedWriter(Writer w)
         *        特有方法：
         *            public String newLine()    跨平台的换行
         *
         */

        //1.创建字符缓冲输出流的对象
        //BufferedWriter bw = new BufferedWriter(new FileWriter("day29-code\\b.txt"));
        //开启续写功能
        BufferedWriter bw = new BufferedWriter(new FileWriter("day29-code\\b.txt",true));
        //2.写数据
        bw.write("趁微风还正好趁年轻他未老");
        bw.newLine();
        bw.write("趁阳光还不燥趁微笑他心跳");
        bw.newLine();

        //3.释放资源
        bw.close();

    }
}
