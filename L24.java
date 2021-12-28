package Leetcode;


class L24 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapPairs(ListNode head) {
        /*Iteration*/
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prevNode = dummy;
        while(head != null && head.next != null){
            /*define prev, first, second*/
            ListNode firstNode = head;
            ListNode secondNode = head.next;

            /*swap*/
            prevNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            /*change pointer*/
            prevNode = firstNode;
            head = head.next;
        }
        return dummy.next;
    }
}
