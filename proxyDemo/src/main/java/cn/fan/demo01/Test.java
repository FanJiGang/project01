package cn.fan.demo01;

public class Test {
    public static void main(String[] args) {
        ICar iCar =new MyCarImpl(new GoogleCar());
        iCar.start();
        iCar.run();
        iCar.stop();
    }
}
