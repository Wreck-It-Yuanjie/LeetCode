package Leetcode;

import java.util.*;

// solution 1: Array + two pointer
// time complexity : O (m)
// space complexity : m

// solution 2 : Recursion


class L234 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {
        // Array + two pointer
        List<Integer> lstArray = new ArrayList<>();

        ListNode current = head;

        // convert to array
        while(current != null){
            lstArray.add(current.val);
            current = current.next;
        }

        // two pointers
        int low = 0, high = lstArray.size() - 1;
        while(low < high){
            if (lstArray.get(low) != lstArray.get(high)) return false;
            else {
                low ++;
                high --;
            }
        }

        return true;
    }
}