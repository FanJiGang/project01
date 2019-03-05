package cn.fan.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
//        method01();
        /*
         *
         */
        ICar car = (ICar)Proxy.newProxyInstance(Test.class.getClassLoader(), GoogleCar.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //method代表当前正在执行的每个方法
                if ("start".equals(method.getName())) {
                    System.out.println("开始前预热一下");
                    method.invoke(new GoogleCar());
                    System.out.println("开始后放个音乐");
                }else {
                    method.invoke(new GoogleCar());
                }
                return null;
            }
        });
        car.start();
        car.run();
        car.stop();
    }

    private static void method01() {
        //获取GoogleCar.class中所有的接口
        Class cls = GoogleCar.class.getInterfaces()[0];
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
