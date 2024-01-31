package myio.myobjectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        需求:
        利用序列化流/对象操作输出流，把一个对象写到本地文件中

        构造方法:
        public ObjectOutputStream(OutputStream out) 把基本流变成高级流

        成员方法:
        public final void writeObject(object obj)    把对象序列化(写出) 到文件中去

        细节：
            使用对象输出流将对象保存到文件时会出现NotSerializableException异常
            解决方案: 需要让Javabean类实现Serializable接口
            serializable(可串行化的)
         */

        //1.创建对象
        Teacher t1 = new Teacher("张三",23,"东莞");
        //2.创建序列化流/对象操作输出流的对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day29-code\\e.txt"));

        //3.写出
        oos.writeObject(t1);

        //4.释放
        oos.close();

    }
}
