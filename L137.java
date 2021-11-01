package Leetcode;

import java.util.*;

public class L137 {
    public int singleNumber(int[] nums) {
        /*Hashmap*/
//         HashMap<Integer, Integer> hashTable = new HashMap<Integer, Integer> ();

//         for(int i: nums){
//             hashTable.put(i, hashTable.getOrDefault(i, 0) + 1);
//         }

//         for(int j: nums){
//             if(hashTable.get(j) == 1){
//                 return j;
//             }
//         }
//         return 0;
        /*Hashset*/
        HashSet<Long> hashset = new HashSet<Long>();
        long sumSet = 0; long sumArray = 0;
        for(long i: nums){
            sumArray += i;
            hashset.add((long)i);
        }

        for(long j: hashset){
            sumSet += j;
        }

        return (int)((sumSet*3 - sumArray)/2);
    }
}
