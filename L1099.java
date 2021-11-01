package Leetcode;

import java.util.*;

public class L1099 {
    public int twoSumLessThanK(int[] nums, int k) {
        /*two pointers*/
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        int maxSum = -1;
        while(low < high){
            if(nums[low] + nums[high] < k && nums[low] + nums[high] >= maxSum){
                maxSum = nums[low] + nums[high];
                low ++;
            }
            else if(nums[low] + nums[high] < k && nums[low] + nums[high] < maxSum){
                low ++;
            }
            else{
                high --;
            }
        }
        return maxSum;
    }
}
