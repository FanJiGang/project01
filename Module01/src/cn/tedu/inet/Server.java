package cn.tedu.inet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        ServerSocket server = null;
        Scanner scan=new Scanner(System.in);
        try {
            server = new ServerSocket(8888);
            Socket client = server.accept();
            InputStream is = client.getInputStream();
            OutputStream os = client.getOutputStream();
            byte[] bys=new byte[1024];
            getMsg(is, bys);
            sendMsg(scan, os);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

    }

    private static void getMsg(InputStream is, byte[] bys) {
        new Thread(new Runnable() {
            int len;
            @Override
            public void run() {
                try {
                    while((len=is.read(bys))!=-1){
                        System.out.println("Client:"+new String(bys,0,len));
                    }
                } catch (IOException e) {
                    System.out.println("Client已下线!");
                }
            }
        }).start();
    }

    private static void sendMsg(Scanner scan, OutputStream os) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.print("请输入内容(Server):");
                    String content=scan.nextLine();
                    if("exit".equalsIgnoreCase(content)){
                        content="Server已下线!";
                        System.exit(0);
                    }
                    byte[] content_bys=content.getBytes();
                    try {
                        os.write(content_bys);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
