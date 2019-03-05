package cn.tedu.demo01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
        //method4();
        //method5();
        //method6();
        method7();
    }

    private static void method7() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(3);
        Collections.swap(list,0,2);
        for (Integer integer : list) {
            System.out.println("integer = " + integer);
        }
    }

    private static void method6() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        Collections.shuffle(al);
        for (Integer integer : al) {
            System.out.println("integer = " + integer);
        }
    }

    private static void method5() {
        ArrayList<String> al = new ArrayList<>();
        al.add("hello");
        al.add("world");
        for (String s : al) {
            System.out.println("s = " + s);
        }
        Collections.reverse(al);
        for (String s : al) {
            System.out.println("s = " + s);
        }
    }

    private static void method4() {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            al.add((int) (Math.random()*100));
        }
        for (Integer integer : al) {
            System.out.println("integer = " + integer);
        }
        Collections.sort(al);
        for (Integer integer : al) {
            System.out.println("integer = " + integer);
        }
    }

    private static void method3() {
        ArrayList<String> al = new ArrayList<>();
        al.add("1");
        al.add("2");
        al.add("5");
        al.add("9");
        Collections.fill(al,"替身");
        for (String s: al) {
            System.out.println(s);
        }
    }

    private static void method2() {
        ArrayList<String> al = new ArrayList<>();
        al.add("hello");
        al.add("world");
        al.add("java");
        al.add("c++");
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("1");
        al2.add("1");
        al2.add("2");
        al2.add("2");
        al2.add("3");
        al2.add("4");
        Collections.copy(al2,al);
        for (String s: al2) {
            System.out.println(s);
        }
    }

    private static void method1() {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(0);
        al.add(2);
        al.add(4);
        al.add(6);
        for (int i : al) {
            System.out.println(i);
        }
        System.out.println(al.get(3));
        int index = Collections.binarySearch(al, 6);
        System.out.println(index);
    }
}
