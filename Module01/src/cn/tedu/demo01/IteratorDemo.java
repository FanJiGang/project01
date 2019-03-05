package cn.tedu.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("hello");
        c.add("world");
        c.add("java");
        //method1(c);
        if(c instanceof ArrayList){
            ArrayList<String> al=(ArrayList) c;
            ListIterator<String> lt = al.listIterator();
            while(lt.hasNext()){
                String s=lt.next();
                System.out.println(s);
                if("java".equals(s)){
                    lt.add("c++");
                }
            }
            for (String s:c){
                System.out.println(s);
            }
        }


    }

    private static void method1(Collection<String> c) {
        Iterator<String> i1 = c.iterator();
        while(i1.hasNext()){
            String next = i1.next();
            System.out.println(next);
//            if ("java".equals(next)){
//                c.add("c++");
//            }
        }
    }
}
