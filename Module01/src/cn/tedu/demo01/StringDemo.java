package cn.tedu.demo01;

public class StringDemo {
    public static void main(String[] args) {
        long round = Math.round(-1.5);
        System.out.println("round = " + round);
        String str1 = new String("abc");
        String str2 = "abc";
        String str3 = "abc";
        System.out.println(str1==str2);
        System.out.println(str2==str3);
    }
}
