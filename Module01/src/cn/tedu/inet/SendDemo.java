package cn.tedu.inet;

import java.io.IOException;
import java.net.*;

/*
 * 使用UDP协议发送数据
 *      创建发送端Socket对象
 *      创建数据并打包
 *      发送数据
 *      释放资源
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        byte[] bys = "exIt".getBytes();
        DatagramPacket p = new DatagramPacket(bys, bys.length, InetAddress.getLocalHost(), 8888);
        ds.send(p);
        ds.close();
    }
}
