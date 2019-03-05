package cn.tedu.demo01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
    public static void main(String[] args) {
        FileWriter fw=null;
        try {
            fw=new FileWriter("fw.txt");
            fw.write("adbcdsdf");
            fw.write("\n");
            fw.write("123456");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }




    }

}
