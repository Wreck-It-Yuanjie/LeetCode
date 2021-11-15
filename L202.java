package Leetcode;

import java.util.*;

public class L202 {
    //     public boolean isHappy(int n) {
//         //Hashtable: find whether suck in a loop
//         int sum = n;
//         HashMap<Integer, Integer> hashtable = new HashMap<>();
//         hashtable.put(sum, 1);

//         while(sum != 1){
//             if (hashtable.get(sum) > 1) return false;
//             else {
//                 sum = findNext(sum);
//                 hashtable.put(sum, hashtable.getOrDefault(sum, 0) + 1);
//             }
//         }
//         return true;
//     }

    public boolean isHappy(int n) {
        //Hashset: find whether suck in a loop
        int sum = n;
        HashSet<Integer> hashtable = new HashSet<>();
        // hashtable.put(sum, 1);
        hashtable.add(n);

        while(sum != 1){
            sum = findNext(sum);
            if (hashtable.contains(sum) == true) return false;
            else hashtable.add(sum);
        }
        return true;
    }

    public int findNext(int n){
        int sum = 0;
        //Find the next number
        while(n > 0){
            int d = n%10;
            n = n/10;
            sum += d*d;
        }
        return sum;
    }
}
