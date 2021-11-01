package Leetcode;

import java.util.*;

public class L136 {
    public int singleNumber(int[] nums) {
        /*List*/
//         List<Integer> numlist = new ArrayList<Integer>();

//         for(int i = 0; i < nums.length; i++){
//             if(numlist.contains(nums[i])){
//                 numlist.remove(new Integer(nums[i]));
//             }
//             else{
//                 numlist.add(nums[i]);
//             }
//         }

//         return numlist.get(0);
        /*Hashtable*/
        HashMap<Integer, Integer> hashTable = new HashMap<Integer, Integer> ();

        for(int i: nums){
            hashTable.put(i, hashTable.getOrDefault(i, 0) + 1);
        }

        for(int j: nums){
            if(hashTable.get(j) == 1){
                return j;
            }
        }
        return 0;
    }
}
