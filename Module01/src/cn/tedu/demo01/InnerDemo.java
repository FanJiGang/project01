package cn.tedu.demo01;

public class InnerDemo {
    public static void main(String[] args) {
//        Outer outer = new Outer();
//        outer.method();
//        Outer.Inner inner = new Outer().new Inner();
//        inner.function();
//        Outer.Inner inner = new Outer.Inner();
//        inner.function();
        new Outer.Inner().function();
    }
}

class Outer{
    private String s="私有成员变量";

    public void method(){
        Inner i=new Inner();
        System.out.println("s:"+s);
        i.function();
    }

    static class Inner{
        public void function(){
            //s="访问了外部类的私有成员变量";
            System.out.println("内部类:");
        }
    }
}

