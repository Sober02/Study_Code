package myio.mytest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        /*
        为了保证文件的安全性，就需要对原始文件进行加密存储，再使用的时候再对其进行解密处理。
        加密原理:
            对原始文件中的每一个字节数据进行更改，然后将更改以后的数据存储到新的文件中
        解密原理:
            读取加密之后的文件，按照加密的规则反向操作，变成原始文件。


        ^ : 异或
            两边相同: false
            两边不同: true

            一个数异或两次是他的本身！
         */
//        System.out.println(100 ^ 10);//110
//        System.out.println(110 ^ 10);//100

        //思路：
        // 加密，将文件进行异或。
        // 解密，将加密后的文件再进行异或即可

        //加密 day28-code\lufei.jpg

        //1.创建对象关联原始文件
        FileInputStream fis = new FileInputStream("day28-code\\lufei.jpg");
        //2.创建对象关联加密文件
        FileOutputStream fos = new FileOutputStream("day28-code\\encryption.jpg");
        //3.加密处理
        int len;
        while ((len = fis.read()) != -1){
            fos.write(len ^ 2);
        }
        //4.释放资源
        fos.close();
        fis.close();

        /*//解密
        //1.创建对象关联原始文件
        FileInputStream fis2 = new FileInputStream("day28-code\\encryption.jpg");
        //2.创建对象关联加密文件
        FileOutputStream fos2 = new FileOutputStream("day28-code\\lufei.jpg");
        //3.加密处理
        int len2;
        while ((len2 = fis2.read()) != -1){
            fos2.write(len2 ^ 2);
        }
        //4.释放资源
        fos2.close();
        fis2.close();*/

    }
}
