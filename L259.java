package Leetcode;

import java.util.*;

public class L259 {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int result = 0;
        for(int low = 0; low < nums.length - 2; low++){
            int mid = low + 1;
            int high = nums.length - 1;
            while(mid < high){
                int sum = nums[low] + nums[mid] + nums[high];
                if(sum < target){
                    result += high - mid;
                    mid++;
                }
                else{
                    high--;
                }
            }
        }
        return result;
    }
}
