package cn.tedu.demo02;

import java.io.*;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        //method01();
        //PrintWriter pw = new PrintWriter("a.txt");
        PrintWriter pw = new PrintWriter(new FileWriter("a.txt",true),true);
        pw.println("6");
        pw.println("5");
        pw.println("4");
        pw.close();
        /*PrintWriter pw = new PrintWriter(new FileWriter("a.txt", true), true);
        pw.println(1);
        pw.println("lalala");
        pw.println(21);
        pw.println("接收");

        pw.close();*/

    }

    private static void method01() throws FileNotFoundException {
        PrintWriter pw=new PrintWriter("a.txt");
        pw.println("hello");
        pw.println("world");
        pw.print("hello");
        pw.print("world");
        pw.close();
    }
}
