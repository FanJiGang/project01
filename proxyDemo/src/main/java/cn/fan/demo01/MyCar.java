package cn.fan.demo01;

/**
 * 给谷歌汽车启动时添加一些新功能
 */
public abstract class MyCar implements ICar {

    private ICar iCar;

    public MyCar(ICar iCar) {
        this.iCar = iCar;
    }

    @Override

    public void start() {
        iCar.start();
    }

    @Override
    public void run() {
        iCar.run();
    }

    @Override
    public void stop() {
        iCar.stop();
    }
}
