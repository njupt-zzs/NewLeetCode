package com.gczx.juc;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @authoor zzs
 * @create 2019-12-18 18:43
 */
public class Foo1114 {
    public Foo1114() {
    }

    private int num = 1;
    Object lock = new Object();
    public void first(Runnable printFirst) throws InterruptedException {
        synchronized (lock){
            while (num != 1)
                lock.wait();
            printFirst.run();
            num = 2;
            lock.notifyAll();
        }

    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (lock){
            while (num != 2)
                lock.wait();
            printSecond.run();
            num = 3;
            lock.notifyAll();
        }

    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized (lock){
            while (num != 3)
                lock.wait();
            printThird.run();
            num = 1;
            lock.notifyAll();
        }

    }
}
