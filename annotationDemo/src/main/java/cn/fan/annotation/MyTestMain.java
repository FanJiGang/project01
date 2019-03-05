package cn.fan.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 加载字节码文件中的方法,判断哪些方法上有自定义的@MyTest,如果有则执行
 */
public class MyTestMain {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //将类的字节码文件加载到内存中
        Class cls = Class.forName("cn.fan.test.TestMyAnnotation");
        //获取字节码
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            //System.out.println(method.getName());
            //判断当前方法上是否有@MyTest注解
            if (method.isAnnotationPresent(MyTest.class)) {
                method.invoke(cls.newInstance());
            }
        }

    }
}
