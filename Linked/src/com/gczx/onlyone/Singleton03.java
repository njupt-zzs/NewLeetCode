package com.gczx.onlyone;

/**
 * @authoor zzs
 * @create 2019-12-23 16:34
 */
public class Singleton03 {

    private Singleton03(){}

    private static class Inner{   //控制对象的数量
        private static Singleton03 instance = new Singleton03();
    }

    public static Singleton03 getInstance(){
        return Inner.instance;
    }
}
