package test3;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        /*
        需求:
            定义一个方法找某一个文件夹中，是否有以avi结尾的电影。(暂时不需要考虑子文件夹)
         */
        File f = new File("H:\\英雄时刻\\1569834379");
        System.out.println(haveAvi(f));
    }

    /*
    * 作用：用来查找某一个文件夹中是否有以avi结尾的文件
    * 形参：要查找的文件夹
    * 返回值：查找的结果  存在true  不存在false
     */
    public static boolean haveAvi(File file){
        //1.进入H:\英雄时刻\1569834379文件夹，而且要获取里面所有的内容
        File[] files = file.listFiles();
        //2.遍历数组获取里面每一个元素
        for (File f : files) {
            //f：依次表示文件夹内的每一个文件或者文件夹的路径
            if (f.isFile() && f.getName().endsWith(".avi")){
                return true;
            }
        }
        return false;
    }

}
