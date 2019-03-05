package cn.tedu.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress address = InetAddress.getByName("ZSGAX1Y3R4BFD4U");
        InetAddress address = InetAddress.getByName("192.168.0.100");
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("localHost = " + localHost);
        String hostName = address.getHostName();
        System.out.println("hostName = " + hostName);
        System.out.println("address = " + address);

    }
}
