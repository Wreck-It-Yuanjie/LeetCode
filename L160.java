package Leetcode;


// hashset : b1 - b2 - b3 - b4 - c1 - c2 - c3
// traverse ListA : a1 - a2 - c1

// two pointers p1 & p2
// if they are of the same length : arrive at the intersection at the same time
// if they are of different length : when p1 arrives at null, we put it back to headB; same as p2.

public class L160 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         /* hashset solution */
//         Set<ListNode> hashset = new HashSet<>();

//         //traverse A
//         ListNode tempA = headA;
//         while(tempA != null){
//             hashset.add(tempA);
//             tempA = tempA.next;
//         }

//         //traverse B to find the value
//         ListNode tempB = headB;
//         while(tempB != null){
//             if (hashset.contains(tempB)) return tempB;
//             else tempB = tempB.next;
//         }

//         return null;

        /*two pointers*/
        ListNode p1 = headA, p2 = headB;

        while(p1 != p2){
            p1 = p1 == null? headB : p1.next;
            p2 = p2 == null? headA : p2.next;
        }

        return p1;
    }
}

// hashset
// length (ListA) = m; length (ListB) = n;
// time complexity : O (m + n)
// space complexity : m

// two pointers
// time complexity : O (m + n)
// space complexity : 1