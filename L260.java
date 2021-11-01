package Leetcode;

import java.util.*;

public class L260 {
    public int[] singleNumber(int[] nums) {
        /*Hashmap*/
        int[] result = new int[2];
        HashMap<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for(int i: nums){
            hashtable.put(i, hashtable.getOrDefault(i, 0) + 1);
        }

        int flag = 0;
        for(int i: nums){
            if (hashtable.get(i) == 1){
                result[flag] = i;
                if(flag == 1){
                    return result;
                }
                flag ++;
            }
        }
        return result;
    }
}
