package com.network.b_Socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Socket网络编程简单范例
 * 1，客户端，服务端实际就是两个Socket对象，通过IO流，把网络当作通道进行数据传输
 * */
public class SocketServerDemo {

    public static void main(String[] args) {
        InputStream in = null;
        Socket server = null;
        ServerSocket serverSocket = null;
        try {
            /*1,创建ServerSocket对象，在本机监听8082端口，如果该端口被占用则无法监听。
                注意默认情况下该对象只能监听一次端口，即客户端发送来一次消息后，这里就不再监听了，客户端再发送就会报错，需要重新运行ServerSocketDemo进行监听；
                ServerSocket可以对应多个Socket对象，通过accept()方法获取多个Socket对象，这就是多并发的情况，即一个服务器可以有多个客户端连接；
             */
            serverSocket = new ServerSocket(8082);
            System.out.println("服务器等待连接……");
            //2,当没有客户端连接服务器时，当前线程会阻塞，即下面的语句暂停执行
            server = serverSocket.accept();  //调用accept()方法获取socket对象
            System.out.println("Server's Socket==>" + server);
            //3,获取输入流，里面有客户端传来的数据
            in = server.getInputStream();
            int readCount = 0;
            byte[] bytes = new byte[1024];
            while( (readCount = in.read(bytes)) != -1 ){
                System.out.println(new String(bytes,0,readCount));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           //4, 关闭IO流和通信流，这里还要关闭ServerSocket,减少资源占用
            try {
                if(in != null) in.close();
                if(server != null) server.close();
                if(serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
