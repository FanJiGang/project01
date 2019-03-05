package cn.tedu.demo03;

import java.io.*;
import java.util.Properties;

public class PropertiesDemo02 {
    public static void main(String[] args) throws IOException {
        //method01();
        //method02();
        Properties props = new Properties();
        props.setProperty("JSD001","Tom");
        props.setProperty("JSD002","Jerry");
        props.setProperty("JSD003","King");
        FileWriter fw = new FileWriter("b.txt");
        props.store(fw,"HelloWord");
        fw.close();

    }

    private static void method02() throws IOException {
        Properties props = new Properties();
        FileReader fr = new FileReader("a.txt");
        props.load(fr);
        fr.close();
        System.out.println("props = " + props);
    }

    private static void method01() throws FileNotFoundException {
        Properties props = new Properties();
        props.setProperty("JSD001","Tom");
        props.setProperty("JSD002","Jerry");
        props.setProperty("JSD003","King");
        PrintWriter pw = new PrintWriter("a.txt");
        props.list(pw);
        pw.close();
    }
}
