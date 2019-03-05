package cn.tedu.demo02;

import java.io.*;

public class SystemInOutDemo {
    public static void main(String[] args) throws IOException {
        //method02();
        //method03();
        BufferedReader br = new BufferedReader(new FileReader("Module01\\src\\cn\\tedu\\demo02\\SystemInOutDemo.java"));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }
        br.close();
        bw.close();
    }

    private static void method03() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Module01\\src\\cn\\tedu\\demo02\\SystemInOutDemo.java"));
        Writer writer=new OutputStreamWriter(System.out);
        String line;
        while ((line=br.readLine())!=null){
            writer.write(line);
            writer.write("\r\n");
        }
        br.close();
        writer.close();
    }

    private static void method02() throws IOException {
        //method01();
        BufferedReader br = new BufferedReader(new FileReader("Module01\\src\\cn\\tedu\\demo02\\SystemInOutDemo.java"));
        OutputStream out = System.out;
        String line;
        while((line=br.readLine())!=null){
            out.write(line.getBytes());
            out.write("\t\n".getBytes());
        }
        br.close();
        out.close();
    }

    private static void method01() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Module01\\src\\cn\\tedu\\demo02\\SystemInOutDemo.java"));
        PrintStream out = System.out;
        String line;
        while ((line=br.readLine())!=null){
            out.println(line);
        }
        br.close();
        out.close();
    }
}
