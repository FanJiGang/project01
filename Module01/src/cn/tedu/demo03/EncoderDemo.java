package cn.tedu.demo03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EncoderDemo {
    public static void main(String[] args) throws IOException {
        //method01();
        FileInputStream fis = new FileInputStream("c.txt");
        byte[] bys=new byte[1024];
        int len = fis.read(bys);
        System.out.println(new String(bys,0,len,"gbk"));
    }

    private static void method01() throws IOException {
        String s="错的不是我，而是这个世界！";
        byte[] bys=s.getBytes("gbk");
        FileOutputStream fos = new FileOutputStream("c.txt");
        fos.write(bys);
        fos.close();
    }
}
