package cn.tedu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class test {


    public static void main(String[] args) {
        //method01();
        //method02();
        //method03();
        //method04();
        //method05();
        //method06();
        try {
            System.out.println("args = " + args);
        }finally {
            System.out.println(333);
        }
    }

    private static void method06() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        unmodifiableList.add("ddd");
    }

    private static void method05() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        ListIterator<String> it = list.listIterator();
        if (it.hasNext()) {
            it.add("aaaa");
        }
        it=list.listIterator();
        while (it.hasNext()) {
//            System.out.println(it.nextIndex());
//            System.out.println(it.previousIndex());
            it.next();
            it.set("ccccc");
        }
        for (String s : list) {
            System.out.println("s = " + s);
        }
    }

    private static void method04() {
        System.out.println(Math.round(-1.51));
        System.out.println(Math.round(-2.50));
        System.out.println(Math.round(-2.51));
        System.out.println(Math.round(-2.52));
        System.out.println(Math.round(-3.5));
        System.out.println(Math.round(-3.50));
        System.out.println(Math.round(-3.51));
        System.out.println(Math.round(-3.52));
    }

    private static void method03() {
        String str1="dfasewafads";
        String str2="";
        for (int i = 0; i < str1.length(); i++) {
            str2=str1.charAt(i)+str2;
        }
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }

    private static void method02() {
        String str1="adfsedfasf";
        char[] str1_char = str1.toCharArray();
        String str2="";
        for (int i = str1_char.length-1; i >= 0; i--) {
            str2+=str1_char[i];
        }
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }

    private static void method01() {
        String str1 = "abcddeds";
        StringBuilder sb = new StringBuilder(str1);
        StringBuilder str2 = sb.reverse();
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
