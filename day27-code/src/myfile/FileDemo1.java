package myfile;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        /*
        public File(string pathname)                根据文件路径创建文件对象
        public File(String parent, String child)    根据父路径名字符串和子路径名字符串创建文件对象
        public File(File parent, String child)      根据父路径对应文件对象和子路径名字符串创建文件对象

         */

        //1.根据字符串表示的路径，变成File对象
        String str = "E:\\aaa\\a.txt";
        File f1 = new File(str);
        System.out.println(f1);//

        //E:\Documents\Downloads\`.html
        //2.父级路径：E:\Documents\Downloads
        //子级路径：`.html
        String parent = "E:\\Documents\\Downloads";
        String child = "`.html";
        File f2 = new File(parent,child);
        System.out.println(f2);//E:\Documents\Downloads\`.html

        File f3 = new File(parent + "\\" + child);
        System.out.println(f3);//E:\Documents\Downloads\`.html

        //3.把一个File表示的路径和String表示路径进行拼接
        File parent2 = new File("E:\\Documents\\Downloads");
        String child2 = "`.html";
        File f4 = new File(parent2,child2);
        System.out.println(f4);//E:\Documents\Downloads\`.html

    }
}