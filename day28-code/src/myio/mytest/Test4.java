package myio.mytest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Test4 {
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
        /*Integer[] arr = Arrays.stream(sb.toString().split("-"))
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                })
                .sorted()
                .toArray(new IntFunction<Integer[]>() {
                    @Override
                    public Integer[] apply(int value) {
                        return new Integer[value];
                    }
                });*/
        Integer[] arr = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);

        //3.写出
        FileWriter fw = new FileWriter("day28-code\\b.txt");
        String str = Arrays.toString(arr).replace(", ", "-");
        String result = str.substring(1, str.length() - 1);
        fw.write(result);
        fw.close();
    }
}
