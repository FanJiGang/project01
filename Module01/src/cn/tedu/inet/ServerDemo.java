package cn.tedu.inet;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket client = server.accept();
        InputStream is = client.getInputStream();
        byte[] bys=new byte[1024];
        int len = is.read(bys);
        System.out.println("ip:"+client.getInetAddress());
        System.out.println("数据:" + new String(bys,0,len));
        client.close();
    }
}
