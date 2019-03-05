package cn.tedu.demo01;

import java.io.*;

public class BufferTest {
    public static void main(String[] args) {
        BufferedWriter bw=null;
        BufferedReader br=null;
        try {
            bw=new BufferedWriter(new FileWriter("copy01.txt",true));
            br=new BufferedReader(new FileReader("fw.txt"));
            String s=null;
            while ((s=br.readLine())!=null){
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
}
