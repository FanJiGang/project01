package cn.tedu.demo01;

public class InnerDemo2 {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.method();
    }
}

class Outer2{
    public void method(){
        System.out.println("Outer2.method()");
//        Inner i=new Inner();
        class Inner{
            public void function(){
                System.out.println("Inner.function()");
            }
        }
        Inner i=new Inner();
        i.function();
    }
}