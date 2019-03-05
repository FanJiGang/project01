package cn.tedu.demo03;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OosDemo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //method1();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("b.txt"));
        Object o = ois.readObject();
        ArrayList<Student> list= (ArrayList<Student>) o;
        for (Student s : list) {
            System.out.println("s = " + s);
        }
    }

    private static void method1() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("b.txt"));
        List<Student> list=new ArrayList<Student>();
        list.add(new Student("1","Tom",24));
        list.add(new Student("2","Jerry",21));
        list.add(new Student("3","Jim",18));
        oos.writeObject(list);
        oos.close();
    }
}
