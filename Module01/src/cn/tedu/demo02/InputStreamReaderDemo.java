package cn.tedu.demo02;

import java.io.*;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        //method01();
        Reader reader=new InputStreamReader(System.in);
        FileWriter fw=new FileWriter("a.txt");
        char[] chs=new char[1024];
        int len;
        while ((len=reader.read(chs))!=-1){
            fw.write(chs,0,len);
            fw.flush();
        }
        fw.close();
        reader.close();

    }

    private static void method01() throws IOException {
        InputStream in = System.in;
        FileWriter fw=new FileWriter("a.txt");
        byte[] bys=new byte[1024];
        int len;
        while((len=in.read(bys))!=-1){
            fw.write(new String(bys,0,len));
            fw.flush();
        }
        in.close();
        fw.close();
    }
}
