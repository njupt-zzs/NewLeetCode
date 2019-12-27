package com.gczx.onlyone;

/**
 * @authoor zzs
 * @create 2019-12-23 16:40
 */
public enum Singleton04 {
    INSTANCE;
    public void method(){
        System.out.println("hhh");
    }

    public static void main(String[] args) {
        System.out.println(Singleton04.INSTANCE == Singleton04.INSTANCE);
    }
}
