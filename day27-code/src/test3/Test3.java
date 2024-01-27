package test3;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        /*
        需求:
            定义一个方法找所有盘符中，是否有以avi结尾的电影。
            (需要考虑子文件夹)
         */

        File f = new File("H:\\");
        findAVI(f);

        //findAVI();//StackOverflowError

    }
    public static void findAVI(){
        //获取本地所有的盘符
        File[] arr =File.listRoots();
        for (File file : arr) {
            findAVI();
        }
    }

    public static void findAVI(File src){
        //1.进入src文件夹
        File[] files = src.listFiles();
        //2.遍历数组，依次得到src里面的每一个文件或者文件夹
        if (files != null){
            for (File file : files) {
                //判断当前内容是文件还是文件夹
                if (file.isFile()){
                    //3.当前内容是文件，判断是否为avi文件
                    String name = file.getName();
                    if (name.endsWith(".avi")){
                        System.out.println(file);
                    }
                }else{
                    //4.当前内容是文件夹，递归
                    //细节：再次调用本方法的时候，参数一定要是src的次一级路径
                    findAVI(file);
                }
            }
        }

    }
}
