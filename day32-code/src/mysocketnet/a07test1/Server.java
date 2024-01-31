package mysocketnet.a07test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //客户端: 多次发送数据
        //服务器:接收多次接收数据，并打印

        //1.创建ServerSocket的对象
        ServerSocket ss = new ServerSocket(10000);

        //2.监听客户端的链接
        Socket socket = ss.accept();

        //3.用输入流获取信息
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int b;
        while ((b = br.read()) != -1){
            System.out.print((char) b);
        }

        socket.close();
        ss.close();

    }
}
