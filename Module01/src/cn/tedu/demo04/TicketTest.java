package cn.tedu.demo04;

public class TicketTest {
    public static void main(String[] args) {
        TicketThread tickets = new TicketThread(100);
        Thread thread1 = new Thread(tickets);
        thread1.setName("窗口1");
        Thread thread2 = new Thread(tickets);
        thread2.setName("窗口2");
        Thread thread3 = new Thread(tickets);
        thread3.setName("窗口3");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class TicketThread implements Runnable{
    private int tickets;
    Object o=new Object();

    public TicketThread(int tickets) {
        this.tickets = tickets;
    }

    public TicketThread() {

    }

    @Override
    public void run() {
        while (true) {
            method();
        }
    }

    private synchronized void method() {
        if (tickets>0) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+tickets--);
        }
    }
}