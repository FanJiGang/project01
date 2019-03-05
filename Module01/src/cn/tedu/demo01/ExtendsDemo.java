package cn.tedu.demo01;

public class ExtendsDemo {
    public static void main(String[] args) {
        //Dad dad=new Dad();
        Son son = new Son();
    }
}

class Dad{
    public Dad() {
        System.out.println("父类的无参构造");
    }
    public Dad(int num){
        System.out.println("父类的有参构造");
    }
}

class Son extends Dad{
    public Son(){
        //super(1);
        this(1);
        System.out.println("子类的无参构造");
    }
    public Son(int num){
        super(1);
        System.out.println("子类的有参构造");
    }
}
