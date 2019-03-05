package cn.tedu.demo04;

public class Mythread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}

class ThreadDemo{
    public static void main(String[] args) {
        Mythread mythread1 = new Mythread();
        mythread1.setName("mythread1");
        Mythread mythread2 = new Mythread();
        mythread2.setName("mythread2");
        mythread1.start();
        mythread2.start();

    }
}
