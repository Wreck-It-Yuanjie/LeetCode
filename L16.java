package Leetcode;

import java.util.*;

public class L16 {
    public int threeSumClosest(int[] nums, int target) {
        /*two pointers*/
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for(int low = 0; low < nums.length - 1; low ++){
            int mid  = low + 1;
            int high = nums.length - 1;
            while(mid < high){
                int sum = nums[low] + nums[mid] + nums[high];
                if(Math.abs(sum - target) < Math.abs(diff)){
                    diff = sum - target;
                }
                if(sum < target){
                    mid++;
                }
                else{
                    high--;
                }
            }
        }
        return target + diff;
    }
}
