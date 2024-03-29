package myio.myhutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        /*
        FileUtil类:
        file: 根据参数创建一个file对象
        touch; 根据参数创建文件

        writeLines: 把集合中的数据写出到文件中，覆盖模式。
        appendLines;把集合中的数据写出到文件中，续写模式。
        readLines: 指定字符编码，把文件中的数据，读到集合中。
        readUtf8Lines: 按照UTF-8的形式，把文件中的数据，读到集合中

        copy: 拷贝文件或者文件夹
         */

        File file1 = FileUtil.file("E:\\", "zzz", "xxx", "a.txt");
        System.out.println(file1);

        File touch = FileUtil.touch(file1);
        System.out.println(touch);

        /*ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abc");
        list.add("abc");

        File file2 = FileUtil.writeLines(list, "E:\\z.txt", "UTF-8", true);
        System.out.println(file2);
*/
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abc");
        list.add("abc");

        File file3 = FileUtil.appendLines(list, "E:\\z.txt", "UTF-8");
        System.out.println(file3);

        List<String> list2 = FileUtil.readLines("E:\\z.txt", "UTF-8");
        System.out.println(list2);

    }
}
