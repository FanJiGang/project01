package cn.tedu.demo02;

import java.io.File;

public class RecurrenceTest {
    private static int result=0;
    public static void main(String[] args) {
        File file = new File("Module01");
        method(file);
        System.out.println(result);

    }

    public static void method(File file){
        if(file.isFile()){
            return;
        }
        File[] files=file.listFiles();

        for(File f:files){
            if(f.isFile()){
                if(f.getName().endsWith(".java")){
                    System.out.println(f.getName());
                    result++;
                }
            }else{
                method(f);
            }
        }
    }
}
