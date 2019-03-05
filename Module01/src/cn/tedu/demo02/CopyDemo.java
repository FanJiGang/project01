package cn.tedu.demo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        //Method01();
        FileReader fr = new FileReader("fw.txt");
        FileWriter fw = new FileWriter("copy01.txt");
        int len;
        char[] chs=new char[1024];
        while ((len=fr.read(chs))!=-1){
            fw.write(chs,0,len);
        }
        fr.close();
        fw.close();


    }

    private static void Method01() throws IOException {
        FileReader fr = new FileReader("copy.txt");
        FileWriter fw = new FileWriter("copy01.txt");
        int ch;
        while((ch=fr.read())!=-1){
                fw.write(ch);
                fw.flush();
        }
        fr.close();
        fw.close();
    }
}
