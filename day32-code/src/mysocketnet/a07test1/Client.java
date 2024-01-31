package mysocketnet.a07test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //客户端: 多次发送数据
        //服务器:接收多次接收数据，并打印

        //1.创建Socket对象，连接服务端
        Socket socket = new Socket("127.0.0.1",10000);


        //2.可以从连接通道中获取输出流
        Scanner sc = new Scanner(System.in);
        OutputStream os = socket.getOutputStream();
        while (true) {
            System.out.println("请输入你要发送的消息：");
            String str = sc.nextLine();
            os.write(str.getBytes());
            if (str.equals("886")){
                break;
            }
        }
        socket.close();
    }
}
