package Leetcode;

public class L83 {
    public class ListNode {
        int val;
        L21.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, L21.ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while(current != null && current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }
            else current = current.next;
        }

        return head;
    }
}
