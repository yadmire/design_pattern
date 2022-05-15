package com.yadmire.design.ceational.singleton;

/**
 * @className Singleton1
 * @author:yadmire
 * @create: 2022-05-15 16:17
 * @Description: 饿汉式单例 Demo
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存
 */
public class Singleton1 {
    //私有化构造，不允许新建对象
    private Singleton1(){
    }
    private static Singleton1 INSTANCE=new Singleton1();

    /**
     * 返回对象
     * @return
     */
    public Singleton1 getSigleton(){
        return INSTANCE;
    }

}
