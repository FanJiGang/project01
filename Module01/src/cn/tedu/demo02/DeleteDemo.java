package cn.tedu.demo02;

import java.io.File;

public class DeleteDemo {

    public static void main(String[] args) {
        File file = new File("F:\\a");
        delete(file);
    }

    public static void delete(File file){
        if(file.isFile()){
            file.delete();
            System.out.println(1);
            return;
        }
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()){
                file1.delete();
                System.out.println(file1.getName());
            }else{
                delete(file1);
            }
        }
        file.delete();

    }
}
