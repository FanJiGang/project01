package cn.tedu.demo02;

import java.io.*;

public class PrintWriterDemo02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(("a.txt")));
        PrintWriter pw = new PrintWriter(new FileWriter("F:\\copy.txt", true), true);
        String line;
        while((line=br.readLine())!=null){
            pw.println(line);
        }
        pw.close();
        br.close();

    }
}
