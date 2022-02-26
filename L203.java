package Leetcode;

class L203 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeElements(ListNode head, int val) {

        ListNode out = new ListNode(0);
        out.next = head;
        ListNode previous = out, current = head;

        // Edge case: head == null
        if(current == null){
            return null;
        }

        // Normal case
        while(current != null){
            if(current.val == val){
                previous.next = current.next;
            }
            else{
                previous = current;
            }
            current = current.next;
        }
        return out.next;
    }
}
