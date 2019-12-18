package com.gczx.zzs;

/**
 * @authoor zzs
 * @create 2019-12-18 16:31
 */


public class Reversed206 {

    public ListNode reverseList(ListNode head) {
        //先考虑一般情况
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode nextTemp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nextTemp;
        }
        return pre;
    }
}
