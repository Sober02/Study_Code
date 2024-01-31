package myio.mytest01;

import java.io.*;
import java.util.*;

public class Test2Case02 {
    public static void main(String[] args) throws IOException {
        //需求:把《出师表》的文章顺序进行恢复到一个新文件中

        //1.读取数据
        BufferedReader br = new BufferedReader(new FileReader("day29-code\\csb.txt"));
        String line;

        TreeMap<Integer,String> tm = new TreeMap<>();
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            tm.put(Integer.parseInt(arr[0]),line);
        }
        br.close();

        //System.out.println(tm);

        //3.写数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("day29-code\\rightCSB2.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            bw.write(value);
            bw.newLine();
        }
        bw.close();

    }
}
