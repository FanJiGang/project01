package cn.tedu.demo01;

import java.util.Scanner;

public class ReverseTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s="";
        StringBuilder sb=new StringBuilder(s);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入内容:");
            String input=scan.nextLine();
            sb.append(input);
        }
//      System.out.println(sb.toString());
//      System.out.println(sb.reverse().toString());
        reverse(sb.toString());
        System.out.println("sb"+sb);
    }


    public static String reverse(String s){
        char[] c=s.toCharArray();
        for (int start=0,end=c.length-1; start<end ; start++,end--) {
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;
        }
        System.out.println(c);
        return c.toString();
    }
}
