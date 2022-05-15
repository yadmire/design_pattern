package com.yadmire.design.ceational.singleton;

/**
 * @className Singleton5
 * @author: yadmire
 * @create: 2022-05-15 16:58
 * @Description: 额外：枚举类型
 */
public enum  Singleton5 {
    SINGLETON_5;
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
