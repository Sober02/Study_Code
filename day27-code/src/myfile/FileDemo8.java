package myfile;

import java.io.File;

public class FileDemo8 {
    public static void main(String[] args) {
        /*
    (掌握) public File[] listFiles()                  获取当前该路径下所有内容
    public File[] listFiles(FileFilter filter)      利用文件名过滤器获取当前该路径下所有内容
    public File[] listFiles(FilenameFilter filter)  利用文件名过滤器获取当前该路径下所有内容
         */

        //1.创建File对象
        File f1 = new File("E:\\aaa");
        //2.打印里面的txt文件
        File[] arr = f1.listFiles();
        for (File file : arr) {
            if (file.isFile() && file.getName().endsWith(".txt")){
                //依次表示aaa文件夹里面的每一个文件或者文件夹的路径
                System.out.println(file);
            }
        }
    }
}
