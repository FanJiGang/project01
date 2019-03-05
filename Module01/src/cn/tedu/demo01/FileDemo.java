package cn.tedu.demo01;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Date;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        //method();
        //method2();
        //method03();
        //method04();
        //method05();
        //method06();
        //method07();
        //method08();
        //method09();
        //method10();
        File[] fs = File.listRoots();
        for (File f : fs) {
            System.out.println("f = " + f);
        }


    }

    private static void method10() {
        File f1 = new File("test01");
        File[] fs = f1.listFiles();
        for (File f : fs) {
            System.out.println("f = " + f);
        }
    }

    private static void method09() {
        File f1 = new File("test01");
        String[] files= f1.list();
        for(String s:files){
            System.out.println("s:"+s);
        }
    }

    private static void method08() {
        File f1=new File("b.txt");
        File f2=new File("copy.txt");
        System.out.println(f1.renameTo(f2));
    }

    private static void method07() {
        File f1 = new File("F:\\a\\b.txt");
        System.out.println(new Date(f1.lastModified()).toLocaleString());
        System.out.println(f1.length());
    }

    private static void method06() {
        File f1=new File("a.txt");
        File f2=new File("F:\\a\\b.txt");
        File f3=new File("b");
        System.out.println(f1.getName());
        System.out.println(f2.getName());
        System.out.println(f3.getName());
        System.out.println(f1.getPath());
        System.out.println(f2.getPath());
        System.out.println(f3.getPath());
    }

    private static void method05() {
        File f1 = new File("F:\\a\\b.txt");
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.getAbsolutePath());
        File parent=new File("a");
        File f2=new File(parent,"b.txt");
        if(!parent.exists()){
            parent.mkdirs();
        }
        System.out.println(f2.getParent());
        System.out.println(f2.getParentFile());
    }

    private static void method04() {
        File f1 = new File("F:\\a\\b.txt");
        System.out.println(f1.isHidden());
    }

    private static void method03() throws IOException {
        File f1=new File("a.txt");
        File f2=new File("b");
        if(!f1.exists()){
            f1.createNewFile();
        }
        if(!f2.exists()){
            f2.createNewFile();
        }
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());
    }

    private static void method2() {
        File f1=new File("F:\\a\\b.txt");
        File f2=new File("b.txt");
        System.out.println(f1.exists());
        System.out.println(f2.exists());
        System.out.println(f1.isAbsolute());
        System.out.println(f2.isAbsolute());
    }

    private static void method() throws IOException {
        File f1=new File("F:\\a\\b.txt");
        File f2=new File("F:\\a","b.txt");
        File f3=new File(new File("F:\\a"),"b.txt");
        System.out.println("read:"+f1.canRead());
        System.out.println("write:"+f2.canWrite());
        System.out.println("execute:"+f3.canExecute());
        System.out.println("create:"+f1.createNewFile());
    }
}
