package myio.mytest01;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test2Case01 {
    public static void main(String[] args) throws IOException {
        //需求:把《出师表》的文章顺序进行恢复到一个新文件中

        //1.读取数据
        BufferedReader br = new BufferedReader(new FileReader("day29-code\\csb.txt"));
        String line;

        ArrayList<String> list = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();

        //2.排序
        //按照每一行开头的序号进行排序
        //1.先帝创业未半而中道崩殂
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);
                return i1 - i2;
            }
        });

        //System.out.println(list);

        //3.写数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("day29-code\\rightCSB.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
