package com.gczx.onlyone;

/**
 * @authoor zzs
 * @create 2019-12-23 16:28
 */
public class Singleton02 {
    private static volatile Singleton02 instance;
    private Singleton02(){}
    public static Singleton02 getInstance(){
        if (instance == null)
            synchronized (Singleton02.class){
                if (instance == null)
                     instance = new Singleton02();
            }
        return instance;
    }

}
