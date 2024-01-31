package mysocketnet.a04udpdemo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        /*
            组播发送端代码

            广播只需要把单播的地址改为255.255.255.255即可
         */

        //1.创建MulticastSocket对象
        MulticastSocket ms = new MulticastSocket();

        //2.创建DatagramPacket对象
        String str="你好~你好！";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("224.0.0.1");
        int port = 10000;

        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

        //3.调用MulticastSocket发送数据方法发送数据
        ms.send(dp);

        //4.释放资源
        ms.close();

    }
}
