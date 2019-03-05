package cn.tedu.demo03;


import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class EncoderDemo02 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"), "gbk");
        String s="错的不是我,";
        osw.write(s);
        osw.close();

    }
}
