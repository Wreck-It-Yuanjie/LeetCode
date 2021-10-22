package Leetcode;

public class L53 {
    public int maxSubArray(int[] nums) {
        /*Dynamic programming*/
        int tempmax = nums[0];
        int overallmax = nums[0];
        for(int i = 1; i < nums.length; i++){
            tempmax = Math.max(nums[i], tempmax + nums[i]);
            overallmax = Math.max(tempmax, overallmax);
        }
        return overallmax;
    }
}
