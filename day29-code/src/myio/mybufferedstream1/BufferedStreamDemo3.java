package myio.mybufferedstream1;

import java.io.*;

public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
      /*
       *    字符缓冲输入流：
       *        构造方法：
       *            public BufferedReader(Reader r)
       *        特有方法：
       *            public String readLine()    读一整行
       *
       */

        //1.创建字符缓冲输入流的对象
        BufferedReader br = new BufferedReader(new FileReader("day29-code\\a.txt"));
        //2.读取数据
        //细节：
        //readLine方法在读取的时候，一次读一整行，遇到回车换行结束
        //          但是他不会把回车换行(\r\n)读到内存当中
        /*String line1 = br.readLine();
        System.out.println(line1);
        String line2 = br.readLine();
        System.out.println(line2);*/

        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        //3.释放资源
        br.close();

    }
}
