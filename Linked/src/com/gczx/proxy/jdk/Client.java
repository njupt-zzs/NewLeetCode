package com.gczx.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @authoor zzs
 * @create 2019-12-23 11:05
 */
public class Client {

    private Object target;

    public Client(Object target) {
        this.target = target;
    }

    public Object getInstance() {
       return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy,method,args) -> {

           System.out.println("jdk开始代理");
           Object invoke = method.invoke(target, args);
           System.out.println("代理结束");
           return invoke;
       });


   }

    public static void main(String[] args) {
        Teacher instance = (Teacher) new Client(new TeachIml()).getInstance();
        instance.teach();
    }
}
