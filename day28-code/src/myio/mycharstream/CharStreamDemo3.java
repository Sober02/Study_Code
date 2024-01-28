package myio.mycharstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
       FileWriter构造方法
        public FileWriter(Eile file)                        创建字符输出流关联本地文件
        public FileWriter(String pathname)                  创建字符输出流关联本地文件
        public FileWriter(File file，boolean append)         创建字符输出流关联本地文件，续写
        public FileWriter(String pathname, boolean append)  创建字符输出流关联本地文件，续写

        FileWriter成员方法
        void write(int c)                           写出一个字符
        void write(String str)                      写出一个字符串
        void write(String str, int off, int len)    写出一个字符串的一部分
        void write(char[] cbuf)                     写出一个字符数组
        void write(char[] cbuf, int off,int len)    写出字符数组的一部分
         */

        //1.创建对象并关联本地文件
        FileWriter fw = new FileWriter("day28-code\\a.txt");

        //打开续写功能
        FileWriter fw2 = new FileWriter("day28-code\\a.txt",true);
        //2.写数据
        // void write(int c)
        fw.write(25105);//我

        String str = "加啊加呀222！！";
        // void write(String str)
        fw.write(str);//加油加油222！！

        // void write(String str, int off, int len)
        fw.write(str,2,7);//加呀222!!

        // void write(char[] cbuf)
        char[] chars = {'加','啊','加','呀','2','2','2','!'};
        fw.write(chars);

        // void write(char[] cbuf, int off,int len)
        fw.write(chars,3,5);//从索引3开始，读取5个长度的字符

        //3.释放资源
        fw.close();
    }
}
