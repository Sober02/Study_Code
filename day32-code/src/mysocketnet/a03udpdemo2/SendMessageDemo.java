package mysocketnet.a03udpdemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        /*
        按照下面的要求实现程序
            UDP发送数据: 数据来自于键盘录入，直到输入的数据是886，发送数据结束
            UDP接收数据: 因为接收端不知道发送端什么时候停止发送，故采用死循环接收
         */

        DatagramSocket ds = new DatagramSocket();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的消息：");
            String str = sc.nextLine();
            if (str.equals("886")){
                break;
            }
            byte[] bytes = str.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 10086;

            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

            ds.send(dp);

        }

        ds.close();

    }
}
