package Leetcode;

public class L344 {
    //recursion
//     public void reverseString(char[] s) {
//         helper(0, s);
//     }

    //     public void helper(int index, char[] s){
//         //base case
//         int len = s.length;
//         if(len == 0 || index >= len) return;
//         if(index < len - index - 1){
//             char temp = s[index];
//             s[index] = s[len - index - 1];
//             s[len - index - 1] = temp;
//         }
//         else return;
//         //recursion
//         helper(index + 1, s);
//     }
    //two pointers
    public void reverseString(char[] s) {
        if(s.length == 0) return;
        int low = 0; int high = s.length - 1;
        while(low < high){
            char temp = s[low];
            s[low++] = s[high];
            s[high--] = temp;
        }
    }
}
