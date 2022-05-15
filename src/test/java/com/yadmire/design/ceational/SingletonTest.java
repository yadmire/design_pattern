package com.yadmire.design.ceational;

import com.yadmire.design.ceational.singleton.Singleton5;
import org.junit.Assert;
import org.junit.Test;

/**
 * @className SingletonTest
 * @author: yadmire
 * @create: 2022-05-15 17:03
 * @Description: 单例模式
 */
public class SingletonTest {

    @Test
    public void testSingletonEnum(){
        System.out.printf("test for Singleton Enum");
        Singleton5 singleton1 = Singleton5.SINGLETON_5;//枚举类型实例化（静态块中）
        singleton1.setName("单例1");
        System.out.println(singleton1.getName());

        Singleton5 singleton2 = Singleton5.SINGLETON_5;
        singleton2.setName("单例2");
        System.out.println(singleton2.getName());

        System.out.println(singleton1.getName() + ":" + singleton2.getName());

        // 断言 两者是同一个对象
        Assert.assertTrue(singleton1==singleton2);
    }
}
