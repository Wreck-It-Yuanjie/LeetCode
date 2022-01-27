package Leetcode;


// traverse the linkedlist and change the value of them
// set the last node to be null

class L237 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public void deleteNode(ListNode node) {
        // define reference to the deleted node
        ListNode temp = node;

        while (temp.next != null){
            temp.val = temp.next.val;

            // last one
            if(temp.next.next == null) temp.next = null;
            else temp = temp.next;

        }

    }
}

//4 - 5 - 1 - 9
//             c
//step 1 : 4 - 1 - 1 - 9
//                 c
//step 2 : 4 - 1 - 9 - null

//time complexity : length (m)
