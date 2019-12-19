package com.gczx.collection;

import java.util.Arrays;

/**
 * @authoor zzs
 * @create 2019-12-19 15:44
 * 手写一个ArrayList,实现增删改查
 * 假设所传入的参数均是正确有效的
 */
public class ArrayLIST<E> {
    //它可以实现自动扩容,这个是与数组有本质的区别的
    private int a;
    private int cap = 0;
    private Object [] obj;

    public ArrayLIST(int a) {
        this.a = a;
        obj = new Object[a];
    }

    public int add(E e){
        if(cap == a)
            addcapaity();
        obj[cap++] = e;
        return cap;
    }

    public int delete(){
        obj[cap--] = null;
        return cap;
    }

    public void update(int n, E e){
        //n should between 0 and a-1
        obj[n] = e;
    }

    public E seek(int n){
        return (E) obj[n];
    }

    private void addcapaity(){
        Object[] newobj = new Object[2 * a];
        for (int i = 0; i < obj.length; i++) {
            newobj[i] = obj[i];
        }
        obj = newobj;
    }

    public static void main(String[] args) {
        ArrayLIST<Integer> list = new ArrayLIST<>(3);
        list.add(1);
        list.add(2);
        list.add(1);
        System.out.println(list.add(1));
        System.out.println(list.delete());

    }
}
