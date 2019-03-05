package cn.tedu.inet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        Scanner scan=new Scanner(System.in);
        try {
            socket = new Socket(InetAddress.getLocalHost(), 8888);
            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();
            byte[] bys=new byte[1024];

            sendMsg(scan, os);
            receive(is, bys);

        } catch (IOException e) {
            System.out.println("客户端出错!");
            e.printStackTrace();
        } finally {
        }
    }

    private static void sendMsg(Scanner scan, OutputStream os) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.print("请输入内容(Client):");
                        String content=scan.nextLine();
                        if ("exit".equalsIgnoreCase(content)){
                            System.exit(0);
                        }
                        byte[] content_bys=content.getBytes();
                        os.write(content_bys);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private static void receive(InputStream is, byte[] bys) {
        new Thread(new Runnable() {
            int len;
            @Override
            public void run() {
                try {
                    while ((len=is.read(bys))!=-1) {
                        System.out.println("Server:"+new String(bys,0,len));
                    }
                } catch (IOException e) {
                    System.out.println("Server已下线!");
                }
            }
        }).start();
    }

}
