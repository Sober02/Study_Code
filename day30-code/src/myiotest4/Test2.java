package myiotest4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) throws IOException {
        /*
            Properties作为Map集合的操作
         */

        //1.创建集合的对象
        Properties prop = new Properties();

        //2.添加数据
        //细节：虽然我们可以往Properties当中添加任意的数据类型，但是一般只会往里面添加字符串类型的数据
        prop.put("aaa","www");
        prop.put("bbb","qqq");
        prop.put("ccc","fff");
        prop.put("ddd","eee");

        //3.把集合中的数据以键值对的形式写到本地文件当中
        FileOutputStream fos = new FileOutputStream("day30-code\\src\\myiotest4\\a.properties");
        prop.store(fos,"test");
        fos.close();





    }
}
