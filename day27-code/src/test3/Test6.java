package test3;

import java.io.File;
import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        /*
        需求:统计一个文件夹中每种文件的个数并打印。(考虑子文件夹)

        打印格式如下:
                txt:3个
                doc:4个
                jpg:6个

                代码优化 -》 6_2
         */

        File file = new File("E:\\aaa");
        ArrayList<File> list = new ArrayList<>();
        ArrayList<File> everyFiles = getEveryFiles(list,file);
        System.out.println(everyFiles);
        int txtCount = 0;
        int docCount = 0;
        int jpgCount = 0;
        for (File everyFile : everyFiles) {
            String name = everyFile.getName();
            if (name.endsWith(".txt")){
                txtCount++;
            }else if (name.endsWith(".docx")){
                docCount++;
            }else if (name.endsWith(".jpg")){
                jpgCount++;
            }
        }
        System.out.println("txt" + txtCount + "个");
        System.out.println("doc" + docCount + "个");
        System.out.println("jpg" + jpgCount + "个");
    }

    //定义一个方法获取文件夹中的所有文件
    //用集合存储所有获取到的文件
    //返回这个集合
    public static ArrayList<File> getEveryFiles(ArrayList<File> list,File src){
        //定义一个集合存储文件
        //ArrayList<File> list = new ArrayList<>();
        //1.进入src文件夹
        File[] files = src.listFiles();
        //2.遍历数组
        for (File file : files) {
            if (file.isFile()){
        //3.判断，如果是文件，添加到集合中
                list.add(file);
            }else {
        //4.判断，如果是文件夹，递归
                getEveryFiles(list,file);
            }
        }
        return list;
    }
}
