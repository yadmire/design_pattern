package com.yadmire.design.ceational.singleton;

/**
 * @className Singleton4
 * @author: yadmire
 * @create: 2022-05-15 16:34
 * @Description: 饿汉式-双重检查机制
 */
public class Singleton4 {

    // 这里添加 volatile 保证创建过程是线程可见的
    // new 操作在字节码层面上会分解成3个操作：
    // 1. 给 singleton 分配内存
    // 2. 调用 Singleton 的构造函数来初始化成员变量，形成实例
    // 3. 将singleton对象指向分配的内存空间（执行完这步 singleton才是非 null了）
    // 通过添加 volatile （内存屏障）保证线程的可见性与顺序性，同时保证不会发生指令重排，
    // 但是此处保证的不是new 时的指令重排，而是保证在写操作时，通过内存屏障，为该内存区域加锁，保证不会有读操作，保证写期间不会有读该内存区域的操作
    private  static volatile Singleton4 INSTANCE= null;

    private Singleton4(){}

    public static Singleton4 getINSTANCE() {
        if(INSTANCE == null){
            // 局部加锁，增加效率
            synchronized (Singleton4.class){
                if(INSTANCE ==null){
                    INSTANCE=new Singleton4();
                }
            }
        }
        return INSTANCE;
    }
}
