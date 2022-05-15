package com.yadmire.design.ceational.singleton;

/**
 * @className Singleton3
 * @author: yadmire
 * @create: 2022-05-15 16:29
 * @Description: 懒汉式-加锁，线程安全
 */
public class Singleton3 {
    // 私有化构造
    private Singleton3 (){}
    private static Singleton3 INSTANCE=null;

    // 加锁，保证单例，但是比较重，影响效率
    public  synchronized Singleton3 getSingleton3(){
        if(INSTANCE==null){
            INSTANCE=new Singleton3();
        }
        return INSTANCE;
    }
}
