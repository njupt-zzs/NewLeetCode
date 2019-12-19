package com.gczx.juc;

import javax.lang.model.element.VariableElement;
import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * @authoor zzs
 * @create 2019-12-19 9:31
 */
public  class ZeroEvenOdd {
    private int n;

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    private Semaphore z = new Semaphore(1);
    private Semaphore e = new Semaphore(0);
    private Semaphore o = new Semaphore(0);


    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero() throws InterruptedException {
        for (int i = 0; i < n; i++) {
            z.acquire();
            System.out.println(0);
            if ((i&1) == 0)
                o.release();
            else
                e.release();
        }

    }

    public void even() throws InterruptedException {
        for (int i = 2; i <= n; i+=2) {
            e.acquire();
            System.out.println(i);
            z.release();
        }

        
    }

    public void odd() throws InterruptedException {
        for (int i = 1; i <= n; i+=2) {
            o.acquire();
            System.out.println(i);
            z.release();
        }
    }

    public static void main(String[] args) {
        ZeroEvenOdd evenOdd = new ZeroEvenOdd(5);
        new Thread(() -> {
            try {
                evenOdd.zero();
            }catch (Exception e){
                e.printStackTrace();
            }
        },"A").start();
        
        new Thread(() -> {
            try {
                evenOdd.even();
            }catch (Exception e){
                e.printStackTrace();
            }
        },"A").start();
        
        new Thread(() -> {
            try {
                evenOdd.odd();
            }catch (Exception e){
                e.printStackTrace();
            }
        },"A").start();
    }
}
