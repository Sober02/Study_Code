package mysocketnet.a11test5;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunnable implements Runnable{

    Socket socket;

    public MyRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //接收客户端上传的文件并下载到本地
        try {
            String name = UUID.randomUUID().toString().replace("-", "");
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day32-code\\serverdir\\"+name+".jpg"));
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1){
                bos.write(bytes,0,len);
            }

            //发送反馈
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("上传成功~");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //释放资源
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
