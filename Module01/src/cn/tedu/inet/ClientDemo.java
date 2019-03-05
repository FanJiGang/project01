package cn.tedu.inet;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);
        OutputStream os = socket.getOutputStream();
        byte[] bys=new Scanner(System.in).nextLine().getBytes();
        os.write(bys);
        socket.close();
    }
}
