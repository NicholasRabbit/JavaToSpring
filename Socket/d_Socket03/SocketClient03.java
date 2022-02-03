package com.network.d_Socket03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 1,使用Socket从客户端向服务器传送文件范例；
 * */
public class SocketClient03 {

    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;
        Socket client = null;
        try {
            //1,创建客户端Socket对象
            client = new Socket(InetAddress.getLocalHost(),8082);
            //2,要想向服务器传文件，首先从本地获取文件的输入流, 这里idea相对路径报异常FileNotFoundException，绝对路径管用可复制成功，后期待研究
            in = new FileInputStream("F:\\Learning\\Computer\\Socket网络编程\\Network_Code\\Network\\src\\com\\network\\d_Socket03\\images\\三国.jpg");
            //3,获取输出流，向网络中输出字节流到服务器
            out = client.getOutputStream();
            //4,从本地读到程序内，再从程序传送到网络输出流中
            byte[] bytes = new byte[1024];
            int readCount = 0;
            while( (readCount = in.read(bytes)) != -1){
                out.write(bytes,0,readCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
