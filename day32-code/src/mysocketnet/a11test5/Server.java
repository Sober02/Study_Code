package mysocketnet.a11test5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {
        //客户端:将本地文件上传到服务器。接收服务器的反馈。
        //服务器: 接收客户端上传的文件，上传完毕之后给出反馈。
        //方法一：利用循环加多线程使得服务器可以不断地接收文件
        //方法二：循环加线程池

        //创建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,//核心线程数量
                5,//线程池总大小
                60,//空闲时间
                TimeUnit.SECONDS,//空闲时间的单位
                new ArrayBlockingQueue<>(2),//队列
                Executors.defaultThreadFactory(),//线程工厂，让线程池如何创建线程对象
                new ThreadPoolExecutor.AbortPolicy()//阻塞队列

        );

        //创建ServerSocket对象
        ServerSocket ss = new ServerSocket(10000);
        while (true) {
            //等待客户端的连接
            Socket socket = ss.accept();

            /*//开启一条线程
            //一个用户对应服务端的一条线程
            //弊端：不断的创建线程和销毁线程很浪费资源，所以可以使用线程池。
            Thread thread = new Thread(new MyRunnable(socket));
            thread.start();*/

            //使用线程池
            pool.submit(new MyRunnable(socket));

        }

    }
}
