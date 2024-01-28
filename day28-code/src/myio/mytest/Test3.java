package myio.mytest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) throws IOException {
        /*
        文本文件中有以下的数据:
        2-1-9-4-7-8
        将文件中的数据进行排序，变成以下的数据:
        1-2-4-7-8-9
         */


        //1.读取数据
        FileReader fr = new FileReader("day28-code\\b.txt");
        int len;
        StringBuilder sb = new StringBuilder();
        while ((len = fr.read()) != -1) {
            sb.append((char) len);
        }
        fr.close();
        System.out.println(sb);

        //2.排序
        String str = sb.toString();
        String[] arrStr = str.split("-");
        //System.out.println(Arrays.toString(arrStr));//[2, 1, 9, 4, 7, 8]
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : arrStr) {
            int i = Integer.parseInt(s);
            list.add(i);
        }
        Collections.sort(list);
        System.out.println(list);


        //3.写出
        FileWriter fw = new FileWriter("day28-code\\b.txt");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                fw.write(list.get(i) + "");
            } else {
                fw.write(list.get(i) + "-");
            }
        }
        fw.close();
    }
}
