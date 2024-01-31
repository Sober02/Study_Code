package myio.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //将本地文件中的GBK文件，转为UTF-8
        //day29-code\b.txt

        /*//1.JDK11以前的方案
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day29-code\\b.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day29-code\\c.txt"),"UTF-8");
        int b;
        while ((b = isr.read()) != -1){
            osw.write(b);
        }
        osw.close();
        isr.close();*/

        //2.代替方案
        FileReader fr = new FileReader("day29-code\\b.txt", Charset.forName("GBK"));
        //可以不写Charset.forName("UTF-8"),因为Java默认就是utf-8
        FileWriter fw = new FileWriter("day29-code\\d.txt",Charset.forName("UTF-8"));

        int ch;
        while ((ch = fr.read()) != -1){
            fw.write(ch);
        }
        fw.close();
    }
}
