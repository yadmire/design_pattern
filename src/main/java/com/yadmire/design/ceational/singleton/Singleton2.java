package com.yadmire.design.ceational.singleton;

/**
 * @className Singleton2
 * @author: yadmire
 * @create: 2022-05-15 16:24
 * @Description: 懒汉式 （在第一次调用的时候实例化自己）
 *  这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 */
public class Singleton2 {
    //私有化构造，不允许新建对象
    private Singleton2(){
    }
    private static Singleton2 INSTANCE;
    /**
     * 返回对象
     * @return
     */
    public Singleton2 getSigleton(){
        // 首次加载时进行创建
        if(INSTANCE==null){
            INSTANCE=new Singleton2();
        }
        return INSTANCE;
    }
}
