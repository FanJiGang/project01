package cn.fan.demo03;

/**
 * 谷歌生产的无人汽车
 */
public class GoogleCar implements ICar {
    @Override
    public String start(int a,int b) {
        System.out.println("呜呜呜~开车了...");
        return "start:"+a+b;
    }

    @Override
    public void run() {
        System.out.println("-----平稳运行中-----");
    }

    @Override
    public void stop() {
        System.out.println("停下来了...");
    }
}
