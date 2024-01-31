package myio.mytest02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class a02Test1 {
    public static void main(String[] args) throws IOException {
        /*
        需求:
            将多个自定义对象序列化到文件中，但是对象的个数不确定，该如何操作呢?

         */

        //1.创建对象
        Student s1 = new Student("张三",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",23);

        //创建集合存储对象
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //2.创建序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day29-code\\f.txt"));

        //3.写出数据
        oos.writeObject(list);

        //4.释放资源
        oos.close();

    }
}
