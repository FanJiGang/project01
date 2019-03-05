package cn.tedu.demo03;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OosDemo {

    public static void main(String[] args) {
        //method01();
        //method02();
        method03();
    }

    private static void method03() {
        ObjectInputStream ois=null;
        List<Student> lists = new ArrayList<Student>();
        try {
            ois = new ObjectInputStream(new FileInputStream("a.txt"));
            while (true) {
                Object o=ois.readObject();
                if(o instanceof Student){
                    lists.add((Student)o);
                }
            }
        } catch (EOFException e) {
            System.out.println("读取结束");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        for (Student student : lists) {
            System.out.println("student = " + student);
        }
    }

    private static void method02() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        Object o=ois.readObject();
        Object o1=ois.readObject();
        Object o2=ois.readObject();

        System.out.println("o = " + o);
        System.out.println("o1 = " + o1);
    }

    private static void method01() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        Student s1=new Student("1","Tom",24);
        Student s2=new Student("2","Jim",21);
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.close();
    }
}
