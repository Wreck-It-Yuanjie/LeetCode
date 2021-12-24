package Leetcode;

import java.util.*;

public class L169 {
    public int majorityElement(int[] nums) {
//         int len = nums.length/2;

//         //hashmap
//         HashMap<Integer, Integer> answer = new HashMap<>();

//         for(int i = 0; i < nums.length; i++){
//             answer.put(nums[i], answer.getOrDefault(nums[i], 0) + 1);
//         }

//         //iteration
//         int maxValue = 0;
//         for(Map.Entry<Integer, Integer> MjEntry : answer.entrySet()){
//             if (MjEntry.getValue() > len) maxValue = MjEntry.getKey();
//         }

//         return maxValue;
        //sorting
        Arrays.sort(nums);
        return nums[nums.length/2];

    }
}
