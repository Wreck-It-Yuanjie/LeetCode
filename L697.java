package Leetcode;

import java.util.*;

public class L697 {
    public int findShortestSubArray(int[] nums) {
        //Hashmap
        HashMap<Integer, Integer> leftmap = new HashMap<>();
        HashMap<Integer, Integer> rightmap = new HashMap<>();
        HashMap<Integer, Integer> countmap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!leftmap.containsKey(nums[i])) leftmap.put(nums[i], i);
            rightmap.put(nums[i], i);
            countmap.put(nums[i], countmap.getOrDefault(nums[i], 0) + 1);
        }

        int result = nums.length;
        int maxfreq = Collections.max(countmap.values());
        for(int num: countmap.keySet()){
            if(countmap.get(num) == maxfreq){
                result = Math.min(result, rightmap.get(num) - leftmap.get(num) + 1);
            }
        }
        return result;
    }
}
