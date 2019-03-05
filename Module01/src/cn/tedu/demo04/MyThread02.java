package cn.tedu.demo04;

public class MyThread02 implements Runnable{
    private int num;

    public MyThread02(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (num!=0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+num--);
        }
    }
}
class ThreadDemo02{
    public static void main(String[] args) {
        MyThread02 myThread02 = new MyThread02(10);
        Thread thread1 = new Thread(myThread02);
        thread1.setName("张三");
        Thread thread2 = new Thread(myThread02);
        thread2.setName("李四");
        thread1.start();
        thread2.start();
    }
}
