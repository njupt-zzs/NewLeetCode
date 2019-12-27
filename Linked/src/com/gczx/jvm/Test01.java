package com.gczx.jvm;

import java.lang.reflect.Constructor;

/**
 * @authoor zzs
 * @create 2019-12-23 15:47
 */
public class Test01 {
    public static void main(String[] args) throws Exception{
        Constructor<test> constructor = test.class.getConstructor();
        test test = constructor.newInstance();
        System.out.println(test);
    }
}
