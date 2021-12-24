package Leetcode;

import java.util.*;


//Definition for singly-linked list.


class L2 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dumhead = new ListNode(0);

        ListNode v1 = l1, v2 = l2, ptr = dumhead;

        int carry = 0;

        while(v1 != null || v2 != null){
            int x = 0, y = 0;
            if(v1 != null){
                x = v1.val;
                v1 = v1.next;
            }
            if(v2 != null){
                y = v2.val;
                v2 = v2.next;
            }
            int sum = x + y + carry;
            carry = sum/10;
            sum = sum%10;
            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }
        if(carry > 0){
            ptr.next = new ListNode(carry);
        }
        return dumhead.next;
    }
}
