package cn.fan.test;

import cn.fan.annotation.MyTest;

/**
 * 测试使用自定义的注解
 */
public class TestMyAnnotation {
    @MyTest(timeout = 1000)
    public void testDemo01(){
        System.out.println("执行了方法...");
    }
}
