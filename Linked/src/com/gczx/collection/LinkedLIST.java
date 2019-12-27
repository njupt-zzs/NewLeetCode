package com.gczx.collection;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @authoor zzs
 * @create 2019-12-19 19:58
 */
public class LinkedLIST<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    private class Node<E>{
        E item;
        Node<E> next;
        Node<E> pre;

        public Node(E item, Node<E> next, Node<E> pre) {
            this.item = item;
            this.next = next;
            this.pre = pre;
        }
    }

    public LinkedLIST() {
    }

    public boolean add(E e){
        Node<E> l = tail;
        Node<E> cur = new Node<>(e, null, l);
        tail = cur;
        if (l == null)
            head = cur;
        else
            l.next = cur;

        size++;
        return true;
    }

    public E removeFirst(){
      if (this.size == 0)
          return null;
      if (this.size == 1)
          return head.item;
      Node<E> l = head;
      head = l.next;
      return l.item;
    }

    /*public boolean remove(){
        //删除中间一个，这个主要是你TM不知道要删哪个？
    }*/

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
