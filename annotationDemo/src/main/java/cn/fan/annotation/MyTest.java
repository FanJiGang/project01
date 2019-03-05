package cn.fan.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Fan
 * 自行定义的,模拟junit4功能
 */
/*
 * 指定注解的作用域
 */
@Retention(RetentionPolicy.RUNTIME)
/*
 * 指定注解可以加到什么地方
 */
@Target(ElementType.METHOD)
public @interface MyTest {
    /*
     * 在注解中定义属性
     * 支持类型:基本数据类型(8种),String,Class(字节码),Annotation(注解),枚举
     *         以及以上类型的一维数组类型
     */
    public long timeout() default -1;
}