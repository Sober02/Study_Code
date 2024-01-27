package myfile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo7 {
    public static void main(String[] args) {
    /*
    public static File[] listRoots()                列出可用的文件系统根
    public string[] list()                          获取当前该路径下所有内容
    public string[] list(FilenameFilter filter)     利用文件名过滤器获取当前该路径下所有内容
    (掌握) public File[] listFiles()                  获取当前该路径下所有内容
    public File[] listFiles(FileFilter filter)      利用文件名过滤器获取当前该路径下所有内容
    public File[] listFiles(FilenameFilter filter)  利用文件名过滤器获取当前该路径下所有内容

     */

        //1.listRoots   获取系统中所有的盘符
        File[] arr = File.listRoots();
        System.out.println(Arrays.toString(arr));

        System.out.println("=========================");
        //2.list  获取当前该路径下所有内容（仅仅能获取名字）
        File f1 = new File("E:\\aaa");
        String[] arr2 = f1.list();
        for (String s : arr2) {
            System.out.println(s);
        }

        System.out.println("=========================");
        //3.list(FilenameFilter filter) 利用文件名过滤器获取当前该路径下所有内容
        //需求：我现在要获取E:\\aaa文件夹里面所有txt文件
        File f2 = new File("E:\\aaa");
        String[] arr3 = f2.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return src.isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr3));


    }
}
