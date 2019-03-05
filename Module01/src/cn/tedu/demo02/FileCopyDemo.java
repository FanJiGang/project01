package cn.tedu.demo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\常用api文档\\Ext JS 3.0.chm");
        FileOutputStream fos = new FileOutputStream("copy.chm");

        int len;
        byte[] bys=new byte[1024];
        while ((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fis.close();
        fos.close();

    }
}
