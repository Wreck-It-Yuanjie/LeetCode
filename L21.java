package Leetcode;

/**
 * Definition for singly-linked list. **/

class L21 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //iteration
        ListNode dumhead = new ListNode(0);

        ListNode dum = dumhead;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                dum.next = l1;
                l1 = l1.next;
            }
            else{
                dum.next = l2;
                l2 = l2.next;
            }
            dum = dum.next;
        }
        //if there is nodes at the end of either l1 or l2
        dum.next = (l1 == null) ? l2: l1;

        return dumhead.next;
    }
}
