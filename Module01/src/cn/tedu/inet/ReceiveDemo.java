package cn.tedu.inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(8888);
        byte[] bys=new byte[1024];
        DatagramPacket p = new DatagramPacket(bys,bys.length);
        while (true) {
            ds.receive(p);
            System.out.println("ip:"+p.getAddress());
            int len=p.getLength();
            String s=new String(bys,0,len);
            if("exit".equalsIgnoreCase(s)){
                break;
            }
            System.out.println("数据:"+s);
        }
        ds.close();
    }
}
