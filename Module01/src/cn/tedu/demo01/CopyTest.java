package cn.tedu.demo01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTest {
    public static void main(String[] args) {
        FileWriter fw=null;
        FileReader fr=null;
        try {
            fw=new FileWriter("copy.txt");
            fr=new FileReader("fw.txt");
            int num;
            while ((num=fr.read())!=-1){
                fw.write(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
