package cn.fan.demo02;

/**
 * 谷歌生产的无人汽车
 */
public class GoogleCar implements ICar {
    @Override
    public void start() {
        System.out.println("呜呜呜~开车了...");
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
