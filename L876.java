package Leetcode;

class L876 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        //output to array
        // ListNode[] A = new ListNode[100];
        // int t = 0;
        // while(head != null){
        //     A[t++] = head;
        //     head = head.next;
        // }
        // return A[t/2];
        //two pointers
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
