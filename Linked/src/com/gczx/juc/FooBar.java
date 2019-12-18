package com.gczx.juc;

/**
 * @authoor zzs
 * @create 2019-12-18 18:48
 */
public class FooBar {
    private int n;

    public FooBar(int n) {
        this.n = n;
    }
    private  int one = 1;
    private Object lock = new Object();

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized (lock){
                while (one != 1)
                    printFoo.wait();
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                one = 2;
                lock.notify();
            }

        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized (lock){
                while (one != 2)
                    printBar.wait();
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                one = 1;
                lock.notify();
            }

        }
    }


    public static void main(String[] args) throws Exception{
        FooBar fooBar = new FooBar(5);

        fooBar.foo(() -> {
            System.out.println("foo");
        });

        fooBar.bar(() -> {
            System.out.println("bar");
        });


        new Thread(() -> {
            System.out.println("heihei");
        },"aa").start();
    }
}
