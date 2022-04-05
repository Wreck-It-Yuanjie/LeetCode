package Leetcode;

import java.util.*;

public class L1679 {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int left = 0, right = nums.length - 1;
        while(left < right){
            int temp = nums[left] + nums[right];
            if(temp == k){
                count++;
                left++;
                right--;
            }
            else if(temp > k){
                right--;
            }
            else{
                left++;
            }
        }
        return count;
    }
}
