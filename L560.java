package Leetcode;

import java.util.*;

public class L560 {
    public int subarraySum(int[] nums, int k) {
        /*Better brutal force*/
        // int result = 0;
        // for(int i = 0; i < nums.length; i++){
        //     int j = i+1;
        //     int tmpSum = nums[i];
        //     while(true){
        //         if(tmpSum == k){
        //             result++;
        //         }
        //         if (j < nums.length){
        //             tmpSum += nums[j];
        //             j++;
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return result;
        /*Hashmap*/
        int count = 0;int sum = 0;
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        hashtable.put(0,1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(hashtable.containsKey(sum - k)){
                count += hashtable.get(sum - k);
            }
            hashtable.put(sum, hashtable.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
