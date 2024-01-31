package myio.mycommonsio;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CommonsIODemo1 {
    public static void main(String[] args) throws IOException {
        /*
        FileUtils类
            static void copyFile(File srcFile, File destFile)               复制文件
            static void copyDirectory(File srcDir, File destDir)            复制文件夹
            static void copyDirectoryToDirectory(File srcDir, File destDir) 复制文件夹
            static void deleteDirectory(File directory)                     删除文件夹
            static void cleanDirectory(File directory)                      清空文件夹
            static String readFileToString(File file, Charset encoding)     读取文件中的数据变成成字符串
            static void write(File file, CharSequence data, String encoding)写出数据
        IOUtils类
            public static int copy(InputStream input, OutputStream output)  复制文件
            public static int copyLarge(Reader input, Writer output)        复制大文件
            public static String readLines(Reader input)                    读取数据
            public static void write(String data, OutputStream output)      写出数据
         */
        File src = new File("day29-code\\a.txt");
        File dest = new File("day29-code\\copy3.txt");
        //FileUtils.copyFile(src,dest);

        File srcDir = new File("E:\\aaa\\AA");
        File destDir = new File("E:\\bbb");
        //只拷贝AA里面的内容不包含AA本身的文件夹
        //FileUtils.copyDirectory(srcDir,destDir);
        //拷贝AA里面的内容包含AA本身这个文件夹
        //FileUtils.copyDirectoryToDirectory(srcDir,destDir);

        //FileUtils.cleanDirectory(destDir);
        File f = new File("E:\\bbb\\aa");
        //FileUtils.deleteDirectory(f);

        String s = FileUtils.readFileToString(src, "UTF-8");
        System.out.println(s);
        File f2 = new File("E:bbb\\a.txt");

        FileInputStream fis = new FileInputStream("E:bbb\\a.txt");
        FileOutputStream fos = new FileOutputStream("E:bbb\\b.txt");
        int copy = IOUtils.copy(fis, fos);
        System.out.println(copy);
    }
}
