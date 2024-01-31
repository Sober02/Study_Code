package mysocketnet.a09test3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //客户端:将本地文件上传到服务器。接收服务器的反馈。
        //服务器: 接收客户端上传的文件，上传完毕之后给出反馈

        //创建ServerSocket对象
        ServerSocket ss = new ServerSocket(10000);

        //等待客户端的链接
        Socket socket = ss.accept();

        //接收上传的文件
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day32-code\\serverdir\\a.jpg"));
        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }

        //上传完毕反馈
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("上传成功！");
        bw.newLine();
        bw.flush();

        //释放资源
        socket.close();
        ss.close();

    }
}
