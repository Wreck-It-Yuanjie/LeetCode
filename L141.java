package Leetcode;

import java.util.*;


// solution 1 : hashset
// traverse the linkedlist, and if we found a node exist in the set, return true; otherwise false
// time complexity : m + 1
// space complexity: m

// solution 2 : two pointer
// slow, fast
// time complexity : m
// space complexity : 1

public class L141 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        // hashset
        ListNode current = head;
        Set<ListNode> hashset = new HashSet<>();

        if (current == null || current.next == null) return false;

        while(current.next != null){
            if(hashset.contains(current)) return true;
            else{
                hashset.add(current);
                current = current.next;
            }
        }
        return false;

    }
}
