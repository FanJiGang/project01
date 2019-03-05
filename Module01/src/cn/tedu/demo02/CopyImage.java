package cn.tedu.demo02;

import java.io.*;

public class CopyImage {
    public static void main(String[] args) throws IOException {
        //method01();
        FileInputStream fis = new FileInputStream("F:\\a.png");
        FileOutputStream fos = new FileOutputStream("a2.png");
        int len;
        byte[] bys=new byte[1024];
        while ((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fis.close();
        fos.close();
    }

    private static void method01() throws IOException {
        FileReader fr = new FileReader("F:\\a.png");
        FileWriter fw = new FileWriter("a1.png");
        int len;
        char[] chs=new char[1024];
        while ((len=fr.read(chs))!=-1){
            fw.write(chs,0,len);
        }
        fr.close();
        fw.close();
    }
}
