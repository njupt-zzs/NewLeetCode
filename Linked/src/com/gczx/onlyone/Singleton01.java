package com.gczx.onlyone;

/**
 * @authoor zzs
 * @create 2019-12-23 16:23
 */
public class Singleton01 {  //类初始化的时候就已经实例化完毕

    private static Singleton01 instance = new Singleton01();
    private Singleton01(){}

    public static Singleton01 getInstance(){
        return instance;
    }
}
