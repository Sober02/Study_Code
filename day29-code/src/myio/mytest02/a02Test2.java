package myio.mytest02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class a02Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        反序列化读取文件
         */

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day29-code\\f.txt"));
        ArrayList<Student> s = (ArrayList<Student>) ois.readObject();
        for (Student student : s) {
            System.out.println(student);
        }
        ois.close();
    }
}
