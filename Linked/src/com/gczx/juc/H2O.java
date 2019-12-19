package com.gczx.juc;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.concurrent.Semaphore;

/**
 * @authoor zzs
 * @create 2019-12-19 10:49
 */
public class H2O {
    public H2O() {

    }
    private Semaphore h = new Semaphore(2);
    private Semaphore o = new Semaphore(0);
    public void hydrogen() throws InterruptedException {
        h.acquire();
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        System.out.println("h");
        o.release();
    }

    public void oxygen() throws InterruptedException {
        o.acquire(2);
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        System.out.println("o");
        h.release(2);
    }

    public static void main(String[] args) {
        H2O h2O = new H2O();
        new Thread(() -> {
            try {
                for (;;)
                    h2O.hydrogen();
            }catch (Exception e){
                e.printStackTrace();
            }
        },"A").start();

        new Thread(() -> {
            try {
                for (;;)
                    h2O.oxygen();
            }catch (Exception e){
                e.printStackTrace();
            }
        },"B").start();
    }
}
