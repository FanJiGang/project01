package cn.fan.demo03;

import sun.net.spi.nameservice.dns.DNSNameService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 字节码加载器
 */
public class Test {
    public static void main(String[] args) {
        //method01();
        ICar icar = (ICar)Proxy.newProxyInstance(Test.class.getClassLoader(), GoogleCar.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object obj = null;
                if ("start".equals(method.getName())) {
                    System.out.println("启动前...");
                    obj = method.invoke(new GoogleCar(), args);
                    System.out.println("args="+Arrays.toString(args));
                    System.out.println("obj="+obj);
                    System.out.println("启动后...");
                } else {
                    obj = method.invoke(new GoogleCar());
                }
                return obj;
            }
        });
        String str = icar.start(2, 6);
        System.out.println("str = " + str);
        icar.run();
        icar.stop();
    }

    private static void method01() {
        //1.系统引导加载器
        ClassLoader loader1 = String.class.getClassLoader();
        System.out.println("loader1 = " + loader1);
        //2.扩展类加载器(ExtClassLoader)
        ClassLoader loader2 = DNSNameService.class.getClassLoader();
        System.out.println("loader2 = " + loader2);
        //3.应用类加载器(AppClassLoader)
        ClassLoader loader3 = Test.class.getClassLoader();
        System.out.println("loader3 = " + loader3);
    }
}
