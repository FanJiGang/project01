package cn.fan.demo01;

public class MyCarImpl extends MyCar {

    public MyCarImpl(ICar iCar) {
        super(iCar);
    }

    @Override
    public void start() {
        System.out.println("正在为您查询天气情况...");
        super.start();
        System.out.println("正在为您规划路线...");
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void stop() {
        super.stop();
    }
}
