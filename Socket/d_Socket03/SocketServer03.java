package com.network.d_Socket03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer03 {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket server = null;
        InputStream in = null;
        OutputStream out = null;
        try {
            //1,创建服务器，定义好端口
            serverSocket = new ServerSocket(8082);
            System.out.println("服务器已启动等待连接……");
            //2,获取服务器端的Socket对象
            server = serverSocket.accept();
            //3,获取网络输入流
            in = server.getInputStream();
            //4,读取数据，并通过输出流写入到服务器本地磁盘
            out = new FileOutputStream("F:\\Learning\\Computer\\Socket网络编程\\Network_Code\\Network\\src\\com\\network\\d_Socket03\\serverImages\\ThreeKingdoms.jpg");
            byte[] bytes = new byte[1024];
            int readCount = 0;
            while ((readCount = in.read(bytes)) != -1) {
                out.write(bytes,0,readCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
