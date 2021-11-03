package Leetcode;

import java.util.*;

public class L217 {
    public boolean containsDuplicate(int[] nums) {
        /*Hashtable*/
        HashMap<Integer, Integer> hashtable = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            hashtable.put(nums[i], hashtable.getOrDefault(nums[i], 0) + 1);
            if(hashtable.get(nums[i]) > 1){
                return true;
            }
        }
        return false;
    }
}
