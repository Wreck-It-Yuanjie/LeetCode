package Leetcode;

class L206 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;

        while(head != null){
            ListNode temp_next = head.next;
            head.next = prev;
            prev = head;
            head = temp_next;
        }
        return prev;
    }
}
